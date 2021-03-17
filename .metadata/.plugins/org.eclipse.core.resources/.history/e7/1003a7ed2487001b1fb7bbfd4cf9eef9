package com.example.demo.cmm.util;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.springframework.stereotype.Component;

@Component
public class Proxy {
	
	public Consumer<String> print = System.out::print;
	public Function<Object, String> string = String::valueOf;
	public Function<String, Integer> integer = Integer::parseInt;
	
	
	public static Function<Double, Double> absDouble = Math::abs;
	public Function<Float, Float> absFloat = Math::abs;
	public Function<Integer, Integer> absInteger = Math::abs;
	public Function<Long, Long> absLong = Math::abs;
	
	public Function<Double, Double> ceil = Math::ceil;
	
	public Function<Double, Double> floor = Math::floor;
	
	public BiFunction<Double, Double, Double> maxDouble = Math::max;
	public BiFunction<Float, Float, Float> maxFloat = Math::max;
	public BiFunction<Integer, Integer, Integer> maxIntefer = Math::max;
	public BiFunction<Long, Long, Long> maxLong = Math::max;
}
