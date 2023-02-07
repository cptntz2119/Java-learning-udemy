public class Main {
    public static void main(String[] args) {
        System.out.println("sum odd from 1 to 11 is " + sumOdd(1,11));
        System.out.println("sum odd from 1 to 10 is " + sumOdd(-1,10));
    }

    public static boolean isOdd( int num){
        if ((num > 0 ) && (num % 2 != 0)){
            return true;
        }else {
            return false;
        }

    }

    public static int sumOdd ( int start, int end){
        if ((end < 0) || (start > end) || (start < 0)){
            return  -1;
        }

        int sum = 0;
        for ( int num = start; num <= end; num ++){
            if (isOdd (num)){
                sum += num;
            }
        }

        return sum;
    }
}