//Write a program to demonstrate RMI (Remote Method Invocation) in Java.
//step-1 Create a Remote Interface
//step-2 Implement the Remote Interface
//step-3 Write server program
//step-4 Write client program


// Remote Interface
import java.rmi.*;

public interface Hello extends Remote {
    String sayHello() throws RemoteException;
}

// Remote Implementation Class
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class HelloImpl extends UnicastRemoteObject implements Hello {
    protected HelloImpl() throws RemoteException {
        super();
    }

    public String sayHello() throws RemoteException {
        return "Hello from the RMI server!";
    }
}

// Server Program
import java.rmi.Naming;

public class Server {
    public static void main(String[] args) {
        try {
            HelloImpl obj = new HelloImpl();  // Create remote object
            Naming.rebind("HelloService", obj);  // Register in RMI Registry
            System.out.println("Server is ready.");
        } catch (Exception e) {
            System.out.println("Server Error: " + e);
        }
    }
}

// Client Program
import java.rmi.Naming;

public class RMI_Example {
    public static void main(String[] args) {
        try {
            Hello stub = (Hello) Naming.lookup("rmi://localhost/HelloService"); 
            String response = stub.sayHello();  
            System.out.println("Response: " + response);
        } catch (Exception e) {
            System.out.println("Client Error: " + e);
        }
    }
}
