
package com.translator.structure;

import com.translator.parser.JavaParser;

public class FormalParameter {

    private JavaParser.FormalParameterContext ctx;

    public FormalParameter(JavaParser.FormalParameterContext ctx) {
        this.ctx = ctx;
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append(ctx.type().getText());
        if (ctx.type().classOrInterfaceType() != null)
            b.append(" *");
        b.append(ctx.variableDeclaratorId().getText());

        return b.toString();
    }
}