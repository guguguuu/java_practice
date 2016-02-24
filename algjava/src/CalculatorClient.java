import java.rmi.Naming;
import java.rmi.RemoteException;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;

public class CalculatorClient {

    public static void main(String[] args) {
        try {
            Calculator c = (Calculator)
                    Naming.lookup(
                            "rmi://localhost/CalculatorService");
            System.out.println("Hello!");
            System.out.println(c.boardCast("aaa",20));

            Runnable example = new CalculatorImpl(2000);
            Runnable example1 = new CalculatorImpl(3000);
            new Thread(example).start();
            new Thread(example1).start();




            System.out.println( c.sub(8, 3) );
            System.out.println( c.add(4, 5) );
            System.out.println( c.mul(3, 6) );
            System.out.println( c.div(9, 3) );
        }
        catch (MalformedURLException murle) {
            System.out.println();
            System.out.println(
                    "MalformedURLException");
            System.out.println(murle);
        }
        catch (RemoteException re) {
            System.out.println();
            System.out.println(
                    "RemoteException");
            System.out.println(re);
        }
        catch (NotBoundException nbe) {
            System.out.println();
            System.out.println(
                    "NotBoundException");
            System.out.println(nbe);
        }
        catch (
                java.lang.ArithmeticException
                        ae) {
            System.out.println();
            System.out.println(
                    "java.lang.ArithmeticException");
            System.out.println(ae);
        }
    }
}
