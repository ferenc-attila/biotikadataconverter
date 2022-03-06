package repositories;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public abstract class BackgroundDataRepository {

    private String tableName;
    private final JdbcTemplate jdbcTemplate;

    protected BackgroundDataRepository(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    protected List<String> readBackgroundData() {
        List<String> result = new ArrayList<>();
        jdbcTemplate.query("SELECT * FROM ?",
                (rs, rowNum) -> result.add(rs.getLong("KOD") + ";" + rs.getString("LEIRAS")), tableName);
        return result;
    }

    protected void writeBackgroundData(List<String> data) {
        for (String entry : data) {
            String[] row = entry.split(";");
            jdbcTemplate.update("INSERT INTO ? (KOD, LEIRAS) VALUES (?, ?)", tableName, Long.parseLong(row[0]), row[1]);
        }
    }

    protected String getTableName() {
        return tableName;
    }

    protected void setTableName(String tableName) {
        this.tableName = tableName;
    }

    protected JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
}
