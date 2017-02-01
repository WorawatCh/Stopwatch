package stopwatch;

import java.math.BigDecimal;

/**
 * This task will add BigDecimal in array.
 * 
 * @author Worawat Chueajedton
 *
 */
public class SumBigDecimalTask implements Runnable {

	private int counter;
	static final int ARRAY_SIZE = 500000;

	/**
	 * Initialize SumBigDecimal by counter.
	 * 
	 * @param counter
	 *            is a number of time that you add number
	 */
	public SumBigDecimalTask(int counter) {
		this.counter = counter;
	}

	/**
	 * Add number from 1 until ARRAY_SIZE by BigDecimal.
	 * 
	 */
	@Override
	public void run() {
		BigDecimal[] values = new BigDecimal[ARRAY_SIZE];
		for (int i = 0; i < ARRAY_SIZE; i++)
			values[i] = new BigDecimal(i + 1);
		BigDecimal sum = new BigDecimal(0.0);
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0;
			sum = sum.add(values[i]);
		}
		System.out.println("sum = " + sum);
	}

	/**
	 * Return the result
	 * 
	 * @return the description of this task
	 */
	@Override
	public String toString() {
		return String.format("Sum array of BigDecimal with count=%,d\n", counter);
	}
}
