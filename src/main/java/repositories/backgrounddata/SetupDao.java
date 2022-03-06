package repositories.backgrounddata;

import javax.sql.DataSource;

public class SetupDao extends BackgroundDataRepository {

    public SetupDao(DataSource dataSource) {
        super(dataSource);
        this.setTableName("SETUP");
    }
}
