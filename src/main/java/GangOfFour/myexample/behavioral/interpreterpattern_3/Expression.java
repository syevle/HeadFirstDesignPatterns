package GangOfFour.myexample.behavioral.interpreterpattern_3;
import java.util.Map;
interface Expression {
    public int interpret(Map<String,Expression> variables);
}
