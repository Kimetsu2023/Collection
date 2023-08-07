package practice;

import java.time.LocalDate;

public class Task implements Comparable<Task>  {
	private LocalDate date;
	private String task;


    public Task(LocalDate date,String task) {
		this.date = date;
        this.task = task;
    }

    public LocalDate getDate() {
	    return date;
    }

	public String getTask() {
		return task;
	}



        @Override
    	public int compareTo(Task other) {
    		return this.date.compareTo(other.getDate());
    	}
}
