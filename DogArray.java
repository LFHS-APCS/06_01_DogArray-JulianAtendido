public class DogArray
{

    /**
     *  Returns the index of the youngest dog in the given array
     */
    public static int getYoungestIndex(Dog[] dogs)
    {
      int age = dogs[0].getAge();
      int youngest = 0;
        for (int i = 0; i < dogs.length; i++){
          if (dogs[i].getAge() < age) {
          age = dogs[i].getAge();
          youngest = i;
          }
        }
      return youngest;

    }

    /**
     *  Returns the name of the youngest dog in the given array
     */
    public static String getYoungestName(Dog[] dogs)
    {
        return "";
    }
}
