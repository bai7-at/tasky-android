package defpackage;

import com.google.common.collect.ImmutableList;

/* loaded from: classes2.dex */
final class u54 implements w20 {
    public final ImmutableList a;
    private final int b;

    private u54(int i, ImmutableList immutableList) {
        this.b = i;
        this.a = immutableList;
    }

    private static w20 a(int i, int i2, yo5 yo5Var) {
        switch (i) {
            case 1718776947:
                return n38.d(i2, yo5Var);
            case 1751742049:
                return y20.b(yo5Var);
            case 1752331379:
                return z20.c(yo5Var);
            case 1852994675:
                return q38.a(yo5Var);
            default:
                return null;
        }
    }

    public static u54 c(int i, yo5 yo5Var) {
        ImmutableList.a aVar = new ImmutableList.a();
        int g = yo5Var.g();
        int i2 = -2;
        while (yo5Var.a() > 8) {
            int u = yo5Var.u();
            int f = yo5Var.f() + yo5Var.u();
            yo5Var.T(f);
            w20 c = u == 1414744396 ? c(yo5Var.u(), yo5Var) : a(u, i2, yo5Var);
            if (c != null) {
                if (c.getType() == 1752331379) {
                    i2 = ((z20) c).b();
                }
                aVar.a(c);
            }
            yo5Var.U(f);
            yo5Var.T(g);
        }
        return new u54(i, aVar.k());
    }

    public w20 b(Class cls) {
        gx8 it2 = this.a.iterator();
        while (it2.hasNext()) {
            w20 w20Var = (w20) it2.next();
            if (w20Var.getClass() == cls) {
                return w20Var;
            }
        }
        return null;
    }

    @Override // defpackage.w20
    public int getType() {
        return this.b;
    }
}
