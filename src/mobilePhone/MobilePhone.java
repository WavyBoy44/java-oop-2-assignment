package mobilePhone;

public class MobilePhone {
	// Please create 4 instance variables for our MobilePhone class:
	// 1.Brand
	// 2.Model
	// 3.Phone Number
	// 4.Storage Capacity
	// Think about what data types would work best with these fields :)

	private String brand, model, operatingSystem;
	private long number, storage;
	
	// Let's create a public constructor for our MobilePhone class
	// Given 4 pieces of information as input (brand, model, operatingSystem, and
	// storageCapacity),
	// Set the instance variables of your object accordingly
	
	public MobilePhone(String brand, String model, String operatingSystem, long storage, long number) {
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.storage = storage;
		this.number = number;
	}

	
	
	// Create getter and setter methods for each of our instance variables
	// Please at least write 1 set of getter/setter by hand. After you get the
	// hang of it, you can go to 'source'->'generate getters and setters'->checkmark
	// all of the fields you want
	// getters and setters for->'generate'
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public long getStorage() {
		return storage;
	}

	public void setStorage(long storage) {
		this.storage = storage;
	}

	// Lets make a couple custom phone-related methods:

	// 1. A makeCall method that takes a phone number as a parameter and then
	// prints:
	// 'We are calling {the input phone number} from our {brand} {model} phone!'

	public void makeCall(long number) {
		System.out.println("We are calling " + number + " form our "+ this.brand + " " + this.model + " phone");
	}
	
	// 2. An installApp method that takes an app name String as input and then
	// prints:
	// 'Installing {input app name} on our {brand} {model} phone!'
	
	public void installApp(String app) {
		System.out.println("Installing " + app + " on our " + this.brand + " " + this.model + " phone!");
	}

	
	// 3. Lastly, a displayInfo method that takes no parameters and prints all
	// information about
	// the phone:
	// Brand: {brand}
	// Model: {model}
	// Phone Number: {phone number}
	// Storage Capacity: {storage capacity}GB
	
	public void displayInfo() {
		System.out.println("Brand:\t\t\t" + this.brand);
		System.out.println("Model:\t\t\t" + this.model);
		System.out.println("Phone Number:\t\t" + this.number);
		System.out.println("Storage Capacity:\t" + this.storage);
	}



}
