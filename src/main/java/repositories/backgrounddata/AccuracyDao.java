package repositories.backgrounddata;

import tables.backgrounddata.Accuracy;

import javax.sql.DataSource;

public class AccuracyDao extends BackgroundDataRepository {

    public AccuracyDao(DataSource dataSource) {
        super(dataSource);
        this.setTableName("PONTOSSAG");
    }

    public Accuracy findAccuracyById(Long id) {
        return this.getJdbcTemplate().queryForObject("SELECT * FROM ? WHERE ID = ?",
                (rs, rowNum) -> new Accuracy(rs.getLong("ID"), rs.getString("LEIRAS")),
                this.getTableName(), id);
    }

    public Accuracy findAccuracyByValue(String value) {
        return this.getJdbcTemplate().queryForObject("SELECT * FROM ? WHERE LEIRAS = ?",
                (rs, rowNum) -> new Accuracy(rs.getLong("ID"), rs.getString("LEIRAS")),
                this.getTableName(), value);
    }
}
