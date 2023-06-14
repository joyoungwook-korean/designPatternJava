package behavioralPattern.interpreterPattern;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import behavioralPattern.interpreterPattern.expression.AndExpression;
import behavioralPattern.interpreterPattern.expression.Expression;
import behavioralPattern.interpreterPattern.expression.OrExpression;
import behavioralPattern.interpreterPattern.expression.TerminalExpression;

public class InterpreterTest {
    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    public static Expression getMarriedWomanExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    @Test
    public void interpreterTest() {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        assertEquals(isMale.interpret("John"), Boolean.TRUE);
        assertEquals(isMale.interpret("mama"), Boolean.FALSE);
        assertEquals(isMarriedWoman.interpret("unmarried"), Boolean.FALSE);
        assertEquals(isMarriedWoman.interpret("Married Julie"), Boolean.TRUE);
    }

}
