package polymorphism20;

public class ComicBook20 extends Book20 {
	private String characterName;

	public ComicBook20(double regularPrice, 
						String publisher, 
						int yearPublished,
						String characterName){
    	super(regularPrice, publisher, yearPublished);
    	setCharacterName(characterName);
	}
	
	//Overriding
	public double computeSalePrice(){
        return super.getRegularPrice() * 0.4;
    }
	
	public String getCharacterName() {
		return characterName;
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

}