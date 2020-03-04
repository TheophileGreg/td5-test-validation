import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Stack;

class ValidParentheses {
	
	
	public static void main(String[] args) {
		
		System.out.println(new ValidParentheses().isValid2("(}"));

	}

	// Hash table that takes care of the mappings.
	private HashMap<Character, Character> mappings;

	// Initialize hash map with mappings. This simply makes the code easier to read.
	public ValidParentheses() {
		this.mappings = new HashMap<Character, Character>();
		this.mappings.put(')', '(');
		this.mappings.put('}', '{');
		this.mappings.put(']', '[');
	}


	public boolean isValid(String s) {

		assert true: "no pre-condition!"; 		// assertion 1

	boolean result= true;
	
	// Initialize a stack to be used in the algorithm.
	Stack<Character> stack = new Stack<Character>();

	for (int i = 0; i < s.length(); i++) {
		char c = s.charAt(i);

		if(c==')' || c=='('|| c=='}' || c=='{' || c==']' || c=='[') { 
			
	
		// If the current character is a closing bracket.
		if (this.mappings.containsKey(c)) {

			// Get the top element of the stack. If the stack is empty, set a dummy value of '#'
			char topElement = stack.empty() ? '#' : stack.pop();

			assert (stack.isEmpty()) || (topElement!='#'): "Invariant: if the stack is empty we get the symbol #";	// assertion 2
			// If the mapping for this bracket doesn't match the stack's top element, return false.
			if (topElement != this.mappings.get(c)) {
				return false;
			}
		} else {
			// If it was an opening bracket, push to the stack.
			stack.push(c);
		}
	}
	}

	assert (!s.isEmpty()) || (result == true) : "post-condition: when s is empty we return true";	//assertion 3
	// If the stack still contains elements, then it is an invalid expression.
	return stack.isEmpty();
	}

	public boolean isValid2(String s) {
		Deque<Character> deque = new ArrayDeque<>();
		int longueurString = s.length();
		int i = 0;
		while(i < longueurString){
			if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{' ){
				deque.addFirst(s.charAt(i));
				i++;
			} else if (s.charAt(i) == ']' || s.charAt(i) == '}' || s.charAt(i) == ')'){
				//if (deque.getFirst() == this.mappings.get(s.charAt(i))){
				if(s.charAt(i) == ']' && deque.getFirst() == '['){
					deque.removeFirst();
					i++;
				} else if(s.charAt(i) == '}' && deque.getFirst() == '{'){
					deque.removeFirst();
					i++;
				} else if(s.charAt(i) == ')' && deque.getFirst() == '('){
					deque.removeFirst();
					i++;
				}else{
					return false;
				}
			}
			else{
				i++;
			}
		}
		return true;

	}
	
	
}
