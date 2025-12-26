// package ex3;

public class Point {
    private double x;
    private double y;
    public Point(double x,double y)
    {
        this.x=x;
        this.y=y;

    }
    public static Double distance(Point p1, Point p2)
    {return Math.sqrt((p1.x-p2.x)*(p1.x-p2.x)+(p1.y-p2.y)*(p1.y-p2.y));}

    public void affiche()
    {System.out.println(" P= ("+this.x+" , "+this.y+" )" );}
}


// class Math {
// // Méthode sqrt : retourne la racine carré de nb 
// public static double sqrt(double nb) {…}
// // Méthode pow : retourne nbpuissance
// public static double pow(double nb, double puissance) {…}
// //… }
