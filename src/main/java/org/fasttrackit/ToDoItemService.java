package org.fasttrackit;

import todolist.domain.ToDoItem;
import todolist.persistance.ToDoItemRepository;
import todolist.transfer.CreatedToDoItemRequest;
import todolist.transfer.UpdateToDoItemRequest;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class ToDoItemService {

    private ToDoItemRepository toDoItemRepository = new ToDoItemRepository();

    public void createToDoItem(CreatedToDoItemRequest request) throws SQLException, IOException, ClassNotFoundException {
        System.out.println("Creating to-do-item " + request);
        toDoItemRepository.createToDoItem(request);
    }

    public void updateToDoItem(long id, UpdateToDoItemRequest request) throws SQLException, IOException, ClassNotFoundException {
        System.out.println("updating to-do-item " + request);
        toDoItemRepository.updateToDoItem(id, request.isDone());

    }

    public void deleteToDoItem(long id) throws SQLException, IOException, ClassNotFoundException {
        System.out.println("Deleting item " + id);
        toDoItemRepository.deleteToDoItem(id);
    }

    public List <ToDoItem> getToDoItems () throws SQLException, IOException, ClassNotFoundException {
        System.out.println("Retrieving to-do-items..");
        return toDoItemRepository.getToDoItems();
    }
}
