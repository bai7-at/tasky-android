package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;
import java.util.Map;
import kotlin.collections.i;

/* loaded from: classes.dex */
public final class k14 implements j14, sg4 {
    private final l14 a;
    private int b;
    private boolean c;
    private float d;
    private final float e;
    private final boolean f;
    private final List g;
    private final int h;
    private final int i;
    private final int j;
    private final boolean k;
    private final Orientation l;
    private final int m;
    private final int n;
    private final /* synthetic */ sg4 o;

    public k14(l14 l14Var, int i, boolean z, float f, sg4 sg4Var, float f2, boolean z2, List list, int i2, int i3, int i4, boolean z3, Orientation orientation, int i5, int i6) {
        this.a = l14Var;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = f2;
        this.f = z2;
        this.g = list;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = z3;
        this.l = orientation;
        this.m = i5;
        this.n = i6;
        this.o = sg4Var;
    }

    @Override // defpackage.j14
    public long a() {
        return in3.a(getWidth(), getHeight());
    }

    @Override // defpackage.j14
    public int b() {
        return this.m;
    }

    @Override // defpackage.j14
    public Orientation c() {
        return this.l;
    }

    @Override // defpackage.j14
    public int d() {
        return -j();
    }

    @Override // defpackage.sg4
    public void e() {
        this.o.e();
    }

    @Override // defpackage.sg4
    public Map f() {
        return this.o.f();
    }

    @Override // defpackage.j14
    public int g() {
        return this.i;
    }

    @Override // defpackage.sg4
    public int getHeight() {
        return this.o.getHeight();
    }

    @Override // defpackage.sg4
    public int getWidth() {
        return this.o.getWidth();
    }

    @Override // defpackage.j14
    public int h() {
        return this.j;
    }

    @Override // defpackage.j14
    public int i() {
        return this.n;
    }

    @Override // defpackage.j14
    public int j() {
        return this.h;
    }

    @Override // defpackage.j14
    public List k() {
        return this.g;
    }

    public final boolean l() {
        l14 l14Var = this.a;
        return ((l14Var != null ? l14Var.getIndex() : 0) == 0 && this.b == 0) ? false : true;
    }

    public final boolean m() {
        return this.c;
    }

    public final float n() {
        return this.d;
    }

    public final l14 o() {
        return this.a;
    }

    public final int p() {
        return this.b;
    }

    public final float q() {
        return this.e;
    }

    public final boolean r(int i, boolean z) {
        l14 l14Var;
        boolean z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        if (!this.f && !k().isEmpty() && (l14Var = this.a) != null) {
            int k = l14Var.k();
            int i2 = this.b - i;
            if (i2 >= 0 && i2 < k) {
                l14 l14Var2 = (l14) i.k0(k());
                l14 l14Var3 = (l14) i.w0(k());
                if (!l14Var2.g() && !l14Var3.g() && (i >= 0 ? Math.min(j() - l14Var2.b(), g() - l14Var3.b()) > i : Math.min((l14Var2.b() + l14Var2.k()) - j(), (l14Var3.b() + l14Var3.k()) - g()) > (-i))) {
                    this.b -= i;
                    List k2 = k();
                    int size = k2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((l14) k2.get(i3)).c(i, z);
                    }
                    this.d = i;
                    z2 = true;
                    z2 = true;
                    z2 = true;
                    if (!this.c && i > 0) {
                        this.c = true;
                    }
                }
            }
        }
        return z2;
    }
}
