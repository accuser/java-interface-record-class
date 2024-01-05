package com.bpp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static com.bpp.factories.LearnerFactory.createLearner;
import static com.bpp.presenters.LearnerPresenter.presentLearner;

/**
 * The main class of the application.
 */
public class App {
	private static final Logger logger = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		String firstName = args[0];
		String lastName = args[1];

		Learner learner = createLearner(firstName, lastName);

		String displayName = presentLearner(learner).displayNameWithEmail();

		logger.info("OK: {}", displayName);
	}
}
