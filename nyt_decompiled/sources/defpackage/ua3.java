package defpackage;

import defpackage.yu4;

/* loaded from: classes2.dex */
public class ua3 implements yu4 {
    public static final mk5 b = mk5.f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);
    private final xu4 a;

    public static class a implements zu4 {
        private final xu4 a = new xu4(500);

        @Override // defpackage.zu4
        public yu4 b(lx4 lx4Var) {
            return new ua3(this.a);
        }
    }

    public ua3(xu4 xu4Var) {
        this.a = xu4Var;
    }

    @Override // defpackage.yu4
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public yu4.a a(z03 z03Var, int i, int i2, sk5 sk5Var) {
        xu4 xu4Var = this.a;
        if (xu4Var != null) {
            z03 z03Var2 = (z03) xu4Var.a(z03Var, 0, 0);
            if (z03Var2 == null) {
                this.a.b(z03Var, 0, 0, z03Var);
            } else {
                z03Var = z03Var2;
            }
        }
        return new yu4.a(z03Var, new gb3(z03Var, ((Integer) sk5Var.c(b)).intValue()));
    }

    @Override // defpackage.yu4
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(z03 z03Var) {
        return true;
    }
}
