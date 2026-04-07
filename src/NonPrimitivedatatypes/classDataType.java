package NonPrimitivedatatypes;
class Student {

    int rollNumber = 25;
    String studentName  = "Dhanush";
    String studentLastName = "Magesh";
    int academicMark = 80;
    char grade = 'A';
}

public class classDataType {
    public static void main(String[] args) {

    Student obj = new Student();

        System.out.println("student Roll Number ===>" + obj.rollNumber);
        System.out.println("student Name ===>" + obj.studentName);
        System.out.println("student LastName ===>" + obj.studentLastName);
        System.out.println("student academic Mark ===>" + obj.academicMark);
        System.out.println("student grade ===>" + obj.grade);

}
}

