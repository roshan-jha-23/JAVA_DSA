package OOPS.interfaces;

public class CDplayer implements Media{
    @Override
    public void start() {
        System.out.println("music strat");
    }

    @Override
    public void stop() {
        System.out.println("music stop");

    }
}
