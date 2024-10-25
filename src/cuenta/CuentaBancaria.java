package cuenta;

public class CuentaBancaria {
	private int id;
	long numeroCuenta;
	enum tipo{corriente,ahorro};
	tipo tipoCuenta;
	double saldo =0;
	double ingreso;
	double egreso;
	Persona persona;
	
	public CuentaBancaria(int id, long numeroCuenta, tipo tipoCuenta, double saldo,double ingreso,double egreso,Persona persona) {
		super();
		this.id = id;
		this.numeroCuenta = numeroCuenta;
		this.tipoCuenta = tipoCuenta;
		this.saldo = saldo;
		this.ingreso=ingreso;
		this.egreso=egreso;
		this.persona=persona;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(long numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public tipo getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(tipo tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getIngreso() {
		return ingreso;
	}

	public void setIngreso(double ingreso) {
		this.ingreso = ingreso;
	}

	
	public double getEgreso() {
		return egreso;
	}

	public void setEgreso(double egreso) {
		this.egreso = egreso;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
//	metodo para crear la cuenta bancaria asignando datos de la persona
	public void crear() {
		System.out.println("Crear cuenta a nombre de: ");
		System.out.println(persona.nombre + "  " +persona.apellido + " CI: "+ persona.cedula);
		System.out.println("Saldo inicial de: "+ saldo+"$");
		System.out.println();
	}
		public void consultar() {
		System.out.println("Saldo disponible: " + saldo+"$");
		
	}
	public void actualizar(double ingreso) {
		System.out.println("Se registro un pago de: "+ ingreso+"$");
		saldo=getSaldo()+ingreso;
		System.out.println("El saldo  actual es de: " + saldo+"$");
		System.out.println();
	}
	public void retirar(double egreso ) {
		if( egreso<=0 ) {
			 System.out.println("La cantidad a retirar debe ser mayor que cero.");
		}else if(getSaldo()< egreso) {
			 System.out.println("El retiro no se puede procesar por "
			 		+ "Saldo insuficiente");
			
		}else {
//			restamos el egreso con el saldo
			saldo =getSaldo()-egreso;
			
			System.out.println("Retiro exitoso");
			System.out.println("Saldo actual: " +saldo+"$");
		}
	}
	public void imprimir() {
		System.out.println("Bienvenido "+persona.nombre+" "+persona.apellido);
		System.out.println("Numero de cuenta: "+getNumeroCuenta());
		System.out.println("Tipo de cuenta: "+ getTipoCuenta());
		System.out.println("Saldo actual: "+getSaldo() +"$");
	}

	

}
