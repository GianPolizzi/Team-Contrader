package prova1;

public class AccorciaStringa {
	
	//Classe principale
	
private String urlOriginale;
	
	public AccorciaStringa(String url) {
		this.urlOriginale = url;
	}
	
	public void convertiURL(String url) {
		if(verificaURL(url)) {
			String first;
			String second;
			
			first = url.substring(12, 17);
			second = url.substring(24, 26);
			
			System.out.println("URL Short: "+first+"."+second);
		}
		
	}
	
	public boolean verificaURL(String url) {
		String protocol;
		String proDef = "http";
		protocol = url.substring(0, 4);
		
		if(protocol.equals(proDef)) {
			return true;
		}
		else {
			System.out.println("ERROR! URL non valido!");
			return false;
		}
	}
	

}
