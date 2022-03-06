package repositories.backgrounddata;

import javax.sql.DataSource;

public class UnitDao extends BackgroundDataRepository {

    public UnitDao(DataSource dataSource) {
        super(dataSource);
        this.setTableName("EGYSEG");
    }
}
