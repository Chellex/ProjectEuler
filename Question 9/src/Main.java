public class Main {
	public static void main(String[] args){
		
		int cSquared = 0;
		
		for(int a = 0; a < 500; a++){
			for(int b = 0; b < 500; b++){
				cSquared = (int)Math.pow(a, 2) + (int)Math.pow(b, 2);
				if(a + b + Math.sqrt(cSquared) == 1000){
					System.out.println((long)(a*b*Math.sqrt(cSquared)));
				}
			}
		}
	}
}
