package validations;

import repositories.backgrounddata.AccuracyDao;
import tables.backgrounddata.Accuracy;

public class AccuracyValidation {

    private AccuracyDao accuracyDao;

    public AccuracyValidation(AccuracyDao accuracyDao) {
        this.accuracyDao = accuracyDao;
    }

    public void validateAccuracy(Accuracy accuracy) {
        Accuracy reference = accuracyDao.findAccuracyById(accuracy.getCode());
        if (!accuracy.equals(reference)) {
            throw new IllegalArgumentException(accuracy.getDescription() + " cannot find in the database with id: " + accuracy.getCode() + "!");
        }
    }
}
