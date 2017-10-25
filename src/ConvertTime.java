import java.util.Scanner;

public class ConvertTime {
    int hours, minutes;

    public ConvertTime(int hours, int minutes){
        this.hours = hours;
        this.minutes = minutes;
    }

    public int getHours(){
        return hours;
    }

    public int getMinutes(){
        return minutes;
    }

    public void setHours(int hours){
        this.hours = hours;
    }

    public void setMinutes(int minutes){
        this.minutes = minutes;
    }

    public int convertToAngle(){
        return Math.abs((((60* hours)+minutes)/2) - (6*minutes));
    }

    public int smallerAngle(){
        return Math.min(360-convertToAngle(), convertToAngle());
    }

    public static void main(String[]args){

        Scanner reader = new Scanner(System.in);

        while(true) {
            System.out.println("Enter hour: ");
            int h = reader.nextInt();
            while(h > 12){
                System.out.println("Hour must be 1-12\n");
                System.out.println("Enter hour: ");
                h = reader.nextInt();
            }
            System.out.println("Enter minutes: ");
            int m = reader.nextInt();
            while(m > 59){
                System.out.println("Minutes must be 0-59\n");
                System.out.println("Enter minutes: ");
                m = reader.nextInt();
            }


            ConvertTime ct = new ConvertTime(h, m);

            System.out.println(ct.convertToAngle() + " degrees.\n");
            System.out.println(ct.smallerAngle() + " degrees (smaller angle).\n");
        }
    }
}
