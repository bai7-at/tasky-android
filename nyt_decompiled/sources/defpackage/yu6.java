package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public class yu6 {
    private static final AtomicInteger c = new AtomicInteger(1);
    private final int a = c.incrementAndGet();
    private final hb9 b;

    private yu6(qt4 qt4Var, hb9 hb9Var) {
        this.b = hb9Var;
    }

    public static yu6 a(qt4 qt4Var, hb9 hb9Var) {
        return new yu6(qt4Var, hb9Var);
    }

    public qt4 b() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yu6) && this.a == ((yu6) obj).a;
    }

    public int hashCode() {
        return this.a;
    }

    public String toString() {
        return "RegisteredReader{" + this.a + "}";
    }
}
