package androidx.compose.foundation.gestures;

import androidx.compose.ui.Modifier;
import defpackage.by0;
import defpackage.cz3;
import defpackage.fd5;
import defpackage.hc1;
import defpackage.hd5;
import defpackage.hn3;
import defpackage.in3;
import defpackage.kt6;
import defpackage.qs2;
import defpackage.rc0;
import defpackage.tc7;
import defpackage.uc0;
import defpackage.vy4;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zt7;
import defpackage.zy3;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineStart;

/* loaded from: classes.dex */
public final class ContentInViewNode extends Modifier.c implements rc0, zy3 {
    private boolean B;
    private boolean L;
    private final UpdatableAnimationState M;
    private Orientation n;
    private tc7 r;
    private boolean s;
    private uc0 t;
    private cz3 w;
    private cz3 x;
    private kt6 y;
    private final BringIntoViewRequestPriorityQueue u = new BringIntoViewRequestPriorityQueue();
    private long H = hn3.b.a();

    public static final class a {
        private final qs2 a;
        private final CancellableContinuation b;

        public a(qs2 qs2Var, CancellableContinuation cancellableContinuation) {
            this.a = qs2Var;
            this.b = cancellableContinuation;
        }

        public final CancellableContinuation a() {
            return this.b;
        }

