package com.usaa;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ChallengeManagerTest {
    ChallengeManager challengeManager;

    @Before
    public void setUp() {
        challengeManager = new ChallengeManager();
    }

    @Test
    public void shouldPass() {
        List<Challenge> challenges = new ArrayList<>();
        Challenge challenge = new Challenge();
        challenge.setQuestion("Is Java Platform independent");
        challenge.setAnswer("YES");
        challenge.setCorrect(true);
        challenges.add(challenge);

        challenge = new Challenge();
        challenge.setCorrect(true);
        challenge.setQuestion("Is Java partial Object Oriented");
        challenge.setAnswer("YES");
        challenges.add(challenge);

        ChallengeManager challengeManager = new ChallengeManager();
        Boolean isPass = challengeManager.isPassing(challenges);

        assertNotNull(isPass);
        assertEquals(true, isPass.booleanValue());
    }

    @Test
    public void shouldFail() {
        List<Challenge> challenges = new ArrayList<>();
        Challenge challenge = new Challenge();
        challenge.setQuestion("Is Java Platform independent");
        challenge.setAnswer("YES");
        challenge.setCorrect(true);
        challenges.add(challenge);

        challenge = new Challenge();
        challenge.setCorrect(false);
        challenge.setQuestion("Is Java pure Object Oriented?");
        challenge.setAnswer("NO");
        challenges.add(challenge);

        ChallengeManager challengeManager = new ChallengeManager();
        Boolean isPass = challengeManager.isPassing(challenges);

        assertNotNull(isPass);
        assertEquals(false, isPass.booleanValue());
    }

    @Test
    public void shouldReturnNullForNull() {
        Boolean isPass = challengeManager.isPassing(null);
        assertNull(isPass);
    }

    @Test
    public void shouldReturnNullForEmpty() {
        Boolean isPass = challengeManager.isPassing(new ArrayList<>());
        assertNull(isPass);
    }
}
