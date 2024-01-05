package com.bpp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The main class of the application.
 */
public class App {
	private static final Logger logger = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		String firstName = args[0];
		String lastName = args[1];

		Learner learner = new Learner(new Identity(firstName, lastName));
		LearnerPresenter presenter = new LearnerPresenter(learner);

		String displayName = presenter.displayNameWithEmail();

		logger.info("OK: {}", displayName);
	}
}
