package defpackage;

/* loaded from: classes.dex */
public class v60 implements d64 {
    final d64 a;
    int b = 0;
    int c = -1;
    int d = -1;
    Object e = null;

    public v60(d64 d64Var) {
        this.a = d64Var;
    }

    @Override // defpackage.d64
    public void a(int i, int i2) {
        int i3;
        if (this.b == 1 && i >= (i3 = this.c)) {
            int i4 = this.d;
            if (i <= i3 + i4) {
                this.d = i4 + i2;
                this.c = Math.min(i, i3);
                return;
            }
        }
        e();
        this.c = i;
        this.d = i2;
        this.b = 1;
    }

    @Override // defpackage.d64
    public void b(int i, int i2) {
        int i3;
        if (this.b == 2 && (i3 = this.c) >= i && i3 <= i + i2) {
            this.d += i2;
            this.c = i;
        } else {
            e();
            this.c = i;
            this.d = i2;
            this.b = 2;
        }
    }

    @Override // defpackage.d64
    public void c(int i, int i2, Object obj) {
        int i3;
        if (this.b == 3) {
            int i4 = this.c;
            int i5 = this.d;
            if (i <= i4 + i5 && (i3 = i + i2) >= i4 && this.e == obj) {
                this.c = Math.min(i, i4);
                this.d = Math.max(i5 + i4, i3) - this.c;
                return;
            }
        }
        e();
        this.c = i;
        this.d = i2;
        this.e = obj;
        this.b = 3;
    }

    @Override // defpackage.d64
    public void d(int i, int i2) {
        e();
        this.a.d(i, i2);
    }

    public void e() {
        int i = this.b;
        if (i == 0) {
            return;
        }
        if (i == 1) {
            this.a.a(this.c, this.d);
        } else if (i == 2) {
            this.a.b(this.c, this.d);
        } else if (i == 3) {
            this.a.c(this.c, this.d, this.e);
        }
        this.e = null;
        this.b = 0;
    }
}
