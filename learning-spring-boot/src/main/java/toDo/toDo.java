package toDo;

import java.util.Date;

public class toDo {
	private String name;
	private String description;
	private Date date;
	private boolean done;
	private Importance importance;
	public enum Importance {
		low,
		medium,
		high;
		
	}
	
	public toDo(String name, String description, Date date, boolean done, Importance importance) {
		super();
		this.name = name;
		this.description = description;
		this.date = date;
		this.done = done;
		this.importance = importance;
	}
	
	//GETTER
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public Date getDate() {
		return date;
	}
	public boolean getDone() {
		return done;
	}
	public Importance getImportance() {
		return importance;
	}
	// SETTER 
	public void setName(String name) {
		this.name = name;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setDone(boolean done) {
		this.done = done;
	}
	public void setImportance(Importance importance) {
		this.importance = importance;
	}
	
	// TO STRING
	@Override
	public String toString() {
		return "toDo \n" + 
			   "[name = " + name + ", \\r\\n" + 
			   "description = " + description + ", \r\n" + 
			   "date = " + date  + ", \r\n" + 
			   "done = " + done + ",  \r\n" +
			   "importance = " + importance + "]";
	}
	
	
	
	

}



