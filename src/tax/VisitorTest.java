package tax;

import tax.items.Liquor;
import tax.items.Necessity;
import tax.items.Tobacco;
import tax.visitors.TaxHolidayVisitor;
import tax.visitors.TaxVisitor;

public class VisitorTest {

    /**
     * Visitor is behavioral design pattern.
     * It is used when we have to perform an operation on a group of similar objects.
     * We can move the operational logic from the objects to another class.
     *
     * The visitor pattern consists of two parts:
     *  - a method called Visit() which is implemented by the visitor and is called for every element in the data structure
     *  - visitable classes providing Accept() methods that accept a visitor
     *
     */

    public static void main(String[] args) {
        TaxVisitor taxCalc = new TaxVisitor();
        TaxHolidayVisitor taxHolidayCalc = new TaxHolidayVisitor();

        System.out.println("---------- REGULAR TAX ----------");
        Necessity milk = new Necessity(3.5);
        Liquor vodka = new Liquor(11.99);
        Tobacco cigar = new Tobacco(19.99);

        System.out.println(milk.accept(taxCalc) + "\n");
        System.out.println(vodka.accept(taxCalc) + "\n");
        System.out.println(cigar.accept(taxCalc) + "\n");

        System.out.println("---------- HOLIDAY TAX ----------");

        System.out.println(milk.accept(taxHolidayCalc) + "\n");
        System.out.println(vodka.accept(taxHolidayCalc) + "\n");
        System.out.println(cigar.accept(taxHolidayCalc) + "\n");

    }
}
