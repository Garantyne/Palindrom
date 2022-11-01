public class Main {
    public static void main(String[] args) {
        String palindrom = "а роза упала на лапу Азора";
        String chekPalindrom = "арозА упал ан алапу азор а";
        //reverse.palindrom();
        palindrom = palindrom.replace(" ","");
        chekPalindrom = chekPalindrom.replace(" ", "");
        System.out.println(palindrom);
        System.out.println(chekPalindrom);


        System.out.println("Строки при сравнении имеют значение " + chekPalindrom.equalsIgnoreCase(palindrom));
    }
}