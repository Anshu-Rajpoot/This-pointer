class pen{
    String color;
    String type;
    public void printcolor(){
        System.out.println("Color is : "+this.color);
        System.out.println("Type of pen is : "+this.type);
    }
}
public class thispointer{
    public static void main(String args[]){
        pen pen1=new pen();
        pen pen2=new pen();

        pen1.color="red";
        pen1.type="ball pen";

        pen2.color="blue";
        pen2.type="gel pen";
        
        System.out.println("Pen 1 Data is  ");
        pen1.printcolor();
        System.out.println("\nPen 2 Data is  ");
        pen2.printcolor();
    }
}
