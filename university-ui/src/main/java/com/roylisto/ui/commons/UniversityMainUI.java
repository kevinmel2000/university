package com.roylisto.ui.commons;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SpringUI(path=UniversityMainUI.NAME)
@Title("U n i v e r s i t y")
@Theme("valo")
public class UniversityMainUI extends UI{

	private static final long serialVersionUID = 8205859282344998263L;
	public static final String NAME ="/ui";
	
	@Override
	protected void init(VaadinRequest request) {
		VerticalLayout rootLayout = new VerticalLayout();
		
		rootLayout.addComponent(new Label("Oh we have made it"));
		
		setContent(rootLayout);
		
	}

}
