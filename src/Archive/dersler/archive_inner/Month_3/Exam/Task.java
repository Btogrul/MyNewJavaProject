package Archive.dersler.archive_inner.Month_3.Exam;

import Archive.dersler.archive_inner.Month_3.L22.Book;

import java.util.List;

public class Task implements Comparable<Task>, TaskManager{
    String name;
    PriorityLevel priority;








    @Override
    public void new_task(String name, PriorityLevel priority) {
        this.name = name;
        this.priority = priority;
    }




    @Override
    public void delete(String name,List<Task> x) {
        if (this.name.equals(name)){
            x.remove(this.name);
        }else{
            System.out.println("bele bir task yoxdur");
        }
    }

    @Override
    public void display(List<Task> x) {

        for (Task y : x ) {
            System.out.println(y);
        }

    }

    public String getName() {
        return name;
    }

    public PriorityLevel getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Task o) {
        return this.priority.compareTo(o.getPriority());
    }

    public Task(String name, PriorityLevel priority) {
        this.name = name;
        this.priority = priority;
    }
    public Task() {
    }


    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", priority=" + priority +
                '}';
    }
}
