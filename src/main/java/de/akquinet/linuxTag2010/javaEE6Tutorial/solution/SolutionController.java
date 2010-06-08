package de.akquinet.linuxTag2010.javaEE6Tutorial.solution;

import java.util.Random;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * @author m.schuetz
 */
@Named
@RequestScoped
public class SolutionController {

	@Inject
	private SolutionService solutionService;

	public void sayHello() {
		String msg = solutionService.getName() + " " +  new Random().nextInt(1000);
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(msg));
	}
}
