package repositories;

import javax.sql.DataSource;

public class SuprataxonDao extends BackgroundDataRepository {

    public SuprataxonDao(DataSource dataSource) {
        super(dataSource);
        this.setTableName("SZUPRATAXON");
    }
}
