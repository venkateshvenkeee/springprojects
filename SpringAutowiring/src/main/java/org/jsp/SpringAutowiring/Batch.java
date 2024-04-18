package org.jsp.SpringAutowiring;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Batch {
	private List<String> names;
	private Set<Long> phone_ns;
	private Map<Long, String> details;
	public List<String> getNames() {
		return names;
	}
	public void setNames(List<String> names) {
		this.names = names;
	}
	public Set<Long> getPhone_ns() {
		return phone_ns;
	}
	public void setPhone_ns(Set<Long> phone_ns) {
		this.phone_ns = phone_ns;
	}
	public Map<Long, String> getDetails() {
		return details;
	}
	public void setDetails(Map<Long, String> details) {
		this.details = details;
	}
	public Batch() {
		
	}
	public Batch(List<String> names, Set<Long> phone_ns, Map<Long, String> details) {
		super();
		this.names = names;
		this.phone_ns = phone_ns;
		this.details = details;
	}

}
