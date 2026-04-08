package JavaLoops;

public class EnhancedLoop {
    public static void main(String[] args) {
        String[] candidateNames = {"sanjay","prem","naveen","ragul"};

        for(String name : candidateNames){
            System.out.println("names===>" + name);
        }

        System.out.println("------------------------------------");

        int[] numbers = {100,200,300,400,500,600};

        for(int item : numbers){
            System.out.println("item===>" + item);
        }
    }
}

