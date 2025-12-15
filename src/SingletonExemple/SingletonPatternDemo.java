package SingletonExemple;

public class SingletonPatternDemo {

    static void main() {
        SingleObject so = SingleObject.getInstance();
        SingleObject s1 = SingleObject.getInstance();
        SingleObject s2 = SingleObject.getInstance();
        so.showMessage();
        s1.showMessage();
        s2.showMessage();

    }

}
