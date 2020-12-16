public class SinglyLinkedList {
    public Node head; // puntero de inicio de la lista
    public SinglyLinkedList() {
        head = null;
    }

    // Método para agregar nodo al final de la lista
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    // Método para remover nodo al final de la lista
    public void remove () {
        Node var = head;
        while (var.next.next != null) {
            var = var.next;
        }
        var.next = null;
    }
    
    // Método para mostrar los datos
    public void printValues () {
        Node recorrer = head;
        while (recorrer != null) {
            System.out.println("[" + recorrer.value + "]");
            recorrer = recorrer.next;
        }
    }

    //  Mostrar el primer nodo con el valor dado
    public void find (int n) {
        Node rec = head;
        while (rec.value != n) {
            rec = rec.next;
        }
        System.out.println(rec.value);
    }

    // Remover nodo n
    public void removeAt (int x) {
        Node rem = head;
        if (x == 0) {
            head = rem.next;
        }
        else {
            for (int i = 0; i < x-1; i++) {
                rem = rem.next;
            }
            rem.next = rem.next.next;
        }
    }
}