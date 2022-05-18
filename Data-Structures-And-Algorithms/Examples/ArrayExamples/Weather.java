public class Weather {
	
	private int temp;
	private double rainfall;
	private int windSpeed;
	private String windDirection;

	public Weather(int temp, double rainfall, int windSpeed, String windDirection) {
		this.temp = temp;
		this.rainfall = rainfall;
		this.windSpeed = windSpeed;
		this.windDirection = windDirection;
	}

	public String toString() {
		return   "Temperature:\t" + temp
		       + "\nRainfall:\t" + rainfall
		       + "\nWind Speed:\t" + windSpeed
		       + "\nWind Direction:\t" + windDirection
		       + "\n";
	}

	public static void main(String[] args) {
		Weather [] w = new Weather[3];
		w[0] = new Weather(60, 0, 24, "NW");
		w[1] = new Weather(78, 1.5, 12, "S");
		w[2] = new Weather(23, 5, 45, "W");
		for (int i=0; i<w.length; i++)
			System.out.println(w[i]);
	}
}