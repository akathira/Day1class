package com.test.oops.encapsulation.statictest;



public class Investors {
	private int id;
	private String name;
	private String address;
	private double amount;
	static int count;

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Investors.count = count;
	}

	@Override
	public String toString() {
		return "Investors [id=" + id + ", name=" + name + ", address=" + address + ", amount=" + amount + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Investors(int id, String name, String address, double amount) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.amount = amount;
		count++;
	}

	public Investors() {
		count++;

	}

}
	