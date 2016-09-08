package com.greatjaime.my_leetcode;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;


public class ReverseVowels {

	public static String reverseVowels1(String s) {
		char[] result = new char[s.length()];
		//元音由栈存储
		Stack<Character> vowels = new Stack<Character>();
		//辅音由队列存储
		Queue<Character> consonants = new LinkedList<Character>();
		for(int i = 0;i < s.length();i ++) {
			//遍历字符串，对每个位置进行标记
			switch (s.charAt(i)) {
			case 'a': case 'e': case 'i': case 'o': case 'u': 
				result[i] = '0';
				vowels.push(s.charAt(i));
				break;
			default :
				result[i] = '1';
				consonants.add(s.charAt(i));
			}
		}
		for(int i = 0;i < s.length();i ++) {
			//根据标记依次填入元音或辅音字母
			if(result[i] == '0') 
				result[i] = vowels.pop();
			else
				result[i] = consonants.remove();
		}
		return new String(result);
			
	}
	
	public static String reverseVowels(String s) {
		char [] c = s.toCharArray();
		int i = 0;
		int j = s.length() - 1;
		while(i < j) {
				//当前索引没越界 且 不为元音时 移到下一索引
				while(i < s.length()-1 && !match(c, i))
					i ++ ;
				while(j > 0 && !match(c, j))
					j --;
	
				if(i < j) {
					//若前索引位置仍在后索引之前，则进行交换
					char temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
				i ++;
				j --;
			}
			return new String(c);
		}
		
		public static boolean match(char[] c, int i) {
			return c[i] == 'a' || c[i] == 'A' || c[i] == 'e' || c[i] == 'E' || c[i] == 'i'
					|| c[i] == 'I' || c[i] == 'o' || c[i] == 'O' || c[i] == 'u' || c[i] == 'U';
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseVowels("leetcode"));
	}

}
