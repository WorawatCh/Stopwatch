package stopwatch;

/**
 * This task will add DoublePrimitive in array.
 * 
 * @author Worawat Chueajedton
 *
 */
public class SumDoublePrimitiveTask implements Runnable {

	private int counter;
	static final int ARRAY_SIZE = 500000;

	/**
	 * Initialize Double by counter.
	 * 
	 * @param counter
	 *            is a number of time that you add number
	 */
	public SumDoublePrimitiveTask(int counter) {
		this.counter = counter;
	}

	/**
	 * Add number from 1 until ARRAY_SIZE by DoublePrimitive.
	 * 
	 */
	@Override
	public void run() {
		double[] values = new double[ARRAY_SIZE];
		for (int k = 0; k < ARRAY_SIZE; k++)
			values[k] = k + 1;
		double sum = 0.0;
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0;
			sum = sum + values[i];
		}
		System.out.println("sum = " + sum);
	}

	/**
	 * 
	 * Return the result
	 * 
	 * @return the description of this task
	 * 
	 */
	@Override
	public String toString() {
		return String.format("Sum array of double primitives with count=%,d\n", counter);
	}
}
