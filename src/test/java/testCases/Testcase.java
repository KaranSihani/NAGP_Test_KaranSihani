package testCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Testcase {
	
	int additionValue = 8;
	int subtractValue = 2;
	int multiplicationValue = 15;
/*
 * Sameple test for Addition	
 */
@Test
public void addition() {
	int a = 5;
	int b=3;
	int finaladd = a+b;
	assertEquals(finaladd, additionValue);	
}
@Test
public void subtraction() {
	int a = 5;
	int b=3;
	int finalsub = a-b;
	assertEquals(finalsub, subtractValue);	
}
@Test
public void multiply() {
	int a = 5;
	int b=3;
	int finalmult = a*b;
	assertEquals(finalmult, multiplicationValue);	
}


}
