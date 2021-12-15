package com.company.Netology;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        String text = "jklksnm fjkjhd sjkn anjknkc";

// о функциональном стиле свидетельствуют интерфейс function и монады

	final Function<String, List<String>> dictionary = (a) ->
        Arrays.stream(a.split(" "))
                .sorted()
                .distinct()
                .collect(Collectors.toList());
	dictionary.apply(text);


    }
}
