
public class IterationMathLib 
extends MathLib {

	@Override
	int gcd(int x, int y) {
	System.out.println("iteration gcd not implemented");
	int temp;
	while(y!=0) {
		if(x>=y&&x!=0) {
		temp=x;
		x=y;
		y=temp%y;
	}
	
	}
	return x;
	
}


int ackerman(int x, int y) {
	int temp2;
	int temp3;
	while(x!=0) {
		if(y==0) {
			x-=1;
			y=1;
		}
		
		  if(x!=0 && y!=0) {
			  temp2 = x;
			  x -=1; 
			  temp3=y;
			  y= ackerman(temp2, temp3-1); }
		 
	}
	return y+=1;
	
	
}

int fibonaci(int x) {
	// TODO Auto-generated method stub
	while(x!=0) {
		if(x==1) {
			return 1;
		}
		if(x>1) {
			return fibonaci(x-1) + fibonaci(x-2);
		}
		}
	return 0;
	}

int hanoi(int n) {
	while(n!=1) {
		if(n>1) {
			return 2*hanoi(n-1)+1;
		}
	}
	return 1;
}
	
}












