package fan;

/**
 * Program to create and determine the status of an array of fans
 * CM245A Lab 02
 * @author Alexander Foiles
 * @version 02/02/2016
 */
public class Fan {
    
    String color;
    double speed;
    double radius;
    public int SLOW;
    public int MEDIUM;
    public int FAST;
    private boolean on;
    
    Fan(){
        speed=SLOW;
        radius=5;
        color = "Blue";
        on = false;
    }
    private String getColor(){
        return color;
    }
    private double getRadius(){
        return radius;
    }
    private boolean isOn(){
        return on;
    }
    private double getSpeed(){
        return speed;
    }
    
    /*  private void setSpeed(double newSpeed){
            this.speed = newSpeed;
        }
        private void setRadius(double newRadius){
            this.radius = newRadius;
        }
        private void setOn(boolean on){
            this.on = on;
        }
    */
    public void setFan(double newSpeed,double newRadius, String newColor, boolean on){
        this.speed=newSpeed;
        this.radius=newRadius;
        this.color=newColor;
        this.on=on;
    }

    //returns a string of descriptors to print (can leave off .toString())?
    static void print(Fan[] list){
        for(int k=0;k<list.length;k++)
            System.out.println(list[k].toString());
    }
    private static Fan[] load(){
        Fan[] list = new Fan[5];
        for(int k=0; k<list.length; k++){
            list[k]= new Fan();
        }
        return list;
    }
    public static String toString(Fan[] list){
        String fanString= "";
        for (int k=0; k<list.length; k++){
            fanString
        }
    }
    
    public static void main (String[] args){
        Fan[] fans = new Fan[5];
        fans=load();
        fans[0]=setFan(FAST,10,"Yellow",true);
        fans[1]=setFan(MEDIUM,5,"Blue", false);
        fans[2]=setFan(SLOW,25,"Red",true);
        fans[3]=setFan(FAST,15,"Green",false);
        fans[4]=setFan(MEDIUM,20,"Orange",true);
        
    }
}
//change countBlue(Fan[] fans, int speed) to a speed name