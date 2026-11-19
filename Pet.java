package entity;
public class Pet{
	private String petName;
	private String petType;
	private double fee;
	
	public Pet(){
		System.out.println("E-Pet Created.");
	}
	
	public Pet(String petName, String petType, double fee){
		System.out.println("P-Pet Created.");
		setPetName(petName);
		setPetType(petType);
		setFee(fee);
	}
	
	public void setPetName(String petName){
		this.petName = petName;
	}
	
	public String getPetName(){
		return petName;
	}
	
	public void setPetType(String petType){
		this.petType = petType;
	}
	
	public String getPetType(){
		return petType;
	}
	
	public void setFee(double fee){
		this.fee = fee;
	}
	
	public double getFee(){
		return fee;
	}
	
	public void showPet(){
		System.out.println("Pet Name: "+petName);
		System.out.println("Pet Type: "+petType);
		System.out.println("Adoption Fee: "+fee+" USD");
	}
	
	public String toString(){
		return "Pet Name: "+petName+"\n"+
				"Pet Type: "+petType+"\n"+
				"Adoption Fee: "+fee+" USD"+"\n";
	}
	
}