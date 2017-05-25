package retailerdata;

import java.util.ArrayList;

public class AtomicData {
	private String exception;
	private ArrayList<String> data;
	public AtomicData(String error, ArrayList<String> data) {
		this.exception = error;
		this.data = data;
	}
	public String getException() {
		return exception;
	}
	public void setException(String exception) {
		this.exception = exception;
	}
	public ArrayList<String> getData() {
		return data;
	}
	public void setData(ArrayList<String> data) {
		this.data = data;
	}
	@Override
	public String toString() {
		StringBuilder output = new StringBuilder("AtomicData {exception=" + exception + ", data=[");
		for(String str : data){
			if(str != data.get(data.size() - 1)){
				output.append(String.format("%s,", str));
			} else {
				output.append(str);
			}
		}
		output.append("]}");
		return output.toString();
	}
	
}
