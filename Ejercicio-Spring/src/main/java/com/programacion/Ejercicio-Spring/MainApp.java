package com.programacion.Ejercicio-Spring;

public class MainApp {
	
	public static void main (String[] args) {
		ApplicationContextx applicationContext=new ClassPathXmlApplicationContext("spring_config.xml");

		Administrador administrador=(Administrador)applicacionContext.getBean("admin");
		
		administrador.imprimirDireccion();
		
		((ClassPathXmlApplicationContext)applicationContext).close();
	}

}
