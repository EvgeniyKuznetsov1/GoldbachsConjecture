import java.util.*;

public class PairPrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите чётное число больше 1: ");
        int number = input.nextInt();

        pairPrimeNumbers(number);
    }

    //  Вывод пар простых чисел, дающие в сумме чётное число number
    public static void pairPrimeNumbers(int number){
        if(number % 2 == 0 && number > 1) {
            System.out.printf("%d = ", number);
            for(int i = 1; i < number; i++){
                if(isPrime(i)){
                    for(int j = 1; j < number; j++){
                        if(isPrime(j) && i + j == number){
                            System.out.printf("{%d, %d} ", i, j);
                        }
                    }
                }
            }
        } else{
            System.out.println("Число нечётное или меньше либо равно 1");
        }
    }

    //  Проверка одного из составляющих пару на принадлежность к простым числам
    public static boolean isPrime(int i){
        for(int j = 2; j <= i - 1; j++){
            if(i % j == 0){
                return false;
            }
        }
        return true;
    }
}
