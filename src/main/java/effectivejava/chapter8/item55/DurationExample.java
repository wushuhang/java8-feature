package effectivejava.chapter8.item55;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationExample {

	public static void main(String[] args) {
		LocalDateTime comingMidnight = LocalDateTime.of(LocalDate.now().plusDays(1), LocalTime.MIDNIGHT);
		LocalDateTime now = LocalDateTime.now();
		Duration between = Duration.between(now, comingMidnight);
		System.out.println(between);
	}
}
