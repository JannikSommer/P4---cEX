package symbolTable.attributes;

import java.util.ArrayList;

public abstract class Attributes {
    public String name;
    public AttributeKind kind;
    public ArrayList<Attributes> level;
    public Attributes var;
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
