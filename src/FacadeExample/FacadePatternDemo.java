package FacadeExample;

import java.util.ArrayList;

public class FacadePatternDemo {

FacadePatternDemo(){
    ShapeMaker sm = ShapeMaker.getInstance();

    sm.drawAllShapes();

}

    void main() {

    }

}
