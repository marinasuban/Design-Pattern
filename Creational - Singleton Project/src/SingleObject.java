public class SingleObject {
    //creates an object of SingleObject
    private static SingleObject instance = new SingleObject();

    //make the constructor private
    private SingleObject(){}

    //Get the only object available
    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
