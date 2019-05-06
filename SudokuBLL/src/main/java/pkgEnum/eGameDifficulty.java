package pkgEnum;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public enum eGameDifficulty {
	HARD(1000), MEDIUM(500), EASY(100); // enums by descending iDifficultyValue
	
	private int iDifficultyValue;
	
	private static java.util.Map<java.lang.Integer, eGameDifficulty> lookup = new HashMap<Integer, eGameDifficulty>();

	eGameDifficulty(int iDifficultyValue) {
		this.iDifficultyValue = iDifficultyValue;
	}
	
	static eGameDifficulty get(int iDifficulty) {
		//Map<Integer, eGameDifficulty> eSorted = new TreeMap<Integer, eGameDifficulty>();
		
		for (eGameDifficulty e : (eGameDifficulty.values())) {
			if (iDifficulty >= e.iDifficultyValue)
				return e;
		}
		return null;
	}

	int getiDifficulty() {
		return this.iDifficultyValue;
	}

	/**
	 * 
	 * @param name - the name of the enum constant to be returned.
	 * @return the enum constant with the specified name
	 */
	/*static eGameDifficulty valueOf(java.lang.String name) throws IllegalArgumentException, NullPointerException {
		// TODO
	}*/

	/**
	 * Returns an array containing the constants of this enum type, in the order
	 * they are declared. This method may be used to iterate over the constants as
	 * follows:
	 * 
	 * for (eGameDifficulty c : eGameDifficulty.values()) <br>
	 * System.out.println(c);
	 * 
	 * @return an array containing the constants of this enum type, in the order
	 *         they are declared
	 */
	/*static eGameDifficulty[] values() {

	}*/

}
