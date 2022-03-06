package repositories;

import java.util.List;

public interface BackgroundDataRepository {

    List<String> readBackgroundData();

    void writeBackgroundData(List<String> data);
}
