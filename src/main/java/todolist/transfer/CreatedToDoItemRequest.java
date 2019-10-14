package todolist.transfer;

import java.time.LocalDate;
//DTO (Data Transfer Object)

public class CreatedToDoItemRequest {
    private String description;
    private LocalDate deadline;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "CreatedToDoItemRequest{" +
                "description='" + description + '\'' +
                ", deadline=" + deadline +
                '}';
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }
}
