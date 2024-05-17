import java.util.Random;
import java.util.Scanner;

public class MatheTrainer {
    public static void main(String[] args) {
        //Человек с консоли вводит число - сколько примеров он хочет решить +++++
        //мы по одному примеру генерируем и даем человеку написать ответ
        //потом следующий пример
        //Мы сравниваем наши ответы и ответы компьютера
        //Выводим сообщения (победа или проигрыш)

        int count = redValue();


        Random random = new Random();
        for (int i = 0; i < count; i++) {

            int firstNumber = random.nextInt(0, 100);
            int secondNumber = random.nextInt(0, 100);

            prinExample(firstNumber,secondNumber );

            int answer =firstNumber+secondNumber;
            int answerFromPerson= redValue();

            if(answer ==answerFromPerson) {
                System.out.println("ti molodez");
            }else {
                System.out.println("glupii");

                // Scanner scanner = new Scanner(System.in);eto obedinili
                //int answerFromPerson = scanner.nextInt();
            }
        }
    }

    public static int redValue() {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        return count;
    }
    public static void prinExample(int firstNumber, int secondNumber){

        System.out.println(firstNumber + "+" + secondNumber + "=");
    }

}

