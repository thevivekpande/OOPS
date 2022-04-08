package structuralPatterns;

class Volt{
	private int volt;
	public Volt(int volt) {
		this.setVolt(volt);
	}
	public int getVolt() {
		return volt;
	}
	public void setVolt(int volt) {
		this.volt = volt;
	}
}

class Socket{
	public Volt getVolt() {
		return new Volt(120);
	}
}

interface SocketAdapter{
	public Volt get120Volt();
	public Volt get10Volt();
	public Volt get5Volt();
}


class SocketAdapterImpl implements SocketAdapter{
	
	private Socket socket=new Socket();

	@Override
	public Volt get120Volt() {
		return socket.getVolt();
	}

	@Override
	public Volt get10Volt() {
		Volt v=socket.getVolt();
		return convertVolt(v, 10);
	}

	@Override
	public Volt get5Volt() {
		Volt v=socket.getVolt();
		return convertVolt(v, 5);
	}
	
	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolt()/i);
	}
	
}
public class AdapterTest {
	public static void main(String[] args) {
		SocketAdapter socketAdapter=new SocketAdapterImpl();
		Volt v5=getVolt(socketAdapter, 5);
		Volt v10=getVolt(socketAdapter, 10);
		Volt v120=getVolt(socketAdapter, 120);
		System.out.println("V5 volts using adapter : " + v5.getVolt());
		System.out.println("V10 volts using adapter : "+ v10.getVolt());
		System.out.println("V120 volts using adapter : "+v120.getVolt()); 
	}

	private static Volt getVolt(SocketAdapter socketAdapter, int i) {
		if(i==5) return socketAdapter.get5Volt();
		if(i==10) return socketAdapter.get10Volt();
		if(i==120) return socketAdapter.get120Volt();
		return null;
	}

}
