package com.hanbit.jinkyu.koh.standalone;

public class God {

	private static God god;

	private God() {

	}

	public static God pray() {
		if (god == null) {
			god = new God();
		}

		return god;
	}

}
