package peak_finding;

import org.junit.Assert;
import org.junit.Test;

public class TestLinearPeakFinding {

	@Test
	public void test() {
		int[] values = {1,2,3,4,5,6,9,7};
		int peakValue = new LinearPeakFinding(values).findPeak();
		Assert.assertEquals(peakValue, 9);
	}

}
