package tables.properties;

import tables.backgroundData.CoordinateType;

public class Coordinates {

    private String reference;
    private double x;
    private double y;
    private double z;
    private CoordinateType coordinateType;

    public Coordinates(String reference, double x, double y, double z, CoordinateType coordinateType) {
        this.reference = reference;
        this.x = x;
        this.y = y;
        this.z = z;
        this.coordinateType = coordinateType;
    }

    public Coordinates(String reference, double x, double y, CoordinateType coordinateType) {
        this.reference = reference;
        this.x = x;
        this.y = y;
        this.coordinateType = coordinateType;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public CoordinateType getCoordinateType() {
        return coordinateType;
    }

    public void setCoordinateType(CoordinateType coordinateType) {
        this.coordinateType = coordinateType;
    }
}