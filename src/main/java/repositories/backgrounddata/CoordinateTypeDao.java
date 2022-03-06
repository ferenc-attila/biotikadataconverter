package repositories.backgrounddata;

import javax.sql.DataSource;

public class CoordinateTypeDao extends BackgroundDataRepository {

    public CoordinateTypeDao(DataSource dataSource) {
        super(dataSource);
        this.setTableName("KOORDTIPUS");
    }
}
