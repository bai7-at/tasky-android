package androidx.compose.ui.input.pointer;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import defpackage.a30;
import defpackage.bd8;
import defpackage.by0;
import defpackage.cd8;
import defpackage.du7;
import defpackage.ey0;
import defpackage.fm1;
import defpackage.fy5;
import defpackage.gt2;
import defpackage.hc1;
import defpackage.hn3;
import defpackage.nx5;
import defpackage.r99;
import defpackage.rl1;
import defpackage.ss2;
import defpackage.vx5;
import defpackage.vy4;
import defpackage.ww8;
import defpackage.zt7;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

/* loaded from: classes.dex */
public final class SuspendingPointerInputModifierNodeImpl extends Modifier.c implements cd8, fy5, fm1 {
    private gt2 n;
    private Job r;
    private c s;
    private final vy4 t;
    private final vy4 u;
    private c w;
    private long x;

    /* JADX INFO: Access modifiers changed from: private */
    final class PointerEventHandlerCoroutine implements a30, fm1, by0 {
        private final by0 a;
        private final /* synthetic */ SuspendingPointerInputModifierNodeImpl b;
        private CancellableContinuation c;
        private PointerEventPass d = PointerEventPass.Main;
        private final CoroutineContext e = EmptyCoroutineContext.a;

        public PointerEventHandlerCoroutine(by0 by0Var) {
            this.a = by0Var;
            this.b = SuspendingPointerInputModifierNodeImpl.this;
        }

