package NonPrimitivedatatypes;

public class StringDataType {
    public static void main(String[] args) {

        String firstPersonFirstName = "Sanjay";
        String firstPersonLastName = "kumar";

        String secondPersonFirstName = new String("prem");
        String secondPersonLastName = new String("prem");


        System.out.println(firstPersonFirstName== firstPersonLastName);
        System.out.println(secondPersonFirstName == secondPersonLastName);


    }
}


