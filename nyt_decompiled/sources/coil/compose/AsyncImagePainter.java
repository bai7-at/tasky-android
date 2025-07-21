package coil.compose;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.b0;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.recyclerview.widget.RecyclerView;
import coil.ImageLoader;
import coil.compose.AsyncImagePainter;
import coil.size.Precision;
import com.google.accompanist.drawablepainter.DrawablePainter;
import defpackage.AbstractC0565if;
import defpackage.a32;
import defpackage.ao0;
import defpackage.by0;
import defpackage.cc8;
import defpackage.dg8;
import defpackage.fc1;
import defpackage.fu7;
import defpackage.fv1;
import defpackage.iu;
import defpackage.jr8;
import defpackage.o31;
import defpackage.ov6;
import defpackage.p31;
import defpackage.qn0;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.v80;
import defpackage.vg3;
import defpackage.wn0;
import defpackage.ww8;
import defpackage.xg3;
import defpackage.zq3;
import defpackage.zt7;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes.dex */
public final class AsyncImagePainter extends Painter implements ov6 {
    public static final a B = new a(null);
    private static final ss2 H = new ss2() { // from class: coil.compose.AsyncImagePainter$Companion$DefaultTransform$1
        @Override // defpackage.ss2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AsyncImagePainter.b invoke(AsyncImagePainter.b bVar) {
            return bVar;
        }
    };
    private CoroutineScope g;
    private final MutableStateFlow h = StateFlowKt.MutableStateFlow(zt7.c(zt7.b.b()));
    private final sy4 i = b0.e(null, null, 2, null);
    private final sy4 j = b0.e(Float.valueOf(1.0f), null, 2, null);
    private final sy4 k = b0.e(null, null, 2, null);
    private b l;
    private Painter m;
    private ss2 n;
    private ss2 r;
    private ContentScale s;
    private int t;
    private boolean u;
    private final sy4 w;
    private final sy4 x;
    private final sy4 y;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ss2 a() {
            return AsyncImagePainter.H;
        }

        private a() {
        }
    }

    public static abstract class b {

        public static final class a extends b {
            public static final a a = new a();

            private a() {
                super(null);
            }

            @Override // coil.compose.AsyncImagePainter.b
            public Painter a() {
                return null;
            }
        }

        /* renamed from: coil.compose.AsyncImagePainter$b$b, reason: collision with other inner class name */
        public static final class C0135b extends b {
            private final Painter a;
            private final a32 b;

            public C0135b(Painter painter, a32 a32Var) {
                super(null);
                this.a = painter;
                this.b = a32Var;
            }

            public static /* synthetic */ C0135b c(C0135b c0135b, Painter painter, a32 a32Var, int i, Object obj) {
                if ((i & 1) != 0) {
                    painter = c0135b.a();
                }
                if ((i & 2) != 0) {
                    a32Var = c0135b.b;
                }
                return c0135b.b(painter, a32Var);
            }

            @Override // coil.compose.AsyncImagePainter.b
            public Painter a() {
                return this.a;
            }

            public final C0135b b(Painter painter, a32 a32Var) {
                return new C0135b(painter, a32Var);
            }

            public final a32 d() {
                return this.b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0135b)) {
                    return false;
                }
                C0135b c0135b = (C0135b) obj;
                return zq3.c(a(), c0135b.a()) && zq3.c(this.b, c0135b.b);
            }

            public int hashCode() {
                return ((a() == null ? 0 : a().hashCode()) * 31) + this.b.hashCode();
            }

            public String toString() {
                return "Error(painter=" + a() + ", result=" + this.b + ')';
            }
        }

        public static final class c extends b {
            private final Painter a;

            public c(Painter painter) {
                super(null);
                this.a = painter;
            }

            @Override // coil.compose.AsyncImagePainter.b
            public Painter a() {
                return this.a;
            }

            public final c b(Painter painter) {
                return new c(painter);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && zq3.c(a(), ((c) obj).a());
            }

            public int hashCode() {
                if (a() == null) {
                    return 0;
                }
                return a().hashCode();
            }

            public String toString() {
                return "Loading(painter=" + a() + ')';
            }
        }

        public static final class d extends b {
            private final Painter a;
            private final cc8 b;

            public d(Painter painter, cc8 cc8Var) {
                super(null);
                this.a = painter;
                this.b = cc8Var;
            }

            @Override // coil.compose.AsyncImagePainter.b
            public Painter a() {
                return this.a;
            }

            public final cc8 b() {
                return this.b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return zq3.c(a(), dVar.a()) && zq3.c(this.b, dVar.b);
            }

            public int hashCode() {
                return (a().hashCode() * 31) + this.b.hashCode();
            }

            public String toString() {
                return "Success(painter=" + a() + ", result=" + this.b + ')';
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract Painter a();

        private b() {
        }
    }

    public static final class c implements dg8 {
        public c() {
        }

        @Override // defpackage.dg8
        public void a(Drawable drawable) {
        }

        @Override // defpackage.dg8
        public void b(Drawable drawable) {
            AsyncImagePainter.this.Q(new b.c(drawable != null ? AsyncImagePainter.this.N(drawable) : null));
        }

        @Override // defpackage.dg8
        public void c(Drawable drawable) {
        }
    }

    public AsyncImagePainter(vg3 vg3Var, ImageLoader imageLoader) {
        b.a aVar = b.a.a;
        this.l = aVar;
        this.n = H;
        this.s = ContentScale.a.e();
        this.t = fv1.p.b();
        this.w = b0.e(aVar, null, 2, null);
        this.x = b0.e(vg3Var, null, 2, null);
        this.y = b0.e(imageLoader, null, 2, null);
    }

    private final void A(float f) {
        this.j.setValue(Float.valueOf(f));
    }

    private final void B(qn0 qn0Var) {
        this.k.setValue(qn0Var);
    }

    private final void G(Painter painter) {
        this.i.setValue(painter);
    }

    private final void J(b bVar) {
        this.w.setValue(bVar);
    }

    private final void L(Painter painter) {
        this.m = painter;
        G(painter);
    }

    private final void M(b bVar) {
        this.l = bVar;
        J(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Painter N(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? v80.b(AbstractC0565if.c(((BitmapDrawable) drawable).getBitmap()), 0L, 0L, this.t, 6, null) : drawable instanceof ColorDrawable ? new ao0(wn0.b(((ColorDrawable) drawable).getColor()), null) : new DrawablePainter(drawable.mutate());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b O(xg3 xg3Var) {
        if (xg3Var instanceof cc8) {
            cc8 cc8Var = (cc8) xg3Var;
            return new b.d(N(cc8Var.a()), cc8Var);
        }
        if (!(xg3Var instanceof a32)) {
            throw new NoWhenBranchMatchedException();
        }
        Drawable a2 = xg3Var.a();
        return new b.C0135b(a2 != null ? N(a2) : null, (a32) xg3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final vg3 P(vg3 vg3Var) {
        vg3.a p = vg3.R(vg3Var, null, 1, null).p(new c());
        if (vg3Var.q().m() == null) {
            p.o(new fu7() { // from class: coil.compose.AsyncImagePainter$updateRequest$2$1
                @Override // defpackage.fu7
                public final Object r(by0 by0Var) {
                    final MutableStateFlow mutableStateFlow;
                    mutableStateFlow = AsyncImagePainter.this.h;
                    return FlowKt.first(new Flow() { // from class: coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1

                        /* renamed from: coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2 implements FlowCollector {
                            final /* synthetic */ FlowCollector a;

                            @fc1(c = "coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2", f = "AsyncImagePainter.kt", l = {225}, m = "emit")
                            /* renamed from: coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(by0 by0Var) {
                                    super(by0Var);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= RecyclerView.UNDEFINED_DURATION;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.a = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object emit(java.lang.Object r5, defpackage.by0 r6) {
                                /*
                                    r4 = this;
                                    boolean r0 = r6 instanceof coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1
                                    if (r0 == 0) goto L13
                                    r0 = r6
                                    coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1 r0 = (coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1) r0
                                    int r1 = r0.label
                                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                    r3 = r1 & r2
                                    if (r3 == 0) goto L13
                                    int r1 = r1 - r2
                                    r0.label = r1
                                    goto L18
                                L13:
                                    coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1 r0 = new coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1
                                    r0.<init>(r6)
                                L18:
                                    java.lang.Object r6 = r0.result
                                    java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                                    int r2 = r0.label
                                    r3 = 1
                                    if (r2 == 0) goto L31
                                    if (r2 != r3) goto L29
                                    kotlin.f.b(r6)
                                    goto L4b
                                L29:
                                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                                    java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                                    r4.<init>(r5)
                                    throw r4
                                L31:
                                    kotlin.f.b(r6)
                                    kotlinx.coroutines.flow.FlowCollector r4 = r4.a
                                    zt7 r5 = (defpackage.zt7) r5
                                    long r5 = r5.m()
                                    au7 r5 = defpackage.iu.b(r5)
                                    if (r5 == 0) goto L4b
                                    r0.label = r3
                                    java.lang.Object r4 = r4.emit(r5, r0)
                                    if (r4 != r1) goto L4b
                                    return r1
                                L4b:
                                    ww8 r4 = defpackage.ww8.a
                                    return r4
                                */
                                throw new UnsupportedOperationException("Method not decompiled: coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                            }
                        }

                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector flowCollector, by0 by0Var2) {
                            Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), by0Var2);
                            return collect == a.h() ? collect : ww8.a;
                        }
                    }, by0Var);
                }
            });
        }
        if (vg3Var.q().l() == null) {
            p.n(UtilsKt.g(this.s));
        }
        if (vg3Var.q().k() != Precision.EXACT) {
            p.h(Precision.INEXACT);
        }
        return p.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(b bVar) {
        b bVar2 = this.l;
        b bVar3 = (b) this.n.invoke(bVar);
        M(bVar3);
        Painter z = z(bVar2, bVar3);
        if (z == null) {
            z = bVar3.a();
        }
        L(z);
        if (this.g != null && bVar2.a() != bVar3.a()) {
            Object a2 = bVar2.a();
            ov6 ov6Var = a2 instanceof ov6 ? (ov6) a2 : null;
            if (ov6Var != null) {
                ov6Var.e();
            }
            Object a3 = bVar3.a();
            ov6 ov6Var2 = a3 instanceof ov6 ? (ov6) a3 : null;
            if (ov6Var2 != null) {
                ov6Var2.c();
            }
        }
        ss2 ss2Var = this.r;
        if (ss2Var != null) {
            ss2Var.invoke(bVar3);
        }
    }

    private final void t() {
        CoroutineScope coroutineScope = this.g;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        }
        this.g = null;
    }

    private final float u() {
        return ((Number) this.j.getValue()).floatValue();
    }

    private final qn0 v() {
        return (qn0) this.k.getValue();
    }

    private final Painter x() {
        return (Painter) this.i.getValue();
    }

    private final o31 z(b bVar, b bVar2) {
        xg3 d;
        iu.a aVar;
        if (!(bVar2 instanceof b.d)) {
            if (bVar2 instanceof b.C0135b) {
                d = ((b.C0135b) bVar2).d();
            }
            return null;
        }
        d = ((b.d) bVar2).b();
        jr8.a P = d.b().P();
        aVar = iu.a;
        jr8 a2 = P.a(aVar, d);
        if (a2 instanceof p31) {
            p31 p31Var = (p31) a2;
            return new o31(bVar instanceof b.c ? bVar.a() : null, bVar2.a(), this.s, p31Var.b(), ((d instanceof cc8) && ((cc8) d).d()) ? false : true, p31Var.c());
        }
        return null;
    }

    public final void C(ContentScale contentScale) {
        this.s = contentScale;
    }

    public final void D(int i) {
        this.t = i;
    }

    public final void E(ImageLoader imageLoader) {
        this.y.setValue(imageLoader);
    }

    public final void F(ss2 ss2Var) {
        this.r = ss2Var;
    }

    public final void H(boolean z) {
        this.u = z;
    }

    public final void I(vg3 vg3Var) {
        this.x.setValue(vg3Var);
    }

    public final void K(ss2 ss2Var) {
        this.n = ss2Var;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean a(float f) {
        A(f);
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean b(qn0 qn0Var) {
        B(qn0Var);
        return true;
    }

    @Override // defpackage.ov6
    public void c() {
        if (this.g != null) {
            return;
        }
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain().getImmediate()));
        this.g = CoroutineScope;
        Object obj = this.m;
        ov6 ov6Var = obj instanceof ov6 ? (ov6) obj : null;
        if (ov6Var != null) {
            ov6Var.c();
        }
        if (!this.u) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new AsyncImagePainter$onRemembered$1(this, null), 3, null);
        } else {
            Drawable F = vg3.R(y(), null, 1, null).e(w().a()).a().F();
            Q(new b.c(F != null ? N(F) : null));
        }
    }

    @Override // defpackage.ov6
    public void d() {
        t();
        Object obj = this.m;
        ov6 ov6Var = obj instanceof ov6 ? (ov6) obj : null;
        if (ov6Var != null) {
            ov6Var.d();
        }
    }

    @Override // defpackage.ov6
    public void e() {
        t();
        Object obj = this.m;
        ov6 ov6Var = obj instanceof ov6 ? (ov6) obj : null;
        if (ov6Var != null) {
            ov6Var.e();
        }
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public long k() {
        Painter x = x();
        return x != null ? x.k() : zt7.b.a();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected void m(fv1 fv1Var) {
        this.h.setValue(zt7.c(fv1Var.b()));
        Painter x = x();
        if (x != null) {
            x.j(fv1Var, fv1Var.b(), u(), v());
        }
    }

    public final ImageLoader w() {
        return (ImageLoader) this.y.getValue();
    }

    public final vg3 y() {
        return (vg3) this.x.getValue();
    }
}
