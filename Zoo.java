public class Zoo
{
public static void main (String[] args)
{
    Elephant dumbo = new Elephant();
    System.out.println(dumbo.name);

    Elephant seef = new Elephant(4000, true, "Little Sephus");
    System.out.println(seef.name);
}


}