package Archive.dersler.archive_inner.Month_2.L13.Task_3;

import Archive.dersler.archive_inner.Month_2.L13.Task_2.Shape;

public class Rectangle extends Shape {
    @Override
    public void calculateArea(int a, int b) {
        super.calculateArea(a, b);  // super - bir ust parent hesab olunur - yeni esas parentin
        int area =a * b;
        System.out.println("salam -> yuxarida super istifade etdim. bu deyere fikir vermeyin " + area);
    }
}