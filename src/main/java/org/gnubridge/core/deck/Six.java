package org.gnubridge.core.deck;

import org.gnubridge.core.Card;

public class Six {
	public static Card of(Suit denomination) {
		return new Card("6", denomination);
	}
}
