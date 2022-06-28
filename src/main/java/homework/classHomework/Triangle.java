package homework.classHomework;

public class Triangle {

    public int pirmaMala;
    public int otraMala;
    public int tresaMala;
    public int laukums;

    public Triangle() {
        System.out.println("Veidojam trijsturi.");
    }

    public Triangle(int pirmaMala, int otraMala, int tresaMala) {
        this.pirmaMala = pirmaMala;
        this.otraMala = otraMala;
        this.tresaMala = tresaMala;

        double pusmerimetrs = (this.pirmaMala + this.otraMala + this.tresaMala) / 2d;
        double trijsturalaukums = Math.sqrt(pusmerimetrs * (pusmerimetrs - this.pirmaMala) * (pusmerimetrs - this.otraMala) * (pusmerimetrs - this.tresaMala));
        this.laukums = (int) trijsturalaukums;
    }

    public boolean vienadmalu() {
        return this.pirmaMala == this.otraMala && this.otraMala == this.tresaMala;
    }

    public boolean vienadsanu() {
        return this.pirmaMala == this.otraMala || this.otraMala == this.tresaMala || this.tresaMala == this.pirmaMala;
    }
}
