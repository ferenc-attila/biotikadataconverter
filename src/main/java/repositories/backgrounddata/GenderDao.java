package repositories.backgrounddata;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class GenderDao extends BackgroundDataRepository {

    public GenderDao(DataSource dataSource) {
        super(dataSource);
        this.setTableName("IVAR");
    }

    @Override
    protected List<String> readBackgroundData() {
        List<String> result = new ArrayList<>();
        this.getJdbcTemplate().query("SELECT * FROM ?",
                (rs, rowNum) -> result.add(rs.getLong("Kod") + ":" + rs.getString("LEIRAS")), this.getTableName());
        return result;
    }

    @Override
    protected void writeBackgroundData(List<String> data) {
        for (String entry : data) {
            String[] row = entry.split(";");
            this.getJdbcTemplate().update("INSERT INTO ? (Kod, LEIRAS) VALUES (?, ?)", this.getTableName(), Long.parseLong(row[0]), row[1]);
        }
    }
}
