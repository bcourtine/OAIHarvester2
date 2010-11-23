package org.courtine.oai;

import org.oclc.oai.harvester2.app.RawWrite;

/**
 * Démonstration utilisant {@link org.oclc.oai.harvester2.app.RawWrite#main(String[])}, avec comme
 * argument l'URL http://alcme.oclc.org/oaicat/OAIHandler.
 *
 * @author Benoit Courtine, le 23/11/2010.
 */
public class RawWriteDemo {

	/** URL de démonstration. */
	private static String DEMO_URL = "http://alcme.oclc.org/oaicat/OAIHandler";

	/**
	 * Lancement {@link org.oclc.oai.harvester2.app.RawWrite#main(String[])}, avec comme
	 * argument l'URL http://alcme.oclc.org/oaicat/OAIHandler si rien n'est spécifié, ou avec
	 * les arguments passés en paramètres s'il y en a.
	 *
	 * @param args Arguments (facultatifs).
	 */
	public static void main(String[] args) {
		if (args.length == 0) {
			RawWrite.main(new String[] {DEMO_URL});
		} else {
			RawWrite.main(args);
		}
	}
}
