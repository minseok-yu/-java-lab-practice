public class Animal{
	public static void main(String[] args) {
		String name = "Arcs";
		float weight = (float)8.5565;
		String nameSlave = "SKKU";
		Cat cat = new Cat(name,weight,nameSlave);
		cat.getName();
		cat.setName("Arcs2");
		cat.getName();
		cat.getWeight();
		cat.setWeight((float)8.556);
		cat.getWeight();
		cat.getNameSlave();
		cat.setNameSlave("SNU");
		cat.getNameSlave();
		cat.bark();
		cat.getFood();
		
		
		
	}
}

class Mammal extends Animal{
	public void bark() {
		
	}
	
	public void getFood() {
		
	}
	
}

class Reptile extends Animal{
	public void getFood() {
		
	}
}

final class Cat extends Mammal{
	public Cat(String s1, float f, String s2) {
		name = s1;
		weight = f;
		nameSlave = s2;
	}
	public String name;
	public float weight;
	public String nameSlave;
	public void bark() {
		System.out.println("Meow");
		
	}
	public void getFood() {
		System.out.println("Fish");
		
	}
	public void setName(String s){
		this.name = s;
	}
	public void setWeight(float f){
		this.weight = f;
	}
	public void setNameSlave(String s){
		this.nameSlave = s;
	}

	
	public void getName(){
		System.out.print("Name: ");
		System.out.println(name);
	
	}
	public void getWeight(){
		System.out.print("Weight: ");
		System.out.println(weight);
	
	}
	public void getNameSlave(){
		System.out.print("NameSlave: ");
		System.out.println(nameSlave);
	
	}
	
}

final class Dog extends Mammal{
	public String name;
	public float weight;
	public String nameMaster;
	public Dog(String s1, float f, String s2) {
		name = s1;
		weight = f;
		nameMaster = s2;
	}
	public void bark() {
		System.out.println("Bowbow");
		
	}
	
	public void getFood() {
		System.out.println("Fish");
		
	}
	public void setName(String s){
		this.name = s;
	}
	public void setWeight(float f){
		this.weight = f;
	}
	public void setNameMaster(String s){
		this.nameMaster = s;
	}

	
	public void getName(){
		System.out.print("Name: ");
		System.out.println(name);
	}
	public void getWeight(){
		System.out.print("Weight: ");
		System.out.println(weight);
	
	}
	public void getNameMaster(){
		System.out.print("NameMaster: ");
		System.out.println(nameMaster);
	
	}
}

final class Crocodile extends Reptile{
	public String name;
	public float weight;
	public Crocodile(String s, float f) {
		name = s;
		weight = f;
	}
	public void getFood() {
		System.out.println("Meat");
	}
	public void setName(String s) {
		this.name = s;
	}
	public void setWeight(float f) {
		this.weight = f;
	}
	
	public void getName() {
		System.out.print("Name: ");
		System.out.println(name);
	}
	public void getWeight() {
		System.out.print("Weight: ");
		System.out.println(weight);
	}
	
}
