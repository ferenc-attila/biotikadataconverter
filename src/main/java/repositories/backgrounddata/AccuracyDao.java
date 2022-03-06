package repositories.backgrounddata;

import javax.sql.DataSource;

public class AccuracyDao extends BackgroundDataRepository {

    public AccuracyDao(DataSource dataSource) {
        super(dataSource);
        this.setTableName("PONTOSSAG");
    }
}
