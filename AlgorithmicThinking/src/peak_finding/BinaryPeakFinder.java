package peak_finding;

public class BinaryPeakFinder extends LinearPeakFinding{

	public BinaryPeakFinder(int[] values) {
		super(values);
	}
	
	@Override
	public int findPeak() {
		int mid = values.length/2;
		if(values[mid]<values[mid-1]){
			
		}
		return super.findPeak();
	}
	
}
