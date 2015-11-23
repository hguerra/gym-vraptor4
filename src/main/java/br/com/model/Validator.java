package br.com.model;
@FunctionalInterface
public interface Validator <T>{
	boolean validar(T t);
}
