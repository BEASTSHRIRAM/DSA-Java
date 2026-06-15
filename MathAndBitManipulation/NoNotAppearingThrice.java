//solving an array in which an element not appearing thrice
public class NoNotAppearingThrice {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 9, 4, 4, 4, 2, 2};
		int result = 0;

		for (int i = 0; i < 32; i++) {
		    int bitSum = 0;
		    for (int num : arr) {
		        if ((num & (1 << i)) != 0) {
		            bitSum++;
		        }
		    }
		    if (bitSum % 3 != 0) {
		        result |= (1 << i);
		    }
		}

		System.out.println("The unique number is: " + result);

    }
    

}