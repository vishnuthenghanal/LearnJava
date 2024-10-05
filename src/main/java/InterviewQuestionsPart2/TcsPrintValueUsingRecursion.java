package InterviewQuestionsPart2;
/*  ORGANISATION    : TCS
    QUESTION        : Print values in reverse order from 10 to 1 with out using for loop*/
public class TcsPrintValueUsingRecursion {
    public static void main(String[] args) {
        TcsPrintValueUsingRecursion.printValue(10);
    }

    static void printValue(int no){
        if(no > 0) {
            System.out.println(no);
            no = no - 1;
            printValue(no);
        }
    }

}

