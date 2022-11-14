package tax.interfaces;

public interface Visitable {

    double accept(Visitor visitor);
}
