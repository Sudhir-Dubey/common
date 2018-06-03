package resource;



public class CarResource extends BaseResource{
    private String model;
    private String number;
    private String category;
    private DriverResource driverResource;

    public CarResource() {
    }

    public CarResource(String model, String number, String category, DriverResource driverResource) {
        this.model = model;
        this.number = number;
        this.category = category;
        this.driverResource = driverResource;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public DriverResource getDriverResource() {
        return driverResource;
    }

    public void setDriverResource(DriverResource driverResource) {
        this.driverResource = driverResource;
    }
}
