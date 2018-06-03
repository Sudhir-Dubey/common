package resource;

public class BookResource  extends BaseResource{
    private String pickUpLocation;
    private String dropLocation;

    public BookResource() {
    }

    public BookResource(String pickUpLocation, String dropLocation) {
        this.pickUpLocation = pickUpLocation;
        this.dropLocation = dropLocation;
    }

    public String getPickUpLocation() {
        return pickUpLocation;
    }

    public void setPickUpLocation(String pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
    }

    public String getDropLocation() {
        return dropLocation;
    }

    public void setDropLocation(String dropLocation) {
        this.dropLocation = dropLocation;
    }
}
