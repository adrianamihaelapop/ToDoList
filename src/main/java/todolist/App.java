package todolist;

import todolist.domain.ToDoItem;
import todolist.persistance.ToDoItemRepository;
import todolist.transfer.CreatedToDoItemRequest;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {

        CreatedToDoItemRequest request = new CreatedToDoItemRequest();
        request.setDescription("Learn JDBC");
        request.setDeadline(LocalDate.now().plusWeeks(1));

        ToDoItemRepository toDoItemRepository = new ToDoItemRepository();
        // toDoItemRepository.createToDoItem(request);
        // toDoItemRepository.updateToDoItem(1, true);
        // toDoItemRepository.deleteToDoItem(1);
        List<ToDoItem> toDoItems = toDoItemRepository.getToDoItems();

        System.out.println(toDoItems);
    }
}
