package solidprinciples.interfacesegregation;

public class Robot implements Workable{
    @Override
    public void work() {
        System.out.println("Doing Robot work...");
    }
}
