package com.tka.car;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarRentalSystem rentalSystem = new CarRentalSystem();
		
		Car car1=new Car("C001", "Toyota", "Canry", 60.0 );
		Car car2=new Car("C002", "Honda", "Accord", 70.0);
		
		Car car3=new Car("C003", "Maruti", "Thar", 150.0 );
		Car car4=new Car("C004", "Tata", "Nexon", 80.0);
		Car car5=new Car("C005", "Kia", "Seltos", 170.0);
		rentalSystem.addCar(car1);
		rentalSystem.addCar(car2);
		rentalSystem.addCar(car3);
		rentalSystem.addCar(car4);
		rentalSystem.addCar(car5);
		rentalSystem.menu();
	}

}
