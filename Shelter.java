package entity;

public class Shelter{

	private String shelterName;
	private Pet[] pets;
	
	public Shelter(){
		shelterName = "No Name";
		pets = new Pet[15];
	}
	
	public Shelter(String shelterName, int size){
		this.shelterName = shelterName;
		pets = new Pet[size];
	}
	
	public void setShelterName(String shelterName){
		this.shelterName = shelterName;
	}
	
	public String getShelterName(){
		return shelterName;
	}
	
	public void insertPet(int pNo, Pet p){
		if(pNo>=0 && pNo<pets.length){
			pets[pNo] = p;
		}
	}
	
	public void removePet(int pNo){
		if(pNo>=0 && pNo<pets.length){
			pets[pNo] = null;
		}
	}
	
	public Pet getPet(int pNo){
		if(pNo>=0 && pNo<pets.length){
			return pets[pNo];
		}
		
		return null;
	}
	
	public void showShelter(){
		System.out.println("=========== "+shelterName+" ==============");
		
		double totalFee = 0;
		
		for(int i=0;i<pets.length;i++){
			if(pets[i]!=null){
				totalFee += pets[i].getFee();
				pets[i].showPet();
				System.out.println("---------------------");
			}
		}
		
		System.out.println("---------------------");
		System.out.println("Total Adoption Fee: "+totalFee);
		System.out.println("---------------------\n\n");
	}
	
	public String getShelterAsString(){
		String data = "";
		
		data+="=========== "+shelterName+" ==============\n";
		
		double totalFee = 0;
		int petCount = 0;
		
		for(int i=0;i<pets.length;i++){
			if(pets[i]!=null){
				
				totalFee += pets[i].getFee();
				petCount++;
				
				data += "~~~~~~~"+i+"~~~~~~~~\n";
				data += pets[i].toString();
				data += "---------------------\n";
			}
		}
		
		data+= "---------------------\n";
		data+= "Total Adoption Fee: "+totalFee+"\n";
		data+= "Total Pet Count: "+petCount+"\n";
		data+= "---------------------\n\n";
		
		return data;
	}
	
	
}