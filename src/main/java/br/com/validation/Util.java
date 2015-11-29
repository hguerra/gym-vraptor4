package br.com.validation;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Util {
	// Validator
	@SuppressWarnings("rawtypes")
	public static final Validator<List> list = list -> list != null
			&& !list.isEmpty();
	public static final Validator<LocalDate> dayOfMonth = c -> c
			.getDayOfMonth() == 5;
	public static final Validator<Object> isNull = object -> object == null;
	public static final Validator<Object> notNull = object -> object != null;

	// Regex
	public static boolean isNumeric(String str) {
		return str.matches("[+-]?\\d*(\\.\\d+)?");
	}

	public static boolean isAlpha(String name) {
		return name.matches("[a-zA-Z]+");
	}

	public static boolean isAlphaNumeric(String s) {
		return s.matches("^[a-zA-Z0-9]*$");
	}

	// SearchWord
	public static Integer search(String word, String text) {
		Integer result = null;
		List<String> list = asList(text);
		result = Collections.binarySearch(list, word);
		return result;
	}

	private static List<String> asList(String text) {
		return Arrays.asList(text.split(" "));
	}

	// DuplicatedElements

	public static Map<String, Integer> allElementFrequencyMapSorted(
			List<String> list) {
		Map<String, Integer> map = new TreeMap<String, Integer>();
		for (String temp : list) {
			Integer count = map.get(temp);
			map.put(temp, (count == null) ? 1 : count + 1);
		}
		return map;
	}

	public static Map<String, Integer> allElementFrequencyMap(List<String> list) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String temp : list) {
			Integer count = map.get(temp);
			map.put(temp, (count == null) ? 1 : count + 1);
		}
		return map;
	}

	@SuppressWarnings("rawtypes")
	public static Map<Object, Integer> allElementFrequencyMapObject(List list) {
		Map<Object, Integer> map = new HashMap<Object, Integer>();
		for (Object temp : list) {
			Integer count = map.get(temp);
			map.put(temp, (count == null) ? 1 : count + 1);
		}
		return map;
	}

	public static String allElementFrequencyString(List<String> list) {
		StringBuffer stringBuffer = new StringBuffer();
		Set<String> uniqueSet = new HashSet<String>(list);
		for (String temp : uniqueSet) {
			stringBuffer.append(temp + ":" + Collections.frequency(list, temp));
			stringBuffer.append(";");
		}
		return stringBuffer.toString();
	}

	public static Integer elementFrequency(String element, List<String> list) {
		return Collections.frequency(list, element);
	}

	public static <T> Set<T> findDuplicatesGeneric(Collection<T> list) {
		Set<T> duplicates = new LinkedHashSet<T>();
		Set<T> uniques = new HashSet<T>();
		for (T t : list) {
			if (!uniques.add(t)) {
				duplicates.add(t);
			}
		}
		return duplicates;
	}

	public static void printMap(Map<String, Integer> map) {
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : "
					+ entry.getValue());
		}

	}
}
