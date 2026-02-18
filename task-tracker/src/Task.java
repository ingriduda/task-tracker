
public class Task {
    private int id;
    private String description;
    private String status;
    private String createdAt;
    private String updatedAt;

    public Task(int id, String description, String status, String createdAt, String updatedAt) {
        this.id = id;
        this.description = description;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getId() {
        return id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public String toJson() {
        return String.format(
                "{\"id\":\"%s\",\"description\":\"%s\",\"status\":%s,\"createdAt\":\"%s\"updatedAt\":\"%s\"}",
                id, description, status, createdAt, updatedAt
        );
    }

    @Override
    public String toString() {
        return "Task{id='" + id + "', description='" + description + "', status='" + status + "', createdAt='" + createdAt  + "', updatedAt='" + updatedAt + "'}";
    }
}
