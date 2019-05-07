package pkgEnum;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

import org.junit.Test;

import pkgEnum.eGameDifficulty;

public class SudokuGameDifficultyTest {
	@Test
	public void eGDTest() {		
		assertNull(eGameDifficulty.get(0));
		assertTrue(eGameDifficulty.get(100).equals(eGameDifficulty.EASY));
		assertTrue(eGameDifficulty.get(499).equals(eGameDifficulty.EASY));
		assertTrue(eGameDifficulty.get(500).equals(eGameDifficulty.MEDIUM));
		assertTrue(eGameDifficulty.get(999).equals(eGameDifficulty.MEDIUM));
		assertTrue(eGameDifficulty.get(1000).equals(eGameDifficulty.HARD));
		assertTrue(eGameDifficulty.get(1200).equals(eGameDifficulty.HARD));
	}
}
