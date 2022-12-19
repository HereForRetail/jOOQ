package org.jooq.util.bigquery;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BigQueryUtils {

	public static String toBQArrayString(Object[] values) {
		List<String> quotedValues = Arrays.stream(values)
			.map(value -> value instanceof String
				? '\'' + value.toString() + '\''
				: value.toString())
			.collect(Collectors.toList());
		return '[' + String.join(", ", quotedValues) + ']';
	}

}
