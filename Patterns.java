public class Patterns {
    public static void main(String[] args) {
        System.out.println("Pattern 1");
        Pattern1(4);
        System.out.println("Pattern 2");
        Pattern2(4);
        System.out.println("Pattern 3");
        pattern3(4);
        System.out.println("Pattern 4");
        Pattern4(4);
        System.out.println("Pattern 5");
        Pattern5(4);
        System.out.println("Pattern 28");
        Pattern28(6);
        System.out.println("Pattern 9");
        pattern9(6);
        System.out.println("Pattern 11");
        Pattern11(5);
        System.out.println("Pattern 12");
        Pattern12(5);
        System.out.println("Pattern 31");
        pattern31(5);

        
    }
    static void Pattern1(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
            
        }

    
    }
    static void Pattern2(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
            
        }
        
    }
    static void pattern3(int n){
        for(int row=1;row<=n;row++){
            for(int col =(n-row)+1 ; col >= 1; col--){
                System.out.print("* ");
            }
            System.out.println();
            
        }

    }
    static void Pattern4(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
            
        }

    }
    static void Pattern5(int n){
        for(int row=1;row<=2*n;row++){
            int totalcols=row>n?2*n-row:row;
            for(int col=1;col<totalcols;col++){
                System.out.print("* ");
    }
            
            System.out.println();
            
        }
        
    }
    static void Pattern28(int n){
        for(int row=0;row<=2*n;row++){
            int totalcols=row>n?2*n-row:row;
            int numofspaces=n-totalcols;
            for(int s=0;s<numofspaces;s++){
                System.out.print(" ");

            }
            for(int col=1;col<totalcols;col++){
                System.out.print("* ");
            }
            
            System.out.println();
            
        }

    }
    static void pattern9(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                if ((row + col) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                System.out.print("0 ");
            }
        }
        System.out.println();
        }
    
    }
    static void Pattern11(int n) {
    for (int row = 1; row <= n; row++) {
        // Spaces
        for (int spc = 0; spc < n - row; spc++) {
            System.out.print("  "); // double space for alignment
        }
        // Descending numbers
        for (int col = row; col >= 1; col--) {
            System.out.print(col + " ");
        }
        // Ascending numbers
        for (int col = 2; col <= row; col++) {
            System.out.print(col + " ");
        }
        // New line after each row
        System.out.println();
    }
    }
    static void Pattern12(int n) {
    for (int row = 1; row <= 2*n; row++) {
        // Spaces
        int c=row>n?2*n-row:row;
        for (int spc = 0; spc < n - c; spc++) {
            System.out.print("  "); // double space for alignment
        }
        // Descending numbers
        for (int col = c; col >= 1; col--) {
            System.out.print(col + " ");
        }
        // Ascending numbers
        for (int col = 2; col <= c; col++) {
            System.out.print(col + " ");
        }
        // New line after each row
        System.out.println();
    }
    }
    static void pattern31(int n){
        // for(int i=1;i<2*n;i++) {
		// 	for(int j=1;j<2*n;j++) {
		// 		int top = i;
		// 		int bottom = 2*n-i;
		// 		int left = j;
		// 		int right = 2*n-j;
				
		// 		int element = n*2-3-Math.min(Math.min(top, bottom), Math.min(right, left));
		// 		System.out.print(element+" ");
		// 	}
		// 	System.out.println();
		// }
        int OrgN=n;
        n=2*n;
        for(int row=1;row<=n;row++){
            for(int col=1;col<n;col++){
                int ateveryindex=OrgN*2-4-Math.min(Math.min(row, col), Math.min(n-row,n-col));
                System.out.print(ateveryindex+" ");

            }
            System.out.println();
        }
    }



}
