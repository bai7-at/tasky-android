package defpackage;

/* loaded from: classes.dex */
public abstract class sh0 {

    public static final class a implements iv1 {
        final /* synthetic */ zu1 a;

        a(zu1 zu1Var) {
            this.a = zu1Var;
        }

        @Override // defpackage.iv1
        public void a(float[] fArr) {
            this.a.c().v(fArr);
        }

        @Override // defpackage.iv1
        public void b(float f, float f2, float f3, float f4, int i) {
            this.a.c().b(f, f2, f3, f4, i);
        }

        @Override // defpackage.iv1
        public void c(float f, float f2) {
            this.a.c().c(f, f2);
        }

        @Override // defpackage.iv1
        public void d(ip5 ip5Var, int i) {
            this.a.c().d(ip5Var, i);
        }

        @Override // defpackage.iv1
        public void e(float f, float f2, long j) {
            ph0 c = this.a.c();
            c.c(fd5.o(j), fd5.p(j));
            c.e(f, f2);
            c.c(-fd5.o(j), -fd5.p(j));
        }

        @Override // defpackage.iv1
        public void f(float f, long j) {
            ph0 c = this.a.c();
            c.c(fd5.o(j), fd5.p(j));
            c.s(f);
            c.c(-fd5.o(j), -fd5.p(j));
        }

        @Override // defpackage.iv1
        public void i(float f, float f2, float f3, float f4) {
            ph0 c = this.a.c();
            zu1 zu1Var = this.a;
            long a = du7.a(zt7.i(j()) - (f3 + f), zt7.g(j()) - (f4 + f2));
            if (zt7.i(a) < 0.0f || zt7.g(a) < 0.0f) {
                throw new IllegalArgumentException("Width and height must be greater than or equal to zero");
            }
            zu1Var.d(a);
            c.c(f, f2);
        }

        public long j() {
            return this.a.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iv1 b(zu1 zu1Var) {
        return new a(zu1Var);
    }
}
