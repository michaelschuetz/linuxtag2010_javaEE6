package de.akquinet.linuxTag2010.javaEE6Tutorial;

import javax.ejb.Stateless;

/**
 * @author m.schuetz
 */
@Stateless
public class HelloServiceImpl implements HelloService {

	public String getName() {
		return "Bernd";
	}
}
