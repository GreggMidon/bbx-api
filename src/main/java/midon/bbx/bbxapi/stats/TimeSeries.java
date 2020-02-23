package midon.bbx.bbxapi.stats;

import java.time.LocalDate;

public class TimeSeries<T extends Number> {

	private LocalDate date;
	private T value;
	
	public TimeSeries(LocalDate date, T value) {
		this.date = date;
		this.value = value;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}
