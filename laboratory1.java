import java.util.Random;

public class laboratory1 {
    public static void main(String[] args) {
        // Пункт 1
        long[] w = new long[10];

        for (int i = 9; i >= 0; i--){
            w[i] = (long) 25 - ((long) i * 2); // Создаём массив типа long и заполняем его
        }

        // Пункт 2
        float[] x = new float[13];
        Random random = new Random();

        for (int i = 0; i < x.length; i++){
            x[i] = random.nextFloat(12) - 7; // Создаём массив типа float c числами в диапазоне [-7, 5]
        }

        // Пункт 3
        double[][] w1 = new double[10][13]; // Создаём двумерный массив
        float[] set = {7, 9, 11, 15, 21}; // Создаём множество для проверки наличия элементов
        for (int i = 0; i < 10; i++){
            boolean flag = false; // Создаём флаг для проверки наличия элементов
            for (int j = 0; j < 13; j++){
                for (float value : set){
                    if (w[i] == value){
                        flag = true;
                        break;
                    }
                }
                if (w[i] == 19){
                    w1[i][j] = Math.pow(Math.asin(Math.cos(x[j])),
                               Math.pow(Math.sin(x[j]) + 0.5, Math.asin((x[j] - 1) / 12)) /
                               Math.sin(Math.pow(2 * x[j], x[j])) - 0.5);
                }
                else if (flag){
                    w1[i][j] = Math.tan(Math.pow((1 / 3) * (2 / 3 + Math.tan(x[j])), 1 / 4 * (x[j] - 1)));
                }
                else{
                    w1[i][j] = Math.sin(Math.atan(Math.cos(Math.pow(Math.pow(x[j], 2 / 3 * (0.5 + x[j])),
                               2 * Math.log(Math.abs(x[j]))))));
                }
            }
        }

        // Пункт 4
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 13; j++){
                System.out.printf("| %8.5f |", w1[i][j]);
            }
            System.out.println();
        }
    }
}
