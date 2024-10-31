
package utils;

import java.util.Date;

public class Task {
    private int id;
    private String name;
    private String status;
    private Date createdAt;

    public Task(int id, String name, String status) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.createdAt = new Date();
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getStatus() { return status; }
    public Date getCreatedAt() { return createdAt; }

    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
