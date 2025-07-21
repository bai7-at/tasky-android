package defpackage;

import android.os.Trace;
import android.view.Choreographer;
import android.view.View;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import defpackage.u04;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class v04 implements ov6, u04.b, Runnable, Choreographer.FrameCallback {
    public static final a k = new a(null);
    public static final int l = 8;
    private static long m;
    private final u04 a;
    private final SubcomposeLayoutState b;
    private final LazyLayoutItemContentFactory c;
    private final View d;
    private long f;
    private long g;
    private boolean h;
    private boolean j;
    private final vy4 e = new vy4(new b[16], 0);
    private final Choreographer i = Choreographer.getInstance();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
        
            if (r4 >= 30.0f) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void b(android.view.View r5) {
            /*
                r4 = this;
                long r0 = defpackage.v04.b()
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L2c
                android.view.Display r4 = r5.getDisplay()
                boolean r5 = r5.isInEditMode()
                if (r5 != 0) goto L21
                if (r4 == 0) goto L21
                float r4 = r4.getRefreshRate()
                r5 = 1106247680(0x41f00000, float:30.0)
                int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r5 < 0) goto L21
                goto L23
            L21:
                r4 = 1114636288(0x42700000, float:60.0)
            L23:
                r5 = 1000000000(0x3b9aca00, float:0.0047237873)
                float r5 = (float) r5
                float r5 = r5 / r4
                long r4 = (long) r5
                defpackage.v04.f(r4)
            L2c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: v04.a.b(android.view.View):void");
        }

        private a() {
        }
    }

    private static final class b implements u04.a {
        private final int a;
        private final long b;
        private SubcomposeLayoutState.a c;
        private boolean d;
        private boolean e;

        public /* synthetic */ b(int i, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, j);
        }

        public final boolean a() {
            return this.d;
        }

        public final long b() {
            return this.b;
        }

        public final int c() {
            return this.a;
        }

        @Override // u04.a
        public void cancel() {
            if (this.d) {
                return;
            }
            this.d = true;
            SubcomposeLayoutState.a aVar = this.c;
            if (aVar != null) {
                aVar.dispose();
            }
            this.c = null;
        }

        public final boolean d() {
            return this.e;
        }

        public final SubcomposeLayoutState.a e() {
            return this.c;
        }

        public final void f(SubcomposeLayoutState.a aVar) {
            this.c = aVar;
        }

        private b(int i, long j) {
            this.a = i;
            this.b = j;
        }
    }

    public v04(u04 u04Var, SubcomposeLayoutState subcomposeLayoutState, LazyLayoutItemContentFactory lazyLayoutItemContentFactory, View view) {
        this.a = u04Var;
        this.b = subcomposeLayoutState;
        this.c = lazyLayoutItemContentFactory;
        this.d = view;
        k.b(view);
    }

    private final long g(long j, long j2) {
        if (j2 == 0) {
            return j;
        }
        long j3 = 4;
        return (j / j3) + ((j2 / j3) * 3);
    }

    private final boolean h(long j, long j2, long j3) {
        return j + j3 < j2;
    }

    @Override // u04.b
    public u04.a a(int i, long j) {
        b bVar = new b(i, j, null);
        this.e.b(bVar);
        if (!this.h) {
            this.h = true;
            this.d.post(this);
        }
        return bVar;
    }

    @Override // defpackage.ov6
    public void c() {
        this.a.b(this);
        this.j = true;
    }

    @Override // defpackage.ov6
    public void d() {
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        if (this.j) {
            this.d.post(this);
        }
    }

    @Override // defpackage.ov6
    public void e() {
        this.j = false;
        this.a.b(null);
        this.d.removeCallbacks(this);
        this.i.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.e.s() || !this.h || !this.j || this.d.getWindowVisibility() != 0) {
            this.h = false;
            return;
        }
        long nanos = TimeUnit.MILLISECONDS.toNanos(this.d.getDrawingTime()) + m;
        boolean z = System.nanoTime() > nanos;
        boolean z2 = false;
        while (this.e.t() && !z2) {
            b bVar = (b) this.e.p()[0];
            o04 o04Var = (o04) this.c.d().mo865invoke();
            if (!bVar.a()) {
                int a2 = o04Var.a();
                int c = bVar.c();
                if (c >= 0 && c < a2) {
                    if (bVar.e() == null) {
                        Trace.beginSection("compose:lazylist:prefetch:compose");
                        try {
                            long nanoTime = System.nanoTime();
                            if (!h(nanoTime, nanos, this.f) && !z) {
                                z2 = true;
                                ww8 ww8Var = ww8.a;
                            }
                            Object c2 = o04Var.c(bVar.c());
                            bVar.f(this.b.i(c2, this.c.b(bVar.c(), c2, o04Var.d(bVar.c()))));
                            this.f = g(System.nanoTime() - nanoTime, this.f);
                            z = false;
                            ww8 ww8Var2 = ww8.a;
                        } finally {
                            Trace.endSection();
                        }
                    } else {
                        if (bVar.d()) {
                            throw new IllegalStateException("request already measured");
                        }
                        Trace.beginSection("compose:lazylist:prefetch:measure");
                        try {
                            long nanoTime2 = System.nanoTime();
                            if (!h(nanoTime2, nanos, this.g) && !z) {
                                ww8 ww8Var3 = ww8.a;
                                z2 = true;
                            }
                            SubcomposeLayoutState.a e = bVar.e();
                            zq3.e(e);
                            int a3 = e.a();
                            for (int i = 0; i < a3; i++) {
                                e.b(i, bVar.b());
                            }
                            this.g = g(System.nanoTime() - nanoTime2, this.g);
                            this.e.y(0);
                            z = false;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
            this.e.y(0);
        }
        if (z2) {
            this.i.postFrameCallback(this);
        } else {
            this.h = false;
        }
    }
}
