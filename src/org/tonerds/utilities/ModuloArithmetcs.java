package org.tonerds.utilities;

public final class ModuloArithmetcs {
	private ModuloArithmetcs() {}
	public static int add(int number, int increment, int modulo){
		while (number + increment < 0){
			number += modulo;
		}
		return (number+increment)%modulo;
	}
}
