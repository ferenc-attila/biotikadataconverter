package repositories.backgrounddata;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class FloraDao extends BackgroundDataRepository {

    public FloraDao(DataSource dataSource) {
        super(dataSource);
        this.setTableName("FLORA");
    }

    @Override
    protected List<String> readBackgroundData() {
        List<String> result = new ArrayList<>();
        this.getJdbcTemplate().query("SELECT * FROM ?",
                (rs, rowNum) -> result.add(rs.getDouble("KOD") + ";"
                        + rs.getLong("TAXONKOD") + ";"
                        + rs.getString("LATIN_NEV") + ";"
                        + rs.getInt("FONTOSSAG") + ";"
                        + rs.getInt("EGYSEG") + ";"
                        + rs.getLong("SETUP")
                ), this.getTableName());
        return result;
    }

    @Override
    protected void writeBackgroundData(List<String> data) {
        for (String entry : data) {
            String[] row = entry.split(";");
            this.getJdbcTemplate().update("INSERT INTO ? (KOD, LEIRAS, STAXON, FONTOSSAG) VALUES (?, ?, ?, ?)",
                    this.getTableName(), Long.parseLong(row[0]), row[1], Long.parseLong(row[2]), Long.parseLong(row[3]));
        }
    }
}
