package Archive.dersler.archive_inner.Month_3.Exam;

public enum PriorityLevel {
    LOW,
    MEDIUM,
    HIGH;


    String final_priority;

    PriorityLevel(PriorityLevel priority) {
        switch (priority){
            case LOW -> final_priority = "LOW";
            case MEDIUM -> final_priority = "MEDIUM";
            case HIGH -> final_priority = "HIGH";
            default -> final_priority = "wrong pick";

        }
    }

    PriorityLevel() {

    }
}
