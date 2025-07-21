package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import coil.memory.MemoryCache;
import coil.request.CachePolicy;
import coil.size.Precision;
import coil.size.Scale;
import coil.size.ViewSizeResolver;
import defpackage.jr8;
import defpackage.p31;
import defpackage.qo5;
import defpackage.uc1;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.Headers;

/* loaded from: classes.dex */
public final class vg3 {
    private final Lifecycle A;
    private final fu7 B;
    private final Scale C;
    private final qo5 D;
    private final MemoryCache.Key E;
    private final Integer F;
    private final Drawable G;
    private final Integer H;
    private final Drawable I;
    private final Integer J;
    private final Drawable K;
    private final kl1 L;
    private final dj1 M;
    private final Context a;
    private final Object b;
    private final dg8 c;
    private final b d;
    private final MemoryCache.Key e;
    private final String f;
    private final Bitmap.Config g;
    private final ColorSpace h;
    private final Precision i;
    private final Pair j;
    private final uc1.a k;
    private final List l;
    private final jr8.a m;
    private final Headers n;
    private final zf8 o;
    private final boolean p;
    private final boolean q;
    private final boolean r;
    private final boolean s;
    private final CachePolicy t;
    private final CachePolicy u;
    private final CachePolicy v;
    private final CoroutineDispatcher w;
    private final CoroutineDispatcher x;
    private final CoroutineDispatcher y;
    private final CoroutineDispatcher z;

    public interface b {
        void a(vg3 vg3Var);

        void b(vg3 vg3Var);

        void c(vg3 vg3Var, a32 a32Var);

        void d(vg3 vg3Var, cc8 cc8Var);
    }

