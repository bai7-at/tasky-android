package androidx.compose.animation.core;

import androidx.compose.runtime.m;
import defpackage.bi;
import defpackage.by0;
import defpackage.cc0;
import defpackage.ci;
import defpackage.di;
import defpackage.fi;
import defpackage.gg8;
import defpackage.gt2;
import defpackage.hu8;
import defpackage.mi;
import defpackage.nc1;
import defpackage.ni;
import defpackage.nj3;
import defpackage.oc1;
import defpackage.ss2;
import defpackage.wk2;
import defpackage.ww8;
import defpackage.yh;
import defpackage.zv4;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public abstract class SuspendAnimationKt {
    public static final Object b(float f, float f2, float f3, ci ciVar, gt2 gt2Var, by0 by0Var) {
        Object d = d(VectorConvertersKt.d(wk2.a), cc0.b(f), cc0.b(f2), cc0.b(f3), ciVar, gt2Var, by0Var);
        return d == kotlin.coroutines.intrinsics.a.h() ? d : ww8.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f3 A[Catch: CancellationException -> 0x0045, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0045, blocks: (B:13:0x0041, B:16:0x00e6, B:18:0x00f3), top: B:12:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x011d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r13v1, types: [T, bi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(final defpackage.fi r25, final defpackage.yh r26, long r27, final defpackage.ss2 r29, defpackage.by0 r30) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SuspendAnimationKt.c(fi, yh, long, ss2, by0):java.lang.Object");
    }

    public static final Object d(final hu8 hu8Var, Object obj, Object obj2, Object obj3, ci ciVar, final gt2 gt2Var, by0 by0Var) {
        mi g;
        if (obj3 == null || (g = (mi) hu8Var.a().invoke(obj3)) == null) {
            g = ni.g((mi) hu8Var.a().invoke(obj));
        }
        Object f = f(new fi(hu8Var, obj, g, 0L, 0L, false, 56, null), new gg8(ciVar, hu8Var, obj, obj2, g), 0L, new ss2() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animate$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(bi biVar) {
                gt2.this.invoke(biVar.e(), hu8Var.b().invoke(biVar.g()));
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj4) {
                b((bi) obj4);
                return ww8.a;
            }
        }, by0Var, 2, null);
        return f == kotlin.coroutines.intrinsics.a.h() ? f : ww8.a;
    }

    public static /* synthetic */ Object e(float f, float f2, float f3, ci ciVar, gt2 gt2Var, by0 by0Var, int i, Object obj) {
        float f4 = (i & 4) != 0 ? 0.0f : f3;
        if ((i & 8) != 0) {
            ciVar = di.i(0.0f, 0.0f, null, 7, null);
        }
        return b(f, f2, f4, ciVar, gt2Var, by0Var);
    }

    public static /* synthetic */ Object f(fi fiVar, yh yhVar, long j, ss2 ss2Var, by0 by0Var, int i, Object obj) {
        if ((i & 2) != 0) {
            j = Long.MIN_VALUE;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            ss2Var = new ss2() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animate$5
                public final void b(bi biVar) {
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    b((bi) obj2);
                    return ww8.a;
                }
            };
        }
        return c(fiVar, yhVar, j2, ss2Var, by0Var);
    }

    public static final Object h(fi fiVar, oc1 oc1Var, boolean z, ss2 ss2Var, by0 by0Var) {
        Object c = c(fiVar, new nc1(oc1Var, fiVar.o(), fiVar.getValue(), fiVar.A()), z ? fiVar.n() : Long.MIN_VALUE, ss2Var, by0Var);
        return c == kotlin.coroutines.intrinsics.a.h() ? c : ww8.a;
    }

    public static /* synthetic */ Object i(fi fiVar, oc1 oc1Var, boolean z, ss2 ss2Var, by0 by0Var, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            ss2Var = new ss2() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animateDecay$4
                public final void b(bi biVar) {
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    b((bi) obj2);
                    return ww8.a;
                }
            };
        }
        return h(fiVar, oc1Var, z, ss2Var, by0Var);
    }

    public static final Object j(fi fiVar, Object obj, ci ciVar, boolean z, ss2 ss2Var, by0 by0Var) {
        Object c = c(fiVar, new gg8(ciVar, fiVar.o(), fiVar.getValue(), obj, fiVar.A()), z ? fiVar.n() : Long.MIN_VALUE, ss2Var, by0Var);
        return c == kotlin.coroutines.intrinsics.a.h() ? c : ww8.a;
    }

    public static /* synthetic */ Object k(fi fiVar, Object obj, ci ciVar, boolean z, ss2 ss2Var, by0 by0Var, int i, Object obj2) {
        if ((i & 2) != 0) {
            ciVar = di.i(0.0f, 0.0f, null, 7, null);
        }
        ci ciVar2 = ciVar;
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            ss2Var = new ss2() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animateTo$2
                public final void b(bi biVar) {
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                    b((bi) obj3);
                    return ww8.a;
                }
            };
        }
        return j(fiVar, obj, ciVar2, z2, ss2Var, by0Var);
    }

    private static final Object l(yh yhVar, final ss2 ss2Var, by0 by0Var) {
        return yhVar.a() ? nj3.a(ss2Var, by0Var) : m.c(new ss2() { // from class: androidx.compose.animation.core.SuspendAnimationKt$callWithFrameNanos$2
            {
                super(1);
            }

            public final Object b(long j) {
                return ss2.this.invoke(Long.valueOf(j));
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return b(((Number) obj).longValue());
            }
        }, by0Var);
    }

    private static final void m(bi biVar, long j, long j2, yh yhVar, fi fiVar, ss2 ss2Var) {
        biVar.j(j);
        biVar.l(yhVar.f(j2));
        biVar.m(yhVar.b(j2));
        if (yhVar.c(j2)) {
            biVar.i(biVar.c());
            biVar.k(false);
        }
        p(biVar, fiVar);
        ss2Var.invoke(biVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(bi biVar, long j, float f, yh yhVar, fi fiVar, ss2 ss2Var) {
        m(biVar, j, f == 0.0f ? yhVar.d() : (long) ((j - biVar.d()) / f), yhVar, fiVar, ss2Var);
    }

    public static final float o(CoroutineContext coroutineContext) {
        zv4 zv4Var = (zv4) coroutineContext.get(zv4.A);
        float d = zv4Var != null ? zv4Var.d() : 1.0f;
        if (d >= 0.0f) {
            return d;
        }
        throw new IllegalStateException("negative scale factor");
    }

    public static final void p(bi biVar, fi fiVar) {
        fiVar.F(biVar.e());
        ni.f(fiVar.A(), biVar.g());
        fiVar.C(biVar.b());
        fiVar.D(biVar.c());
        fiVar.E(biVar.h());
    }
}
