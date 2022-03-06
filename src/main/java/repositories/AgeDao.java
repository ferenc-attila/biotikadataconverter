package repositories;

import javax.sql.DataSource;
import java.util.List;

public class AgeDao extends BackgroundDataRepository {

    public AgeDao(DataSource dataSource) {
        super(dataSource);
        this.setTableName("KOR");
    }

    @Override
    protected List<String> readBackgroundData() {
        return super.readBackgroundData();
    }

    @Override
    protected void writeBackgroundData(List<String> data) {
        super.writeBackgroundData(data);
    }
}
