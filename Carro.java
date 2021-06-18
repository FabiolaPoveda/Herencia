package herencia;

public class Carro {

	public static void main(String[] args) {
		
		Vehiculo vehiculo = new Vehiculo(true, true, true, true, true, true);
		Toyota toyota = new Toyota(true, true, true, true, true, true, false, false, true);

		toyota.manubrio();
		toyota.palanca();

	}

}
