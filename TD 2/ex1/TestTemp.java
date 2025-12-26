package ex1;

public class TestTemp {
    public static void main (String [ ] args)
    {
        Temps t = new Temps (10); 
        t.affiche( );
        t = new Temps (10,12); 
        t.affiche( );
        t = new Temps (10, 12, 45); 
        t.affiche( );
    }
}
