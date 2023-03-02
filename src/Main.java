import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Parallelepiped parallelepiped = new Parallelepiped();
        Cylinde cylinde = new Cylinde();
        while (true) {
            System.out.println("""
                    Salam! choose your next function
                    
                    find parallelepiped square - input square
                    find parallelepiped volume - input volume
                    find cylinde square - input square2
                    find cylinde volume - input volume2""");

            String function = scanner.next();
            switch (function) {
                case "square":
                    try {
                        System.out.println("Input height");
                        parallelepiped.setHeight(scanner.nextDouble());
                        System.out.println("Input length");
                        parallelepiped.setLength(scanner.nextDouble());
                        System.out.println("Input width");
                        parallelepiped.setWidth(scanner.nextDouble());
                        if (parallelepiped.getHeight() < 0 || parallelepiped.getLength() < 0 || parallelepiped.getWidth() < 0) {
                            throw new RuntimeException(" number can't be smallest 0");
                        }
                        System.out.println(parallelepiped.findSquare(parallelepiped.getHeight(), parallelepiped
                                .getLength(), parallelepiped.getWidth()));
                    } catch (ArithmeticException e) {
                        System.out.println("number can't be deleted to zero");
                    } catch (InputMismatchException e) {
                        System.out.println("number can't be word");
                    }
                    break;
                case "volume":
                    try {
                        System.out.println("Input height");
                        parallelepiped.setHeight(scanner.nextDouble());
                        System.out.println("Input length");
                        parallelepiped.setLength(scanner.nextDouble());
                        if (parallelepiped.getHeight() < 0 || parallelepiped.getLength() < 0) {
                            throw new RuntimeException(" number can't be smallest 0");
                        }
                        System.out.println(parallelepiped.findVolume(parallelepiped.getHeight(), parallelepiped
                                .getLength()));
                    } catch (ArithmeticException e) {
                        System.out.println("number can't be deleted to zero");
                    } catch (InputMismatchException e) {
                        System.out.println("number can't be word");
                    }
                    break;
                case "square2":
                    try{
                        System.out.println("Input radius");
                        cylinde.setRadios(scanner.nextDouble());
                        System.out.println("Input height");
                        cylinde.setHeight(scanner.nextDouble());
                        if(cylinde.getHeight()<0||cylinde.getRadios()<0){
                            throw  new RuntimeException("nimber can't be smallesy zero");
                        }
                        System.out.println(cylinde.findSquare(cylinde.getHeight(),
                                cylinde.getRadios()));
                    } catch (ArithmeticException e){
                        System.out.println("Number can't be deleted to zero");
                    } catch (InputMismatchException e){
                        System.out.println("Number can't be word");
                    }
                    break;
                case "volume2":
                    try{
                        System.out.println("Input radius");
                        cylinde.setRadios(scanner.nextDouble());
                        System.out.println("Input height");
                        cylinde.setHeight(scanner.nextDouble());
                        if(cylinde.getHeight()<0||cylinde.getRadios()<0){
                            throw  new RuntimeException("nimber can't be smallesy zero");
                        }
                        System.out.println(cylinde.findVolume(cylinde.getHeight(),
                                cylinde.getRadios()));
                    } catch (ArithmeticException e){
                        System.out.println("Number can't be deleted to zero");
                    } catch (InputMismatchException e){
                        System.out.println("Number can't be word");
                    }
            }
        }
    }
}

