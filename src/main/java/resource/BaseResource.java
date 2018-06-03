package resource;

public class BaseResource {
    private String id;
    private String createdBy;

    public BaseResource() {
    }

    public BaseResource(String id, String createdBy) {
        this.id = id;
        this.createdBy = createdBy;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
}
