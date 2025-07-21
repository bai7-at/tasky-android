package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.ag4;
import defpackage.m76;
import defpackage.nn0;
import defpackage.qs2;
import defpackage.ro0;
import defpackage.wn0;

/* loaded from: classes.dex */
public abstract class ColorsKt {
    private static final m76 a = CompositionLocalKt.e(new qs2() { // from class: androidx.compose.material.ColorsKt$LocalColors$1
        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ro0 mo865invoke() {
            ro0 g;
            g = ColorsKt.g((r43 & 1) != 0 ? wn0.d(4284612846L) : 0L, (r43 & 2) != 0 ? wn0.d(4281794739L) : 0L, (r43 & 4) != 0 ? wn0.d(4278442694L) : 0L, (r43 & 8) != 0 ? wn0.d(4278290310L) : 0L, (r43 & 16) != 0 ? nn0.b.h() : 0L, (r43 & 32) != 0 ? nn0.b.h() : 0L, (r43 & 64) != 0 ? wn0.d(4289724448L) : 0L, (r43 & 128) != 0 ? nn0.b.h() : 0L, (r43 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? nn0.b.a() : 0L, (r43 & 512) != 0 ? nn0.b.a() : 0L, (r43 & 1024) != 0 ? nn0.b.a() : 0L, (r43 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? nn0.b.h() : 0L);
            return g;
        }
    });

    public static final long a(ro0 ro0Var, long j) {
        if (!nn0.t(j, ro0Var.j()) && !nn0.t(j, ro0Var.k())) {
            if (!nn0.t(j, ro0Var.l()) && !nn0.t(j, ro0Var.m())) {
                return nn0.t(j, ro0Var.c()) ? ro0Var.e() : nn0.t(j, ro0Var.n()) ? ro0Var.i() : nn0.t(j, ro0Var.d()) ? ro0Var.f() : nn0.b.g();
            }
            return ro0Var.h();
        }
        return ro0Var.g();
    }

    public static final long b(long j, Composer composer, int i) {
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(441849991, i, -1, "androidx.compose.material.contentColorFor (Colors.kt:296)");
        }
        long a2 = a(ag4.a.a(composer, 6), j);
        if (a2 == nn0.b.g()) {
            a2 = ((nn0) composer.m(ContentColorKt.a())).B();
        }
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        return a2;
    }

    public static final ro0 c(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        return new ro0(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, false, null);
    }

    public static /* synthetic */ ro0 d(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, int i, Object obj) {
        long d = (i & 1) != 0 ? wn0.d(4290479868L) : j;
        long d2 = (i & 2) != 0 ? wn0.d(4281794739L) : j2;
        long d3 = (i & 4) != 0 ? wn0.d(4278442694L) : j3;
        return c(d, d2, d3, (i & 8) != 0 ? d3 : j4, (i & 16) != 0 ? wn0.d(4279374354L) : j5, (i & 32) != 0 ? wn0.d(4279374354L) : j6, (i & 64) != 0 ? wn0.d(4291782265L) : j7, (i & 128) != 0 ? nn0.b.a() : j8, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? nn0.b.a() : j9, (i & 512) != 0 ? nn0.b.h() : j10, (i & 1024) != 0 ? nn0.b.h() : j11, (i & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? nn0.b.a() : j12);
    }

    public static final m76 e() {
        return a;
    }

    public static final long f(ro0 ro0Var) {
        return ro0Var.o() ? ro0Var.j() : ro0Var.n();
    }

    public static final ro0 g(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        return new ro0(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, true, null);
    }

    public static final void i(ro0 ro0Var, ro0 ro0Var2) {
        ro0Var.x(ro0Var2.j());
        ro0Var.y(ro0Var2.k());
        ro0Var.z(ro0Var2.l());
        ro0Var.A(ro0Var2.m());
        ro0Var.p(ro0Var2.c());
        ro0Var.B(ro0Var2.n());
        ro0Var.q(ro0Var2.d());
        ro0Var.u(ro0Var2.g());
        ro0Var.v(ro0Var2.h());
        ro0Var.s(ro0Var2.e());
        ro0Var.w(ro0Var2.i());
        ro0Var.t(ro0Var2.f());
        ro0Var.r(ro0Var2.o());
    }
}
