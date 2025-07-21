package defpackage;

/* loaded from: classes.dex */
public final class s18 implements x08 {
    private final Object a;

    public s18(Object obj) {
        this.a = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s18) && zq3.c(this.a, ((s18) obj).a);
    }

    @Override // defpackage.x08
    public Object getValue() {
        return this.a;
    }

    public int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "StaticValueHolder(value=" + this.a + ')';
    }
}
