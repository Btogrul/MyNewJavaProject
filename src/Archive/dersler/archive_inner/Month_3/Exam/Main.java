package Archive.dersler.archive_inner.Month_3.Exam;

import Archive.dersler.archive_inner.Month_3.L22.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user_answer;
        Task new_task = new Task();
        List <Task> my_task = new ArrayList<>();
        my_task.add(new Task("Custom Task High",PriorityLevel.HIGH));
        my_task.add(new Task("task medium", PriorityLevel.MEDIUM));
        my_task.add(new Task("custom low", PriorityLevel.LOW));

        System.out.println("Yeni Task elave etmek isteyirsiz ? he/yox");
        user_answer = sc.next();
        if (user_answer.equals("he")){
            PriorityLevel task_priority = null;
            System.out.println(" name of the task ");
            String new_name = sc.next();
            System.out.println("Set priority  low/ medium/ high");
            String priority = sc.next();
            switch (priority){
                case "low" -> task_priority = PriorityLevel.LOW;
                case "medium" ->task_priority = PriorityLevel.MEDIUM;
                case "high" -> task_priority = PriorityLevel.HIGH;
                default -> System.out.println("wrong");
            }
            new_task.new_task(new_name, task_priority);



        } else if (user_answer.equals("yox")){
            System.out.println("movcud siyahi ");
            Collections.sort(my_task);

            for (Task x : my_task) {
                System.out.println(x);
            }

        }else{
            System.out.println(" kodu tam bitirmedim");
        }



    }



}
