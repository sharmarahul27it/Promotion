package com.promotion;

public enum Engine {
	unitA(50), unitB(30), unitC(20), unitD(15), promotion_3A(130), promotion_2B(45), promotion_CD(30);

	private final int value;

	Engine(final int newValue) {
		value = newValue;
	}

	public int getValue() {
		return value;
	}

}
