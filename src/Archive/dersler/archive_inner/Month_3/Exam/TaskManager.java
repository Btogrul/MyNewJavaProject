package Archive.dersler.archive_inner.Month_3.Exam;

import java.util.List;

public interface TaskManager {
     void new_task(String name, PriorityLevel priority);
     void delete(String name, List<Task> x);
     void display(List<Task> x);
}
