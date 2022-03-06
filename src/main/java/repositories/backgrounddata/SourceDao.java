package repositories.backgrounddata;

import javax.sql.DataSource;

public class SourceDao extends BackgroundDataRepository {

    public SourceDao(DataSource dataSource) {
        super(dataSource);
        this.setTableName("ADATFORRAS");
    }
}
