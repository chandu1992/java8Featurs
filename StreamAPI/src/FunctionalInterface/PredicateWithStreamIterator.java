package FunctionalInterface;

import java.time.LocalDate;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateWithStreamIterator {

	public static void main(String[] args) {
		LocalDate startDate = LocalDate.of(2024, 8, 1);
		LocalDate monthEndDate = LocalDate.of(2024, 8, 31);
		
		long daysCount = java.time.temporal.ChronoUnit.DAYS.between(startDate, monthEndDate);
		System.out.println("Days in month : "+daysCount);
		
		Predicate <LocalDate> isWeekend = date -> date.getDayOfWeek() == java.time.DayOfWeek.SATURDAY || date.getDayOfWeek() == java.time.DayOfWeek.SUNDAY;
		
		long businessDay = Stream.iterate(startDate, date -> date.plusDays(1))
				.limit(daysCount)
				.filter(isWeekend.negate())
				.count();
		
		System.out.println("Total Days skipping sunday and saturday : "+businessDay);
	}
}
