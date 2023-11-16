package Archive.dersler.thirteen_to_20.L15.Task_2;

public class ResizableRectangle implements Resizable {
    int width;
    int height;

    public ResizableRectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void resize(int count) {
        this.width *= count;
        this.height *= count;

        System.out.println( "width : "  + width + " height : " + height );
    }
}
