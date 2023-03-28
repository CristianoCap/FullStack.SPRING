package com.toDoApp.learningspringboot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import toDo.toDo;
import toDo.toDo.Importance;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class toDoController {
	public toDo todo1 = new toDo("111", "Lorem Ipsum", new Date(), false, Importance.low);
	public toDo todo2 = new toDo("222", "Lorem Ipsum", new Date(), true, Importance.medium);
	public toDo todo3 = new toDo("333", "Lorem Ipsum", new Date(), false, Importance.low);
	public toDo todo4 = new toDo("444", "Lorem Ipsum", new Date(), true, Importance.medium);
	public toDo todo5 = new toDo("555", "Lorem Ipsum", new Date(), false, Importance.high);
	
	public List<toDo> toDos = new ArrayList<toDo>();
	
	
	public List<toDo> getAndSetTodos(){
		if(this.toDos.size() == 0) {
			this.toDos.add(todo1);
			this.toDos.add(todo2);
			this.toDos.add(todo3);
			this.toDos.add(todo4);
			this.toDos.add(todo5);
		}
		
		return this.toDos;

	}
	
	@RequestMapping({"/","toDoList"})
	public List<toDo> retrieveAllToDo(){
		List<toDo> AllToDo = this.getAndSetTodos();
		System.out.println(AllToDo);
		return AllToDo;
	}
	
	@GetMapping(path="/toDoUndone")
	public List<toDo> retrieveAllUndoneToDo(){
		List<toDo> AllToDo = this.getAndSetTodos();
		List<toDo> toDoUndone = new ArrayList<toDo>();
		for (int i = 0; i < AllToDo.size(); i++ ) {
			if(!AllToDo.get(i).getDone()) {
				toDoUndone.add(AllToDo.get(i));
			}
		}
		return toDoUndone;
	}
	@GetMapping(path="/toDoDone")
	public List<toDo> retrieveAlloneToDo(){
		List<toDo> AllToDo = this.getAndSetTodos();
		List<toDo> toDoDone = new ArrayList<toDo>();
		for (int i = 0; i < AllToDo.size(); i++ ) {
			if(AllToDo.get(i).getDone()) {
				toDoDone.add(AllToDo.get(i));
			}
		}
		return toDoDone;
	}
}
