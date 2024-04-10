package structures;
import java.io.PrintWriter;

public class me {
  public static void main(String[] args) throws Exception{
    PrintWriter pen = new PrintWriter(System.out, true);
    AssociativeArray<String,String> strArr = 
      new AssociativeArray<String,String>();
    
      strArr.hasKey("7");
      strArr.size();
      strArr.set("M", "m");
      strArr.set("E", "e");
      strArr.set("D", "d");
      strArr.set("H", "h");
      strArr.get(null);
      strArr.remove("D");
      System.out.println("strArr " + strArr);
      strArr.set("A", "a");
      strArr.get("D");
      //strArr.hasKey(null);
      System.out.println("isFull: " + strArr.isFull());
      strArr.size();
      // strArr.remove("H");
      pen.println(strArr);
      pen.println("find: " + strArr.find("E"));
      


//  /** 
//    * Successfully checks the size of the array after setting and removing 
//    */
//   @Test
//   public void medhashreeAdhikariTest1() throws Exception {
//     AssociativeArray<String,Integer> strArr = 
//       new AssociativeArray<String,Integer>();
//       strArr.set("M", 1);
//       strArr.set("E", 2);
//       strArr.set("D", 3);
//       strArr.set("H", 4);
//       strArr.set("A", 5);
//       strArr.remove("M");
//       strArr.remove("E");
//       strArr.remove("D");
//       strArr.remove("H");
//       strArr.remove("A");
//     // set a value to a key with something already associated to it
//     assertEquals(0, strArr.size());
//   }

//   /**
//    * Successfully gets the value associated with an empty string
//    */
//   @Test
//   public void medhashreeAdhikariTest2() throws Exception {
//     AssociativeArray<String,Integer> strArr = 
//       new AssociativeArray<String,Integer>();
    
//     // set key's value to empty string
//     strArr.set("", 1);
    
//     // expected 1, returns 1
//     assertEquals(1, strArr.get(""));
//   }

//   /**
//    * Successfully returns null when trying to get something
//    * from an empty array
//    * @throws Exception
//    */
//   @Test
//   public void medhashreeAdhikariTest3() throws Exception {
//     AssociativeArray<String,Integer> strArr = 
//       new AssociativeArray<String,Integer>();
//     // expected null
//     assertEquals(null, strArr.get("M"));
//   }

  }
}