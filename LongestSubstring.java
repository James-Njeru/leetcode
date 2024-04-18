//Longest substring without repeating characters

public static int longestSubString(String s) {
		int maxLength = 0;
		
		Map<Character, Integer> visitedChars = new HashMap<>();
		
		for (int right = 0, left=0; right < s.length(); right++) {
			char currentChar = s.charAt(right);
					
			if (visitedChars.containsKey(currentChar) && visitedChars.get(currentChar)>=left) {
				left = visitedChars.get(currentChar) + 1;
			}
			maxLength = Math.max(maxLength, right-left+1);
			visitedChars.put(currentChar, right);
		}
		
		return maxLength;
	}

//an interesting one
public static int longestSubString(String s) {
		int maxLength = 0;
		
		Map<Character, Integer> visitedChars = new HashMap<>();
		
		for (int right = 0, left=0; right < s.length(); right++) {
			int indexOfFirstAppearanceInSubstring = s.indexOf(s.charAt(right),left);
			
			if (indexOfFirstAppearanceInSubstring != right) {
				left = indexOfFirstAppearanceInSubstring + 1;
			}
			maxLength = Math.max(maxLength, right-left+1);
		}
		
		return maxLength;
	}
