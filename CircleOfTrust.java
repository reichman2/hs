public class CircleOfTrust extends ConsoleProgram
{
    public void run()
    {
        // Start here!
        /*
         *
         *
         */ 
        
        double r = readDouble("Radius: ");
        
        
        double a = (Math.PI * Math.pow(r, 2));
        double c = (2 * Math.PI * r);
        double v = (4 / 3 * Math.PI * Math.pow(r, 3));
        double sa = (4 * Math.PI * Math.pow(r, 2));
        
        // Round the area, circumference, volume, and surface area.
        a = round(a); // (int) (a * 100 + 0.5) / 100.0;
        c = round(c); // (int) (c * 100 + 0.5) / 100.0;
        v = round(v); // (int) (v * 100 + 0.5) / 100.0;
        sa = round(sa); // (int) (sa * 100 + 0.5) / 100.0
        
        System.out.println("A = " + a);
        System.out.println("C = " + c);
        
        System.out.println("V = " + v);
        System.out.println("SA = " + sa);
    }
    
    public double round(double n) {
        return (int) (n * 100 + 0.5) / 100.0;
    }
}
