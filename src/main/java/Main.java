import java.util.Scanner;

public class Main {

    public static Integer newProblem(){
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть перше число");
        Integer n1 = Integer.parseInt(input.nextLine());
        System.out.println("Введіть операцію");
        String op = input.nextLine();
        System.out.println("Введіть друге число");
        Integer n2 = Integer.parseInt(input.nextLine());
        Integer res = 0;
        try {
            switch (op){
                case "+":
                    res = n1 + n2;
                    break;
                case "-":
                    res = n1 - n2;
                    break;
                case "*":
                    res = n1 * n2;
                    break;
                case "/":
                    res = n1 / n2;
                    break;
            }
            System.out.println(n1 + " " + op + " " + n2 + " = " + res);
            return res;
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return 0;
    }
    public static Integer workWithCurrentNumber(Integer current)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть операцію");
        String op = input.nextLine();
        System.out.println("Введіть число");
        Integer n2 = Integer.parseInt(input.nextLine());
        Integer res = current;
        try {
            switch (op){
                case "+":
                    res += n2;
                    break;
                case "-":
                    res -= n2;
                    break;
                case "*":
                    res *= n2;
                    break;
                case "/":
                    res /= n2;
                    break;
            }
            System.out.println(current + " " + op + " " + n2 + " = " + res);
            return res;
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return 0;
    }
    public static void main(String[] args) {
        Boolean cont = true;

        Integer current = 0;
        Scanner input = new Scanner(System.in);
        while (cont){
            System.out.println("1)New problem \n2)Work with current number \n3)Exit");
            Integer choice = Integer.parseInt(input.nextLine());
            switch (choice){
                case 1:
                    current = newProblem();
                    break;
                case 2:
                    current = workWithCurrentNumber(current);
                    break;
                case 3:
                    cont = false;
                    break;
                default:
                    break;
            }

        }



    }
}
