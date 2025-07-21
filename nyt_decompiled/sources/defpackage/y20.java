package defpackage;

/* loaded from: classes2.dex */
final class y20 implements w20 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    private y20(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static y20 b(yo5 yo5Var) {
        int u = yo5Var.u();
        yo5Var.V(8);
        int u2 = yo5Var.u();
        int u3 = yo5Var.u();
        yo5Var.V(4);
        int u4 = yo5Var.u();
        yo5Var.V(12);
        return new y20(u, u2, u3, u4);
    }

    public boolean a() {
        return (this.b & 16) == 16;
    }

    @Override // defpackage.w20
    public int getType() {
        return 1751742049;
    }
}
