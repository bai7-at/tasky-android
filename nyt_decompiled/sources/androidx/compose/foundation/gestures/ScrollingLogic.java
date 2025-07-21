package androidx.compose.foundation.gestures;

import androidx.compose.runtime.b0;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import defpackage.fd5;
import defpackage.g35;
import defpackage.hd5;
import defpackage.hm5;
import defpackage.qc7;
import defpackage.qk2;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.tc7;
import defpackage.u49;

/* loaded from: classes.dex */
final class ScrollingLogic {
    private tc7 a;
    private Orientation b;
    private hm5 c;
    private boolean d;
    private qk2 e;
    private NestedScrollDispatcher f;
    private final sy4 g = b0.e(Boolean.FALSE, null, 2, null);

    public ScrollingLogic(tc7 tc7Var, Orientation orientation, hm5 hm5Var, boolean z, qk2 qk2Var, NestedScrollDispatcher nestedScrollDispatcher) {
        this.a = tc7Var;
        this.b = orientation;
        this.c = hm5Var;
        this.d = z;
        this.e = qk2Var;
        this.f = nestedScrollDispatcher;
    }

    private final boolean f() {
        return this.a.a() || this.a.d();
    }

    public final long c(final qc7 qc7Var, long j, final int i) {
        ss2 ss2Var = new ss2() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$dispatchScroll$performScroll$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final long b(long j2) {
                NestedScrollDispatcher nestedScrollDispatcher;
                NestedScrollDispatcher nestedScrollDispatcher2;
                nestedScrollDispatcher = ScrollingLogic.this.f;
                long d = nestedScrollDispatcher.d(j2, i);
                long s = fd5.s(j2, d);
                ScrollingLogic scrollingLogic = ScrollingLogic.this;
                float p = scrollingLogic.p(scrollingLogic.k(scrollingLogic.m(s)));
                ScrollingLogic scrollingLogic2 = ScrollingLogic.this;
                long k = scrollingLogic2.k(scrollingLogic2.q(qc7Var.a(p)));
                long s2 = fd5.s(s, k);
                nestedScrollDispatcher2 = ScrollingLogic.this.f;
                return fd5.t(fd5.t(d, k), nestedScrollDispatcher2.b(k, s2, i));
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return fd5.d(b(((fd5) obj).x()));
            }
        };
        hm5 hm5Var = this.c;
        return g35.e(i, g35.a.c()) ? ((fd5) ss2Var.invoke(fd5.d(j))).x() : (hm5Var == null || !f()) ? ((fd5) ss2Var.invoke(fd5.d(j))).x() : hm5Var.d(j, i, ss2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(long r12, defpackage.by0 r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            if (r0 == 0) goto L14
            r0 = r14
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = (androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            r0.<init>(r11, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r4.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r11 = r4.L$0
            kotlin.jvm.internal.Ref$LongRef r11 = (kotlin.jvm.internal.Ref$LongRef) r11
            kotlin.f.b(r14)
            goto L5c
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            kotlin.f.b(r14)
            kotlin.jvm.internal.Ref$LongRef r14 = new kotlin.jvm.internal.Ref$LongRef
            r14.<init>()
            r14.element = r12
            tc7 r1 = r11.a
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2 r3 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2
            r10 = 0
            r5 = r3
            r6 = r11
            r7 = r14
            r8 = r12
            r5.<init>(r6, r7, r8, r10)
            r4.L$0 = r14
            r4.label = r2
            r2 = 0
            r5 = 1
            r6 = 0
            java.lang.Object r11 = defpackage.tc7.e(r1, r2, r3, r4, r5, r6)
            if (r11 != r0) goto L5b
            return r0
        L5b:
            r11 = r14
        L5c:
            long r11 = r11.element
            u49 r11 = defpackage.u49.b(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.d(long, by0):java.lang.Object");
    }

    public final tc7 e() {
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(long r7, defpackage.by0 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1 r0 = (androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1 r0 = new androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L31
            if (r2 != r3) goto L29
            goto L31
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            java.lang.Object r6 = r0.L$0
            androidx.compose.foundation.gestures.ScrollingLogic r6 = (androidx.compose.foundation.gestures.ScrollingLogic) r6
            kotlin.f.b(r9)
            goto L6d
        L39:
            kotlin.f.b(r9)
            r6.i(r4)
            long r7 = r6.n(r7)
            androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1 r9 = new androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1
            r2 = 0
            r9.<init>(r6, r2)
            hm5 r2 = r6.c
            if (r2 == 0) goto L5e
            boolean r5 = r6.f()
            if (r5 == 0) goto L5e
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = r2.a(r7, r9, r0)
            if (r7 != r1) goto L6d
            return r1
        L5e:
            u49 r7 = defpackage.u49.b(r7)
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r7 = r9.invoke(r7, r0)
            if (r7 != r1) goto L6d
            return r1
        L6d:
            r7 = 0
            r6.i(r7)
            ww8 r6 = defpackage.ww8.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.g(long, by0):java.lang.Object");
    }

    public final long h(long j) {
        return this.a.c() ? fd5.b.c() : q(j(this.a.f(j(p(j)))));
    }

    public final void i(boolean z) {
        this.g.setValue(Boolean.valueOf(z));
    }

    public final float j(float f) {
        return this.d ? f * (-1) : f;
    }

    public final long k(long j) {
        return this.d ? fd5.u(j, -1.0f) : j;
    }

    public final boolean l() {
        if (!this.a.c() && !((Boolean) this.g.getValue()).booleanValue()) {
            hm5 hm5Var = this.c;
            if (!(hm5Var != null ? hm5Var.b() : false)) {
                return false;
            }
        }
        return true;
    }

    public final long m(long j) {
        return this.b == Orientation.Horizontal ? fd5.i(j, 0.0f, 0.0f, 1, null) : fd5.i(j, 0.0f, 0.0f, 2, null);
    }

    public final long n(long j) {
        return this.b == Orientation.Horizontal ? u49.e(j, 0.0f, 0.0f, 1, null) : u49.e(j, 0.0f, 0.0f, 2, null);
    }

    public final float o(long j) {
        return this.b == Orientation.Horizontal ? u49.h(j) : u49.i(j);
    }

    public final float p(long j) {
        return this.b == Orientation.Horizontal ? fd5.o(j) : fd5.p(j);
    }

    public final long q(float f) {
        return f == 0.0f ? fd5.b.c() : this.b == Orientation.Horizontal ? hd5.a(f, 0.0f) : hd5.a(0.0f, f);
    }

    public final void r(tc7 tc7Var, Orientation orientation, hm5 hm5Var, boolean z, qk2 qk2Var, NestedScrollDispatcher nestedScrollDispatcher) {
        this.a = tc7Var;
        this.b = orientation;
        this.c = hm5Var;
        this.d = z;
        this.e = qk2Var;
        this.f = nestedScrollDispatcher;
    }

    public final long s(long j, float f) {
        return this.b == Orientation.Horizontal ? u49.e(j, f, 0.0f, 2, null) : u49.e(j, 0.0f, f, 1, null);
    }
}
