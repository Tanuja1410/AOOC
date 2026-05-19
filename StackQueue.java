class StackQueue {                                     
    private int maxSize;                                    
    private int[] stackArray;                                
    private int top;                                       

    public StackQueue(int size) {                           
        this.maxSize = size;                                 
        this.stackArray = new int[maxSize];                 
        this.top = -1;                                       
    }

    public void push(int value) {                            
        if (top < maxSize - 1) {                             
            stackArray[++top] = value;                       
        } else {                                             
            System.out.println("Stack is full. Cannot push " + value);            
        }
    }

    public int pop() {                                            
        if (top >= 0) {                                             
            return stackArray[top--];                             
        } else {                                                   
            System.out.println("Stack is empty. Cannot pop.");     
            return -1; // Return -1 to indicate stack is empty
        }
    }

    public boolean isEmpty() {                                     
        return (top == -1);                                        
    }   

    public boolean isFull() {                                       
        return (top == maxSize - 1);                                
    }
    
    public static void main(String[] args) {
        StackQueue s = new StackQueue(5);
        System.out.println("Pushing: 10, 20, 30, 40");
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        System.out.println("Popping all elements:");
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

}


