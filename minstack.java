/*
 Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

    push(x) -- Push element x onto stack.
    pop() -- Removes the element on top of the stack.
    top() -- Get the top element.
    getMin() -- Retrieve the minimum element in the stack.

*/
//use lists. Insert into 2nd list only if the element is less than 
// the already present element.
public class MinStack {

    /** initialize your data structure here. */
    List<Integer> s = new LinkedList();
    List<Integer> q = new LinkedList();

public void push(int x) {
    if(q.isEmpty()) q.add(x);
    else if(x <= q.get(q.size()-1)) q.add(x);
    s.add(x);    
}

public void pop() {
    if(s.size()<1) return;
    if(top() == q.get(q.size()-1)) q.remove(q.size()-1);
    s.remove(s.size()-1);
}

public int top() {
    if(s.size()<1) return 0;
    return s.get(s.size()-1);
}

public int getMin() {
    return q.get(q.size()-1);
}
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
 
