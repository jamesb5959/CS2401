public class LL {
    public void magicMethod() {
        Node temp = head;
       
        int max = 0;
        while (temp != null) {
        if (temp.data > max) {
        max = temp.data;
        temp = temp.next;
        } else {
        temp.data += 10;
        head = head.next;
        temp = head;
        max = 0;
        }
        }
        public static void main(String args[]) 
    { 
        LinkedList<String> ll = new LinkedList<>(); 
    
        ll.add("Geeks"); 
        ll.add("Geeks"); 
        ll.add(1, "For"); 
    
        System.out.println(ll); 
    } 
} 
}
