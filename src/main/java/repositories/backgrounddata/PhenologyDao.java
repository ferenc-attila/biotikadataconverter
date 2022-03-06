package repositories.backgrounddata;

import javax.sql.DataSource;

public class PhenologyDao extends BackgroundDataRepository {

    public PhenologyDao(DataSource dataSource) {
        super(dataSource);
        this.setTableName("FENOLOGIA");
    }
}
