package OOP.OOP;

public class NetflixPlayer extends VodPlayer{
    @Override
    public void play(final String title){
        System.out.println("playing "+title+" on Netflix");
    }
}
