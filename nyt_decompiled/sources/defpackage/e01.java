package defpackage;

import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes.dex */
public abstract class e01 implements no7 {
    private final i01 a;
    private final i01 b;
    private final i01 c;
    private final i01 d;

    public e01(i01 i01Var, i01 i01Var2, i01 i01Var3, i01 i01Var4) {
        this.a = i01Var;
        this.b = i01Var2;
        this.c = i01Var3;
        this.d = i01Var4;
    }

    public static /* synthetic */ e01 d(e01 e01Var, i01 i01Var, i01 i01Var2, i01 i01Var3, i01 i01Var4, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i & 1) != 0) {
            i01Var = e01Var.a;
        }
        if ((i & 2) != 0) {
            i01Var2 = e01Var.b;
        }
        if ((i & 4) != 0) {
            i01Var3 = e01Var.c;
        }
        if ((i & 8) != 0) {
            i01Var4 = e01Var.d;
        }
        return e01Var.c(i01Var, i01Var2, i01Var3, i01Var4);
    }

    @Override // defpackage.no7
    public final el5 a(long j, LayoutDirection layoutDirection, fm1 fm1Var) {
        float a = this.a.a(j, fm1Var);
        float a2 = this.b.a(j, fm1Var);
        float a3 = this.c.a(j, fm1Var);
        float a4 = this.d.a(j, fm1Var);
        float h = zt7.h(j);
        float f = a + a4;
        if (f > h) {
            float f2 = h / f;
            a *= f2;
            a4 *= f2;
        }
        float f3 = a4;
        float f4 = a;
        float f5 = a2 + a3;
        if (f5 > h) {
            float f6 = h / f5;
            a2 *= f6;
            a3 *= f6;
        }
        float f7 = a2;
        float f8 = a3;
        if (f4 >= 0.0f && f7 >= 0.0f && f8 >= 0.0f && f3 >= 0.0f) {
            return e(j, f4, f7, f8, f3, layoutDirection);
        }
        throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + f4 + ", topEnd = " + f7 + ", bottomEnd = " + f8 + ", bottomStart = " + f3 + ")!").toString());
    }

    public final e01 b(i01 i01Var) {
        return c(i01Var, i01Var, i01Var, i01Var);
    }

    public abstract e01 c(i01 i01Var, i01 i01Var2, i01 i01Var3, i01 i01Var4);

    public abstract el5 e(long j, float f, float f2, float f3, float f4, LayoutDirection layoutDirection);

    public final i01 f() {
        return this.c;
    }

    public final i01 g() {
        return this.d;
    }

    public final i01 h() {
        return this.b;
    }

    public final i01 i() {
        return this.a;
    }
}
