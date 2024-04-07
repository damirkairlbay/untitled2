import java.util.Scanner;

public class Main {

    private static int findMinimum(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    private static double average(int[] array) {
        double aver = 0;
        for (int value : array) {
            aver += value;
        }
        return aver / array.length;
    }

    private static String isPrime(int num) {
        if (num <= 1) {
            return "No";
        }
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                return "Compositive";
            }
        }
        return "Prime";
    }

    private static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    private static int power(int a, int b) {
        if (b == 0) {
            return 1;
        } else {
            return a * power(a, b - 1);
        }
    }

    private static void reversePrint(int[] arr, int n) {
        if (n < 0) {
            return;
        }
        System.out.print(arr[n] + " ");
        reversePrint(arr, n - 1);
    }

    private static String isAllDigits(String s) {
        if (s.isEmpty()) {
            return "Yes";
        }
        char firstChar = s.charAt(0);
        if (Character.isDigit(firstChar)) {
            return isAllDigits(s.substring(1));
        } else {
            return "No";
        }
    }

    private static int binomialCoefficient(int n, int k) {
        if (k == 0 || n == k) {
            return 1;
        } else {
            return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
        }
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите задачу от 1 до 10 для выполнения:");
        int taskChoice = scanner.nextInt();

        long startTime = System.currentTimeMillis();

        switch (taskChoice) {
            case 1:
                System.out.println("Введите количество элементов массива:");
                int size1 = scanner.nextInt();
                int[] array1 = new int[size1];
                System.out.println("Введите элементы массива:");
                for (int i = 0; i < size1; i++) {
                    array1[i] = scanner.nextInt();
                }
                System.out.println("Минимальное значение: " + findMinimum(array1));
                break;
            case 2:
                System.out.println("Введите количество элементов массива:");
                int size2 = scanner.nextInt();
                int[] array2 = new int[size2];
                System.out.println("Введите элементы массива:");
                for (int i = 0; i < size2; i++) {
                    array2[i] = scanner.nextInt();
                }
                System.out.println("Среднее значение: " + average(array2));
                break;
            case 3:
                System.out.println("Введите число:");
                int num = scanner.nextInt();
                System.out.println("Прайм число или нет: " + isPrime(num));
                break;
            case 4:
                System.out.println("Введите число:");
                int num4 = scanner.nextInt();
                System.out.println("Факториал: " + factorial(num4));
                break;
            case 5:
                System.out.println("Введите число:");
                int num5 = scanner.nextInt();
                System.out.println("Число Фибоначчи: " + fibonacci(num5));
                break;
            case 6:
                System.out.println("Введите основание и степень:");
                int base = scanner.nextInt();
                int exponent = scanner.nextInt();
                System.out.println("Результат возведения в степень: " + power(base, exponent));
                break;
            case 7:
                System.out.println("Введите количество элементов массива:");
                int size7 = scanner.nextInt();
                int[] array7 = new int[size7];
                System.out.println("Введите элементы массива:");
                for (int i = 0; i < size7; i++) {
                    array7[i] = scanner.nextInt();
                }
                System.out.println("Элементы массива в обратном порядке:");
                reversePrint(array7, size7 - 1);
                System.out.println(); // Для красивого вывода
                break;
            case 8:
                scanner.nextLine(); // Чтобы очистить буфер после чтения числа
                System.out.println("Введите строку для проверки:");
                String str = scanner.nextLine();
                System.out.println("Строка состоит только из цифр: " + isAllDigits(str));
                break;
            case 9:
                System.out.println("Введите n и k для вычисления биномиального коэффициента:");
                int n = scanner.nextInt();
                int k = scanner.nextInt();
                System.out.println("Биномиальный коэффициент: " + binomialCoefficient(n, k));
                break;
            case 10:
                System.out.println("Введите два числа для нахождения НОД:");
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                System.out.println("НОД(" + a + ", " + b + ") = " + gcd(a, b));
                break;
            default:
                System.out.println("Неверный ввод. Выберите число от 1 до 10.");
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Время выполнения задачи: " + (endTime - startTime) + " мс.");

        scanner.close();
    }
}
