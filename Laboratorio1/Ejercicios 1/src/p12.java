

public class p12 {

	public static void main(String args[]) {
		int a=12,b,i;
		b=a;
	    for(i=2; i<b;i++) {
	    	if(a%i==0) {
	    		System.out.println(+i);
	    		a=a/i;
	    		i=2;
	    	}
	    }
		
	}
}