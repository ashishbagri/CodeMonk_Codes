package peak_finding;

public class BinaryPeakFinder extends LinearPeakFinding{

	public BinaryPeakFinder(int[] values) {
		super(values);
	}
	
	@Override
	public int findPeak() {
		
		return findPeak(values,0, values.length-1);
	}

	private int findPeak(int[] values, int i, int j) {
		int mid = (j+i)/2;
		if(values[mid]<values[mid-1]){
			return findPeak(values, i, mid);
		}else
			if(values[mid]<values[mid+1])
				return findPeak(values, mid, j);
		return values[mid];
	}
	
}
