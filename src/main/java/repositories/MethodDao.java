package repositories;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class MethodDao extends BackgroundDataRepository {

    public MethodDao(DataSource dataSource) {
        super(dataSource);
        this.setTableName("MODSZER");
    }

    protected List<String> readBackgroundData() {
        List<String> result = new ArrayList<>();
        this.getJdbcTemplate().query("SELECT * FROM ?",
                (rs, rowNum) -> result.add(rs.getLong("KOD") + ";" + rs.getString("LEIRAS")), this.getTableName());
        return result;
    }

    protected void writeBackgroundData(List<String> data) {
        for (String entry : data) {
            String[] row = entry.split(";");
            this.getJdbcTemplate().update("INSERT INTO ? (KOD, LEIRAS) VALUES (?, ?)", this.getTableName(), Long.parseLong(row[0]), row[1]);
        }
    }
}
