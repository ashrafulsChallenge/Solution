package com.inrhythm.challenge.library.objects;

public class IntStringPair {

	private int intVal;
	private String stringVal;

	public IntStringPair(int intVal_, String stringVal_) {
		intVal = intVal_;
		stringVal = stringVal_;
	}

	public IntStringPair() {
	}

	public int getIntVal() {
		return intVal;
	}

	public String getStringVal() {
		return stringVal;
	}

	public void setIntVal(int intVal) {
		this.intVal = intVal;
	}

	public void setStringVal(String stringVal) {
		this.stringVal = stringVal;
	}
}
