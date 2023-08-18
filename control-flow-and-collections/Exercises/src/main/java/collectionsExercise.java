import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class collectionsExercise {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int[] nums = {1, 1, 2, 3, 5, 8};
        for (int num : nums){
            if (num%2 == 1){
                System.out.println(num);
            }
        };

        String phrase ="I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] phraseArray = phrase.split("\\.");
        System.out.println(Arrays.toString(phraseArray));


        int[] addTheseEvens = {0,1,2,4,52,7,5,34,6,4,8,9};
        System.out.println(addEvens(addTheseEvens));


        String[] wordList = {"a","ab","abc","abcd","abcde","abcdef"};
        printWordLength(wordList);


        hashMapPractice();


    }
    public static int addEvens( int[] array){
        int total = 0;
        for(int integer : array){
            if(integer%2 == 0){
                total += integer;
            }
        }
        return total;
    };

    public static String printWordLength (String[] wordArray){
//        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number from 1-6");
        int index = (input.nextInt() - 1);
        input.skip("\n");
//        input.close();
        System.out.println(wordArray[index]);
        return wordArray[index];

    };

    public static void hashMapPractice (){
//        Scanner input = new Scanner(System.in);
        HashMap<String, Integer> studentRoster = new HashMap<>();
        String again;
        System.out.println("Add a student? (y/n)");
        again = input.nextLine();
        do{
            System.out.println("Student name: ");
            String studentName = input.nextLine();
            System.out.println("ID Number: ");
            Integer studentID = input.nextInt();
            input.skip("\n");

            studentRoster.put(studentName, studentID);

            System.out.println("Add another student? (y/n)");
            again = input.nextLine();

            if(again.equals("n")){
                for(Map.Entry<String, Integer> student : studentRoster.entrySet()){
                    System.out.println("Name: " + student.getKey() + ", ID: " + student.getValue());
                };

            }

        }while(again.equals("y"));





//        System.out.println("Add a student, or type 'n' to stop:");
//        String again = input.nextLine();
//        do{
//            if (again.equals("n")){
//                input.close();
//                System.out.println(studentRoster);
//            }else{
//                System.out.println("Student Name: ");
//                String studentName = input.nextLine();
//
//                if(!studentName.equals("")){
//                    System.out.println("Student ID: ");
//                    Integer studentID = input.nextInt();
//                    studentRoster.put(studentName, studentID);
//                    if(!studentID.equals("")){
//                        System.out.println();
//                    }
//                }
//
//                System.out.println();
//            }
            //code here
//        }while(!again.equals(""));


//        input.close();

    }

    //do {
    //   System.out.print("Student: ");
    //   newStudent = input.nextLine();
    //
    //   if (!newStudent.equals("")) {
    //      System.out.print("ID: ");
    //      Integer newID = input.nextInt();
    //      classRoster.put(newID, newStudent);
    //
    //      input.nextLine();
    //   }
    //} while(!newStudent.equals(""));
    //
    //input.close();
    //
    //System.out.println("\nClass roster:");
    //
    //for (Map.Entry<Integer, String> student : classRoster.entrySet()) {
    //   System.out.println(student.getValue() + "'s ID: " + student.getKey());
    //}
    //
    //System.out.println("Number of students in roster: " + classRoster.size());

}
//    Write a static method to find the sum of all the even numbers in an ArrayList.
//    Within main, create a list with at least 10 integers and call your method on the list.