package androidx.compose.foundation.lazy.layout;

import defpackage.ss2;

/* loaded from: classes.dex */
public interface a {

    /* renamed from: androidx.compose.foundation.lazy.layout.a$a, reason: collision with other inner class name */
    public static final class C0029a {
        private final int a;
        private final int b;
        private final Object c;

        public C0029a(int i, int i2, Object obj) {
            this.a = i;
            this.b = i2;
            this.c = obj;
            if (i < 0) {
                throw new IllegalArgumentException(("startIndex should be >= 0, but was " + i).toString());
            }
            if (i2 > 0) {
                return;
            }
            throw new IllegalArgumentException(("size should be >0, but was " + i2).toString());
        }

        public final int a() {
            return this.b;
        }

        public final int b() {
            return this.a;
        }

        public final Object c() {
            return this.c;
        }
    }

    int a();

    void b(int i, int i2, ss2 ss2Var);

    C0029a get(int i);
}
