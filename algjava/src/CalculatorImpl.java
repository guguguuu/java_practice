public class CalculatorImpl
        extends
        java.rmi.server.UnicastRemoteObject
        implements Calculator,Runnable {

    // Implementations must have an
    //explicit constructor
    // in order to declare the
    //RemoteException exception
    public CalculatorImpl()
            throws java.rmi.RemoteException {
        super();
    }
    private int starttime;
    public CalculatorImpl(int starttime)
            throws java.rmi.RemoteException{
        this.starttime = starttime;
    }//implement rennable

    public long add(long a, long b)
            throws java.rmi.RemoteException {
        System.out.println ("Doing addition");
        return a + b;
    }

    public long sub(long a, long b)
            throws java.rmi.RemoteException {
        System.out.println ("Doing subtraction");
        return a - b;
    }

    public long mul(long a, long b)
            throws java.rmi.RemoteException {
        System.out.println ("Doing multiplication");
        return a * b;
    }

    public long div(long a, long b)
            throws java.rmi.RemoteException {
        System.out.println ("Doing division");
        return a / b;
    }
    public String boardCast(String a, int b)
            throws java.rmi.RemoteException {
        System.out.println("Boardcast a message");
        String message = Integer.toString(b)+a;
        return message;
    }

    public void run() {

        try {
            Thread.sleep(starttime);
        }
        catch(InterruptedException e) {
        System.out.println("error");
        };
        for(int i=0;i<20;i++) {
            System.out.println("aa");
            System.out.println();

        }
        System.out.println("hh");

    };



}
