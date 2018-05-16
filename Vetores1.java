
public class Vetores1 {

	public static void main(String[] args) {
		
		/*  ordenação de vetores  */
		
		int[] nums = {9,8,7,6,5,4,3,2,1,0};
		int k;
		
		
			for (int i = 0; i < nums.length; i++) {
				for (int j = 0; j < nums.length-1; j++) {
					if (nums[i] < nums[j]) {
						k = nums[j];
						nums[j] = nums[i];
						nums[i] = k;				
					}	
				}
			}		
		
			int y = nums.length-1;
			int z = 0; 

			while (y >= 0) {	
				System.out.println(nums[z]+"\t"+nums[y]);
				z++;
				y--;
			}	
	}
}
