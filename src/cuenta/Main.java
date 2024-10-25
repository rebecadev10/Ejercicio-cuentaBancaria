package cuenta;

import cuenta.CuentaBancaria.tipo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona cliente1=new Persona(30051282,"Rebeca","Rodriguez");
		CuentaBancaria cuenta1=new CuentaBancaria(1,1121278831,tipo.ahorro,0,0,0,cliente1);
//		creamos nuestra cuenta
		cuenta1.crear();
//		consulta inicial
		cuenta1.consultar();
//		abono a la cuenta
		cuenta1.actualizar(10);
		
		cuenta1.retirar(11);
		cuenta1.consultar();
		cuenta1.retirar(0);
		cuenta1.retirar(8);
		cuenta1.imprimir();
		
		
	}

}
