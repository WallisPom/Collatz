import java.util.ArrayList;
//list is my other class with attributes iterations and values
public class CollatzWallisPom10197617 {
						
	
	static ArrayList<list> mylist= new ArrayList<>();
	
	
public static void main(String[] args) {
		
		for(int a = 1; a <= 1000; a++) {
			list newList= collatzmethod(a);
			mylist.add(newList);
		}
		
		mylist.forEach(list-> {
            System.out.println("Iterations: " + list.getIterations());
            
        });		
		
	}
			
	public static list collatzmethod(int n){
	
		list myobject = new list(1, 1);
		myobject.setValue(n);
		
		int i = 0;
	
		while(n > 1) {
			
		if(n % 2 == 0) {				//If n mod 2 is 0, it's even (divide by 2)
			n = (n/2);	
		}
		else{
			n = n*3 + 1;	
		}
		i++;

	for(list var: mylist) {
		if(var.getValue() == n) {
			myobject.setIterations(i);
			return myobject;
			}
		}
	}
	
		myobject.setIterations(i);
	return myobject;
	
}
}