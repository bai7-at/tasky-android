package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;
import java.util.Map;
import kotlin.collections.i;

/* loaded from: classes.dex */
public final class on5 implements ln5, sg4 {
    private final List a;
    private final int b;
    private final int c;
    private final int d;
    private final Orientation e;
    private final int f;
    private final int g;
    private final boolean h;
    private final int i;
    private final ug4 j;
    private final ug4 k;
    private float l;
    private int m;
    private boolean n;
    private final boolean o;
    private final /* synthetic */ sg4 p;

    public on5(List list, int i, int i2, int i3, Orientation orientation, int i4, int i5, boolean z, int i6, ug4 ug4Var, ug4 ug4Var2, float f, int i7, boolean z2, sg4 sg4Var, boolean z3) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = orientation;
        this.f = i4;
        this.g = i5;
        this.h = z;
        this.i = i6;
        this.j = ug4Var;
        this.k = ug4Var2;
        this.l = f;
        this.m = i7;
        this.n = z2;
        this.o = z3;
        this.p = sg4Var;
    }

    @Override // defpackage.ln5
    public long a() {
        return in3.a(getWidth(), getHeight());
    }

    @Override // defpackage.ln5
    public int b() {
        return this.d;
    }

    @Override // defpackage.ln5
    public Orientation c() {
        return this.e;
    }

    @Override // defpackage.ln5
    public int d() {
        return -r();
    }

    @Override // defpackage.sg4
    public void e() {
        this.p.e();
    }

    @Override // defpackage.sg4
    public Map f() {
        return this.p.f();
    }

    @Override // defpackage.ln5
    public int g() {
        return this.b;
    }

    @Override // defpackage.sg4
    public int getHeight() {
        return this.p.getHeight();
    }

    @Override // defpackage.sg4
    public int getWidth() {
        return this.p.getWidth();
    }

    @Override // defpackage.ln5
    public int h() {
        return this.i;
    }

    @Override // defpackage.ln5
    public List i() {
        return this.a;
    }

    @Override // defpackage.ln5
    public int j() {
        return this.c;
    }

    public final boolean k() {
        ug4 ug4Var = this.j;
        return ((ug4Var != null ? ug4Var.getIndex() : 0) == 0 && this.m == 0) ? false : true;
    }

    public final boolean l() {
        return this.n;
    }

    public final ug4 m() {
        return this.k;
    }

    public final float n() {
        return this.l;
    }

    public final ug4 o() {
        return this.j;
    }

    public final int p() {
        return this.m;
    }

    public int q() {
        return this.g;
    }

    public int r() {
        return this.f;
    }

    public final boolean s(int i) {
        int i2;
        int g = g() + j();
        boolean z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        if (!this.o && !i().isEmpty() && this.j != null && (i2 = this.m - i) >= 0 && i2 < g) {
            float f = g != 0 ? i / g : 0.0f;
            float f2 = this.l - f;
            if (this.k != null && f2 < 0.5f && f2 > -0.5f) {
                ug4 ug4Var = (ug4) i.k0(i());
                ug4 ug4Var2 = (ug4) i.w0(i());
                if (i >= 0 ? Math.min(r() - ug4Var.b(), q() - ug4Var2.b()) > i : Math.min((ug4Var.b() + g) - r(), (ug4Var2.b() + g) - q()) > (-i)) {
                    this.l -= f;
                    this.m -= i;
                    List i3 = i();
                    int size = i3.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        ((ug4) i3.get(i4)).a(i);
                    }
                    z = true;
                    z = true;
                    z = true;
                    if (!this.n && i > 0) {
                        this.n = true;
                    }
                }
            }
        }
        return z;
    }
}
