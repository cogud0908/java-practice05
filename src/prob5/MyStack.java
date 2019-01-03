package prob5;

public class MyStack {
	private int top;
	private String[] buffer;

	@SuppressWarnings("unchecked")
	public MyStack(int capacity) {
		
		buffer = new String[capacity];
		top = -1;
	}

	public void push(String s) {
		
		if(top+1 >= buffer.length)
		{
			String[] buffer2 = new String[buffer.length*2];
			for(int i = 0; i < buffer.length; i++)
				buffer2[i] = buffer[i];
			
			buffer = buffer2;
		}
		
		buffer[++top] = s;
	}

	public String pop() throws MyStackException {
		
		if(top < 0)
		{
			throw new MyStackException();
		}		
		
		return buffer[top--];
	}

	public boolean isEmpty() {
		return top == -1;
	}
}