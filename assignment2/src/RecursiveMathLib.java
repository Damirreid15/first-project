

public class RecursiveMathLib 
extends MathLib{

	@Override
	int gcd(int x,int y) {
	if(y==0) {
		return x;
	}
	if(x>=y&& x !=0) {
	
return gcd(y,x %y);	
}
	return 0;
	}

int ackerman(int x, int y) {
	if(x==0) {
		return y+1;
		
		
		
		
	}
	if(y==0) {
		
		return ackerman(x-1,1);
		
		
	}
	else if(x!=0&&y!=0) {
		
		return ackerman(x-1,ackerman(x,y-1));
		
		
	}
	
	
	return 0;
	
}

int fibonaci(int x) {
	
	if(x==0) {
		return 0;
		
		
		
	}
	if(x==1) {
		
		return 1;
	}
	
	if(x>1) {
		
		return fibonaci(x-1)+fibonaci(x-2);
	}
	
	return 0;
	
	
	
}

int hanoi(int n) {
	
	if (n==1) {
		return 1;
		
		
	}
	if(n>1) {
		
		return 2*hanoi(n-1)+1;
		
		
	}
	
	return 0;
	
	
}







}


