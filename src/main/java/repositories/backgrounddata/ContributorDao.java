package repositories.backgrounddata;

import javax.sql.DataSource;

public class ContributorDao extends BackgroundDataRepository {

    public ContributorDao(DataSource dataSource) {
        super(dataSource);
        this.setTableName("ADATKOZLO");
    }
}
