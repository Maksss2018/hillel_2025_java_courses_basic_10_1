/*
Створіть Java програму з використанням методів, яка виконує наступні завдання:

   + Напишіть метод, який приймає ціле число як аргумент і виводить його квадрат.
   + Напишіть метод, який приймає два аргументи типу double - радіус та висоту - і повертає об'єм циліндра. Виведіть об'єм циліндра на екран.
   + Напишіть метод, який приймає масив цілих чисел та обчислює і повертає суму всіх елементів масиву.
   + Напишіть метод, який приймає рядок (String) як аргумент та повертає новий рядок, який складається з
     букв цього рядка у зворотньому порядку.
   + Напишіть метод, який приймає два цілих числа, a та b, і повертає результат a^b (a підняте до степеня b).
    Напишіть метод, який приймає параметри: ціле число n і рядок text. Метод повинен вивести текстовий рядок text n рази, розділяючи кожен рядок символом переносу.
    Залийте виконаний проект на свій GitHub репозиторій, посилання на який зазначте в LMS.
* */
void main() { // Create a Scanner object
    System.out.print("Введіть ціле число: ");
    var number = new Scanner(System.in).nextInt();
    var sqrNumber = getSquareOfNumber(number);
    System.out.println("Квадрат числа "+number+" дорівнює "+sqrNumber);

    var radius = 3.5;
    var height = 10.0;
    var volume = getVolume(height, radius);

    var arrayOfInt = new int[] { 10, 20, 30, 40, 50};
    var sumFromArrayOfInt = getSumOfAllIntInTheArray(arrayOfInt);


    System.out.print("Введіть рядок: ");
    var someString = new Scanner(System.in).nextLine();
    var reversedStr= makeReversString(someString);
    System.out.print("Рядок в зворотньому порядку: "+reversedStr+"\n");

    System.out.print("Введіть число а:");
    var aNumber =  new Scanner(System.in).nextInt();
    System.out.print("Введіть число b:");
    var bNumber =  new Scanner(System.in).nextInt();
    var graduallyOfAAndB = getGradual(aNumber,bNumber);
    System.out.print("Результат "+aNumber+"^"+bNumber+" дорівнює "+graduallyOfAAndB+"\n");

    System.out.println("Об'єм циліндра з радіусом "+radius+" і висотою "+height+" дорівнює "+volume);
    System.out.println("Масив чисел "+ Arrays.toString(arrayOfInt));
    System.out.println("Сума всіх елементів масиву дорівнює "+sumFromArrayOfInt);
}
int getSquareOfNumber (int number ){
    return number * number;
}
double getVolume  (double height , double radius ){
    return Math.PI * Math.pow(radius, 2) * height;
}
int getSumOfAllIntInTheArray(int[] array){
    int sum = 0;
    for(int i = 0; i < array.length; i++){
        sum += array[i];
    }
    return sum;
}
String makeReversString (String str){
    String reversedStr = "";
    for (int i = str.length() - 1; i >= 0; i--) {
        reversedStr += str.charAt(i);
    }
    return reversedStr;
}

int getGradual(int a, int b){
     return a^b;
}