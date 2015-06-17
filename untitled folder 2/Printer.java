package Class;

public class Printer {
	private String name;
	private int amountOfPaper;
	private int amountOfInk;
	private int printedPages;
	private static int printPage = 0;
	
	public Printer(){
		this.name = "DefaultPrinter";
		this.amountOfPaper = 0;
		this.amountOfInk = 0;
		this.printedPages = 0;
	}
	
	public Printer(String name1){
		this.name = name1;
		this.amountOfPaper = 0;
		this.amountOfInk = 0;
		this.printedPages = 0;
	}
	
	public boolean isThereInk(){
		return (amountOfInk == 0)? false:true;
	}
	
	public boolean isTherePaper(){
		return (amountOfPaper == 0)? false:true;
	}
	
	public int printedPages(){
		return printedPages;
	}
	
	public void addPaper(int amountOfPaper){
		if(this.amountOfPaper <= 100){
			this.amountOfPaper += amountOfPaper;
		}else{
			
		}
	}
	public void addMaxInk(){
		amountOfInk = 100;
	}
	public void printPages(int numOfPages){
		for(int i = numOfPages; i >0; i++){
			amountOfInk -= 3;
			amountOfPaper --;
			printedPages ++;
			printPage++;
			if (amountOfPaper == 0 || amountOfInk == 0 ){
				break;
			}
		}
		
	}
	public String toString(){
		String t = name + " " ;
		if (amountOfPaper == 0 && amountOfInk ==0){
			t += "No ink nor paper";
		}else if(amountOfPaper > 0 && amountOfInk >0){
			t += "Ready";
		}else if( amountOfPaper == 0 && amountOfInk > 0){
			t += " No paper ";
		}else if( amountOfPaper > 0 && amountOfInk ==0){
			t+=" No ink";
		}
		return t;
		
	}

	public static int getPrintPage() {
		return printPage;
	}

	
	
	
	
	
	
}
