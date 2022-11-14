package books.items;


import books.interfaces.Visitable;
import books.interfaces.Visitor;

public class Book implements Visitable {

    private int price;
    private String isbnNumber;

    public Book(int cost, String isbn)
    {
        this.price=cost;
        this.isbnNumber=isbn;
    }

    public int getPrice()
    {
        return price;
    }

    public String getIsbnNumber()
    {
        return isbnNumber;
    }

    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
