package stopwatch;

/**
 * This task will add Double in array.
 * 
 * @author Worawat Chueajedton
 *
 */
public class SumDoubleTask implements Runnable {

	private int counter;
	static final int ARRAY_SIZE = 500000;

	/**
	 * Initialize Double by counter.
	 * 
	 * @param counter
	 *            is a number of time that you add number
	 */
	public SumDoubleTask(int counter) {
		this.counter = counter;
	}

	/**
	 * 
	 * Add number from 1 until ARRAY_SIZE by Double.
	 * 
	 */
	@Override
	public void run() {
		Double[] values = new Double[ARRAY_SIZE];
		for (int i = 0; i < ARRAY_SIZE; i++)
			values[i] = new Double(i + 1);
		Double sum = new Double(0.0);
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0;
			sum = sum + values[i];
		}
		System.out.println("sum = " + sum);

	}

	/**
	 * Return the result
	 * 
	 * @return the description of this task
	 * 
	 */
	@Override
	public String toString() {
		return String.format("Sum array of Double objects with count=%,d\n", counter);
	}
}
