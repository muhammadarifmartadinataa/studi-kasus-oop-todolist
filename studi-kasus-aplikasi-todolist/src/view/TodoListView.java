package view;

import entity.TodoList;
import service.TodolistService;
import util.InputUtil;

public class TodoListView {
    private TodolistService todolistService;

    public TodoListView(TodolistService todolistService) {
        this.todolistService = todolistService;
    }
    public void showTodoList(){
        while (true) {
           todolistService.showTodoList();
            System.out.println("MENU : ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");
            var input = InputUtil.input("Pilih");
            if (input.equals("1")) {
                addTodoList();
            } else if (input.equals("2")) {
                removeTodoList();
            } else if (input.equals("x")) {
                break;
            } else {
                System.out.println("Pilihan tidak dimengerti");
            }
        }

    }
    public void addTodoList(){
        System.out.println("MENAMBAH TODOLIST");
        var todo = InputUtil.input("Todo (x Jika Batal)");
        if (todo.equals("x"))
        {
            //batal
        } else {
            todolistService.addTodoList(todo);
        }

    }
    public void removeTodoList(){
        System.out.println("MENGHAPUS TODOLIST");
        var number = InputUtil.input("Nomor yang dihapus (x Jika Batal)");
        if (number.equals("x")){
            //batal
        } else {
            todolistService.removeTodoList(Integer.valueOf(number));
        }

    }

}
