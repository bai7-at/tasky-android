package defpackage;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ev9 {
    private static volatile ev9 b;
    static final ev9 c = new ev9(true);
    private final Map a = Collections.emptyMap();

    ev9(boolean z) {
    }

    public static ev9 a() {
        ev9 ev9Var = b;
        if (ev9Var == null) {
            synchronized (ev9.class) {
                try {
                    ev9Var = b;
                    if (ev9Var == null) {
                        ev9Var = c;
                        b = ev9Var;
                    }
                } finally {
                }
            }
        }
        return ev9Var;
    }

    public final rv9 b(zx9 zx9Var, int i) {
        lh4.a(this.a.get(new cv9(zx9Var, i)));
        return null;
    }
}
