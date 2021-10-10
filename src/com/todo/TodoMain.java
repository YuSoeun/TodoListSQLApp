package com.todo;

import java.util.Scanner;

import com.todo.dao.TodoList;
import com.todo.menu.Menu;
import com.todo.service.TodoUtil;

public class TodoMain {
	
	public static void start() {
	
		Scanner sc = new Scanner(System.in);
		TodoList l = new TodoList();
		l.importData("todolist.txt");
		
		TodoUtil.loadList(l, "todolist.txt");
		
		boolean isList = false;
		boolean quit = false;
		String keyword = null;
		do {
			Menu.prompt(false);
			isList = false;
			String choice = sc.next();
			switch (choice) {

			case "help":
				Menu.prompt(true);
				break;
				
			case "add":
				TodoUtil.createItem(l);
				break;
			
			case "del":
				TodoUtil.deleteItem(l);
				break;
				
			case "edit":
				TodoUtil.updateItem(l);
				break;
				
			case "find":
				keyword = sc.nextLine().trim();
				TodoUtil.findList(l, keyword);
				break;
			
			case "find_cate":
				keyword = sc.nextLine().trim();
				TodoUtil.findCateItem(l, keyword);
				break;
				
			case "ls_cate":
				TodoUtil.printCates(l);
				break;
	
			case "ls":
				TodoUtil.listAll(l);
				break;

			case "ls_name_asc":
				l.sortByName();
				isList = true;
				break;

			case "ls_name_desc":
				l.sortByName();
				l.reverseList();
				isList = true;
				break;
				
			case "ls_date":
				l.sortByDate();
				isList = true;
				break;
				
			case "ls_date_desc":
				l.sortByDate();
				l.reverseList();
				isList = true;
				break;

			case "exit":
				TodoUtil.saveList(l, "todolist.txt");
				quit = true;
				break;

			default:
				System.out.println("위의 명령어 중 하나를 선택해주세요.");
				break;
			}
			
			if(isList) l.listAll();
		} while (!quit);
	}
}
