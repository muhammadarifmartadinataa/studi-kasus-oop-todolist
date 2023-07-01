package view;

import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListServiceImpl;
import service.TodolistService;

public class TodoListViewTest {
    public static void main(String[] args) {
        testRemoveTodoList();

    }
    public static void  testShowTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodolistService todolistService = new  TodoListServiceImpl(todoListRepository);

        TodoListView todoListView = new TodoListView(todolistService);

        todolistService.addTodoList("BELAJAR JAVA DASAR ");
        todolistService.addTodoList("BELAJAR JAVA OOP ");
        todolistService.addTodoList("BELAJAR JAVA STANDARTD CLASSES ");
        todoListView.showTodoList();
    }
    public static void  testAddTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodolistService todolistService = new  TodoListServiceImpl(todoListRepository);

        TodoListView todoListView = new TodoListView(todolistService);

        todoListView.addTodoList();
        todolistService.showTodoList();

        todoListView.addTodoList();
        todolistService.showTodoList();

        todoListView.addTodoList();
        todolistService.showTodoList();
    }
    public static void  testRemoveTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodolistService todolistService = new  TodoListServiceImpl(todoListRepository);

        TodoListView todoListView = new TodoListView(todolistService);

        todoListView.addTodoList();
        todoListView.addTodoList();
        todoListView.addTodoList();
        todolistService.showTodoList();
        todoListView.removeTodoList();
        todolistService.showTodoList();




    }
}
