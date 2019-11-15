

public class Contexto {
private Transport transport;
	
	public Contexto()
	{}
	
	public void SetTeacher( Transport transport) {
		this.transport = transport;
	}
	
	
	public void Teach() {
		transport.GoToAirport();
	}
}
