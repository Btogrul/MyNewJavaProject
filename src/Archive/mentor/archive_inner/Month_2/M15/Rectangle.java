package Archive.mentor.archive_inner.Month_2.M15;

public class Rectangle implements Resize{
    int width;
    int height;


    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }




    @Override
    public void resize(int x) {
        this.width = this.width + ( this.width * x / 100 ) ;
        this.height = this.height + ( this.height * x / 100 ) ;


        System.out.println("width - i " +width + "|||    heighti ise " + height);
    }



    public void scaleDown(int x) {
        this.width = this.width - ( this.width * x / 100 ) ;
        this.height = this.height - ( this.height * x / 100 ) ;


        System.out.println("width - i " +width + "    |||     heighti ise " + height);
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
