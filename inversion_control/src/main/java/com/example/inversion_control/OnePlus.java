package com.example.inversion_control;

public class OnePlus implements Mobile {
	
	Color color;
	
	OnePlus(){
		System.out.println("OnePlus Constructor is triggered");
	}
	
	OnePlus(Color colorObj){
		this.color = colorObj;
	}

	@Override
	public void getModelAndColor() {
		System.out.println("Model : 9 Pro");
		color.getOnePlusColor();
	}

}
