package com.bpp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.bpp.interfaces.LearnerLike;
import com.bpp.presenters.LearnerPresenter;

class LearnerPresenterTest {
	LearnerLike learner = new LearnerLike() {
		@Override
		public String firstName() {
			return "Alice";
		}

		@Override
		public String lastName() {
			return "Brockwell";
		}

		@Override
		public String email() {
			return "abrockwell@my.bpp.com";
		}

		@Override
		public String username() {
			return "abrockwell";
		}
	};


	@Test
	void testDisplayName() {
		LearnerPresenter presenter = new LearnerPresenter(learner);

		assertEquals("Alice Brockwell", presenter.displayName());
	}

	@Test
	void testDisplayNameWithEmail() {
		LearnerPresenter presenter = new LearnerPresenter(learner);

		assertEquals("Alice Brockwell <abrockwell@my.bpp.com>", presenter.displayNameWithEmail());
	}
}
