package androidx.compose.ui.input.nestedscroll;

import defpackage.d35;
import defpackage.fd5;
import defpackage.kv4;
import defpackage.qs2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class NestedScrollDispatcher {
    private kv4 a;
    private qs2 b = new qs2() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$calculateNestedScrollScope$1
        {
            super(0);
        }

        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CoroutineScope mo865invoke() {
            return NestedScrollDispatcher.this.h();
        }
    };
    private CoroutineScope c;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r8, long r10, defpackage.by0 r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1
            if (r0 == 0) goto L14
            r0 = r12
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            kotlin.f.b(r12)
            goto L47
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            kotlin.f.b(r12)
            d35 r1 = r7.g()
            if (r1 == 0) goto L4e
            r6.label = r2
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.Q0(r2, r4, r6)
            if (r12 != r0) goto L47
            return r0
        L47:
            u49 r12 = (defpackage.u49) r12
            long r7 = r12.o()
            goto L54
        L4e:
            u49$a r7 = defpackage.u49.b
            long r7 = r7.a()
        L54:
            u49 r7 = defpackage.u49.b(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.a(long, long, by0):java.lang.Object");
    }

    public final long b(long j, long j2, int i) {
        d35 g = g();
        return g != null ? g.r0(j, j2, i) : fd5.b.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(long r5, defpackage.by0 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1 r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r7)
            goto L43
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.f.b(r7)
            d35 r4 = r4.g()
            if (r4 == 0) goto L4a
            r0.label = r3
            java.lang.Object r7 = r4.o0(r5, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            u49 r7 = (defpackage.u49) r7
            long r4 = r7.o()
            goto L50
        L4a:
            u49$a r4 = defpackage.u49.b
            long r4 = r4.a()
        L50:
            u49 r4 = defpackage.u49.b(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.c(long, by0):java.lang.Object");
    }

    public final long d(long j, int i) {
        d35 g = g();
        return g != null ? g.b1(j, i) : fd5.b.c();
    }

    public final CoroutineScope e() {
        CoroutineScope coroutineScope = (CoroutineScope) this.b.mo865invoke();
        if (coroutineScope != null) {
            return coroutineScope;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final kv4 f() {
        return this.a;
    }

    public final d35 g() {
        kv4 kv4Var = this.a;
        if (kv4Var != null) {
            return (NestedScrollNode) kv4Var.l(NestedScrollNodeKt.a());
        }
        return null;
    }

    public final CoroutineScope h() {
        return this.c;
    }

    public final void i(qs2 qs2Var) {
        this.b = qs2Var;
    }

    public final void j(kv4 kv4Var) {
        this.a = kv4Var;
    }

    public final void k(CoroutineScope coroutineScope) {
        this.c = coroutineScope;
    }
}
