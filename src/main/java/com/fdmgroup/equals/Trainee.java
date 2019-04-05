package com.fdmgroup.equals;

public class Trainee {

	private String name;
	private String stream;
	private int weeksCompleted;
	
	public Trainee(String name, String stream, int weeksCompleted) {
		super();
		this.name = name;
		this.stream = stream;
		this.weeksCompleted = weeksCompleted;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public int getWeeksCompleted() {
		return weeksCompleted;
	}
	public void setWeeksCompleted(int weeksCompleted) {
		this.weeksCompleted = weeksCompleted;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((stream == null) ? 0 : stream.hashCode());
		result = prime * result + weeksCompleted;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trainee other = (Trainee) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (stream == null) {
			if (other.stream != null)
				return false;
		} else if (!stream.equals(other.stream))
			return false;
		if (weeksCompleted != other.weeksCompleted)
			return false;
		return true;
	}
	
}
