package com.bpp;

/**
 * The LearnerPresenter class is responsible for presenting information about a Learner.
 */
public class LearnerPresenter {
	private LearnerLike learner;

	/**
	 * Constructs a LearnerPresenter object with the specified Learner.
	 *
	 * @param learner the Learner object to be presented
	 */
	public LearnerPresenter(LearnerLike learner) {
		this.learner = learner;
	}

	/**
	 * Returns the display name of the Learner.
	 *
	 * @return the display name of the Learner
	 */
	public String displayName() {
		return String.format("%s %s", learner.firstName(), learner.lastName());
	}

	/**
	 * Returns the display name of the Learner along with their email address.
	 *
	 * @return the display name of the Learner with email address
	 */
	public String displayNameWithEmail() {
		return String.format("%s <%s>", this.displayName(), learner.email());
	}
}
