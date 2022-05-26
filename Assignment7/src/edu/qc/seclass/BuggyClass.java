package edu.qc.seclass;

public class BuggyClass {

	public int buggyMethod1(int a, int b) {

		int ans = 0;
		if (!((a - b) > 0)) {
			ans = b / a;
		}
		if (!((a - b) < 0)) {
			ans = a / b;
		}
		if (a == b) {
			ans = 2 ;
		}
		return ans;
	}

	public int buggyMethod2(int a, int b) {
		
		int ans = 0;
		if ((a - b)> 0) {
			ans = a * b;
		}
		else if ((a - b) < 0) {
			ans = a + b;
		}
		else if (a == b) {
			ans = b / a;
		}
		return ans;
	}

	public int buggyMethod3(int a) {
		
		if (a % 5 == 0) {
			a = a / 5;
		}
		else if (a % 3 == 0) {
			a *= 2;
		}
		else if (a < 0) {
			a = 100 / (a + 2);
		}
		
        return a;

	}

	public void buggyMethod4() {
		/*
		It is not possible to create a test suite that achieves 100% branch coverage and does not reveal the fault
		and a test suite that achieved 100% statement coverage and reveals the fault. Because if we want to reveal to fault we can't 
		achieve 100% statement coverage. Therefore, it's unavoidable to produce a division by zero fault and 100% statement coverage. 
		*/
	}
	
	public void buggyMethod5() {
		/* 
		 * It is not possible to create a test suite that achieves 100% statement coverage 
		 * and not reveal the fault because statement coverage will go through line 4 where we have a division by zero 
		 * and therefore it's not possible to avoid line 4 and get 100% statement coverage. 
		 */
	}
	
}
