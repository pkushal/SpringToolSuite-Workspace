public class Power {
	static double ans=1;

	public static void main(String[] args) {
		Power p = new Power();
//		System.out.println("The result is : " +p.powrecursive(2, 5));
//		p.pow(2);
		System.out.println("The answer is : "+p.pow(0.00001, 2147483647));
	}
	
	public double powe(double x, int n){
		int m=Math.abs(n);
		int count=1;
		while(m>0){
			int bin=m&1;
			if(bin==1){
				
					ans*=x;
				
			}
			x=x*x;
			m=m>>1;
		}
		if(n<0){
			if(ans==0){
				return 0;
			}else{
				return 1/ans;
			}
		}
		else{
			return ans;
		}
	}
	
	
	public double pow(double x, int n){
		int m=Math.abs(n);
		int count=1;
		while(m!=0){
			int bin=m&1;
			if(bin==1){
				for(int j=0; j<count; j++){
					ans*=x;
				}
			}
			count*=2;
			m=m>>1;
		}
		if(n<0){
			if(ans==0){
				return 0;
			}else{
				return 1/ans;
			}
		}
		else{
			return ans;
		}
	}
	


	public double powrecursive(double x, int n) {
		if (n == 0)
			return 1;
		ans *= x;
		powrecursive(x, n - 1);
		return ans;
	}
}