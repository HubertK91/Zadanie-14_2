class Vehicle {
    private final String type;
    private final String brand;
    private final String model;
    private final int year;
    private final int mileage;
    private final String vinNumber;

    public Vehicle(String type, String brand, String model, int year, int mileage, String vinNumber) {
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.vinNumber = vinNumber;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                ", vinNumber='" + vinNumber + '\'' +
                '}';
    }
}
