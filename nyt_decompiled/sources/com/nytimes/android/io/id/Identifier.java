package com.nytimes.android.io.id;

/* loaded from: classes4.dex */
public class Identifier<TYPE, KEY> {
    protected final KEY key;

    /* renamed from: type, reason: collision with root package name */
    protected final TYPE f63type;

    protected Identifier(TYPE type2, KEY key) {
        this.f63type = type2;
        this.key = key;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Identifier)) {
            return false;
        }
        Identifier identifier = (Identifier) obj;
        if (this.f63type.equals(identifier.f63type)) {
            return this.key.equals(identifier.key);
        }
        return false;
    }

    public KEY getKey() {
        return this.key;
    }

    public TYPE getType() {
        return this.f63type;
    }

    public int hashCode() {
        return (this.f63type.hashCode() * 31) + this.key.hashCode();
    }

    public String toString() {
        return "Identifier{type=" + this.f63type + ", key=" + this.key + '}';
    }
}
