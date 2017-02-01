package stopwatch;

/**
 * A Stopwatch that measure the start time, stop time and also elapsed time
 * 
 * @author Worawat Chueajedton
 *
 */
public class Stopwatch {
	private static final double NANOSECONDS = 1.0E-9;
	private long startTime;
	private long stopTime;
	private boolean isRunning = false;

	/**
	 * To start a stopwatch if it not running.
	 * 
	 */
	public void start() {
		if (isRunning == false) {
			this.startTime = System.nanoTime();
			isRunning = true;
		}

	}

	/**
	 * To stop a stopwatch if it still running.
	 * 
	 */
	public void stop() {
		if (isRunning == true) {
			this.stopTime = System.nanoTime();
			isRunning = false;
		}
	}

	/**
	 * Return elapsed time of stopwatch. If a stopwatch already running it will
	 * return elapsed time from start time to current time.And if stopwatch is
	 * stop it will return elapsed time from start time to stop time
	 * 
	 * @return return elapsed time in second
	 */
	public double getElapsed() {
		if (isRunning == true) {
			return (System.nanoTime() - this.startTime) * NANOSECONDS;
		} else {
			return (this.stopTime - this.startTime) * NANOSECONDS;
		}
	}

	/**
	 * To check a stopwatch that is ruuning or stop
	 * 
	 * @return result of checking
	 */
	public boolean isRunning() {
		return isRunning;
	}

}
