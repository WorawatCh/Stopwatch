package stopwatch;

/**
 * This class will show the elapsed time of any task the use it.
 * 
 * @author Worawat Chueajedton
 *
 */
public class Tasktimer {
	private Stopwatch timer = new Stopwatch();

	/**
	 * Run a task and show the elapsed time of it.
	 * 
	 * @param running
	 *            to tell a task to be run
	 */
	public void measureAndPrint(Runnable running) {
		System.out.println(running.toString());
		timer.start();
		running.run();
		timer.stop();
		System.out.printf("Elapsed time %.6f sec\n\n", timer.getElapsed());
	}

}
