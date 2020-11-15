package dssc.assignment.fizzbuzz;

import java.util.stream.IntStream;

public class FizzBuzz {

    public void FizzBuzz1(){
        System.out.println("FizzBuzz assignment");
        String s;
        for(int i = 1; i<=100; i++){
            s ="";
            if(i % 3 == 0){
                s += "Fizz";
            }
            if(i % 5==0){
                s += "Buzz";
            }
            if(s.equals("")){
                System.out.println(i);
            }else{
                System.out.println(s);
            }
        }
    }

    public void FizzBuzzBang(){
        System.out.println("Extended version");

        String s;
        for(int i = 1; i<=105; i++){
            s ="";
            if(i % 7 == 0) {
                s = s + "Bang";
                if (i % 5 == 0) {
                    s = "Buzz" + s;
                }
                if (i % 3 == 0) {
                    s = "Fizz" + s;
                }
            }
            if(s.equals("")){
                System.out.println(i);
            }else{
                System.out.println(s);
            }
        }
    }

    //Trying to use functional programming
    public void FizzBuzzFunctional(){
        IntStream str = IntStream.rangeClosed(1,100);
        str.forEach( x -> {String s = "";
                            s +=  (x % 3 == 0) ? "Fizz" : "";
                            s +=  (x % 5 == 0) ? "Buzz" : "";
                            System.out.println(s.isEmpty()? x : s);
                          }
        );

    }

    public void FizzBuzzBangFunctional(){
        IntStream str = IntStream.rangeClosed(1, 105);
        str.forEach( x -> { String s ="";
                            s += (x % 7 == 0) ? (x % 5 ==0) ?  (x % 3 == 0) ? "FizzBuzzBang": "BuzzBang" : (x % 3==0) ? "FizzBang": "Bang"  : "";
                            System.out.println(s.isEmpty()? x : s);
                          }
        );
    }

    public static void main(String... args) {
        FizzBuzz f = new FizzBuzz();
        f.FizzBuzz1();
        System.out.println("\n\n\n");
        f.FizzBuzzFunctional();
        System.out.println("\n\n\n");
        f.FizzBuzzBang();
        System.out.println("\n\n\n");
        f.FizzBuzzBangFunctional();

    }

}
