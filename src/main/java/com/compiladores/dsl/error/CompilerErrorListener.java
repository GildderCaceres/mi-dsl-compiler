package com.compiladores.dsl.error;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.util.ArrayList;
import java.util.List;

public class CompilerErrorListener extends BaseErrorListener {

    private final List<String> errores = new ArrayList<>();

    public List<String> getErrores() {
        return errores;
    }

    public boolean hayErrores() {
        return !errores.isEmpty();
    }

    @Override
    public void syntaxError(
            Recognizer<?, ?> recognizer,
            Object offendingSymbol,
            int line,
            int charPositionInLine,
            String msg,
            RecognitionException e
    ) {
        errores.add(
                "ERROR SINTÁCTICO: línea " + line
                        + ", columna " + charPositionInLine
                        + " -> " + msg
        );
    }
}