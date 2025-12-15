package SingletonExemple;

import java.util.Random;

public class SingleObject {
    //Skapar ett objekt
    private static final SingleObject instance = new SingleObject();
    private int random = new Random().nextInt(100);

    private SingleObject(){
    }

    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Det här  fungerade\n" + random);
    }
}
