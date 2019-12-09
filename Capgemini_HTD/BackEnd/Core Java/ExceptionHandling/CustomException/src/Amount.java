package com.capgemini.exception.custom;

public class Amount {
	void check(int val) throws InvalidLemitException {

		if (val > 40000) {

			throw new InvalidLemitException();
		}
	}

}
