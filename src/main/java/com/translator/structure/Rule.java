
package com.translator.structure;

import com.translator.exceptions.SubruleAlreadySetException;
import com.translator.exceptions.NoSuchSubruleException;

public abstract class Rule {
    private Rule parent;

    public abstract void addSubRule(Rule subrule) throws NoSuchSubruleException, SubruleAlreadySetException;

    public final void setParent(Rule parent) {
        this.parent = parent;
    }

    public Rule getParent() {
        return parent;
    }

    public String name() {
        String capName = this.getClass().getSimpleName();
        String firLet = capName.substring(0, 1);
        return firLet.toLowerCase() + capName.substring(1);
    }
}