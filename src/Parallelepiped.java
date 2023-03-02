public class Parallelepiped {
    private double height;
    private double length;
    private  double width;

    public Parallelepiped(double height, double length, double width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public Parallelepiped() {
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double findSquare(double height, double length, double width){
      double result=2*((height * length) + (length * width) + (height * width));
        return result;
    }
    public double findVolume(double height, double length){
        double result2= (length*width*height);
        return  result2;
    }

    @Override
    public String toString() {
        return "Parallelepiped{" +
                "height=" + height +
                ", length=" + length +
                ", width=" + width +
                '}';
    }
}
