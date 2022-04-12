public class quiz1 {
    public void printbw() { 
        intLL iter = this;
        if (iter.next == null) {  
        System.out.print(iter.getData()); 
        return; 
        }  
        next.printbw(); 
        
        System.out.print(iter.getData()); 
        }

        public void printbwEven() { 
            intLL iter = this;
            if (iter.next == null) {  
                if(data%2==0){}
                System.out.print(iter.getData()); 
                return; 
                }
            }
            next.printbwEven();  
            if(data%2==0){
            System.out.print(iter.getData()); 
            return; 
            }
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
    public int sum() { 
        if (next == null) { 
            return data; 
        }
        return data + next.sum();
        } 

        //except multiples of 5
        public int sumEven() { 
            if (next == null) { 
                if (data % 2 == 0 && data%5!=0) {
                    return data; 
                }
                return 0; 
            } 
            if (data %  2 == 0 && data%5!=0)  
            return data + next.sumEven(); 
            else
            return next.sumEven(); 
            }
            
            public void aggregateValues(){
                if (next == null) return;
                next.setData(next.getData() + data);
                if (next.getNext() != null) 
                    next.getNext().aggregateValues();
                else 
                    return;}
}
