import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Stack;

public class DragonLunch {

    static Stack<Person>stack = new Stack<>();

    public static void kidnap(Person person){


       if(person.gender == Gender.BOY ){
           stack.push(person); //bbgg
       }
       else if (person.gender == Gender.GIRL){
           if(!stack.isEmpty() && stack.peek().gender == Gender.BOY){
               stack.pop();
           }else{
               stack.push(person);
           }
       }

    }

    public static boolean willDragonEatOrNot(){
        return stack.empty() ;

    }

    public static boolean willDragonEatOrNot(String genders){

        Stack<Character> stack1  =  new Stack<>();

        for (int i = 0; i < genders.length(); i++){
            char gender = genders.charAt(i);
            if(gender == 'B'){
                stack1.push(gender);
            }else {
                if (!stack1.isEmpty() && stack1.peek() == 'B'){
                    stack1.pop();
                }else{
                    stack1.push(gender);
                }
            }
        }

        return stack1.isEmpty();


    }

    public static void main(String[] args){

        // By Person class
        Person p1 = new Person("Danyar");
        p1.gender = Gender.GIRL;
        Person p2 = new Person("Aisha");
        p2.gender = Gender.GIRL;
        Person p3 = new Person("Dias");
        p3.gender = Gender.BOY;
        Person p4 = new Person("Aiman");
        p4.gender = Gender.GIRL;

        // By String sequence

        StringBuilder sequence = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 10; i++){
            char gender = random.nextBoolean() ? 'B' : 'G';
            sequence.append(gender);
        }

        

        System.out.println(sequence.toString());
        System.out.println(willDragonEatOrNot("GBGBGGBBGG"));

        kidnap(p2);
        kidnap(p1);
        kidnap(p4);
        kidnap(p3);
        System.out.println(willDragonEatOrNot());

    }
}
