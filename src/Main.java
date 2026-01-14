/*
Створіть Java програму з використанням методів, яка виконує наступні завдання:

   + Напишіть метод, який приймає ціле число як аргумент і виводить його квадрат.
   + Напишіть метод, який приймає два аргументи типу double - радіус та висоту - і повертає об'єм циліндра. Виведіть об'єм циліндра на екран.
    Напишіть метод, який приймає масив цілих чисел та обчислює і повертає суму всіх елементів масиву.
    Напишіть метод, який приймає рядок (String) як аргумент та повертає новий рядок, який складається з букв цього рядка у зворотньому порядку.
    Напишіть метод, який приймає два цілих числа, a та b, і повертає результат a^b (a підняте до степеня b).
    Напишіть метод, який приймає параметри: ціле число n і рядок text. Метод повинен вивести текстовий рядок text n рази, розділяючи кожен рядок символом переносу.
    Залийте виконаний проект на свій GitHub репозиторій, посилання на який зазначте в LMS.
* */
void main() {
    Scanner scanner = new Scanner(System.in); // Create a Scanner object
    System.out.print("Введіть ціле число: ");
    var number = scanner.nextInt();
    var sqrNumber = getSquareOfNumber(number);
    var radius = 3.5;
    var height = 10.0;
    var volume = getVolume(height, radius);
    System.out.println("Квадрат числа "+number+" дорівнює "+sqrNumber);
    System.out.println("Об'єм циліндра з радіусом "+radius+" і висотою "+height+" дорівнює "+volume);
}
int getSquareOfNumber (int number ){
    return number * number;
}
double getVolume  (double height , double radius ){
    return Math.PI * Math.pow(radius, 2) * height;
}