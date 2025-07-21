package defpackage;

import androidx.compose.foundation.lazy.layout.LazyLayoutAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimationKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.l;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class l14 implements g14 {
    private final int a;
    private final List b;
    private final boolean c;
    private final Alignment.b d;
    private final Alignment.c e;
    private final LayoutDirection f;
    private final boolean g;
    private final int h;
    private final int i;
    private final int j;
    private final long k;
    private final Object l;
    private final Object m;
    private final e14 n;
    private int o;
    private final int p;
    private final int q;
    private final int r;
    private boolean s;
    private int t;
    private int u;
    private int v;
    private final int[] w;

    public /* synthetic */ l14(int i, List list, boolean z, Alignment.b bVar, Alignment.c cVar, LayoutDirection layoutDirection, boolean z2, int i2, int i3, int i4, long j, Object obj, Object obj2, e14 e14Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, z, bVar, cVar, layoutDirection, z2, i2, i3, i4, j, obj, obj2, e14Var);
    }

    private final int e(long j) {
        return this.c ? vm3.k(j) : vm3.j(j);
    }

    private final int f(l lVar) {
        return this.c ? lVar.v0() : lVar.F0();
    }

    @Override // defpackage.g14
    public int a() {
        return this.p;
    }

    @Override // defpackage.g14
    public int b() {
        return this.o;
    }

    public final void c(int i, boolean z) {
        if (this.s) {
            return;
        }
        this.o = b() + i;
        int length = this.w.length;
        for (int i2 = 0; i2 < length; i2++) {
            boolean z2 = this.c;
            if ((z2 && i2 % 2 == 1) || (!z2 && i2 % 2 == 0)) {
                int[] iArr = this.w;
                iArr[i2] = iArr[i2] + i;
            }
        }
        if (z) {
            int j = j();
            for (int i3 = 0; i3 < j; i3++) {
                LazyLayoutAnimation a = this.n.a(getKey(), i3);
                if (a != null) {
                    long n = a.n();
                    int j2 = this.c ? vm3.j(n) : Integer.valueOf(vm3.j(n) + i).intValue();
                    boolean z3 = this.c;
                    int k = vm3.k(n);
                    if (z3) {
                        k += i;
                    }
                    a.x(wm3.a(j2, k));
                }
            }
        }
    }

    public final int d() {
        return this.r;
    }

    public final boolean g() {
        return this.s;
    }

    @Override // defpackage.g14
    public int getIndex() {
        return this.a;
    }

    @Override // defpackage.g14
    public Object getKey() {
        return this.l;
    }

    public final long h(int i) {
        int[] iArr = this.w;
        int i2 = i * 2;
        return wm3.a(iArr[i2], iArr[i2 + 1]);
    }

    public final Object i(int i) {
        return ((l) this.b.get(i)).d();
    }

    public final int j() {
        return this.b.size();
    }

    public final int k() {
        return this.q;
    }

    public final boolean l() {
        return this.c;
    }

    public final void m(l.a aVar, boolean z) {
        ss2 b;
        if (this.t == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first");
        }
        int j = j();
        for (int i = 0; i < j; i++) {
            l lVar = (l) this.b.get(i);
            int f = this.u - f(lVar);
            int i2 = this.v;
            long h = h(i);
            LazyLayoutAnimation a = this.n.a(getKey(), i);
            if (a != null) {
                if (z) {
                    a.t(h);
                } else {
                    if (!vm3.i(a.l(), LazyLayoutAnimation.m.a())) {
                        h = a.l();
                    }
                    long m = a.m();
                    long a2 = wm3.a(vm3.j(h) + vm3.j(m), vm3.k(h) + vm3.k(m));
                    if ((e(h) <= f && e(a2) <= f) || (e(h) >= i2 && e(a2) >= i2)) {
                        a.j();
                    }
                    h = a2;
                }
                b = a.k();
            } else {
                b = LazyLayoutAnimationKt.b();
            }
            ss2 ss2Var = b;
            if (this.g) {
                h = wm3.a(this.c ? vm3.j(h) : (this.t - vm3.j(h)) - f(lVar), this.c ? (this.t - vm3.k(h)) - f(lVar) : vm3.k(h));
            }
            long j2 = this.k;
            long a3 = wm3.a(vm3.j(h) + vm3.j(j2), vm3.k(h) + vm3.k(j2));
            if (this.c) {
                l.a.t(aVar, lVar, a3, 0.0f, ss2Var, 2, null);
            } else {
                l.a.p(aVar, lVar, a3, 0.0f, ss2Var, 2, null);
            }
        }
    }

    public final void n(int i, int i2, int i3) {
        int F0;
        this.o = i;
        this.t = this.c ? i3 : i2;
        List list = this.b;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            l lVar = (l) list.get(i4);
            int i5 = i4 * 2;
            if (this.c) {
                int[] iArr = this.w;
                Alignment.b bVar = this.d;
                if (bVar == null) {
                    throw new IllegalArgumentException("null horizontalAlignment when isVertical == true");
                }
                iArr[i5] = bVar.a(lVar.F0(), i2, this.f);
                this.w[i5 + 1] = i;
                F0 = lVar.v0();
            } else {
                int[] iArr2 = this.w;
                iArr2[i5] = i;
                int i6 = i5 + 1;
                Alignment.c cVar = this.e;
                if (cVar == null) {
                    throw new IllegalArgumentException("null verticalAlignment when isVertical == false");
                }
                iArr2[i6] = cVar.a(lVar.v0(), i3);
                F0 = lVar.F0();
            }
            i += F0;
        }
        this.u = -this.h;
        this.v = this.t + this.i;
    }

    public final void o(boolean z) {
        this.s = z;
    }

    private l14(int i, List list, boolean z, Alignment.b bVar, Alignment.c cVar, LayoutDirection layoutDirection, boolean z2, int i2, int i3, int i4, long j, Object obj, Object obj2, e14 e14Var) {
        this.a = i;
        this.b = list;
        this.c = z;
        this.d = bVar;
        this.e = cVar;
        this.f = layoutDirection;
        this.g = z2;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = j;
        this.l = obj;
        this.m = obj2;
        this.n = e14Var;
        this.t = RecyclerView.UNDEFINED_DURATION;
        int size = list.size();
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            l lVar = (l) list.get(i7);
            i5 += this.c ? lVar.v0() : lVar.F0();
            i6 = Math.max(i6, !this.c ? lVar.v0() : lVar.F0());
        }
        this.p = i5;
        this.q = uo6.d(a() + this.j, 0);
        this.r = i6;
        this.w = new int[this.b.size() * 2];
    }
}
