package ex4;

public class Complexe {
    private double real;
    private double img;
    public Complexe(double real, double img )
    {
        this.real=real;
        this.img=img;
    }
    public String info()
    {return "( re: "+this.real+" , im: "+this.img+" )" ;}

    @SuppressWarnings("null")
    public Complexe produit (Complexe c)
    {
        Complexe X = null;
        X.real=(c.real*this.real)-(c.img*this.img);
        X.img=(c.real*this.img)+(c.img*this.real);
        return X;
    }

    @SuppressWarnings("null")
    public static Complexe produit (Complexe c1, Complexe c2)
    {
        Complexe X = null;
        X.real=(c1.real*c2.real)-(c1.img*c2.img);
        X.img=(c1.real*c2.img)+(c1.img*c2.real);
        return X;
    }
}
