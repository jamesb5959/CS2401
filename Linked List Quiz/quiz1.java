public class quiz1 {
    public void addIfLonger(String str){
        List iter = head;
        for(int i=0; i<List.getSize(); i++){
            if(iter.getData().length() < str.length()){
                                Node newNode = new Node(string, iter.getNext());
                                iter.setNext(newNode);
                            Size++;
        }
            }
            return;
        }
        
    public void printbw() { 
        intLL iter = this;
        if (iter.next == null) {  
        System.out.print(iter.getData()); 
        return; 
        }  
        next.printbw(); 
        
        System.out.print(iter.getData()); 
        }
        
    public void printOdd() { 
        if (next == null) { 
            if (data % 2 == 1) { // data is odd 
                System.out.println(data); 
            } 
        return; 
        } 
        if (data %  2 == 1)  
        System.out.println(data); 
        next.printOdd(); 
    } 
    public int sumEven() { 
        if (next == null) { 
            if (data % 2 == 0) {
                return data; 
            }
            return 0; 
        } 
        if (data %  2 == 0)  
        return data + next.sumEven(); 
        return next.sumEven(); 
        } 
    public void aggregateValues()
        intLL iter = this;
        if (iter.getNext == null && aggregateValues()%2==0) { 
            return iter.getData(); 
        }
        else if(iter.getNext == null){
            return iter.getData();
        }
        if(aggregateValues()%2==1){
            int aux = iter.getNext().iter.getData;
            it
            return 1 + next.aggregateValues();    
        }
        return 1 + next.aggregateValues();
    } 
}
