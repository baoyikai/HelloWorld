import java.util.ArrayList;
public class DNA{
	
//	1 It begins with a “start codon”: ATG.
//	2 It ends with a “stop codon”: TGA.
//	3 In between, each additional codon is a sequence of three nucleotides.
	
//	"ATGCGATACGCTTGA"
//	"ATGCGATACGTGA"
//	"ATTAATATGTACTGA"

	public boolean divisibleByThree(String dna) {
		int length = dna.length();
		if(length % 3 == 0) {
			return true;
		}else {
			return false;
		}	
	}
	
	public boolean checkStart(String dna) {
		int start = dna.indexOf("ATG");
		if (start == 0) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean checkstop(String dna) {
		int dnaLength = dna.length();
		String stop = dna.substring(dnaLength - 3,dnaLength);
		if (stop.equals("TGA")) {
			return true;
		}else {
			return false;
		}
	}
	
	
  public static void main(String[] args){
	ArrayList<String> testerList = new ArrayList<String>();
	testerList.add("ATGCGATACGCTTGA");
	testerList.add("ATGCGATACGTGA");
	testerList.add("ATTAATATGTACTGA");
	
	for (String tester:testerList) {
		
		DNA mydna = new DNA();
	    boolean step1 = mydna.divisibleByThree(tester);
	    boolean step2 = mydna.checkStart(tester);
	    boolean step3 = mydna.checkstop(tester);
	   
	    if (step1 && step2 && step3) {
	    	System.out.println("Check out!" + tester + " is a DNA");
	    }else {
	    	System.out.println(tester + " is not a DNA");
	    }
	}

  }
}