import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AdderRemote extends UnicastRemoteObject implements Adder {

	private static final long serialVersionUID = 1L;

	public AdderRemote() throws RemoteException {
		super();
	}

	public int add(int x, int y) throws RemoteException {
		return x + y;
	}

}
