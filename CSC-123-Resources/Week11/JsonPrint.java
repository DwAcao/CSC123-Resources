
public class JsonPrint {

	public static void main(String[] args) {
		
		String s="{\"location\":{\"name\":\"Carson\",\"region\":\"California\",\"country\":\"USA\",\"lat\":33.86,\"lon\":-118.26,\"tz_id\":\"America/Los_Angeles\",\"localtime_epoch\":1681781459,\"localtime\":\"2023-04-17 18:30\"},\"current\":{\"last_updated_epoch\":1681781400,\"last_updated\":\"2023-04-17 18:30\",\"temp_c\":17.0,\"temp_f\":62.6,\"is_day\":1,\"condition\":{\"text\":\"Partly cloudy\",\"icon\":\"//cdn.weatherapi.com/weather/64x64/day/116.png\",\"code\":1003},\"wind_mph\":10.5,\"wind_kph\":16.9,\"wind_degree\":230,\"wind_dir\":\"SW\",\"pressure_mb\":1013.0,\"pressure_in\":29.92,\"precip_mm\":0.0,\"precip_in\":0.0,\"humidity\":63,\"cloud\":50,\"feelslike_c\":17.0,\"feelslike_f\":62.6,\"vis_km\":16.0,\"vis_miles\":9.0,\"uv\":5.0,\"gust_mph\":8.3,\"gust_kph\":13.3}}";
		
		System.out.println(s);
	}

}
