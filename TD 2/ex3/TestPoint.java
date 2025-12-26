package ex3;
public class TestPoint {
    public static void main(String[] args)
    {
        // Création du point de coordonnées x=1 et y=3 
        Point p1 = new Point(1.0, 3.0);
        // Création du point de coordonnées x=5 et y=6 
        Point p2 = new Point(5.0, 6.0);
        // Calcul de la distance entre p1 et p2 
        double d = Point.distance(p1,p2);
        p1.affiche( ); // affiche : p = (1.0 , 3.0) 
        p2.affiche( ); // affiche : p = (5.0 , 6.0)
        // affiche la distance entre p1 et p2 
        System.out.println("Distance entre p1 et p2 = " + d);
    }
}
