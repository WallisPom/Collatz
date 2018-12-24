import java.util.ArrayList;
//list is my other class with attributes iterations and values
public class Collatz {
						
	
	static ArrayList<list> mylist= new ArrayList<>();
	
	
public static void main(String[] args) {
		
		for(int a = 1; a <= 1000; a++) {
			list newList= collatzmethod(a);
			mylist.add(newList);
		}
		
		
		/*for(String tempvar: newList) {
			System.out.println(tempvar);
            System.out.println("Starting n : " + newList.getValue() + ", Iterations : " + newList.getIterations());
		
		 });	*/
		mylist.forEach(list-> {
            System.out.println(list.getIterations());
            
        });		
		
	}
			
	public static list collatzmethod(int n){
	
		list myobject = new list(1, 1);
		myobject.setValue(n);
		
		int i = 0;
	
		while(n > 1) {
			
		if(n % 2 == 0) {				//If n mod 2 is 0, it's even (divide by 2)
			n = (n/2);	
			//myobject.setValue(n);
		}
		else{
			n = n*3 + 1;	
			//myobject.setValue(n);
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