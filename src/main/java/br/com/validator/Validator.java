package br.com.validator;
@FunctionalInterface
public interface Validator <T>{
	boolean validar(T t);
}
