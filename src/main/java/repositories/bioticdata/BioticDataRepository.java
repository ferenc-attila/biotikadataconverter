package repositories.bioticdata;

import java.util.List;

public interface BioticDataRepository {

    void insertData(List<String> data);

    List<String> getMultipleData();

    List<String> getMultipleDataWithValues();

    void deleteData(Long id);

    void updateData(Long id);


}
