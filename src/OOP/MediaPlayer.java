package OOP;

import javax.xml.crypto.NoSuchMechanismException;

public interface MediaPlayer {
    // final String MYCONST = "Maria"; // -> public static by default
    String TAG = "MediaPlayer";
    void stop(); //abstract by deafult
    void play();

    default void next(){
        throw new NoSuchMechanismException("not supported by default");
    }

    static String getName(){
        return "MediaPlayer Interface";
    }
}
