package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import defpackage.lh4;
import java.util.Collections;
import java.util.Map;
import okhttp3.internal.http2.Settings;

/* loaded from: classes.dex */
public class l {
    private static boolean b = true;
    private static volatile l d;
    private final Map a = Collections.emptyMap();
    private static final Class c = c();
    static final l e = new l(true);

    private static final class a {
        private final Object a;
        private final int b;

        a(Object obj, int i) {
            this.a = obj;
            this.b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.b;
        }
    }

    l(boolean z) {
    }

    public static l b() {
        l lVar = d;
        if (lVar == null) {
            synchronized (l.class) {
                try {
                    lVar = d;
                    if (lVar == null) {
                        lVar = b ? k.a() : e;
                        d = lVar;
                    }
                } finally {
                }
            }
        }
        return lVar;
    }

    static Class c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public GeneratedMessageLite.c a(f0 f0Var, int i) {
        lh4.a(this.a.get(new a(f0Var, i)));
        return null;
    }
}
