package stopwatch;

/**
 * This task append char 'a' to String.
 * 
 * @author Worawat Chueajedton
 *
 */
public class AppendToStringTask implements Runnable {

	private int count;
	final char CHAR = 'a';

	/**
	 * To set a size of AppendToStringTask by user.
	 * 
	 * @param count
	 *            is a final length of String
	 */
	public AppendToStringTask(int count) {
		this.count = count;
	}

	/**
	 * Add 'a' until String get the final size.
	 * 
	 */
	@Override
	public void run() {
		String result = "";
		int k = 0;
		while (k++ < count) {
			result = result + CHAR;
		}
		System.out.println("final string length = " + result.length());

	}

	/**
	 * Return the result size of StringBuilder.
	 * 
	 * @return Return the result size
	 */
	@Override
	public String toString() {
		return String.format("Append %,d chars to String\n", count);

	}

}
