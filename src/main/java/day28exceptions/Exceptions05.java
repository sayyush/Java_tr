package day28exceptions;

public class Exceptions05 {

    public static void main(String[] args) {

        int a = 12;
        int b = 0;
        String s = "My Java";
        getCharFromString(s, a, b);

    }

    public static void getCharFromString(String s, int a, int b) {


        // try kisminda birden fazla Exception olusturma ihtimali olan kod varsa, coklu "catch" kullanabilirsiniz.

        // Coklu "catch" kullandiginizda Exception Class'lar arasinda "parent - child" iliskisi yoksa, catch'lerin sirasi
        // onemli degildir. Ama kod'daki siralamaya uymak tavsiye edilir.

        // Coklu "catch" kullandiginizda Exception Class'lar arasinda "parent - child" iliskisi varsa, catch'lerin sirasi
        // onemlidir, child olan class ustte olmalidir.

        // Exception Class'lar arasinda "parent - child" iliskisi varsa, ya child class'i uste yazarak child ve parent class'lar
        // icin ozellestirilmis code'lar yazarsiniz. (Hirsiz icin 155, hasta icin 112 gibi).
        // Veya child'i hic kullanmaz sadece parent ile exception'lari handle etmeye calisirsiniz. (Hirsiz icin 911, hasta icin 911 gibi)

        // try'in icinde problem yoksa catch'den sonrasi calismaz
        try {
            int idx = a / b; // ArithmeticException ihtimali var
            char ch = s.charAt(idx); // StringIndexOutOfBoundsException ihtimal var
            System.out.println(ch);

        } catch (ArithmeticException e) {
            System.out.println("Do not divide by zero");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Olmayan index kullandiniz");
        }

    }
}
