package com.hlb;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JavaTest6 {
	
	// Given an input, please apply the provided equations (+, -, x, /)
    // E.g. input: 1.5, equations: x*2, x+10/2, x*1.5-6
    // Answer: 1st equation: x*2 = 1.5*2 = 3
    //         2nd equation: x+10/2 = 3+10/2 = 8
    //         3rd equation: x*1.5-6 = 8*1.5-6 = 6
    //         return 6.0
    public static double solveEquations(double input, String[] equations) {
    //	String[] equation = equations.
    	 ScriptEngine engine = new ScriptEngineManager().getEngineByName("J");
    	double x = input;
    	for (String equation : equations) {
            // Replace 'x' with current value and evaluate
    		
            String expr = equation.replace("x", String.valueOf(x));
            Object result = null;
			try {
				result = engine.eval(expr);
			} catch (ScriptException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            x = Double.parseDouble(result.toString());
        }
    	
    	
        return x;
    }

	public static void main(String[] args) {
		System.out.print("Test 6: ");
        double calculated = solveEquations(1.5, new String[] { "x*x", "x-10/2.2", "x+4-10", "x+5*8" });
        System.out.print("calculated = " + calculated);
	}

}
