package books;

import books.interfaces.Visitable;
import books.items.Book;
import books.items.Fruit;
import books.visitors.ShoppingCartVisitor;

public class VisitorTest {

    public static void main(String[] args) {
        Visitable[] items = new Visitable[]{new Book(20, "1234"),
                new Book(100, "5678"), new Fruit(10, 2, "Banana"),
                new Fruit(5, 5, "Apple")};

        int total = calculatePrice(items);
        System.out.println("Total Cost = "+total);
    }

    private static int calculatePrice(Visitable[] items)
    {
        ShoppingCartVisitor visitor = new ShoppingCartVisitor();
        int sum=0;
        for(Visitable item : items)
        {
            sum = sum + item.accept(visitor);
        }
        return sum;
    }
}
