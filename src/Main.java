import esercizio1.Rettangolo;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Rettangolo rett1 = new Rettangolo(20, 30);
        Rettangolo rett2 = new Rettangolo(150, 65);

        stampaDueRettangolo(rett1, rett2);
    }

    public static void stampaRettangolo(Rettangolo rettangolo){
        System.out.println("il perimetro del rettangolo è " + rettangolo.Perimeter() );
        System.out.println("il area del rettangolo è " + rettangolo.Area() );
    }

    public static void stampaDueRettangolo(Rettangolo rett1, Rettangolo rett2){
        stampaRettangolo(rett1);
        stampaRettangolo(rett2);
        System.out.println("somma area due rettangolo: " + rett1.Area() + rett2.Area());
        System.out.println("somma perimetro due rettangoli: " + rett1.Perimeter() + rett2.Perimeter());
    }
}