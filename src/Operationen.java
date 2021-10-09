public class Operationen {
    public static void main(String[] args) {
        double pi; //deklaration
        pi = 3.1415; //initialisierung
        int number = 37;
        int perfektNumber = 42;
        int erg;
        erg = number + perfektNumber;
        System.out.println("erg = " + erg);

        erg = 27 % 10;
        System.out.println("27  modulo 10 = " + erg);

        System.out.println("erg * 8  = " + (erg *8));
        int amount = 555;
    }

    public static void printInteger (int number) {
        System.out.println("printInteger: " + number);
        System.out.println("orintINteger ist nun fertig!");
    }

    public static void printInvoiceAmount (int amount)
    {
        System.out.println("Rechnungssumme: ..." + amount + "EUR");
    }
}
