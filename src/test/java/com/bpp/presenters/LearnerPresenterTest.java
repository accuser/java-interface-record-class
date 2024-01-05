package com.bpp.presenters;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import com.bpp.interfaces.LearnerLike;

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
	void testPresentLearner() {
		LearnerPresenter presenter = LearnerPresenter.presentLearner(learner);

		assertNotNull(presenter);
		assertEquals("Alice Brockwell", presenter.displayName());
		assertEquals("Alice Brockwell <abrockwell@my.bpp.com>", presenter.displayNameWithEmail());
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
