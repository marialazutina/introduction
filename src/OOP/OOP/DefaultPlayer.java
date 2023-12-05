package OOP.OOP;

public class DefaultPlayer extends VodPlayer{
    @Override
    public void play(final String title){
        System.out.println("playing "+title+" on Default Player");
    }
}
