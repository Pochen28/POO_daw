package org.example.colecciones;

import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingDeque;

public class Prueba_colas {
    public static void main(String[] args) {
        Deque<String> cola = new LinkedList<>();

        cola.offer("Manolito");
        cola.offer("Pocoyo");
        cola.offer("Bart Simpson");
        cola.offer("Stewie");
        cola.poll();// manolo fuera
        System.out.println(cola.peek());
        cola.offerFirst("Kevin MC callister");
        cola.pollLast();
        System.out.println(cola.peekLast());

        LinkedBlockingDeque<String> colalimitada = new LinkedBlockingDeque<>(3);

        colalimitada.offer(("MANOLITO"));
        colalimitada.offer("JUANITO");
        colalimitada.offer("JAIMITO");
        colalimitada.offer("JOSELITO"); // no entra este porque hemos limitado la cola a 3 personas
    }
}
