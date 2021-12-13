public class Main {
    public static void main(String[] args) {

//        Дан массив [3, 22, 1, 13, 4, 6, 16, 5], состоящий из целых чисел.
        int array[];
        array = new int[]{3, 22, 1, 13, 4, 6, 16, 5};

//        1.Напишите программу, которая выводит (через пробел) те элементы массива, которые являются чётными числами.
        System.out.print("Задание 1: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
//        2.Напишите программу, которая выводит все двузначные числа массива.
        System.out.print("\n" + "Задание 2: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 9 && array[i] < 100)
                System.out.print(array[i] + " ");
        }

//        3.Напишите программу, которая выводит на экран наибольшее целое число этого массива.
        System.out.print("\n" + "Задание 3: ");
        int max = array[0];
        for (int i=0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.print(max);

//        4.Напишите программу, которая считает сумму элементов массива и выводит её на экран.
        System.out.print("\n" + "Задание 4: ");
        int sum = 0;
        for (int i : array) {
            sum = sum + i;
        }
        System.out.print(sum);
    }
}