        public final qs2 b() {
            return this.a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x004e, code lost:
        
            if (r0 == null) goto L10;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String toString() {
            /*
                r4 = this;
                kotlinx.coroutines.CancellableContinuation r0 = r4.b
                kotlin.coroutines.CoroutineContext r0 = r0.getContext()
                kotlinx.coroutines.CoroutineName$Key r1 = kotlinx.coroutines.CoroutineName.Key
                kotlin.coroutines.CoroutineContext$a r0 = r0.get(r1)
                kotlinx.coroutines.CoroutineName r0 = (kotlinx.coroutines.CoroutineName) r0
                if (r0 == 0) goto L15
                java.lang.String r0 = r0.getName()
                goto L16
            L15:
                r0 = 0
            L16:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Request@"
                r1.append(r2)
                int r2 = r4.hashCode()
                r3 = 16
                int r3 = kotlin.text.a.a(r3)
                java.lang.String r2 = java.lang.Integer.toString(r2, r3)
                java.lang.String r3 = "toString(this, checkRadix(radix))"
                defpackage.zq3.g(r2, r3)
                r1.append(r2)
                if (r0 == 0) goto L50
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r3 = 91
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = "]("
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                if (r0 != 0) goto L52
            L50:
                java.lang.String r0 = "("
            L52:
                r1.append(r0)
                java.lang.String r0 = "currentBounds()="
                r1.append(r0)
                qs2 r0 = r4.a
                java.lang.Object r0 = r0.mo865invoke()
                r1.append(r0)
                java.lang.String r0 = ", continuation="
                r1.append(r0)
                kotlinx.coroutines.CancellableContinuation r4 = r4.b
                r1.append(r4)
                r4 = 41
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ContentInViewNode.a.toString():java.lang.String");
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public ContentInViewNode(Orientation orientation, tc7 tc7Var, boolean z, uc0 uc0Var) {
        this.n = orientation;
        this.r = tc7Var;
        this.s = z;
        this.t = uc0Var;
        this.M = new UpdatableAnimationState(this.t.b());
    }

    private final long A2(kt6 kt6Var, long j) {
        long c = in3.c(j);
        int i = b.a[this.n.ordinal()];
        if (i == 1) {
            return hd5.a(0.0f, this.t.a(kt6Var.l(), kt6Var.e() - kt6Var.l(), zt7.g(c)));
        }
        if (i == 2) {
            return hd5.a(this.t.a(kt6Var.i(), kt6Var.j() - kt6Var.i(), zt7.i(c)), 0.0f);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float p2() {
        if (hn3.e(this.H, hn3.b.a())) {
            return 0.0f;
        }
        kt6 t2 = t2();
        if (t2 == null) {
            t2 = this.B ? u2() : null;
            if (t2 == null) {
                return 0.0f;
            }
        }
        long c = in3.c(this.H);
        int i = b.a[this.n.ordinal()];
        if (i == 1) {
            return this.t.a(t2.l(), t2.e() - t2.l(), zt7.g(c));
        }
        if (i == 2) {
            return this.t.a(t2.i(), t2.j() - t2.i(), zt7.i(c));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final int q2(long j, long j2) {
        int i = b.a[this.n.ordinal()];
        if (i == 1) {
            return zq3.j(hn3.f(j), hn3.f(j2));
        }
        if (i == 2) {
            return zq3.j(hn3.g(j), hn3.g(j2));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final int r2(long j, long j2) {
        int i = b.a[this.n.ordinal()];
        if (i == 1) {
            return Float.compare(zt7.g(j), zt7.g(j2));
        }
        if (i == 2) {
            return Float.compare(zt7.i(j), zt7.i(j2));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final kt6 s2(kt6 kt6Var, long j) {
        return kt6Var.t(fd5.w(A2(kt6Var, j)));
    }

    private final kt6 t2() {
        vy4 vy4Var;
        vy4Var = this.u.a;
        int q = vy4Var.q();
        kt6 kt6Var = null;
        if (q > 0) {
            int i = q - 1;
            Object[] p = vy4Var.p();
            do {
                kt6 kt6Var2 = (kt6) ((a) p[i]).b().mo865invoke();
                if (kt6Var2 != null) {
                    if (r2(kt6Var2.k(), in3.c(this.H)) > 0) {
                        return kt6Var == null ? kt6Var2 : kt6Var;
                    }
                    kt6Var = kt6Var2;
                }
                i--;
            } while (i >= 0);
        }
        return kt6Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kt6 u2() {
        cz3 cz3Var;
        cz3 cz3Var2 = this.w;
        if (cz3Var2 != null) {
            if (!cz3Var2.m()) {
                cz3Var2 = null;
            }
            if (cz3Var2 != null && (cz3Var = this.x) != null) {
                if (!cz3Var.m()) {
                    cz3Var = null;
                }
                if (cz3Var != null) {
                    return cz3Var2.z(cz3Var, false);
                }
            }
        }
        return null;
    }

    private final boolean w2(kt6 kt6Var, long j) {
        long A2 = A2(kt6Var, j);
        return Math.abs(fd5.o(A2)) <= 0.5f && Math.abs(fd5.p(A2)) <= 0.5f;
    }

    static /* synthetic */ boolean x2(ContentInViewNode contentInViewNode, kt6 kt6Var, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = contentInViewNode.H;
        }
        return contentInViewNode.w2(kt6Var, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y2() {
        if (this.L) {
            throw new IllegalStateException("launchAnimation called when previous animation was running");
        }
        BuildersKt__Builders_commonKt.launch$default(E1(), null, CoroutineStart.UNDISPATCHED, new ContentInViewNode$launchAnimation$2(this, null), 1, null);
    }

    public final void B2(Orientation orientation, tc7 tc7Var, boolean z, uc0 uc0Var) {
        this.n = orientation;
        this.r = tc7Var;
        this.s = z;
        this.t = uc0Var;
    }

    @Override // defpackage.zy3
    public void F0(cz3 cz3Var) {
        this.w = cz3Var;
    }

    @Override // defpackage.rc0
    public Object I(qs2 qs2Var, by0 by0Var) {
        kt6 kt6Var = (kt6) qs2Var.mo865invoke();
        if (kt6Var == null || x2(this, kt6Var, 0L, 1, null)) {
            return ww8.a;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.a.d(by0Var), 1);
        cancellableContinuationImpl.initCancellability();
        if (this.u.c(new a(qs2Var, cancellableContinuationImpl)) && !this.L) {
            y2();
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.a.h()) {
            hc1.c(by0Var);
        }
        return result == kotlin.coroutines.intrinsics.a.h() ? result : ww8.a;
    }

    @Override // defpackage.zy3
    public void e(long j) {
        kt6 u2;
        long j2 = this.H;
        this.H = j;
        if (q2(j, j2) < 0 && (u2 = u2()) != null) {
            kt6 kt6Var = this.y;
            if (kt6Var == null) {
                kt6Var = u2;
            }
            if (!this.L && !this.B && w2(kt6Var, j2) && !w2(u2, j)) {
                this.B = true;
                y2();
            }
            this.y = u2;
        }
    }

    public final long v2() {
        return this.H;
    }

    @Override // defpackage.rc0
    public kt6 z(kt6 kt6Var) {
        if (hn3.e(this.H, hn3.b.a())) {
            throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.");
        }
        return s2(kt6Var, this.H);
    }

    public final void z2(cz3 cz3Var) {
        this.x = cz3Var;
    }
}
