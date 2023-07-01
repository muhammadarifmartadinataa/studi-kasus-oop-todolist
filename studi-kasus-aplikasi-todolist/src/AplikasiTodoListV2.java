import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListServiceImpl;
import service.TodolistService;
import view.TodoListView;

public class AplikasiTodoListV2 {
    public static void main(String[] args) {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodolistService todolistService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todolistService);

        todoListView.showTodoList();
    }

}
