package com.epam.juint_and_tdd;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveAchar {
	
	/*TODO List:-
	 * 1.a)check 'A' length=1
	 *  b)check 'B' length=1
	 * 2.check 'AA' length=2
	 * 3.check 'AB' length=2
	 * 4.check 'BAAAB' length=5
	 * 5.check 'AAAAAAA' length=n
	 * 6.check '' length=0
	 */
	RemoveAChars12 removeAchar;
	@BeforeEach
	void setUP() {
		removeAchar=new RemoveAChars12();
	}
	
	@Test
	void oneAchar1() {
		assertEquals("", removeAchar.removeA("A"));
	}
	
	@Test
	void oneAchar2() {
		assertEquals("B", removeAchar.removeA("B"));
	}
	
	@Test
	void oneAchar3() {
		assertEquals("", removeAchar.removeA("AA"));
	}
	
	@Test
	void oneAchar4() {
		assertEquals("B", removeAchar.removeA("AB"));
	}
	
	@Test
	void oneAchar5() {
		assertEquals("BAABA", removeAchar.removeA("BAAABA"));
	}
	
	@Test
	void oneAchar6() {
		assertEquals("AAAAAAA", removeAchar.removeA("AAAAAAAAA"));
	}
	
	@Test
	void oneAchar7() {
		assertEquals("", removeAchar.removeA(""));
	}
	
}
