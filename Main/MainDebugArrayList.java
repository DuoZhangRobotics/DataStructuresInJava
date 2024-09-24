import ErrorHandling.DataStructureException;
import List.ArrayList;

public class MainDebugArrayList {
   public static void main(String[] args) throws DataStructureException{
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());

        ArrayList<Double>  arrayList1 = new ArrayList<Double>(10);
        System.out.println(arrayList1.size());
        System.out.println(arrayList1.isEmpty());
        arrayList1.append(1.0);
        System.out.println(arrayList1);
        arrayList1.insert(0, 100.0);
        System.out.println(arrayList1);
        arrayList1.extend(new ArrayList<Double>(new Double[]{1.0, 2.0, 3.0}));
        arrayList1.insert(-1, 100.0);
   }
}
