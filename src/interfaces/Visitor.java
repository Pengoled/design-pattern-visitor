package interfaces;

import items.Liquor;
import items.Necessity;
import items.Tobacco;

public interface Visitor {

    double visit(Liquor liquorItem);
    double visit(Tobacco tobaccoItem);
    double visit(Necessity necessityItem);
}
