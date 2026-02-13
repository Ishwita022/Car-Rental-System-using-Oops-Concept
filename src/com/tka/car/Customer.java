package com.tka.car;

public class Customer {
private String name;
private String id;
private long mobileno;

public Customer(String name, String id, long mobileno) {
	this.name=name;
	this.id=id;
	this.mobileno=mobileno;
}

public String getName() {
	return name;
}

public String getId() {
	return id;
}

public long getMobileno() {
	return mobileno;
}


}
