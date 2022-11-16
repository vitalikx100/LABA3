import functions.*;
import functions.ArrayTabulatedFunction;

public class Main {
    public static void main(String[] args)
    {
       double leftX=0;
       double rightX=5;
       double values[]={-1.0, 1.0,3.0,5.0,7.0};


        TabulatedFunction temp2 = null;
        TabulatedFunction temp= null;
        FunctionPoint point = new FunctionPoint(2.5, 5);
        try {
            temp2 = new ArrayTabulatedFunction(leftX, rightX, values);
            temp = new LinkedListTabulatedFunction(leftX, rightX, values);
        } catch (InappropriateFunctionPointException | IllegalArgumentException e) {
            e.printStackTrace();
        }

        temp.print();
        System.out.println();
        temp2.print();

        try {
            temp.addPoint(point);
            temp2.addPoint(point);
        } catch (InappropriateFunctionPointException e) {
            e.printStackTrace();
        }

        temp.print();
        System.out.println();
        temp2.print();



    }
}

