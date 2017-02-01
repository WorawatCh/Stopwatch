package stopwatch;

/**
 * 
 * This task is a task that append char 'a' to StringBuilder.
 * 
 * @author Worawat Chueajedton
 *
 */
public class AppendToStringBuilderTask implements Runnable {
	private int count;
	private final char CHAR = 'a';

	/**
	 * 
	 * To set a size of AppendToStringBuilderTask by user.
	 * 
	 * @param count
	 *            is a final length of String
	 */
	public AppendToStringBuilderTask(int count) {
		this.count = count;
	}

	/**
	 * Add 'a' until StringBuilder get the final size.
	 * 
	 */
	@Override
	public void run() {
		StringBuilder builder = new StringBuilder();
		int k = 0;
		while (k++ < count) {
			builder = builder.append(CHAR);
		}
		// now create a String from the result, to be compatible with task 1.
		String result = builder.toString();
		System.out.println("final string length = " + result.length());
	}

	/**
	 * Return the result size of StringBuilder.
	 * 
	 * @return Return the result size
	 */
	@Override
	public String toString() {
		return String.format("Append %,d chars to StringBuilder\n", count);

	}
}
