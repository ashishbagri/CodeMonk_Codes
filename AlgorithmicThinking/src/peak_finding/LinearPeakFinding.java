package peak_finding;

public class LinearPeakFinding {
	
	protected int[] values;
	
	public LinearPeakFinding(int[] values) {
		this.values = values;
	}
	
	public int findPeak(){
		int peakValue = 0;
		for(int i =1;i<values.length-1;i++){
			if(values[i]>=values[i-1] && values[i]>=values[i+1]){
				peakValue = values[i];
				break;
			}
		}
		if(peakValue==0&&values[values.length-1]>=values[values.length-1-1]){
			peakValue = values[values.length-1];
		}
		return peakValue;
	}
}
