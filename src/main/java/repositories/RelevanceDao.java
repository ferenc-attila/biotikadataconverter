package repositories;

import javax.sql.DataSource;

public class RelevanceDao extends BackgroundDataRepository {

    public RelevanceDao(DataSource dataSource) {
        super(dataSource);
        this.setTableName("BNPI_FONTOSSAG");
    }
}
