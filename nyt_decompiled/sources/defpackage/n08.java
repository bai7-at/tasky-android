package defpackage;

import defpackage.ei7;

/* loaded from: classes2.dex */
public final class n08 implements a82 {
    private final long a;
    private final a82 b;

    class a implements ei7 {
        final /* synthetic */ ei7 a;

        a(ei7 ei7Var) {
            this.a = ei7Var;
        }

        @Override // defpackage.ei7
        public ei7.a f(long j) {
            ei7.a f = this.a.f(j);
            gi7 gi7Var = f.a;
            gi7 gi7Var2 = new gi7(gi7Var.a, gi7Var.b + n08.this.a);
            gi7 gi7Var3 = f.b;
            return new ei7.a(gi7Var2, new gi7(gi7Var3.a, gi7Var3.b + n08.this.a));
        }

        @Override // defpackage.ei7
        public boolean h() {
            return this.a.h();
        }

        @Override // defpackage.ei7
        public long i() {
            return this.a.i();
        }
    }

    public n08(long j, a82 a82Var) {
        this.a = j;
        this.b = a82Var;
    }

    @Override // defpackage.a82
    public yp8 a(int i, int i2) {
        return this.b.a(i, i2);
    }

    @Override // defpackage.a82
    public void p(ei7 ei7Var) {
        this.b.p(new a(ei7Var));
    }

    @Override // defpackage.a82
    public void s() {
        this.b.s();
    }
}
