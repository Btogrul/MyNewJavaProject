package Archive.mentor.Month_4.M28.Task_28_1;
public class Student {
        int id;
        String name;
        String department;

        public Student(int id, String name, String department) {
            this.id = id;
            this.name = name;
            this.department = department;
        }


        int getId() {
            return id;
        }

        String getName() {
            return name;
        }

        String getDepartment() {
            return department;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", department='" + department + '\'' +
                    '}';
        }

}
