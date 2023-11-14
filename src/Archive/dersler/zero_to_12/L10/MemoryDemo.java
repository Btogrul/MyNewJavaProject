package Archive.dersler.zero_to_12.L10;

public class MemoryDemo {
    public void stackVsHeap() {
        int stack_1 = 12;
        double stack_2 = 1.2;
        boolean stack_3 = true;
        char stack_4 = 'A';



        ObjectForMemoryDemo newPerson = new ObjectForMemoryDemo("Toghrul", 1997,false);


        System.out.println("Stack memory:");
        System.out.println("*  " + stack_1);
        System.out.println("*  " + stack_2);
        System.out.println("*  " + stack_3);
        System.out.println("*  " + stack_4);
        System.out.println("-----------------");

        System.out.println(" Heap memory" + newPerson );
    }

}
