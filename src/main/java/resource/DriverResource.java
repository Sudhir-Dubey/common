package resource;

public class DriverResource extends BaseResource{
    private String name;
    private String mob;

    public DriverResource() {
    }

    public DriverResource(String name, String mob) {
        this.name = name;
        this.mob = mob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }
}
