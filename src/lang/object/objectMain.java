package lang.object;

public class objectMain {
    public static void main(String[] args) {
        child child = new child();
        child.childMethod();
        child.parentMethod();

        String string = child.toString();
        System.out.println(string);
    }
}
