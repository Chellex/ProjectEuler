public class Main {
	public static void main(String args[]){
		greatestPrimeFactor(600851475143l);
	}
	
	public static boolean isPrime(long number){
		for(int x = 2; x < number; x++){
			if(number % x == 0){
				return false;
			}
		}
		return true;
	}
	
	public static void greatestPrimeFactor(long number){
		for(long x = (long)Math.floor(Math.sqrt(number)); x > 0; x--){
			if(number % x == 0){
				if(isPrime(x) && x > 1){
					System.out.println("GPF so FAR = " + x);
					System.exit(0);
				}
			}
		}
	}
}
