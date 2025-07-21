package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class nd5 {
    private final od5 a = new od5();
    private final yo5 b = new yo5(new byte[65025], 0);
    private int c = -1;
    private int d;
    private boolean e;

    nd5() {
    }

    private int a(int i) {
        int i2;
        int i3 = 0;
        this.d = 0;
        do {
            int i4 = this.d;
            int i5 = i + i4;
            od5 od5Var = this.a;
            if (i5 >= od5Var.g) {
                break;
            }
            int[] iArr = od5Var.j;
            this.d = i4 + 1;
            i2 = iArr[i4 + i];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public od5 b() {
        return this.a;
    }

    public yo5 c() {
        return this.b;
    }

    public boolean d(z72 z72Var) {
        int i;
        ur.g(z72Var != null);
        if (this.e) {
            this.e = false;
            this.b.Q(0);
        }
        while (!this.e) {
            if (this.c < 0) {
                if (!this.a.c(z72Var) || !this.a.a(z72Var, true)) {
                    return false;
                }
                od5 od5Var = this.a;
                int i2 = od5Var.h;
                if ((od5Var.b & 1) == 1 && this.b.g() == 0) {
                    i2 += a(0);
                    i = this.d;
                } else {
                    i = 0;
                }
                if (!b82.e(z72Var, i2)) {
                    return false;
                }
                this.c = i;
            }
            int a = a(this.c);
            int i3 = this.c + this.d;
            if (a > 0) {
                yo5 yo5Var = this.b;
                yo5Var.c(yo5Var.g() + a);
                if (!b82.d(z72Var, this.b.e(), this.b.g(), a)) {
                    return false;
                }
                yo5 yo5Var2 = this.b;
                yo5Var2.T(yo5Var2.g() + a);
                this.e = this.a.j[i3 + (-1)] != 255;
            }
            if (i3 == this.a.g) {
                i3 = -1;
            }
            this.c = i3;
        }
        return true;
    }

    public void e() {
        this.a.b();
        this.b.Q(0);
        this.c = -1;
        this.e = false;
    }

    public void f() {
        if (this.b.e().length == 65025) {
            return;
        }
        yo5 yo5Var = this.b;
        yo5Var.S(Arrays.copyOf(yo5Var.e(), Math.max(65025, this.b.g())), this.b.g());
    }
}
