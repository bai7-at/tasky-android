package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.Modifier;
import defpackage.d35;
import defpackage.du8;
import defpackage.fd5;
import defpackage.jv4;
import defpackage.kv4;
import defpackage.lv4;
import defpackage.ql1;
import defpackage.qs2;
import defpackage.zq3;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class NestedScrollNode extends Modifier.c implements kv4, d35, ql1 {
    private d35 n;
    private NestedScrollDispatcher r;
    private final jv4 s;

    public NestedScrollNode(d35 d35Var, NestedScrollDispatcher nestedScrollDispatcher) {
        this.n = d35Var;
        this.r = nestedScrollDispatcher == null ? new NestedScrollDispatcher() : nestedScrollDispatcher;
        this.s = lv4.b(du8.a(NestedScrollNodeKt.a(), this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CoroutineScope f2() {
        CoroutineScope h;
        NestedScrollNode h2 = h2();
        if ((h2 == null || (h = h2.f2()) == null) && (h = this.r.h()) == null) {
            throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
        return h;
    }

    private final d35 g2() {
        if (L1()) {
            return (d35) l(NestedScrollNodeKt.a());
        }
        return null;
    }

    private final NestedScrollNode h2() {
        if (L1()) {
            return (NestedScrollNode) l(NestedScrollNodeKt.a());
        }
        return null;
    }

    private final void i2() {
        if (this.r.f() == this) {
            this.r.j(null);
        }
    }

    private final void j2(NestedScrollDispatcher nestedScrollDispatcher) {
        i2();
        if (nestedScrollDispatcher == null) {
            this.r = new NestedScrollDispatcher();
        } else if (!zq3.c(nestedScrollDispatcher, this.r)) {
            this.r = nestedScrollDispatcher;
        }
        if (L1()) {
            k2();
        }
    }

    private final void k2() {
        this.r.j(this);
        this.r.i(new qs2() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollNode$updateDispatcherFields$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CoroutineScope mo865invoke() {
                CoroutineScope f2;
                f2 = NestedScrollNode.this.f2();
                return f2;
            }
        });
        this.r.k(E1());
    }

    @Override // androidx.compose.ui.Modifier.c
    public void O1() {
        k2();
    }

    @Override // androidx.compose.ui.Modifier.c
    public void P1() {
        i2();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.d35
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Q0(long r16, long r18, defpackage.by0 r20) {
        /*
            r15 = this;
            r0 = r15
            r1 = r20
            boolean r2 = r1 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1
            if (r2 == 0) goto L16
            r2 = r1
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1 r2 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.label = r3
            goto L1b
        L16:
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1 r2 = new androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1
            r2.<init>(r15, r1)
        L1b:
            java.lang.Object r1 = r2.result
            java.lang.Object r9 = kotlin.coroutines.intrinsics.a.h()
            int r3 = r2.label
            r10 = 2
            r4 = 1
            if (r3 == 0) goto L47
            if (r3 == r4) goto L39
            if (r3 != r10) goto L31
            long r2 = r2.J$0
            kotlin.f.b(r1)
            goto L8e
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L39:
            long r3 = r2.J$1
            long r5 = r2.J$0
            java.lang.Object r0 = r2.L$0
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode) r0
            kotlin.f.b(r1)
            r13 = r3
            r11 = r5
            goto L64
        L47:
            kotlin.f.b(r1)
            d35 r3 = r0.n
            r2.L$0 = r0
            r11 = r16
            r2.J$0 = r11
            r13 = r18
            r2.J$1 = r13
            r2.label = r4
            r4 = r16
            r6 = r18
            r8 = r2
            java.lang.Object r1 = r3.Q0(r4, r6, r8)
            if (r1 != r9) goto L64
            return r9
        L64:
            u49 r1 = (defpackage.u49) r1
            long r3 = r1.o()
            d35 r0 = r0.g2()
            if (r0 == 0) goto L96
            long r5 = defpackage.u49.l(r11, r3)
            long r7 = defpackage.u49.k(r13, r3)
            r1 = 0
            r2.L$0 = r1
            r2.J$0 = r3
            r2.label = r10
            r15 = r0
            r16 = r5
            r18 = r7
            r20 = r2
            java.lang.Object r1 = r15.Q0(r16, r18, r20)
            if (r1 != r9) goto L8d
            return r9
        L8d:
            r2 = r3
        L8e:
            u49 r1 = (defpackage.u49) r1
            long r0 = r1.o()
            r3 = r2
            goto L9c
        L96:
            u49$a r0 = defpackage.u49.b
            long r0 = r0.a()
        L9c:
            long r0 = defpackage.u49.l(r3, r0)
            u49 r0 = defpackage.u49.b(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollNode.Q0(long, long, by0):java.lang.Object");
    }

    @Override // defpackage.kv4
    public jv4 V() {
        return this.s;
    }

    @Override // defpackage.d35
    public long b1(long j, int i) {
        d35 g2 = g2();
        long b1 = g2 != null ? g2.b1(j, i) : fd5.b.c();
        return fd5.t(b1, this.n.b1(fd5.s(j, b1), i));
    }

    public final void l2(d35 d35Var, NestedScrollDispatcher nestedScrollDispatcher) {
        this.n = d35Var;
        j2(nestedScrollDispatcher);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.d35
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object o0(long r9, defpackage.by0 r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1 r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            long r8 = r0.J$0
            kotlin.f.b(r11)
            goto L7c
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            long r9 = r0.J$0
            java.lang.Object r8 = r0.L$0
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r8 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode) r8
            kotlin.f.b(r11)
            goto L56
        L40:
            kotlin.f.b(r11)
            d35 r11 = r8.g2()
            if (r11 == 0) goto L61
            r0.L$0 = r8
            r0.J$0 = r9
            r0.label = r4
            java.lang.Object r11 = r11.o0(r9, r0)
            if (r11 != r1) goto L56
            return r1
        L56:
            u49 r11 = (defpackage.u49) r11
            long r4 = r11.o()
        L5c:
            r6 = r9
            r10 = r8
            r8 = r4
            r4 = r6
            goto L68
        L61:
            u49$a r11 = defpackage.u49.b
            long r4 = r11.a()
            goto L5c
        L68:
            d35 r10 = r10.n
            long r4 = defpackage.u49.k(r4, r8)
            r11 = 0
            r0.L$0 = r11
            r0.J$0 = r8
            r0.label = r3
            java.lang.Object r11 = r10.o0(r4, r0)
            if (r11 != r1) goto L7c
            return r1
        L7c:
            u49 r11 = (defpackage.u49) r11
            long r10 = r11.o()
            long r8 = defpackage.u49.l(r8, r10)
            u49 r8 = defpackage.u49.b(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollNode.o0(long, by0):java.lang.Object");
    }

    @Override // defpackage.d35
    public long r0(long j, long j2, int i) {
        long r0 = this.n.r0(j, j2, i);
        d35 g2 = g2();
        return fd5.t(r0, g2 != null ? g2.r0(fd5.t(j, r0), fd5.s(j2, r0), i) : fd5.b.c());
    }
}
