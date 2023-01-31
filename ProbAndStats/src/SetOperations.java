
public class SetOperations {
   
       static ArrayList<String> union(ArrayList<String> list1, ArrayList<String> list2)@dd3 {
       ArrayList<String> unionList = new ArrayList<String>();

      
       for (String element : list1) {
           unionList.add(element);
       }

     
       for (String element : list2) {
           if (!unionList.contains(element)) {
               unionList.add(element);
           }
       }

       return unionList;
   }

   
       static ArrayList<String> intersect(ArrayList<String> list1, ArrayList<String> list2) {
       ArrayList<String> intersectList = new ArrayList<String>();

       //add all elements of list1 to intersectList if they exist in list2
       for (String element : list1) {
           if (list2.contains(element)) {
               intersectList.add(element);
           }
       }

       return intersectList;
   }

  
       static ArrayList<String> complement(ArrayList<String> list1, ArrayList<String> list2) {
       ArrayList<String> complementList = new ArrayList<String>();

       
       for (String element : list1) {
           if (!list2.contains(element)) {
               complementList.add(element);
           }
       }

       return complementList;
   }

}
