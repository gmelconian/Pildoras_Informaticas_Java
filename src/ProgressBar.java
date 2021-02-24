
public class ProgressBar {

	public static void main(String[] args) {

		for (int i = 0; i <= 100; i++) {
			progressPercentage(i, 100);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void progressPercentage(int done, int total) {
		int size = 10;
		String iconLeftBoundary = "[";
		String iconDone = "=";
		String iconRemain = ".";
		String iconRightBoundary = "]";

		if (done > total) {
			throw new IllegalArgumentException();
		}
		int donePercents = (100 * done) / total;
		int doneLength = size * donePercents / 100;

		StringBuilder bar = new StringBuilder(iconLeftBoundary);
		for (int i = 0; i < size; i++) {
			if (i < doneLength) {
				bar.append(iconDone);
			} else {
				bar.append(iconRemain);
			}
		}
		bar.append(iconRightBoundary);

		System.out.print("\r" + bar + " " + donePercents + "%");

		if (done == total) {
			System.out.print("\n");
		}
	}

}
