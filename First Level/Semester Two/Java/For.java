
import java.util.*;
public class For {
    public static void main (String[]u){



/*
///////////////////////////////

for(int i = -2; i <= 13; i++) {
System.out.print("#");
System.out.println("##");
}
////////////////////////////////
int xla;
for (int i=0;i<5;i++){
	for (int j=i;j<5;j++){
	System.out.print("*");
    }
    for(int s=1;s<=i;s++){
	System.out.print(" ");
	}
	for(int sp=2;sp<+i ;sp++){
	System.out.print(" ");
	}
    if(i==0){
	xla=0;
	}else{
		xla=i-1;
	}

	do{
	System.out.print("*");
	xla++;
     }while(xla<4);
 System.out.println();
}
//   //     //
for(int i=1;i<5;i++){
    for (int j=1;j<=i;j++){
	System.out.print("*");
	}
	for(int s=i;s<4;s++){
    System.out.print(" ");
	}
	for(int b=i;b<3;b++){
	System.out.print(" ");
	}
	if(i==4){
		xla=1;
		}else{
			xla=0;
	}
	do{
		System.out.print("*");
		xla++;
     }while(xla<=i);
System.out.println();
}
/////////////////////////////////
System.out.println("");
//////////////////////
for(int i=0;i<5;i++){
	for(int j=i;j<4;j++){
		System.out.print(" ");
	}
	for(int k=0;k<=i;k++){
		System.out.print("*");
	}
	for(int l=0;l<i;l++){
		System.out.print("*");
	}System.out.println();
}

	for(int i=0;i<4;i++){
		for(int s=0;s<=i;s++){
		System.out.print(" ");
        }
        for(int j=i;j<4;j++){
		System.out.print("*");
	    }
	    for(int j=i;j<3;j++){
	  System.out.print("*");
	    }System.out.println();

	}


/////////////////////////////////
System.out.println("");
///////////////////////////////////////
for(int i=0;i<4;i++){
		for(int s=0;s<=i;s++){
		System.out.print(" ");
        }
        for(int j=i;j<4;j++){
		System.out.print("*");
	    }
	    for(int j=i;j<3;j++){
	  System.out.print("*");
	    }System.out.println();

	}
/////////////////////////////////
System.out.println("");
///////////////////////////////////
*/
for(int i=0;i<5;i++){

	for(int j=i;j<4;j++){
		System.out.print(" ");
	}
	for(int k=0;k<=i;k++){
		System.out.print("*");
	}
	for(int l=0;l<i;l++){
		System.out.print("*");
	}System.out.println();
}
System.out.println("");

/////////////////////////////////////

for (int i = 0;i <= 5; ++i){
	for (int j = 0;j <= i; ++j){
	System.out.print(" ");
   }
   for (int k = i;k <=5; ++k){
   		System.out.print("*");
		   }System.out.println("");
}

////////////////////////////////////////////////
	/*	for (int i = 0;i <= 5; ++i){
			for (int j = i;j <= 5; ++j){
				System.out.print(" ");
			}
         for (int k = 0;k <=i; ++k){
				System.out.print("*");
			}
		   System.out.println("");
}*/

////////////////////////////////////////////////////////
//System.out.println("");
/*
	for (int row = 0; row <= 5; ++row) {  // Use row and col, NOT i and j, or x and y
       for (int col = row; col<=5; col++) {
	         System.out.print("*");
		      }
		      System.out.println("");
		  }
*/
/////////////////////////////////////////////////////////
/*
	//int sizeA = 5;    // size of the board
	 for (int i = 0; i <= 5; ++i) {  // Use row and col, NOT i and j, or x and y
		 for (int j = 0; j<=i; ++j) {
           System.out.print("*");
		      }
		      System.out.println("");

     }*/
		//////////////////////////////////////////////////



		/*
    int sum = 0;          // Store the accumulated sum, init to 0
      double average;       // average in double
      int lowerbound = 1;   // The lowerbound to sum
      int upperbound = 10; // The upperbound to sum

      // Use a for-loop to sum from lowerbound to upperbound
      for (int number = lowerbound; number <= upperbound; ++number) {
         sum += number;     // same as "sum = sum + number"
      }System.out.println(sum);*/
/////////////////////////////////////////////////

/*
PrintPatterns aPrintPatterns = new PrintPatterns();

        int size = 7;
        System.out.println("Pattern A");
        aPrintPatterns.printPatternA(size);
        System.out.println("Pattern B");
        aPrintPatterns.printPatternB(size);
        System.out.println("Pattern C");
        aPrintPatterns.printPatternC(size);
        System.out.println("Pattern D");
        aPrintPatterns.printPatternD(size);
        System.out.println("Pattern E");
        aPrintPatterns.printPatternE(size);
        System.out.println("Pattern F");
        aPrintPatterns.printPatternF(size);
        System.out.println("Pattern G");
        aPrintPatterns.printPatternG(size);
        System.out.println("Pattern H");
        aPrintPatterns.printPatternH(size);
        System.out.println("Pattern I");
        aPrintPatterns.printPatternI(size);
        System.out.println("Pattern J");
        aPrintPatterns.printPatternJ(size);
        System.out.println("Pattern K");
        aPrintPatterns.printPatternK(size);
        System.out.println("Pattern L");
        aPrintPatterns.printPatternL(size);
        System.out.println("Pattern M");
        aPrintPatterns.printPatternM(size);
        System.out.println("Pattern N");
        aPrintPatterns.printPatternN(size);
        System.out.println("Pattern O");
        aPrintPatterns.printPatternO(size);
        System.out.println("Pattern P");
        aPrintPatterns.printPatternP(size);
        System.out.println("Pattern Q");
        aPrintPatterns.printPatternQ(size);
        System.out.println("Pattern R");
        aPrintPatterns.printPatternR(size);
        System.out.println("Pattern S");
        aPrintPatterns.printPatternS(size);
        System.out.println("Pattern T");
        aPrintPatterns.printPatternT(size);
        System.out.println("Pattern U");
        aPrintPatterns.printPatternU(size);

    }


    private void printPatternA(int size)
    {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    private void printPatternB(int size)
    {
        for (int i = size; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    private void printPatternC(int size)
    {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print(( j >= i ? "# " : "  "));
            }
            System.out.println();
        }
    }

    private void printPatternD(int size)
    {
        for (int i = size; i >= 1; i--) {
            for (int j = 1; j <= size; j++) {
                System.out.print(( j >= i ? "# " : "  "));
            }
            System.out.println();
        }
    }

    private void printPatternE(int size)
    {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print((i%size <= 1) || (j%size <= 1) ? "# " : "  ");
            }
            System.out.println();
        }
    }

    private void printPatternF(int size)
    {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print((i%size <= 1) || (i == j) ? "# " : "  ");
            }
            System.out.println();
        }
    }

    private void printPatternG(int size)
    {
        for (int i = 1; i <= size; i++)
        {
            for (int j = 1; j <= size; j++)
            {
                if((i%size <= 1) || (i + j == size + 1)) {
                    System.out.print("# ");
                    continue;
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    private void printPatternH(int size)
    {
        for (int i = 1; i <= size; i++)
        {
            for (int j = 1; j <= size; j++)
            {
                if((i%size <= 1) || (i == j) || (i + j == size + 1)) {
                    System.out.print("# ");
                    continue;
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    private void printPatternI(int size)
    {
        for (int i = 1; i <= size; i++)
        {
            for (int j = 1; j <= size; j++)
            {
                if ((i%size <= 1) ||
                    (j%size <= 1) ||
                    (i == j)      ||
                    (i + j == size + 1))
                {
                    System.out.print("# ");
                    continue;
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    private void printPatternJ(int size)
    {
        for (int i = 1; i <= size; i++)
        {
            for (int j = 1; j <= 2*size - i; j++) {
                if (j >= i) {
                    System.out.print("# ");
                    continue;
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    private void printPatternK(int size)
    {
        for (int i = size; i >= 1; i--)
        {
            for (int j = 1; j <= 2*size - i; j++) {
                if (j >= i) {
                    System.out.print("# ");
                    continue;
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    private void printPatternL(int size)
    {
        int n = 0;
        while (n <= 2*size)
        {
            int i = Math.abs(size - n);
            if (i == 0) {
                n+=2;
                continue;
            }
            for (int j = 1; j <= 2*size - i; j++) {
                if (j >= i) {
                    System.out.print("# ");
                    continue;
                }
                System.out.print("  ");
            }
            System.out.println();
            n++;
        }
    }

    private void printPatternM(int size)
    {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d ", j);
            }
            System.out.println();
        }
    }

    private void printPatternN(int size)
    {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print(( j >= i ? (j-i+1) : " ") + " ");
            }
            System.out.println();
        }
    }

    private void printPatternO(int size)
    {
        for (int i = 1; i <= size; i++) {
            for (int j = size; j >= 1; j--) {
                System.out.print(( j <= i ? j : " ") + " ");
            }
            System.out.println();
        }
    }

    private void printPatternP(int size)
    {
        for (int i = 1; i <= size; i++) {
            for (int j = size; j >= 1; j--) {
                System.out.print(( j >= i ? j-i+1 : " ") + " ");
            }
            System.out.println();
        }
    }

    private void printPatternQ(int size)
    {
        for (int i = 1; i <= size; i++)
        {
            for (int j = 1; j <= 2*size; j++)
            {
                if (j > size + i - 1) {
                    continue;
                }

                if (j <= size) {
                    System.out.print((i + j >= size + 1 ? (i + j)%size : " ") + " ");
                }
                else {
                    System.out.print((i + j >= size + 1 ? (i + size)%j : " ") + " ");
                }
            }
            System.out.println();
        }
    }

    private void printPatternR(int size)
    {
        for (int i = 1; i <= size; i++)
        {
            for (int j = 1; j <= 2*size; j++)
            {
                if ( j <= size && j >= i) {
                    System.out.print((j-i+1));
                }
                else if (j > size && j < 2*size - i +1 ) {
                    System.out.print(size-(j+i-1)%size);
                }
                else {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private void printPatternS(int size)
    {
        for (int i = 1; i <= size; i++)
        {
            for (int j = 1; j <= 2*size; j++)
            {
                if (j%(size+1) == 0) {
                    continue;
                }
                else if ( (j <= size) && (j > i) ) {
                    System.out.print(" ");
                }
                else if ( (j > size + 1) && (j < 2*size - i + 1) ) {
                    System.out.print(" ");
                }
                else if (j <= size) {
                    System.out.print(j%(size+1));
                }
                else {
                    System.out.print( 2*size-j + 1);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private void printPatternT(int size)
    {
        for (int i = 1; i <= size; i++)
        {
            for (int j = 1; j <= 2*size; j++)
            {
                if (j == 2*size) {
                    continue;
                }
                else if (j <= size - i + 1) {
                    System.out.print(j);
                }
                else if ( (j > size - i + 1) && (j < size + i - 1) ) {
                    System.out.print(" ");
                }
                else {
                    System.out.print(2*size - j);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private void printPatternU(int size)
    {
        for (int i = 1; i <= size; i++)
        {
            for (int j = 1; j <= 2*size; j++)
            {
                if (j <= size - i) {
                    System.out.print(" ");
                }
                else if ( (j > size - i) && (j < size + i) ) {
                    if (j <= size) {
                        System.out.print( (i + (i + j)%(size+1))%(size+1) );
                    }
                    //else if (j > size) {
                    //    System.out.print( 0 );
                    //}
                    //else {
                    //
                    //}
                }
                else {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }

*/

///////////////////////////////////
/*
 for(int i=1,z=4;i<=5;i++,z–){
                                                                 for(int j=1;j<=i;j++){
                                                                                 System.out.print(j);
                                                                 }
                                                                 for(int k=z;k>=1;k–){
                                                                                 System.out.print(” “);
                                                                 }
                                                                 for(int l=z;l>=1;l–){
                                                                                 System.out.print(” “);
                                                                 }
                                                                 for(int m=1;m<=i;m++){
                                                                                 System.out.print(m);
                                                                 }
                                                                 System.out.println();
                                 }

                                                 for(int i=4,z=1;i>=1;i–,z++){
                                                                 for(int j=1;j<=i;j++){
                                                                                 System.out.print(j);
                                                                 }
                                                                 for(int j=1;j<=z;j++){
                                                                                 System.out.print(” “);
                                                                 }
                                                                 for(int j=1;j<=z;j++){
                                                                                 System.out.print(” “);
                                                                 }
                                                                 for(int m=1;m<=i;m++){
                                                                                 System.out.print(m);
                                                                 }
                                                                 System.out.println();

                                }*/
///////////////////////////
    }
}
