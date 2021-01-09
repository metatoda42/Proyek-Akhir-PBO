package proyek_mvc;

import proyek_mvc.Model;
import proyek_mvc.View;

public class Control {
	int mastervariable=0;//HE IS THE CHOSEN ONE!!!
	
	Model model;
	View view;

	public Control(View vpc, Model mpc) {
		this.model = mpc;
        this.view = vpc;
	}

}
