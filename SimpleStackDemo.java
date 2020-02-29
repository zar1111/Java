
class SimpleStackDemo {
	public static void main(String[] args){
			int i;
			char ch;
			
			System.out.println("Demonstrate SimpleStack\n");
			
			// Construct 10-element empty stack.
			SimpleStack stack = new SimpleStack(10);
			
			System.out.println("\nPush 10 items onto a 10-element stack.");

			//Push the letters Althrouh J onto the stack
			System.out.println("Pushing: ");
			for (ch = 'A'; ch < 'K'; ch++)
			{
				System.out.print(ch+" ");
				stack.push(ch);
			}

			System.out.print("\nPop those 10 items from stack.");

			//pop
			System.out.println("Poping: " );

			for(i = 0; i < 10; i++){
				ch = stack.pop();
				System.out.print(ch+" ");
			}
			
			System.out.println("\nNext, use isempty and isfull");
			
			//Push the letters until the stack is full

			System.out.print("Pushing: ");
			for(ch = 'A'; !stack.isFull(); ch++){
				System.out.print(ch+" " );
				stack.push(ch);
			}
			
			System.out.println("\n");
			
			//Pop

			System.out.print("Popping: ");
			while(!stack.isEmpty())
			{
				ch = stack.pop();
				System.out.print(ch+" ");
			}
		}
	}
			




class SimpleStack{
	char[] data;
	int tos;
	
	//Constuct an empty stack given its size
	
	SimpleStack(int size) {
		data = new char[size]; // create the array to hold the stack
		tos = 0;
	}

	// Push
	void push(final char ch) {
		if (isFull()) {
			System.out.print(" -- Stack is full.");
			return;
		}
		data[tos] = ch;
		tos++;
	}

	// Pop
	char pop() {
		if (isEmpty()) {
			System.out.print(" -- Stack is empty.");
			return (char) 0;
		}
		tos--;
		return data[tos];
	}

	// isEmpty
	boolean isEmpty() {
		return tos == 0;
	}

	boolean isFull() {
		return tos == data.length;
	}
}

			
			
			
			
			