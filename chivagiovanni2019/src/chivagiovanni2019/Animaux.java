package chivagiovanni2019;

public class Animaux {
	private String type;
	private int age;
	private double weight;

	public Animaux(String type, int age, double weight) {
		this.type = type;
		this.age = age;
		this.weight = weight;
	}
	
	public Animaux() {
	}
	public void sleep() {
		System.out.println("Je dors");
	}
	public void move() {
		System.out.println("Je me déplace");
	}
	public void eat() {
		System.out.println("Je mange");
	}
	
	
	public String toString() {
		return "Animaux [type=" + type + ", age=" + age + " ans, weight=" + weight + "kg]";
	}

	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public static void main(String[] args) {
		
		Animaux felix = new Animaux();
		felix.type = "chat";
		felix.age = 5;
		felix.weight = 3;
		
		Animaux milou = new Animaux();
		milou.type = "chien";
		milou.age = 7;
		milou.weight = 8;

	}

}