import static java.lang.Math.PI;

public class Cylinde {
    private double radios;
    private double height;

    public Cylinde(double radios, double height) {
        this.radios = radios;
        this.height = height;
    }

    public Cylinde() {
    }

    public double getRadios() {
        return radios;
    }

    public void setRadios(double radios) {
        this.radios = radios;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double findSquare(double radius,double height){
        double result= 2*PI * radius*( height + radius);
        return  result;
    }
    public double findVolume(double radius, double height){
        double result2=  (PI*radius*radius*height);
        return  result2;
    }

    @Override
    public String toString() {
        return "Cylinde{" +
                "radios=" + radios +
                ", height=" + height +
                '}';
    }
}
