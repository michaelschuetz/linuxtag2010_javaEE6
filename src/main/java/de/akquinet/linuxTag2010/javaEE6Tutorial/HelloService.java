package de.akquinet.linuxTag2010.javaEE6Tutorial;

import javax.ejb.Local;

/**
 * @author m.schuetz
 */
@Local
public interface HelloService {
	String getName();
}
