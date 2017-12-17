public class Mission
{

    class Item
    {
        String name = "";
        int weight;
    }

    public interface Spaceship
    {
        public static boolean launch(Item launching)
        {
            if(launching == successful)
                return true;
            else
                return false;
        }

        public static boolean land(Item landing)
        {
            if(landing == successful)
                return true;
            else
                return false;
        }

        public static boolean canCarry(Item weight)
        {
            if(weight <= capacity)
                return true;
            else
                return false;
        }

        public static boolean launch(Item weight)
        {
            Item curr_weight = weight;
        }
    }

    class Rocket implements Spaceship
    {
        
    }

    class U1 extends Rocket
    {

    }

    class U2 extends Rocket
    {

    }






    public static void main(String[] args)
    {

    }
}
