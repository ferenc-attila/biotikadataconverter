package repositories;

import javax.sql.DataSource;

public class ActivityDao extends BackgroundDataRepository {

    public ActivityDao(DataSource dataSource) {
            super(dataSource);
            this.setTableName("AKTIVITAS");
        }
    }
