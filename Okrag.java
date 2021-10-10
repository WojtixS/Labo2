public class Okrag
{
    public static void main(String[] args) {

        Kolo ob1 = new Kolo(4.5);
        if(ob1.r>0){
            System.out.println("Pole "+ob1.getPole());
         System.out.println("Promien "+ob1.getPromien());
        System.out.println("Srednica "+ob1.setSrednica());
        }else{
            System.out.println("Promień nie może mieć wartości rownej zero badz mniejszej");
        }
    }
}
class Kolo{
    double r;
    public Kolo (double r){
        this.r = r;

    }
    public double getPole(){
        return Math.PI * r *r ;
    }

   public double getPromien(){
        return r;
    }

    public double setSrednica(){
        return 2*r;
    }
}