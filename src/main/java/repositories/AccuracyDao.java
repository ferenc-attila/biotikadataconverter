package repositories;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class AccuracyDao implements BackgroundDataRepository {

    private static final String TABLENAME = "PONTOSSAG";

    private JdbcTemplate jdbcTemplate;

    public AccuracyDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<String> readBackgroundData() {
        List<String> accuracies = new ArrayList<>();
        jdbcTemplate.query("SELECT * FROM ?",
                (rs, rowNum) -> accuracies.add(rs.getString("KOD") + ":" + rs.getString("LEIRAS")), TABLENAME);
        return accuracies;
    }

    @Override
    public void writeBackgroundData(List<String> data) {

    }
}
