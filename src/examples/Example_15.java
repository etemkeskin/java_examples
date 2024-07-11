package examples;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

// Custom immutable class
public final class Example_15 {

	private final String name;
	private final Date doj;	
	private final List<String> mobile;
	
	public Example_15(String name, Date doj, List<String> mobile) {
		this.name = name;
		this.doj = doj;
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public Date getDoj() {
		return (Date) doj.clone();
	}

	public List<String> getMobile() {
		return new ArrayList<>(mobile);
	}
	
	@Override
	public String toString() {
		return "Example_15 [name=" + name + ", doj=" + doj + ", mobile=" + mobile + "]";
	}

}
