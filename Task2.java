package DomashkiJava.Hw4Java;
// Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - 
// помещает элемент в конец очереди, dequeue() - возвращает первый элемент из
// очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
    
import java.util.ArrayDeque;
     
    public class Task2 {
        public static ArrayDeque<Integer> enqueue(ArrayDeque<Integer> linkedList, int element) {
            linkedList.addLast(element);
    
            return linkedList;
        }
    
        public static int dequeue(ArrayDeque<Integer> linkedList) {
            int firstElement = linkedList.getFirst();
            linkedList.pollFirst();
            System.out.println("Очередь после удаления элемента: " + linkedList);
    
            return firstElement;
        }
    
        public static int first(ArrayDeque<Integer> linkedList) {
            return linkedList.getFirst();
        }
    
        public static void main(String[] args) {
            ArrayDeque<Integer> linkedList = new ArrayDeque<>();
            for (int i = 0; i < 10; i++) {
                linkedList.add((int) (Math.random() * (10 - 1)));
            }
            int elem = 17;
            System.out.println("Очередь: " + linkedList);
            System.out.println("Очередь после добавления элемента: " + enqueue(linkedList, elem) + "\n"
                    + "Добавляемый элемент " + elem);
            System.out.println("Удаляемый элемент: " + dequeue(linkedList));
            System.out.println("Первый элемент: " + first(linkedList));
            System.out.println("Очередь после извлечения первого элемента без его удаления:" + linkedList);
        }
    
    }