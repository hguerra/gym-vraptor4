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
	/**
	 * Validator Academia
	 */
	public static final Validator<LocalDate> dayOfMonth = c -> c
			.getDayOfMonth() == 5;

	/**
	 * Validator
	 */
	@SuppressWarnings("rawtypes")
	public static final Validator<List> list = list -> list != null
			&& !list.isEmpty();
	public static final Validator<Object> isNull = object -> object == null;
	public static final Validator<Object> notNull = object -> object != null;
	// Regex
	public static final Validator<String> isNumeric = numeric -> numeric
			.matches("[+-]?\\d*(\\.\\d+)?");
	public static final Validator<String> isAlpha = alpha -> alpha
			.matches("[a-zA-Z]+");
	public static final Validator<String> isAlphaNumeric = alphaNumeric -> alphaNumeric
			.matches("^[a-zA-Z0-9]*$");
	// Regex Brazilian
	public static final Validator<String> telefone = numeroTelefone -> numeroTelefone
			.matches(".((10)|([1-9][1-9]).)\\s9?[6-9][0-9]{3}-[0-9]{4}")
			|| numeroTelefone
					.matches(".((10)|([1-9][1-9]).)\\s[2-5][0-9]{3}-[0-9]{4}"); // (XX)
																				// XXXXX-XXXX
																				// e
																				// (XX)
																				// XXXX-XXXX
	public static final Validator<String> email = email -> email
			.matches("[a-zA-Z0-9]+[a-zA-Z0-9_.-]+@{1}[a-zA-Z0-9_.-]*\\.+[a-z]{2,4}");

	// CPF
	public static final Validator<String> cpf = strCpf -> {
		// inicio
		int d1, d2;
		int digito1, digito2, resto;
		int digitoCPF;
		String nDigResult;

		d1 = d2 = 0;
		digito1 = digito2 = resto = 0;

		for (int nCount = 1; nCount < strCpf.length() - 1; nCount++) {
			digitoCPF = Integer.valueOf(strCpf.substring(nCount - 1, nCount))
					.intValue();

			// multiplique a ultima casa por 2 a seguinte por 3 a seguinte por 4
			// e assim por diante.
			d1 = d1 + (11 - nCount) * digitoCPF;

			// para o segundo digito repita o procedimento incluindo o primeiro
			// digito calculado no passo anterior.
			d2 = d2 + (12 - nCount) * digitoCPF;
		}
		;

		// Primeiro resto da divisão por 11.
		resto = (d1 % 11);

		// Se o resultado for 0 ou 1 o digito é 0 caso contrário o digito é 11
		// menos o resultado anterior.
		if (resto < 2)
			digito1 = 0;
		else
			digito1 = 11 - resto;

		d2 += 2 * digito1;

		// Segundo resto da divisão por 11.
		resto = (d2 % 11);

		// Se o resultado for 0 ou 1 o digito é 0 caso contrário o digito é 11
		// menos o resultado anterior.
		if (resto < 2)
			digito2 = 0;
		else
			digito2 = 11 - resto;

		// Digito verificador do CPF que está sendo validado.
		String nDigVerific = strCpf.substring(strCpf.length() - 2,
				strCpf.length());

		// Concatenando o primeiro resto com o segundo.
		nDigResult = String.valueOf(digito1) + String.valueOf(digito2);

		// comparar o digito verificador do cpf com o primeiro resto + o segundo
		// resto.
		return nDigVerific.equals(nDigResult);
		// fim
	};

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
