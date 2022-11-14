package tax.interfaces;

import tax.items.Liquor;
import tax.items.Necessity;
import tax.items.Tobacco;

public interface Visitor {

    double visit(Liquor liquorItem);
    double visit(Tobacco tobaccoItem);
    double visit(Necessity necessityItem);
}
