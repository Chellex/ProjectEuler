//Chris, make this faster.

public class Main {

	public static void main(String[] args){
		int count = 0;
		int highest = 0;
		long tri = 0;
		long prevSum = 0;

		for(int x = 1; x < 5000000; x++){
			tri = x + prevSum;
			
			for(long i = 1; i <= tri; i++){
				if(tri % 10 == 0 || tri % 3 == 0){
					if(tri % i == 0){
						count += 1;
						if(count > highest){
							highest = count;
							System.out.println(highest + ", Tri = " + tri);
						}
						if(count >= 200){
							System.out.println(count + ", " + tri);
						}
						if(count >= 500){
							System.out.println(tri);
							System.exit(0);
						}
					}
				}else{
					break;
				}
			}
			count = 0;
			prevSum = tri;
		}
	}
}
