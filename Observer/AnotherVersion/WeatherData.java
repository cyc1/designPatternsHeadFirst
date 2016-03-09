import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable {
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() { }
		// 构造器不在需要为了记住观察者们而建立数据结构

	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	public float getTemperature(){
		return temperature;
	}

	public float getHumidity(){
		return humidity;
	}

	public float getPressure(){
		return pressure;
	}

}
