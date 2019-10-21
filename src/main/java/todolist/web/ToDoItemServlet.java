package todolist.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.fasttrackit.ToDoItemService;
import todolist.transfer.CreatedToDoItemRequest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/to-do-items")
public class ToDoItemServlet extends HttpServlet {

    private ToDoItemService toDoItemService = new ToDoItemService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        CreatedToDoItemRequest request = objectMapper.readValue(req.getReader(), CreatedToDoItemRequest.class);

        try {
            toDoItemService.createToDoItem(request);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            resp.sendError(500, "Internal server error" + e.getMessage());
        }
    }
}