    public /* synthetic */ vg3(Context context, Object obj, dg8 dg8Var, b bVar, MemoryCache.Key key, String str, Bitmap.Config config, ColorSpace colorSpace, Precision precision, Pair pair, uc1.a aVar, List list, jr8.a aVar2, Headers headers, zf8 zf8Var, boolean z, boolean z2, boolean z3, boolean z4, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, CoroutineDispatcher coroutineDispatcher4, Lifecycle lifecycle, fu7 fu7Var, Scale scale, qo5 qo5Var, MemoryCache.Key key2, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, kl1 kl1Var, dj1 dj1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, obj, dg8Var, bVar, key, str, config, colorSpace, precision, pair, aVar, list, aVar2, headers, zf8Var, z, z2, z3, z4, cachePolicy, cachePolicy2, cachePolicy3, coroutineDispatcher, coroutineDispatcher2, coroutineDispatcher3, coroutineDispatcher4, lifecycle, fu7Var, scale, qo5Var, key2, num, drawable, num2, drawable2, num3, drawable3, kl1Var, dj1Var);
    }

    public static /* synthetic */ a R(vg3 vg3Var, Context context, int i, Object obj) {
        if ((i & 1) != 0) {
            context = vg3Var.a;
        }
        return vg3Var.Q(context);
    }

    public final b A() {
        return this.d;
    }

    public final MemoryCache.Key B() {
        return this.e;
    }

    public final CachePolicy C() {
        return this.t;
    }

    public final CachePolicy D() {
        return this.v;
    }

    public final qo5 E() {
        return this.D;
    }

    public final Drawable F() {
        return n.c(this, this.G, this.F, this.M.l());
    }

    public final MemoryCache.Key G() {
        return this.E;
    }

    public final Precision H() {
        return this.i;
    }

    public final boolean I() {
        return this.s;
    }

    public final Scale J() {
        return this.C;
    }

    public final fu7 K() {
        return this.B;
    }

    public final zf8 L() {
        return this.o;
    }

    public final dg8 M() {
        return this.c;
    }

    public final CoroutineDispatcher N() {
        return this.z;
    }

    public final List O() {
        return this.l;
    }

    public final jr8.a P() {
        return this.m;
    }

    public final a Q(Context context) {
        return new a(this, context);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vg3) {
            vg3 vg3Var = (vg3) obj;
            if (zq3.c(this.a, vg3Var.a) && zq3.c(this.b, vg3Var.b) && zq3.c(this.c, vg3Var.c) && zq3.c(this.d, vg3Var.d) && zq3.c(this.e, vg3Var.e) && zq3.c(this.f, vg3Var.f) && this.g == vg3Var.g && zq3.c(this.h, vg3Var.h) && this.i == vg3Var.i && zq3.c(this.j, vg3Var.j) && zq3.c(this.k, vg3Var.k) && zq3.c(this.l, vg3Var.l) && zq3.c(this.m, vg3Var.m) && zq3.c(this.n, vg3Var.n) && zq3.c(this.o, vg3Var.o) && this.p == vg3Var.p && this.q == vg3Var.q && this.r == vg3Var.r && this.s == vg3Var.s && this.t == vg3Var.t && this.u == vg3Var.u && this.v == vg3Var.v && zq3.c(this.w, vg3Var.w) && zq3.c(this.x, vg3Var.x) && zq3.c(this.y, vg3Var.y) && zq3.c(this.z, vg3Var.z) && zq3.c(this.E, vg3Var.E) && zq3.c(this.F, vg3Var.F) && zq3.c(this.G, vg3Var.G) && zq3.c(this.H, vg3Var.H) && zq3.c(this.I, vg3Var.I) && zq3.c(this.J, vg3Var.J) && zq3.c(this.K, vg3Var.K) && zq3.c(this.A, vg3Var.A) && zq3.c(this.B, vg3Var.B) && this.C == vg3Var.C && zq3.c(this.D, vg3Var.D) && zq3.c(this.L, vg3Var.L) && zq3.c(this.M, vg3Var.M)) {
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        return this.p;
    }

    public final boolean h() {
        return this.q;
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        dg8 dg8Var = this.c;
        int hashCode2 = (hashCode + (dg8Var != null ? dg8Var.hashCode() : 0)) * 31;
        b bVar = this.d;
        int hashCode3 = (hashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        MemoryCache.Key key = this.e;
        int hashCode4 = (hashCode3 + (key != null ? key.hashCode() : 0)) * 31;
        String str = this.f;
        int hashCode5 = (((hashCode4 + (str != null ? str.hashCode() : 0)) * 31) + this.g.hashCode()) * 31;
        ColorSpace colorSpace = this.h;
        int hashCode6 = (((hashCode5 + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31) + this.i.hashCode()) * 31;
        Pair pair = this.j;
        int hashCode7 = (hashCode6 + (pair != null ? pair.hashCode() : 0)) * 31;
        uc1.a aVar = this.k;
        int hashCode8 = (((((((((((((((((((((((((((((((((((((((hashCode7 + (aVar != null ? aVar.hashCode() : 0)) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + this.o.hashCode()) * 31) + Boolean.hashCode(this.p)) * 31) + Boolean.hashCode(this.q)) * 31) + Boolean.hashCode(this.r)) * 31) + Boolean.hashCode(this.s)) * 31) + this.t.hashCode()) * 31) + this.u.hashCode()) * 31) + this.v.hashCode()) * 31) + this.w.hashCode()) * 31) + this.x.hashCode()) * 31) + this.y.hashCode()) * 31) + this.z.hashCode()) * 31) + this.A.hashCode()) * 31) + this.B.hashCode()) * 31) + this.C.hashCode()) * 31) + this.D.hashCode()) * 31;
        MemoryCache.Key key2 = this.E;
        int hashCode9 = (hashCode8 + (key2 != null ? key2.hashCode() : 0)) * 31;
        Integer num = this.F;
        int hashCode10 = (hashCode9 + (num != null ? num.hashCode() : 0)) * 31;
        Drawable drawable = this.G;
        int hashCode11 = (hashCode10 + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Integer num2 = this.H;
        int hashCode12 = (hashCode11 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Drawable drawable2 = this.I;
        int hashCode13 = (hashCode12 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Integer num3 = this.J;
        int hashCode14 = (hashCode13 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Drawable drawable3 = this.K;
        return ((((hashCode14 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31) + this.L.hashCode()) * 31) + this.M.hashCode();
    }

    public final boolean i() {
        return this.r;
    }

    public final Bitmap.Config j() {
        return this.g;
    }

    public final ColorSpace k() {
        return this.h;
    }

    public final Context l() {
        return this.a;
    }

    public final Object m() {
        return this.b;
    }

    public final CoroutineDispatcher n() {
        return this.y;
    }

    public final uc1.a o() {
        return this.k;
    }

    public final dj1 p() {
        return this.M;
    }

    public final kl1 q() {
        return this.L;
    }

    public final String r() {
        return this.f;
    }

    public final CachePolicy s() {
        return this.u;
    }

    public final Drawable t() {
        return n.c(this, this.I, this.H, this.M.f());
    }

    public final Drawable u() {
        return n.c(this, this.K, this.J, this.M.g());
    }

    public final CoroutineDispatcher v() {
        return this.x;
    }

    public final Pair w() {
        return this.j;
    }

    public final Headers x() {
        return this.n;
    }

    public final CoroutineDispatcher y() {
        return this.w;
    }

    public final Lifecycle z() {
        return this.A;
    }

    private vg3(Context context, Object obj, dg8 dg8Var, b bVar, MemoryCache.Key key, String str, Bitmap.Config config, ColorSpace colorSpace, Precision precision, Pair pair, uc1.a aVar, List list, jr8.a aVar2, Headers headers, zf8 zf8Var, boolean z, boolean z2, boolean z3, boolean z4, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, CoroutineDispatcher coroutineDispatcher4, Lifecycle lifecycle, fu7 fu7Var, Scale scale, qo5 qo5Var, MemoryCache.Key key2, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, kl1 kl1Var, dj1 dj1Var) {
        this.a = context;
        this.b = obj;
        this.c = dg8Var;
        this.d = bVar;
        this.e = key;
        this.f = str;
        this.g = config;
        this.h = colorSpace;
        this.i = precision;
        this.j = pair;
        this.k = aVar;
        this.l = list;
        this.m = aVar2;
        this.n = headers;
        this.o = zf8Var;
        this.p = z;
        this.q = z2;
        this.r = z3;
        this.s = z4;
        this.t = cachePolicy;
        this.u = cachePolicy2;
        this.v = cachePolicy3;
        this.w = coroutineDispatcher;
        this.x = coroutineDispatcher2;
        this.y = coroutineDispatcher3;
        this.z = coroutineDispatcher4;
        this.A = lifecycle;
        this.B = fu7Var;
        this.C = scale;
        this.D = qo5Var;
        this.E = key2;
        this.F = num;
        this.G = drawable;
        this.H = num2;
        this.I = drawable2;
        this.J = num3;
        this.K = drawable3;
        this.L = kl1Var;
        this.M = dj1Var;
    }

    public static final class a {
        private CoroutineDispatcher A;
        private qo5.a B;
        private MemoryCache.Key C;
        private Integer D;
        private Drawable E;
        private Integer F;
        private Drawable G;
        private Integer H;
        private Drawable I;
        private Lifecycle J;
        private fu7 K;
        private Scale L;
        private Lifecycle M;
        private fu7 N;
        private Scale O;
        private final Context a;
        private dj1 b;
        private Object c;
        private dg8 d;
        private b e;
        private MemoryCache.Key f;
        private String g;
        private Bitmap.Config h;
        private ColorSpace i;
        private Precision j;
        private Pair k;
        private uc1.a l;
        private List m;
        private jr8.a n;
        private Headers.Builder o;
        private Map p;
        private boolean q;
        private Boolean r;
        private Boolean s;
        private boolean t;
        private CachePolicy u;
        private CachePolicy v;
        private CachePolicy w;
        private CoroutineDispatcher x;
        private CoroutineDispatcher y;
        private CoroutineDispatcher z;

        public a(Context context) {
            this.a = context;
            this.b = n.b();
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = null;
            this.k = null;
            this.l = null;
            this.m = i.l();
            this.n = null;
            this.o = null;
            this.p = null;
            this.q = true;
            this.r = null;
            this.s = null;
            this.t = true;
            this.u = null;
            this.v = null;
            this.w = null;
            this.x = null;
            this.y = null;
            this.z = null;
            this.A = null;
            this.B = null;
            this.C = null;
            this.D = null;
            this.E = null;
            this.F = null;
            this.G = null;
            this.H = null;
            this.I = null;
            this.J = null;
            this.K = null;
            this.L = null;
            this.M = null;
            this.N = null;
            this.O = null;
        }

        private final void i() {
            this.O = null;
        }

        private final void j() {
            this.M = null;
            this.N = null;
            this.O = null;
        }

        private final Lifecycle k() {
            dg8 dg8Var = this.d;
            Lifecycle c = f.c(dg8Var instanceof lb9 ? ((lb9) dg8Var).getView().getContext() : this.a);
            return c == null ? d13.b : c;
        }

        private final Scale l() {
            View view;
            fu7 fu7Var = this.K;
            View view2 = null;
            ViewSizeResolver viewSizeResolver = fu7Var instanceof ViewSizeResolver ? (ViewSizeResolver) fu7Var : null;
            if (viewSizeResolver == null || (view = viewSizeResolver.getView()) == null) {
                dg8 dg8Var = this.d;
                lb9 lb9Var = dg8Var instanceof lb9 ? (lb9) dg8Var : null;
                if (lb9Var != null) {
                    view2 = lb9Var.getView();
                }
            } else {
                view2 = view;
            }
            return view2 instanceof ImageView ? s.n((ImageView) view2) : Scale.FIT;
        }

        private final fu7 m() {
            ImageView.ScaleType scaleType;
            dg8 dg8Var = this.d;
            if (!(dg8Var instanceof lb9)) {
                return new js1(this.a);
            }
            View view = ((lb9) dg8Var).getView();
            return ((view instanceof ImageView) && ((scaleType = ((ImageView) view).getScaleType()) == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX)) ? gu7.a(au7.d) : jb9.b(view, false, 2, null);
        }

        public final vg3 a() {
            Context context = this.a;
            Object obj = this.c;
            if (obj == null) {
                obj = xa5.a;
            }
            Object obj2 = obj;
            dg8 dg8Var = this.d;
            b bVar = this.e;
            MemoryCache.Key key = this.f;
            String str = this.g;
            Bitmap.Config config = this.h;
            if (config == null) {
                config = this.b.c();
            }
            Bitmap.Config config2 = config;
            ColorSpace colorSpace = this.i;
            Precision precision = this.j;
            if (precision == null) {
                precision = this.b.m();
            }
            Precision precision2 = precision;
            Pair pair = this.k;
            uc1.a aVar = this.l;
            List list = this.m;
            jr8.a aVar2 = this.n;
            if (aVar2 == null) {
                aVar2 = this.b.o();
            }
            jr8.a aVar3 = aVar2;
            Headers.Builder builder = this.o;
            Headers x = s.x(builder != null ? builder.build() : null);
            Map map = this.p;
            zf8 w = s.w(map != null ? zf8.b.a(map) : null);
            boolean z = this.q;
            Boolean bool = this.r;
            boolean booleanValue = bool != null ? bool.booleanValue() : this.b.a();
            Boolean bool2 = this.s;
            boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : this.b.b();
            boolean z2 = this.t;
            CachePolicy cachePolicy = this.u;
            if (cachePolicy == null) {
                cachePolicy = this.b.j();
            }
            CachePolicy cachePolicy2 = cachePolicy;
            CachePolicy cachePolicy3 = this.v;
            if (cachePolicy3 == null) {
                cachePolicy3 = this.b.e();
            }
            CachePolicy cachePolicy4 = cachePolicy3;
            CachePolicy cachePolicy5 = this.w;
            if (cachePolicy5 == null) {
                cachePolicy5 = this.b.k();
            }
            CachePolicy cachePolicy6 = cachePolicy5;
            CoroutineDispatcher coroutineDispatcher = this.x;
            if (coroutineDispatcher == null) {
                coroutineDispatcher = this.b.i();
            }
            CoroutineDispatcher coroutineDispatcher2 = coroutineDispatcher;
            CoroutineDispatcher coroutineDispatcher3 = this.y;
            if (coroutineDispatcher3 == null) {
                coroutineDispatcher3 = this.b.h();
            }
            CoroutineDispatcher coroutineDispatcher4 = coroutineDispatcher3;
            CoroutineDispatcher coroutineDispatcher5 = this.z;
            if (coroutineDispatcher5 == null) {
                coroutineDispatcher5 = this.b.d();
            }
            CoroutineDispatcher coroutineDispatcher6 = coroutineDispatcher5;
            CoroutineDispatcher coroutineDispatcher7 = this.A;
            if (coroutineDispatcher7 == null) {
                coroutineDispatcher7 = this.b.n();
            }
            CoroutineDispatcher coroutineDispatcher8 = coroutineDispatcher7;
            Lifecycle lifecycle = this.J;
            if (lifecycle == null && (lifecycle = this.M) == null) {
                lifecycle = k();
            }
            Lifecycle lifecycle2 = lifecycle;
            fu7 fu7Var = this.K;
            if (fu7Var == null && (fu7Var = this.N) == null) {
                fu7Var = m();
            }
            fu7 fu7Var2 = fu7Var;
            Scale scale = this.L;
            if (scale == null && (scale = this.O) == null) {
                scale = l();
            }
            Scale scale2 = scale;
            qo5.a aVar4 = this.B;
            return new vg3(context, obj2, dg8Var, bVar, key, str, config2, colorSpace, precision2, pair, aVar, list, aVar3, x, w, z, booleanValue, booleanValue2, z2, cachePolicy2, cachePolicy4, cachePolicy6, coroutineDispatcher2, coroutineDispatcher4, coroutineDispatcher6, coroutineDispatcher8, lifecycle2, fu7Var2, scale2, s.v(aVar4 != null ? aVar4.a() : null), this.C, this.D, this.E, this.F, this.G, this.H, this.I, new kl1(this.J, this.K, this.L, this.x, this.y, this.z, this.A, this.n, this.j, this.h, this.r, this.s, this.u, this.v, this.w), this.b, null);
        }

        public final a b(int i) {
            jr8.a aVar;
            if (i > 0) {
                aVar = new p31.a(i, false, 2, null);
            } else {
                aVar = jr8.a.b;
            }
            q(aVar);
            return this;
        }

        public final a c(boolean z) {
            return b(z ? 100 : 0);
        }

        public final a d(Object obj) {
            this.c = obj;
            return this;
        }

        public final a e(dj1 dj1Var) {
            this.b = dj1Var;
            i();
            return this;
        }

        public final a f(int i) {
            this.F = Integer.valueOf(i);
            this.G = null;
            return this;
        }

        public final a g(int i) {
            this.D = Integer.valueOf(i);
            this.E = null;
            return this;
        }

        public final a h(Precision precision) {
            this.j = precision;
            return this;
        }

        public final a n(Scale scale) {
            this.L = scale;
            return this;
        }

        public final a o(fu7 fu7Var) {
            this.K = fu7Var;
            j();
            return this;
        }

        public final a p(dg8 dg8Var) {
            this.d = dg8Var;
            j();
            return this;
        }

        public final a q(jr8.a aVar) {
            this.n = aVar;
            return this;
        }

        public a(vg3 vg3Var, Context context) {
            this.a = context;
            this.b = vg3Var.p();
            this.c = vg3Var.m();
            this.d = vg3Var.M();
            this.e = vg3Var.A();
            this.f = vg3Var.B();
            this.g = vg3Var.r();
            this.h = vg3Var.q().c();
            this.i = vg3Var.k();
            this.j = vg3Var.q().k();
            this.k = vg3Var.w();
            this.l = vg3Var.o();
            this.m = vg3Var.O();
            this.n = vg3Var.q().o();
            this.o = vg3Var.x().newBuilder();
            this.p = t.x(vg3Var.L().a());
            this.q = vg3Var.g();
            this.r = vg3Var.q().a();
            this.s = vg3Var.q().b();
            this.t = vg3Var.I();
            this.u = vg3Var.q().i();
            this.v = vg3Var.q().e();
            this.w = vg3Var.q().j();
            this.x = vg3Var.q().g();
            this.y = vg3Var.q().f();
            this.z = vg3Var.q().d();
            this.A = vg3Var.q().n();
            this.B = vg3Var.E().f();
            this.C = vg3Var.G();
            this.D = vg3Var.F;
            this.E = vg3Var.G;
            this.F = vg3Var.H;
            this.G = vg3Var.I;
            this.H = vg3Var.J;
            this.I = vg3Var.K;
            this.J = vg3Var.q().h();
            this.K = vg3Var.q().m();
            this.L = vg3Var.q().l();
            if (vg3Var.l() == context) {
                this.M = vg3Var.z();
                this.N = vg3Var.K();
                this.O = vg3Var.J();
            } else {
                this.M = null;
                this.N = null;
                this.O = null;
            }
        }
    }
}
