package stopwatch;

/**
 * This main wii do the all the task to compare the speed
 * 
 * @author Worawat Chueajedton
 *
 */
public class Main {
	public static void main(String[] args) {
		Tasktimer timer = new Tasktimer();
		timer.measureAndPrint(new AppendToStringTask(50000));
		timer.measureAndPrint(new AppendToStringTask(100000));
		timer.measureAndPrint(new AppendToStringBuilderTask(100000));
		timer.measureAndPrint(new SumDoublePrimitiveTask(1000000000));
		timer.measureAndPrint(new SumDoubleTask(1000000000));
		timer.measureAndPrint(new SumBigDecimalTask(1000000000));
	}
}
