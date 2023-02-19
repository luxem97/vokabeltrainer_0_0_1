package com.vokabeltrainer.main;

public class VokabelTrainer {
	
	public VokabelTrainer() {
		super();
		
	}
	
	
	public boolean checkVocs(String first, String second) {
		if (first.equals(second)) {
			return true;
		}
		else {
			return false;
		}
	}
}
