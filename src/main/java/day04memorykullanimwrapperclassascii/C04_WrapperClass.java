package day04memorykullanimwrapperclassascii;

public class C04_WrapperClass {
    /*
     Non - Primitive Data turleri sadece data barindirmak icin
    degil ayni zamanda methodlarda bulundurur
    Primitive Data turleri ise sadece deger saklar.
    Java bu duruma bir cozum uretmistir.

    Her primitive data turunu Non- Primitive olarak
    kullanabilmek icin ozel Class'lar olusturmustur.
    Oracle firmasinin urunu olan Java primitivelere method
    ekleyerek olusturduklar bu yeni yapiya Wrapper
    Class adini vermistir.

            Primitive             Wrapper
    byte     ==>        Byte
    short    ==>        Short
    int      ==>        Integer *****
    long     ==>        Long
    float    ==>        Float
    double   ==>        Double
    boolean  ==>        Boolean
    char     ==>        Character  *****

     */


    public static void main(String[] args) {
        byte primitiveByte = 12; //primitive data type larinda nokta koydugumuzda hic bir method gelmez
        Byte wrapperByte = 12;  //wrapper classlarda nokta koydugumuzda bir cok method kullanabiliriz


        //Ex : byte data type'inin en kucuk ve en buyuk degerini ekrana yazdirin


        System.out.println(Byte.MIN_VALUE); //-128
        System.out.println(Byte.MAX_VALUE); //127

        // Ex  : short , int , long  data type'larinin max ve min degerlerini hesaplatan kodu yaziniz


        System.out.println(Short.MAX_VALUE); //32767
        System.out.println(Short.MIN_VALUE); //-32768

        System.out.println(Integer.MIN_VALUE); // -2147483648
        System.out.println(Integer.MAX_VALUE); // 2147483647

        System.out.println(Long.MIN_VALUE); // -9223372036854775808
        System.out.println(Long.MAX_VALUE); // 9223372036854775807

        // ********* Primitive'ler Wrapper Classlara nasil cevrilir ( AUTOBOXING) ********
        float f1 = 13.99F; // kucuk kutu primitive
        Float wrapperF1 = f1;

        // ********** Wrapper classlari primitive data typelarina nasil cevrilir? ( UNBOXING - icinden cikarmak)*****
        Character w1 = 's';
        char primitiveW1= w1;
// autoboxing ve unboxing java tarafindan otamatik yapilir
        // extra kod yazmaya gerek yoktur


        // Ex: Verilen iki String datanin toplamini veren kodu yaziniz

        String str1 ="12345";
        String str2="6789";
        System.out.println(str1+str2); //
        System.out.println(Integer.valueOf(str1)+ Integer.valueOf(str2));
        // valueof  bu methodun ne anlama geldigini bilmek istersen uzerine gellin ctrl basin sana ne oldugunu cikarir












}}
