public class CandyMaker {
    private Candy chocolateBar;
    private Candy lollipop;
    private Candy candyCane;

    public CandyMaker(){
        chocolateBar = new ChocolateBar();
        lollipop = new Lollipop();
        candyCane = new CandyCane();
    }

    public void makeChocolate(){
        chocolateBar.make();
    }

    public void makeLollupop(){
        lollipop.make();
    }

    public void makeCandyCane(){
        candyCane.make();
    }

}
