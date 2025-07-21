package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import defpackage.lh4;
import java.util.Collections;
import java.util.Map;
import okhttp3.internal.http2.Settings;

/* loaded from: classes3.dex */
public class m {
    private static boolean b = true;
    private static volatile m c;
    static final m d = new m(true);
    private final Map a = Collections.emptyMap();

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

    m(boolean z) {
    }

    public static m b() {
        m mVar = c;
        if (mVar == null) {
            synchronized (m.class) {
                try {
                    mVar = c;
                    if (mVar == null) {
                        mVar = b ? l.a() : d;
                        c = mVar;
                    }
                } finally {
                }
            }
        }
        return mVar;
    }

    public GeneratedMessageLite.c a(f0 f0Var, int i) {
        lh4.a(this.a.get(new a(f0Var, i)));
        return null;
    }
}
