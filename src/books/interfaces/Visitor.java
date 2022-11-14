package books.interfaces;

import books.items.Book;
import books.items.Fruit;

public interface Visitor {
    int visit(Book book);
    int visit(Fruit fruit);
}
