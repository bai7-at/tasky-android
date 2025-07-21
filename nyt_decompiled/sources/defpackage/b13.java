package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public class b13 {
    private static volatile b13 b;
    private final Set a = new HashSet();

    b13() {
    }

    public static b13 a() {
        b13 b13Var = b;
        if (b13Var == null) {
            synchronized (b13.class) {
                try {
                    b13Var = b;
                    if (b13Var == null) {
                        b13Var = new b13();
                        b = b13Var;
                    }
                } finally {
                }
            }
        }
        return b13Var;
    }

    Set b() {
        Set unmodifiableSet;
        synchronized (this.a) {
            unmodifiableSet = Collections.unmodifiableSet(this.a);
        }
        return unmodifiableSet;
    }
}
