package symbolTable.attributes;

import java.util.ArrayList;

public abstract class Attributes {
    public String name;
    public AttributeKind kind;
    public Attributes var; // TODO: Redo
    public int depth;

    public Attributes() { }

    public Attributes(String name) {
        this.name = name;
    }

    public Attributes(String name, AttributeKind kind) {
        this(name);
        this.kind = kind;
    }
}
