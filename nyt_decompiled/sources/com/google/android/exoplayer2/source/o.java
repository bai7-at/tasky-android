package com.google.android.exoplayer2.source;

import android.os.Handler;
import com.google.android.exoplayer2.g2;
import com.google.android.exoplayer2.w0;
import defpackage.bl4;
import defpackage.fw1;
import defpackage.ob;
import defpackage.sq8;
import defpackage.sv5;

/* loaded from: classes2.dex */
public interface o {

    public interface a {
        public static final a a = q.b;

        o a(w0 w0Var);

        int[] b();

        a c(fw1 fw1Var);

        a d(com.google.android.exoplayer2.upstream.h hVar);
    }

    public static final class b extends bl4 {
        public b(Object obj) {
            super(obj);
        }

        public b c(Object obj) {
            return new b(super.a(obj));
        }

        public b(Object obj, long j) {
            super(obj, j);
        }

        public b(Object obj, long j, int i) {
            super(obj, j, i);
        }

        public b(Object obj, int i, int i2, long j) {
            super(obj, i, i2, j);
        }

        public b(bl4 bl4Var) {
            super(bl4Var);
        }
    }

    public interface c {
        void a(o oVar, g2 g2Var);
    }

    void a(c cVar);

    void c(Handler handler, p pVar);

    void d(p pVar);

    w0 f();

    n g(b bVar, ob obVar, long j);

    void h(n nVar);

    void i(c cVar);

    void j(c cVar);

    void m(Handler handler, com.google.android.exoplayer2.drm.h hVar);

    void n(com.google.android.exoplayer2.drm.h hVar);

    void p();

    default boolean q() {
        return true;
    }

    default g2 r() {
        return null;
    }

    void s(c cVar, sq8 sq8Var, sv5 sv5Var);
}
