package j_p1_baosic;

public class MaxElentinArray {
	
	    public static void main(String args[]){
	        int[] array = {5, -2, -19, 8, 15, 4};
	        int Maxarray = array[0];
	        for(int arrayO : array){
	        if(arrayO > Maxarray){
	        	Maxarray = arrayO;
	        
	        }
	        
	        }
	        System.out.println(Maxarray);
	        
	    }
}


