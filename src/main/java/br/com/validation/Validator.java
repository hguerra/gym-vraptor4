package br.com.validation;
@FunctionalInterface
public interface Validator <T>{
	boolean validar(T t);
}
