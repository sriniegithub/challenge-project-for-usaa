package com.usaa;

import java.util.Iterator;
import java.util.List;

public class ChallengeManager {

	public Boolean isPassing(List<Challenge> challenges) {
		if (challenges == null || challenges.size() == 0) {
			return null;
		}
		boolean isPass = false;
		int count = 0;
		Challenge challenge = null;
		Iterator<Challenge> itr = challenges.iterator();
		while (itr.hasNext()) {
			challenge = itr.next();
			if(challenge != null && challenge.correct) {
				count++;
			}
		}
		double score = count/challenges.size()*100;

		if (score > 87.5) {
			isPass = true;
		}
		return isPass;
	}
}