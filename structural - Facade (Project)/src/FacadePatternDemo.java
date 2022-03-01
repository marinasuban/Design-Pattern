public class FacadePatternDemo {

    public static void main(String[] args) {
	CandyMaker candyMaker = new CandyMaker();

    candyMaker.makeChocolate();
    candyMaker.makeCandyCane();
    candyMaker.makeLollupop();
    }
}
