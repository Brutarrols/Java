public class Node {
    public int value;
    public Node next; //puntero enlace a la lista
    //constructor para insertar al final de la lista
    public Node(int num) {
        this.value = num;
        next = null;
    }
}