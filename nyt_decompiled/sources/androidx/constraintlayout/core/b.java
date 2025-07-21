package androidx.constraintlayout.core;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.d;
import com.nytimes.android.api.cms.Tag;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class b implements d.a {
    public a e;
    SolverVariable a = null;
    float b = 0.0f;
    boolean c = false;
    ArrayList d = new ArrayList();
    boolean f = false;

    public interface a {
        boolean a(SolverVariable solverVariable);

        SolverVariable b(int i);

        void c(SolverVariable solverVariable, float f, boolean z);

        void clear();

        void d();

        float e(SolverVariable solverVariable, boolean z);

        int f();

        float g(b bVar, boolean z);

        void h(SolverVariable solverVariable, float f);

        float i(int i);

        float j(SolverVariable solverVariable);

        void k(float f);
    }

    public b() {
    }

    private boolean u(SolverVariable solverVariable, d dVar) {
        return solverVariable.m <= 1;
    }

    private SolverVariable w(boolean[] zArr, SolverVariable solverVariable) {
        SolverVariable.Type type2;
        int f = this.e.f();
        SolverVariable solverVariable2 = null;
        float f2 = 0.0f;
        for (int i = 0; i < f; i++) {
            float i2 = this.e.i(i);
            if (i2 < 0.0f) {
                SolverVariable b = this.e.b(i);
                if ((zArr == null || !zArr[b.c]) && b != solverVariable && (((type2 = b.j) == SolverVariable.Type.SLACK || type2 == SolverVariable.Type.ERROR) && i2 < f2)) {
                    f2 = i2;
                    solverVariable2 = b;
                }
            }
        }
        return solverVariable2;
    }

    public void A(d dVar, SolverVariable solverVariable, boolean z) {
        if (solverVariable == null || !solverVariable.g) {
            return;
        }
        this.b += solverVariable.f * this.e.j(solverVariable);
        this.e.e(solverVariable, z);
        if (z) {
            solverVariable.d(this);
        }
        if (d.t && this.e.f() == 0) {
            this.f = true;
            dVar.a = true;
        }
    }

    public void B(d dVar, b bVar, boolean z) {
        this.b += bVar.b * this.e.g(bVar, z);
        if (z) {
            bVar.a.d(this);
        }
        if (d.t && this.a != null && this.e.f() == 0) {
            this.f = true;
            dVar.a = true;
        }
    }

    public void C(d dVar, SolverVariable solverVariable, boolean z) {
        if (solverVariable == null || !solverVariable.n) {
            return;
        }
        float j = this.e.j(solverVariable);
        this.b += solverVariable.s * j;
        this.e.e(solverVariable, z);
        if (z) {
            solverVariable.d(this);
        }
        this.e.c(dVar.n.d[solverVariable.r], j, z);
        if (d.t && this.e.f() == 0) {
            this.f = true;
            dVar.a = true;
        }
    }

    public void D(d dVar) {
        if (dVar.g.length == 0) {
            return;
        }
        boolean z = false;
        while (!z) {
            int f = this.e.f();
            for (int i = 0; i < f; i++) {
                SolverVariable b = this.e.b(i);
                if (b.d != -1 || b.g || b.n) {
                    this.d.add(b);
                }
            }
            int size = this.d.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    SolverVariable solverVariable = (SolverVariable) this.d.get(i2);
                    if (solverVariable.g) {
                        A(dVar, solverVariable, true);
                    } else if (solverVariable.n) {
                        C(dVar, solverVariable, true);
                    } else {
                        B(dVar, dVar.g[solverVariable.d], true);
                    }
                }
                this.d.clear();
            } else {
                z = true;
            }
        }
        if (d.t && this.a != null && this.e.f() == 0) {
            this.f = true;
            dVar.a = true;
        }
    }

    @Override // androidx.constraintlayout.core.d.a
    public void a(d.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.a = null;
            this.e.clear();
            for (int i = 0; i < bVar.e.f(); i++) {
                this.e.c(bVar.e.b(i), bVar.e.i(i), true);
            }
        }
    }

    @Override // androidx.constraintlayout.core.d.a
    public SolverVariable b(d dVar, boolean[] zArr) {
        return w(zArr, null);
    }

    @Override // androidx.constraintlayout.core.d.a
    public void c(SolverVariable solverVariable) {
        int i = solverVariable.e;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.e.h(solverVariable, f);
    }

    @Override // androidx.constraintlayout.core.d.a
    public void clear() {
        this.e.clear();
        this.a = null;
        this.b = 0.0f;
    }

    public b d(d dVar, int i) {
        this.e.h(dVar.o(i, "ep"), 1.0f);
        this.e.h(dVar.o(i, Tag.EM), -1.0f);
        return this;
    }

    b e(SolverVariable solverVariable, int i) {
        this.e.h(solverVariable, i);
        return this;
    }

    boolean f(d dVar) {
        boolean z;
        SolverVariable g = g(dVar);
        if (g == null) {
            z = true;
        } else {
            x(g);
            z = false;
        }
        if (this.e.f() == 0) {
            this.f = true;
        }
        return z;
    }

    SolverVariable g(d dVar) {
        boolean u;
        boolean u2;
        int f = this.e.f();
        SolverVariable solverVariable = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        SolverVariable solverVariable2 = null;
        for (int i = 0; i < f; i++) {
            float i2 = this.e.i(i);
            SolverVariable b = this.e.b(i);
            if (b.j == SolverVariable.Type.UNRESTRICTED) {
                if (solverVariable == null) {
                    u2 = u(b, dVar);
                } else if (f2 > i2) {
                    u2 = u(b, dVar);
                } else if (!z && u(b, dVar)) {
                    f2 = i2;
                    solverVariable = b;
                    z = true;
                }
                z = u2;
                f2 = i2;
                solverVariable = b;
            } else if (solverVariable == null && i2 < 0.0f) {
                if (solverVariable2 == null) {
                    u = u(b, dVar);
                } else if (f3 > i2) {
                    u = u(b, dVar);
                } else if (!z2 && u(b, dVar)) {
                    f3 = i2;
                    solverVariable2 = b;
                    z2 = true;
                }
                z2 = u;
                f3 = i2;
                solverVariable2 = b;
            }
        }
        return solverVariable != null ? solverVariable : solverVariable2;
    }

    @Override // androidx.constraintlayout.core.d.a
    public SolverVariable getKey() {
        return this.a;
    }

    b h(SolverVariable solverVariable, SolverVariable solverVariable2, int i, float f, SolverVariable solverVariable3, SolverVariable solverVariable4, int i2) {
        if (solverVariable2 == solverVariable3) {
            this.e.h(solverVariable, 1.0f);
            this.e.h(solverVariable4, 1.0f);
            this.e.h(solverVariable2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.e.h(solverVariable, 1.0f);
            this.e.h(solverVariable2, -1.0f);
            this.e.h(solverVariable3, -1.0f);
            this.e.h(solverVariable4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            this.e.h(solverVariable, -1.0f);
            this.e.h(solverVariable2, 1.0f);
            this.b = i;
        } else if (f >= 1.0f) {
            this.e.h(solverVariable4, -1.0f);
            this.e.h(solverVariable3, 1.0f);
            this.b = -i2;
        } else {
            float f2 = 1.0f - f;
            this.e.h(solverVariable, f2 * 1.0f);
            this.e.h(solverVariable2, f2 * (-1.0f));
            this.e.h(solverVariable3, (-1.0f) * f);
            this.e.h(solverVariable4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                this.b = ((-i) * f2) + (i2 * f);
            }
        }
        return this;
    }

    b i(SolverVariable solverVariable, int i) {
        this.a = solverVariable;
        float f = i;
        solverVariable.f = f;
        this.b = f;
        this.f = true;
        return this;
    }

    @Override // androidx.constraintlayout.core.d.a
    public boolean isEmpty() {
        return this.a == null && this.b == 0.0f && this.e.f() == 0;
    }

    b j(SolverVariable solverVariable, SolverVariable solverVariable2, float f) {
        this.e.h(solverVariable, -1.0f);
        this.e.h(solverVariable2, f);
        return this;
    }

    public b k(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f) {
        this.e.h(solverVariable, -1.0f);
        this.e.h(solverVariable2, 1.0f);
        this.e.h(solverVariable3, f);
        this.e.h(solverVariable4, -f);
        return this;
    }

    public b l(float f, float f2, float f3, SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4) {
        this.b = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.e.h(solverVariable, 1.0f);
            this.e.h(solverVariable2, -1.0f);
            this.e.h(solverVariable4, 1.0f);
            this.e.h(solverVariable3, -1.0f);
        } else if (f == 0.0f) {
            this.e.h(solverVariable, 1.0f);
            this.e.h(solverVariable2, -1.0f);
        } else if (f3 == 0.0f) {
            this.e.h(solverVariable3, 1.0f);
            this.e.h(solverVariable4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.e.h(solverVariable, 1.0f);
            this.e.h(solverVariable2, -1.0f);
            this.e.h(solverVariable4, f4);
            this.e.h(solverVariable3, -f4);
        }
        return this;
    }

    public b m(SolverVariable solverVariable, int i) {
        if (i < 0) {
            this.b = i * (-1);
            this.e.h(solverVariable, 1.0f);
        } else {
            this.b = i;
            this.e.h(solverVariable, -1.0f);
        }
        return this;
    }

    public b n(SolverVariable solverVariable, SolverVariable solverVariable2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (z) {
            this.e.h(solverVariable, 1.0f);
            this.e.h(solverVariable2, -1.0f);
        } else {
            this.e.h(solverVariable, -1.0f);
            this.e.h(solverVariable2, 1.0f);
        }
        return this;
    }

    public b o(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (z) {
            this.e.h(solverVariable, 1.0f);
            this.e.h(solverVariable2, -1.0f);
            this.e.h(solverVariable3, -1.0f);
        } else {
            this.e.h(solverVariable, -1.0f);
            this.e.h(solverVariable2, 1.0f);
            this.e.h(solverVariable3, 1.0f);
        }
        return this;
    }

    public b p(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (z) {
            this.e.h(solverVariable, 1.0f);
            this.e.h(solverVariable2, -1.0f);
            this.e.h(solverVariable3, 1.0f);
        } else {
            this.e.h(solverVariable, -1.0f);
            this.e.h(solverVariable2, 1.0f);
            this.e.h(solverVariable3, -1.0f);
        }
        return this;
    }

    public b q(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f) {
        this.e.h(solverVariable3, 0.5f);
        this.e.h(solverVariable4, 0.5f);
        this.e.h(solverVariable, -0.5f);
        this.e.h(solverVariable2, -0.5f);
        this.b = -f;
        return this;
    }

    void r() {
        float f = this.b;
        if (f < 0.0f) {
            this.b = f * (-1.0f);
            this.e.d();
        }
    }

    boolean s() {
        SolverVariable solverVariable = this.a;
        return solverVariable != null && (solverVariable.j == SolverVariable.Type.UNRESTRICTED || this.b >= 0.0f);
    }

    boolean t(SolverVariable solverVariable) {
        return this.e.a(solverVariable);
    }

    public String toString() {
        return z();
    }

    public SolverVariable v(SolverVariable solverVariable) {
        return w(null, solverVariable);
    }

    void x(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.a;
        if (solverVariable2 != null) {
            this.e.h(solverVariable2, -1.0f);
            this.a.d = -1;
            this.a = null;
        }
        float e = this.e.e(solverVariable, true) * (-1.0f);
        this.a = solverVariable;
        if (e == 1.0f) {
            return;
        }
        this.b /= e;
        this.e.k(e);
    }

    public void y() {
        this.a = null;
        this.e.clear();
        this.b = 0.0f;
        this.f = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.String z() {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.b.z():java.lang.String");
    }

    public b(c cVar) {
        this.e = new androidx.constraintlayout.core.a(this, cVar);
    }
}
