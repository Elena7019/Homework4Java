package DomashkiJava.Hw4Java;
// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
    
    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.LinkedList;
    import java.util.List;
     
    public class Task1 {
    
        public static<T> List<T> reverseList(List<T> list)
        {
            List<T> reverse = new ArrayList<>(list.size());
     
            new LinkedList<>(list)
                    .descendingIterator()
                    .forEachRemaining(reverse::add);
     
            return reverse;
        }
     
        public static void main(String[] args)
        {
            List<Integer> list = Arrays.asList(1, 12, 35, 344, 5);
            System.out.println("Дан следующий LinkedList: " + list);
            List<Integer> reverse = reverseList(list);
            System.out.println("Получили перевернутый список:" + reverse);
        }
    }
