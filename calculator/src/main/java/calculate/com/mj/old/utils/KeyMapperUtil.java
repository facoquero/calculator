package calculate.com.mj.old.utils;


import calculate.com.mj.old.constants.CALC_FUNC;
import calculate.com.mj.old.constants.CALC_OPER;
import calculate.com.mj.old.constants.Constant;

import java.util.HashMap;
import java.util.Map;

public class KeyMapperUtil {
    final static Map<String, Constant> OPPERATIONS_BY_KEY_BINDINGS = new HashMap<>();
    final static Map<String, Constant> FUNCTIONS_BY_KEY_BINDINGS = new HashMap<>();

    static {
        OPPERATIONS_BY_KEY_BINDINGS.put("*", CALC_OPER.MULT);
        OPPERATIONS_BY_KEY_BINDINGS.put("+", CALC_OPER.ADD);
        OPPERATIONS_BY_KEY_BINDINGS.put("-", CALC_OPER.SUB);
        OPPERATIONS_BY_KEY_BINDINGS.put("/", CALC_OPER.DIV);

        FUNCTIONS_BY_KEY_BINDINGS.put("UNDO", CALC_FUNC.UNDO);
        FUNCTIONS_BY_KEY_BINDINGS.put("CLR", CALC_FUNC.CLEAR);
        FUNCTIONS_BY_KEY_BINDINGS.put("=", CALC_FUNC.EQ);
    }

    public static CALC_OPER resolveOperation(String label) {
        Constant constant = OPPERATIONS_BY_KEY_BINDINGS.get(label);
        if (constant instanceof CALC_OPER) {
            return (CALC_OPER) constant;
        }
        return null;
    }

    public static CALC_FUNC resolveFunction(String label) {
        Constant constant = FUNCTIONS_BY_KEY_BINDINGS.get(label);
        if (constant instanceof CALC_FUNC) {
            return (CALC_FUNC) constant;
        }
        return null;
    }

}
