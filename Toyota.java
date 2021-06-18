package herencia;
import java.util.Scanner;
public class Toyota extends Vehiculo {
	
	private boolean tienetorre;
	private boolean tienealarma;
	private boolean tienepito;
	
	static Scanner lector = new Scanner(System.in);
	public Toyota(boolean tienellantas, boolean tieneluces, boolean tieneasientos, boolean tienemotor, boolean tienemanubrio, boolean tienepalanca, boolean tienetorre,boolean tienealarma, boolean tienepito) {
		super(tienellantas, tieneluces, tieneasientos, tienemotor, tienemanubrio, tienepalanca);
		this.tienetorre = tienetorre;
		this.tienealarma = tienealarma;
		this.tienepito = tienepito;
		
	}
	public void manubrio() {
		System.out.println("Girar:");
		System.out.println("1. A la izquiera");
		System.out.println("2. A la derecha");
		String dirigir = lector.next();
		switch (dirigir) {
		case "1":
			System.out.println("El auto está girando a la izquierda");
		break;
		case "2":
			System.out.println("El auto está girando a la derecha");
		break;
		}
	}
	public void palanca() {
		System.out.println("Cambiar la velocidad:");
		System.out.println("1 /t"
				+ "2"
				+ "3"
				+ "4"
				+ "5"
				+ "6"
				+ "R"
				+ "N");
		String velocidad = lector.next();
		switch (velocidad) {
		case "1":
			System.out.println("El auto está en velocidad 1");
		break;
		case "2":
			System.out.println("El auto está en velocidad 2");
		break;
		case "3":
			System.out.println("El auto está en velocidad 3");
		break;
		case "4":
			System.out.println("El auto está en velocidad 4");
		break;
		case "5":
			System.out.println("El auto está en velocidad 5");
		break;
		case "6":
			System.out.println("El auto está en velocidad 6");
		break;
		case "R":
			System.out.println("El auto está en retroceso");
		break;
		case "N":
			System.out.println("El auto está en neutro");
		break;
		}
	}
	
	public void moverse(double Velocidad) {
		System.out.println(" " + Velocidad + " km/h");
	}

}
