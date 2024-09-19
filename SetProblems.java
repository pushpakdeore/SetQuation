package pushpak33setquation;
import java.sql.Array;
import java.util.*;

public class SetProblems {
    /*1. Class-Specific Set Behavior:
○ Problem: Given a list of integers, create a method that returns a HashSet,
LinkedHashSet, and TreeSet containing the unique elements from the list.
Demonstrate how each set's characteristics (ordering, performance) affect the
output and processing.
○ Example: Input: [5, 3, 5, 1, 2]. Output:
■ HashSet: {1, 2, 3, 5}
■ LinkedHashSet: {5, 3, 1, 2}
■ TreeSet: {1, 2, 3, 5}
*/
    public static void setBehavior(List<Integer> list){
        Set<Integer> hashSet = new HashSet<>(list);
        Set<Integer> LinkedHashset = new LinkedHashSet<>(list);
        Set<Integer> treeSet = new TreeSet<>(list);

        System.out.println("HashSet : "+hashSet);
        System.out.println("LinkedHashSet: "+LinkedHashset);
        System.out.println("TreeSet: "+treeSet);
    }
//    2. Maintaining Insertion Order:
//            ○ Problem: Write a method that takes a list of strings and returns a
//    LinkedHashSet to maintain the insertion order of elements while removing
//    duplicates.
    public static Set<String> maintainInsertionOrder(List<String> list){
        return new HashSet<>(list);
    }
//    4. Sorted Unique Elements:
//            ○ Problem: Write a method that takes a list of integers and returns a TreeSet
//    containing the unique elements sorted in ascending order.
//            ○ Example: Input: [7, 2, 9, 1, 2, 9]. Output: [1, 2, 7, 9]
    public static  Set<Integer> getSortUniqueElement(List<Integer>  sortList){
        return new TreeSet<>(sortList);
    }
//    8. The intersection of Multiple Sets:
    public static Set<Integer> intersetionofMutiple(List<Set<Integer>> sets){
        Set<Integer> result = new HashSet<>(sets.get(2));
        for(Set<Integer> set : sets){
            result.retainAll(set);
        }
        return result;
    }
//10. Remove Elements Based on Condition:
//            ○ Problem: Given a TreeSet of integers, write a method to remove all elements
//    that are less than a specified threshold.
//○ Example: Input: TreeSet = {1, 2, 3, 4, 5} and threshold 3. Output: {3,
//            4, 5}
    public static void removeElementsBelowThreshold(Set<Integer> set, int threshold){
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            Integer element = iterator.next();
            if (element<threshold){
                iterator.remove();
            }
        }
        System.out.println(set);

    }







    public static void main(String[] args) {
        //1
        List<Integer> list =  Arrays.asList(5,3,5,1,2,34,100,43);
        setBehavior(list);

        //2
        List<String> Stringlist = Arrays.asList("apple","banana", "apple", "orange");
        Set<String> linkedHashset = maintainInsertionOrder(Stringlist);
        System.out.println(linkedHashset);

        //3
        List<Integer>  sortList = Arrays.asList(7, 2, 9, 1, 2, 9);
        Set<Integer> treeSet = getSortUniqueElement( sortList );
        System.out.println("sorted and set :"+treeSet);

//        6. Set Operations with Subsets:
//○ Problem: Write a method to check if one Set is a subset of another. Test this
//        with different implementations (HashSet, LinkedHashSet, TreeSet).
//○ Example: Input: SetA = {1, 2, 3} and SetB = {1, 2, 3, 4}. Output:
//        true
        Set<Integer> A = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> B =new HashSet<>(Arrays.asList(1,2,3,4));
        System.out.println("is set A subset of B  :"+B.containsAll(A));

        Set<Integer> C = new LinkedHashSet<>(Arrays.asList(1,2,3));
        Set<Integer> D =new LinkedHashSet<>(Arrays.asList(1,2,3,4));
        System.out.println("is set A subset of B  :"+D.containsAll(C));

        Set<Integer> E = new TreeSet<>(Arrays.asList(1,2,3));
        Set<Integer> F =new TreeSet<>(Arrays.asList(1,2,3,4));
        System.out.println("is set A subset of B  :"+F.containsAll(E));


        //8
        List<Set<Integer>> sets =Arrays.asList(
                new HashSet<>(Arrays.asList(1, 2, 3)),
                new HashSet<>(Arrays.asList(2, 3, 4)),
                new HashSet<>(Arrays.asList(3, 4, 5))
        );
        System.out.println("Intersection of sets :"+intersetionofMutiple(sets));



      //10
        Set<Integer> set = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5));
        int threshold = 3;
        removeElementsBelowThreshold(set, threshold);
        System.out.println("TreeSet after removing elements below " + threshold + ": " + treeSet);





    }
}
