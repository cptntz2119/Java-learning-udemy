public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){
            System.out.println(i);
        }

        int j = 1;
        while (j <= 5){
            System.out.println(j);
            j++;
        }

        int k = 1;
        boolean isReady = false;
        do {
            if (k > 5){
                break;
            }

            System.out.println(k);
            k++;
            isReady = (j > 0);
        }while (isReady);

        int l = 0;
        while (l < 50){
            l += 5;
            if (l % 25 == 0){
                continue;
            }
            System.out.println(l + " ");
        }

        int number = 0;
        while ( number < 15){
            number++;

            if (number <=5){
                System.out.println("skipping number" + number);
                continue;
            }

            System.out.println("current number is " + number);

            if (number > 10){
                System.out.println("breaking at " + number);
                break;
            }
        }
    }


}