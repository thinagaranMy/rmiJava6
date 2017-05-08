import java.rmi.Naming;

public class MyClient {

	public static void main(String[] args) {
		try {
			Adder stub = (Adder) Naming.lookup("rmi://localhost:5000/addRemote");
			System.out.println(stub.add(34, 4));
		} catch (Exception e) {
		}
	}
}
