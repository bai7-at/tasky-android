package defpackage;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public final class daf {
    private static volatile daf b;
    private static volatile daf c;
    static final daf d = new daf(true);
    private final Map a = Collections.emptyMap();

    daf(boolean z) {
    }

    public static daf a() {
        daf dafVar = b;
        if (dafVar == null) {
            synchronized (daf.class) {
                try {
                    dafVar = b;
                    if (dafVar == null) {
                        dafVar = d;
                        b = dafVar;
                    }
                } finally {
                }
            }
        }
        return dafVar;
    }

    public static daf b() {
        daf dafVar = c;
        if (dafVar != null) {
            return dafVar;
        }
        synchronized (daf.class) {
            try {
                daf dafVar2 = c;
                if (dafVar2 != null) {
                    return dafVar2;
                }
                daf a = laf.a(daf.class);
                c = a;
                return a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final dbf c(cef cefVar, int i) {
        lh4.a(this.a.get(new baf(cefVar, i)));
        return null;
    }
}
