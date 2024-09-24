import ErrorHandling.DataStructureException;

public class MainDebugErrorHandling{
  public static void test() throws DataStructureException{
    throw DataStructureException.FUNCTION_NOT_IMPLEMENTED();
  }
  public static void main(String[] args) throws DataStructureException{
    try{
      throw DataStructureException.FUNCTION_NOT_IMPLEMENTED();
    }catch(DataStructureException e){
      System.out.println(e.getMessage());
    }

    try{
      throw new DataStructureException("This is a test"); 
    }
    catch(DataStructureException e){
      System.out.println(e.getMessage());
    }
  }
}