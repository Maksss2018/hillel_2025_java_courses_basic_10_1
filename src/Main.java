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

    System.out.print("Введіть ціле число n:");
    var numberOfIterations =  new Scanner(System.in).nextInt();
    System.out.print("Введіть текстовий рядок:");
    var separatorOfStr =  new Scanner(System.in).nextLine();
    makeStringOutput (numberOfIterations,separatorOfStr);

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

void makeStringOutput (int n , String separator){
    for(int i = 0; i < n; i++){
        System.out.println(separator);
    }
}