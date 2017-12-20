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

        public static boolean carry(Item weight)
        {
            Item curr_weight = weight;
        }
    }

    class Rocket implements Spaceship
    {
        public static boolean launch()
        {
            return true;
        }

        public static boolean land()
        {
            return true;
        }

        public static boolean canCarry(Item weight)
        {
            if (weight <= capacity)
                return true;
            else
                return false;
        }

        public static boolean carry(Item weight)
        {
            Item curr_weight = weight;
        }
    }



    class U1 extends Rocket
    {
        launchExplosion = (int) 0.05 * (cargoCarried / cargoLimit);
        landingCrash = (int) 0.01 * (cargoCarried / cargoLimit);

        public static boolean launch()
        {
            if(launchExplosion >= 100)
            return false;
            else
            return  true;
        }

        public static boolean land()
        {
            if(landingCrash >= 100)
                return false;
            else
                return  true;
        }
    }

    class U2 extends Rocket
    {
        launchExplosion = (int) 0.04 * (cargoCarried / cargoLimit);
        landingCrash = (int) 0.08 * (cargoCarried / cargoLimit);

        public static boolean launch()
        {
            if(launchExplosion >= 100)
                return false;
            else
                return  true;
        }

        public static boolean land()
        {
            if(landingCrash >= 100)
                return false;
            else
                return  true;
        }
    }






    public static void main(String[] args)
    {

    }
}