        @Override // defpackage.an2
        public long A(float f) {
            return this.b.A(f);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // defpackage.a30
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object A0(long r12, defpackage.gt2 r14, defpackage.by0 r15) {
            /*
                r11 = this;
                boolean r0 = r15 instanceof androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1
                if (r0 == 0) goto L13
                r0 = r15
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 r0 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1
                r0.<init>(r11, r15)
            L18:
                java.lang.Object r15 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r11 = r0.L$0
                kotlinx.coroutines.Job r11 = (kotlinx.coroutines.Job) r11
                kotlin.f.b(r15)     // Catch: java.lang.Throwable -> L2d
                goto L76
            L2d:
                r12 = move-exception
                goto L80
            L2f:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L37:
                kotlin.f.b(r15)
                r4 = 0
                int r15 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
                if (r15 > 0) goto L56
                kotlinx.coroutines.CancellableContinuation r15 = r11.c
                if (r15 == 0) goto L56
                kotlin.Result$a r2 = kotlin.Result.a
                androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r2 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
                r2.<init>(r12)
                java.lang.Object r2 = kotlin.f.a(r2)
                java.lang.Object r2 = kotlin.Result.b(r2)
                r15.resumeWith(r2)
            L56:
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl r15 = androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.this
                kotlinx.coroutines.CoroutineScope r4 = r15.E1()
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1 r7 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1
                r15 = 0
                r7.<init>(r12, r11, r15)
                r8 = 3
                r9 = 0
                r5 = 0
                r6 = 0
                kotlinx.coroutines.Job r12 = kotlinx.coroutines.BuildersKt.launch$default(r4, r5, r6, r7, r8, r9)
                r0.L$0 = r12     // Catch: java.lang.Throwable -> L7c
                r0.label = r3     // Catch: java.lang.Throwable -> L7c
                java.lang.Object r15 = r14.invoke(r11, r0)     // Catch: java.lang.Throwable -> L7c
                if (r15 != r1) goto L75
                return r1
            L75:
                r11 = r12
            L76:
                androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r12 = androidx.compose.ui.input.pointer.CancelTimeoutCancellationException.a
                r11.cancel(r12)
                return r15
            L7c:
                r11 = move-exception
                r10 = r12
                r12 = r11
                r11 = r10
            L80:
                androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r13 = androidx.compose.ui.input.pointer.CancelTimeoutCancellationException.a
                r11.cancel(r13)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine.A0(long, gt2, by0):java.lang.Object");
        }

        @Override // defpackage.fm1
        public long B(long j) {
            return this.b.B(j);
        }

        @Override // defpackage.a30
        public Object E(PointerEventPass pointerEventPass, by0 by0Var) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.a.d(by0Var), 1);
            cancellableContinuationImpl.initCancellability();
            this.d = pointerEventPass;
            this.c = cancellableContinuationImpl;
            Object result = cancellableContinuationImpl.getResult();
            if (result == kotlin.coroutines.intrinsics.a.h()) {
                hc1.c(by0Var);
            }
            return result;
        }

        @Override // defpackage.an2
        public float F(long j) {
            return this.b.F(j);
        }

        @Override // defpackage.a30
        public c I0() {
            return SuspendingPointerInputModifierNodeImpl.this.s;
        }

        @Override // defpackage.fm1
        public long Q(float f) {
            return this.b.Q(f);
        }

        @Override // defpackage.fm1
        public float X0(float f) {
            return this.b.X0(f);
        }

        @Override // defpackage.a30
        public long a() {
            return SuspendingPointerInputModifierNodeImpl.this.x;
        }

        @Override // defpackage.an2
        public float c1() {
            return this.b.c1();
        }

        @Override // defpackage.a30
        public long e0() {
            return SuspendingPointerInputModifierNodeImpl.this.e0();
        }

        @Override // defpackage.fm1
        public float f1(float f) {
            return this.b.f1(f);
        }

        @Override // defpackage.by0
        public CoroutineContext getContext() {
            return this.e;
        }

        @Override // defpackage.fm1
        public float getDensity() {
            return this.b.getDensity();
        }

        @Override // defpackage.a30
        public r99 getViewConfiguration() {
            return SuspendingPointerInputModifierNodeImpl.this.getViewConfiguration();
        }

        public final void i(Throwable th) {
            CancellableContinuation cancellableContinuation = this.c;
            if (cancellableContinuation != null) {
                cancellableContinuation.cancel(th);
            }
            this.c = null;
        }

        public final void k(c cVar, PointerEventPass pointerEventPass) {
            CancellableContinuation cancellableContinuation;
            if (pointerEventPass != this.d || (cancellableContinuation = this.c) == null) {
                return;
            }
            this.c = null;
            cancellableContinuation.resumeWith(Result.b(cVar));
        }

        @Override // defpackage.fm1
        public int k1(long j) {
            return this.b.k1(j);
        }

        @Override // defpackage.fm1
        public int l0(float f) {
            return this.b.l0(f);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
        @Override // defpackage.a30
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object p0(long r5, defpackage.gt2 r7, defpackage.by0 r8) {
            /*
                r4 = this;
                boolean r0 = r8 instanceof androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1
                if (r0 == 0) goto L13
                r0 = r8
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 r0 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1
                r0.<init>(r4, r8)
            L18:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.f.b(r8)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3d
                goto L3e
            L29:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L31:
                kotlin.f.b(r8)
                r0.label = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3d
                java.lang.Object r8 = r4.A0(r5, r7, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3d
                if (r8 != r1) goto L3e
                return r1
            L3d:
                r8 = 0
            L3e:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine.p0(long, gt2, by0):java.lang.Object");
        }

        @Override // defpackage.by0
        public void resumeWith(Object obj) {
            vy4 vy4Var = SuspendingPointerInputModifierNodeImpl.this.t;
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = SuspendingPointerInputModifierNodeImpl.this;
            synchronized (vy4Var) {
                suspendingPointerInputModifierNodeImpl.t.w(this);
                ww8 ww8Var = ww8.a;
            }
            this.a.resumeWith(obj);
        }

        @Override // defpackage.fm1
        public float t0(long j) {
            return this.b.t0(j);
        }

        @Override // defpackage.fm1
        public float v(int i) {
            return this.b.v(i);
        }

        @Override // defpackage.fm1
        public long v1(long j) {
            return this.b.v1(j);
        }
    }

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[PointerEventPass.values().length];
            try {
                iArr[PointerEventPass.Initial.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PointerEventPass.Final.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PointerEventPass.Main.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public SuspendingPointerInputModifierNodeImpl(gt2 gt2Var) {
        c cVar;
        this.n = gt2Var;
        cVar = bd8.a;
        this.s = cVar;
        this.t = new vy4(new PointerEventHandlerCoroutine[16], 0);
        this.u = new vy4(new PointerEventHandlerCoroutine[16], 0);
        this.x = hn3.b.a();
    }

    private final void h2(c cVar, PointerEventPass pointerEventPass) {
        vy4 vy4Var;
        int q;
        synchronized (this.t) {
            vy4 vy4Var2 = this.u;
            vy4Var2.c(vy4Var2.q(), this.t);
        }
        try {
            int i = a.a[pointerEventPass.ordinal()];
            if (i == 1 || i == 2) {
                vy4 vy4Var3 = this.u;
                int q2 = vy4Var3.q();
                if (q2 > 0) {
                    Object[] p = vy4Var3.p();
                    int i2 = 0;
                    do {
                        ((PointerEventHandlerCoroutine) p[i2]).k(cVar, pointerEventPass);
                        i2++;
                    } while (i2 < q2);
                }
            } else if (i == 3 && (q = (vy4Var = this.u).q()) > 0) {
                int i3 = q - 1;
                Object[] p2 = vy4Var.p();
                do {
                    ((PointerEventHandlerCoroutine) p2[i3]).k(cVar, pointerEventPass);
                    i3--;
                } while (i3 >= 0);
            }
        } finally {
            this.u.h();
        }
    }

    @Override // defpackage.dy5
    public void L(c cVar, PointerEventPass pointerEventPass, long j) {
        Job launch$default;
        this.x = j;
        if (pointerEventPass == PointerEventPass.Initial) {
            this.s = cVar;
        }
        if (this.r == null) {
            launch$default = BuildersKt__Builders_commonKt.launch$default(E1(), null, CoroutineStart.UNDISPATCHED, new SuspendingPointerInputModifierNodeImpl$onPointerEvent$1(this, null), 1, null);
            this.r = launch$default;
        }
        h2(cVar, pointerEventPass);
        List c = cVar.c();
        int size = c.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            } else if (!nx5.d((vx5) c.get(i))) {
                break;
            } else {
                i++;
            }
        }
        if (z) {
            cVar = null;
        }
        this.w = cVar;
    }

    @Override // androidx.compose.ui.Modifier.c
    public void P1() {
        z0();
        super.P1();
    }

    @Override // defpackage.dy5
    public void U0() {
        c cVar = this.w;
        if (cVar == null) {
            return;
        }
        List c = cVar.c();
        int size = c.size();
        for (int i = 0; i < size; i++) {
            if (((vx5) c.get(i)).j()) {
                List c2 = cVar.c();
                ArrayList arrayList = new ArrayList(c2.size());
                int size2 = c2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    vx5 vx5Var = (vx5) c2.get(i2);
                    arrayList.add(new vx5(vx5Var.g(), vx5Var.p(), vx5Var.i(), false, vx5Var.k(), vx5Var.p(), vx5Var.i(), vx5Var.j(), vx5Var.j(), 0, 0L, 1536, (DefaultConstructorMarker) null));
                }
                c cVar2 = new c(arrayList);
                this.s = cVar2;
                h2(cVar2, PointerEventPass.Initial);
                h2(cVar2, PointerEventPass.Main);
                h2(cVar2, PointerEventPass.Final);
                this.w = null;
                return;
            }
        }
    }

    @Override // defpackage.fy5
    public Object X(gt2 gt2Var, by0 by0Var) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.a.d(by0Var), 1);
        cancellableContinuationImpl.initCancellability();
        final PointerEventHandlerCoroutine pointerEventHandlerCoroutine = new PointerEventHandlerCoroutine(cancellableContinuationImpl);
        synchronized (this.t) {
            this.t.b(pointerEventHandlerCoroutine);
            by0 a2 = ey0.a(gt2Var, pointerEventHandlerCoroutine, pointerEventHandlerCoroutine);
            Result.a aVar = Result.a;
            a2.resumeWith(Result.b(ww8.a));
        }
        cancellableContinuationImpl.invokeOnCancellation(new ss2() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$awaitPointerEventScope$2$2
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return ww8.a;
            }

            public final void invoke(Throwable th) {
                SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine.this.i(th);
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.a.h()) {
            hc1.c(by0Var);
        }
        return result;
    }

    @Override // defpackage.fy5
    public long a() {
        return this.x;
    }

    @Override // defpackage.dy5
    public void a1() {
        z0();
    }

    @Override // defpackage.an2
    public float c1() {
        return rl1.k(this).I().c1();
    }

    public long e0() {
        long v1 = v1(getViewConfiguration().d());
        long a2 = a();
        return du7.a(Math.max(0.0f, zt7.i(v1) - hn3.g(a2)) / 2.0f, Math.max(0.0f, zt7.g(v1) - hn3.f(a2)) / 2.0f);
    }

    @Override // defpackage.fm1
    public float getDensity() {
        return rl1.k(this).I().getDensity();
    }

    @Override // defpackage.fy5
    public r99 getViewConfiguration() {
        return rl1.k(this).o0();
    }

    public gt2 i2() {
        return this.n;
    }

    public void j2(gt2 gt2Var) {
        z0();
        this.n = gt2Var;
    }

    @Override // defpackage.dy5
    public void w1() {
        z0();
    }

    @Override // defpackage.cd8
    public void z0() {
        Job job = this.r;
        if (job != null) {
            job.cancel((CancellationException) new PointerInputResetException());
            this.r = null;
        }
    }
}
