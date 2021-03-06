package peak_finding;

import org.junit.Assert;
import org.junit.Test;

public class TestLinearPeakFinding {

	@Test
	public void test() {
		int[] values = {4,6,0,4,3,6,1,7};
		int peakValue = new LinearPeakFinding(values).findPeak();
		Assert.assertEquals(peakValue, 6);
		
		peakValue = new BinaryPeakFinder(values).findPeak();
		Assert.assertEquals(peakValue, 6);
		
	}

}
