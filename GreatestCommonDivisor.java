public class GreatestCommonDivisor {
    public static void main(String args[]) {
        System.out.println(getGreatestCommonDivisor ( 25, 15 ));
        //ystem.out.println ("result -" + result);

    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if ((first < 10) | (second < 10)) return -1;

        int ostatok = 0;
        int[] myArray1 = new int[first];
        int[] myArray2 = new int[second];

        for (int i = 1; i < first; i++) {
            ostatok = first % i;
            if (ostatok == 0) {
                myArray1[i] = first / i;
                //System.out.println ( myArray1[i] );
            }
        }

        int ostatok2 = 0;
        for (int i = 1; i < second; i++) {
            ostatok2 = second % i;
            if (ostatok2 == 0) {
                myArray2[i] = second / i;
                //System.out.println ( myArray2[i] );
            }
        }

        int result = 0;
        for(int i = 1; i < first; i++){
            //System.out.println ("1 -" + myArray1[i]);
            for(int j = 1; j < second; j++){
                if ((myArray1[i] != 0) | (myArray2[j] != 0)) {
                    //System.out.println ("2 -" + myArray2[j]);
                    if (myArray1[i] == myArray2[j]) {
                        //System.out.println (myArray1[i]);
                        if (result < myArray1[i]) result = myArray1[i];
                    }
                }
            }
        }
        return result;
    }
}
