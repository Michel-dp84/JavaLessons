public class ProjectOne {

    static void calc_if(double numA, int numB, char operation){
        double result = 0;
        if(operation == '+'){
            result = numA + numB;
        } else if (operation == '-') {
            result = numA - numB;
        } else if (operation == '*') {
            result = numA * numB;
        } else if (operation == '/') {
            result = numA / numB;
        } else {
            System.out.println("Oops, it`s incorrect operation");
        }
        if(result != 0)
            System.out.println("Result of " + operation + " is = " + result);
    };

    static void calc_switch(int numA, double numB, char operation){
        double result = 0;
        switch (operation){
            case '+' : result = numA + numB; break;
            case '-' : result = numA - numB; break;
            case '*' : result = numA * numB; break;
            case '/' : if (numB != 0)
                result = numA / numB;
            else System.out.println("Division by zero");
                break;
            default: System.out.println("Oops, operation " + operation + " it`s incorrect");
                return;
        }
        if (numB != 0)
            System.out.println("Result of " + operation + " is = " + result);
    }

    public static void main(String[] args) {

        System.out.println("Calc with if");
        calc_if(3,9,'+');
        calc_if(3,9,'-');
        calc_if(3,9,'*');
        calc_if(3,9,'/');
        calc_if(3,9,'@');
        calc_if(3,0,'*');
        System.out.println("");
        System.out.println("Calc with switch");
        calc_switch(3,9,'+');
        calc_switch(3,9,'-');
        calc_switch(3,9,'*');
        calc_switch(3,9,'/');
        calc_switch(3,9,'@');
        calc_switch(3,0,'/');
    }
}