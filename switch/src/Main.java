public class Main {
    public static void main(String[] args) {
//        int value = 1;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        }else if (value == 2) {
//            System.out.println("Value was 2");
//        }else {
//            System.out.println("Value was not 1 or 2");
//        }
//    }

        System.out.println(getQuarter("JA"));
        System.out.println(getQuarter("SE"));
        System.out.println(getQuarter(""));

        int switchValue = 5;

        switch (switchValue){
            case 1 :
                System.out.println("value is 1");
                break;
            case 2:
                System.out.println("value is 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was 3, 4, or 5");
                System.out.println("Value was " + switchValue);
                break;
            default:
                System.out.println("Value was not 1,2,3,4,5");
                break;
        }
    }

    public static String getQuarter (String month){
        switch (month) {
            case "JA":
            case "FE":
            case "MAR":
                return "1st";
            case "AP":
            case "MA":
            case "JUNE":
                return "2nd";
            case "JULY":
            case "AU":
            case "SE":
                return "3rd";
            case "OC":
            case "NO":
            case "DE":
                return "4th";

        }

        return "bad";
    }

}