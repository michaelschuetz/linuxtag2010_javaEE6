package de.akquinet.linuxTag2010.javaEE6Tutorial.solution;

import javax.ejb.Stateless;

/**
 * @author m.schuetz
 */
@Stateless
public class SolutionServiceImpl implements SolutionService {

	public String getName(){
		return "Hello LinuxTag from " + this.getClass().getSimpleName();
	}
}
