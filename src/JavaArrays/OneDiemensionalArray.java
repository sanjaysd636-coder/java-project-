package JavaArrays;

public class OneDiemensionalArray {
    public static void main(String[] args) {

        String[] names = new String[5];
        names[0] = "sanjay";
        names[1] = "prem";
        names[2] = "naveen";
        names[3] = "raghul";
        names[4] = "raja";

        for(String item : names) {
            System.out.println("item===>" + item);
        }
    }
}

