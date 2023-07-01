package test.service;

import entity.TodoList;
import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListServiceImpl;
import service.TodolistService;

public class TodoListServiceTest {
    public static void main(String[] args) {
        testRemoveTodoList();

            }
            public static void testShowTodoList(){
                TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();
                todoListRepository.data[0] = new TodoList("Belajar Java Dasar");
                todoListRepository.data[1] = new TodoList("Belajar Java OOP");
                todoListRepository.data[2] = new TodoList("Belajar Java Standar Classes");

                TodolistService todolistService = new TodoListServiceImpl(todoListRepository);

                todolistService.showTodoList();
            }
            public static void testAddTodoList(){
                TodoListRepository todoListRepository = new TodoListRepositoryImpl();

                TodolistService todolistService = new TodoListServiceImpl(todoListRepository);

                todolistService.addTodoList("Belajar Java Dasar");
                todolistService.addTodoList("Belajar Java OOP");
                todolistService.addTodoList("Belajar Java Standard Classes");

                todolistService.showTodoList();
            }
            public static void testRemoveTodoList(){
                TodoListRepository todoListRepository = new TodoListRepositoryImpl();
                TodolistService todolistService = new TodoListServiceImpl(todoListRepository);

                todolistService.addTodoList("Belajar Java Dasar");
                todolistService.addTodoList("Belajar Java OOP");
                todolistService.addTodoList("Belajar Java Standard Classes");

                todolistService.showTodoList();
                todolistService.removeTodoList(9);

                todolistService.removeTodoList(2 );
                todolistService.showTodoList();

                todolistService.removeTodoList(2);
                todolistService.showTodoList();

                todolistService.removeTodoList(1);
                todolistService.showTodoList();
            }
}
