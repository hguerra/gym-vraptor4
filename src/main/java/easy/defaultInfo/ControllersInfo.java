package easy.defaultInfo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Vector;

public class ControllersInfo {

	public static void printAccess(String actualMethod, Object bean,
			List<String> attributes) {
		StringBuffer info = new StringBuffer();
		info.append("Method:").append(actualMethod).append(" Class:")
				.append(bean.getClass().getName()).append(" ");
		List<Method> metodos = getMetodos(bean);
		for (Method m : metodos) {
			if (!m.getReturnType().isPrimitive()) {
				info.append("|");
				if (attributes.contains(m.getName())) {
					info.append(m.getName());
					if (checkMethod(m, bean)) {
						info.append(": NULL");
					} else {
						info.append(": OK");
					}
				}
			}
		}
		System.out.println(info.toString());
	}

	public static void printAccess(String method, Object bean) {
		StringBuffer info = new StringBuffer();
		info.append("Method:").append(method).append("Class:")
				.append(bean.getClass().getName());
		System.out.println(info.toString());

	}

	public static boolean isAllMethodsNotNull(Object bean,
			List<String> attributes) {
		List<Method> metodos = getMetodos(bean);
		for (Method m : metodos) {
			if (!m.getReturnType().isPrimitive()) {
				if (attributes.contains(m.getName())) {
					if (checkMethod(m, bean)) {
						return false;
					}
				}
			}
		}
		return true;
	}

	public static boolean isAllMethodsNotNull(Object bean) {
		List<Method> metodos = getMetodos(bean);
		for (Method m : metodos) {
			if (!m.getReturnType().isPrimitive()) {
				if (checkMethod(m, bean)) {
					return false;
				}
			}
		}
		return true;
	}

	private static boolean checkMethod(Method m, Object bean) {
		try {
			if (m.invoke(bean, new Object[0]) == null) {
				return true;
			}
		} catch (IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}
		return false;
	}

	private static List<Method> getMetodos(Object bean) {
		Method[] metodos = bean.getClass().getMethods();

		List<Method> result = new Vector<>();

		for (Method m : metodos) {
			if (m.getName().startsWith("get"))
				result.add(m);
		}

		return result;
	}
}
