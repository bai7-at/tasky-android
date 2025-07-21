package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.util.ArrayDeque;

/* loaded from: classes2.dex */
final class ch1 implements zx1 {
    private final byte[] a = new byte[8];
    private final ArrayDeque b = new ArrayDeque();
    private final x39 c = new x39();
    private yx1 d;
    private int e;
    private int f;
    private long g;

    private static final class b {
        private final int a;
        private final long b;

        private b(int i, long j) {
            this.a = i;
            this.b = j;
        }
    }

    private long d(z72 z72Var) {
        z72Var.g();
        while (true) {
            z72Var.r(this.a, 0, 4);
            int c = x39.c(this.a[0]);
            if (c != -1 && c <= 4) {
                int a2 = (int) x39.a(this.a, c, false);
                if (this.d.f(a2)) {
                    z72Var.p(c);
                    return a2;
                }
            }
            z72Var.p(1);
        }
    }

    private double e(z72 z72Var, int i) {
        return i == 4 ? Float.intBitsToFloat((int) r1) : Double.longBitsToDouble(f(z72Var, i));
    }

    private long f(z72 z72Var, int i) {
        z72Var.readFully(this.a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.a[i2] & 255);
        }
        return j;
    }

    private static String g(z72 z72Var, int i) {
        if (i == 0) {
            return "";
        }
        byte[] bArr = new byte[i];
        z72Var.readFully(bArr, 0, i);
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        return new String(bArr, 0, i);
    }

    @Override // defpackage.zx1
    public void a() {
        this.e = 0;
        this.b.clear();
        this.c.e();
    }

    @Override // defpackage.zx1
    public boolean b(z72 z72Var) {
        ur.i(this.d);
        while (true) {
            b bVar = (b) this.b.peek();
            if (bVar != null && z72Var.getPosition() >= bVar.b) {
                this.d.a(((b) this.b.pop()).a);
                return true;
            }
            if (this.e == 0) {
                long d = this.c.d(z72Var, true, false, 4);
                if (d == -2) {
                    d = d(z72Var);
                }
                if (d == -1) {
                    return false;
                }
                this.f = (int) d;
                this.e = 1;
            }
            if (this.e == 1) {
                this.g = this.c.d(z72Var, false, true, 8);
                this.e = 2;
            }
            int e = this.d.e(this.f);
            if (e != 0) {
                if (e == 1) {
                    long position = z72Var.getPosition();
                    this.b.push(new b(this.f, this.g + position));
                    this.d.h(this.f, position, this.g);
                    this.e = 0;
                    return true;
                }
                if (e == 2) {
                    long j = this.g;
                    if (j <= 8) {
                        this.d.d(this.f, f(z72Var, (int) j));
                        this.e = 0;
                        return true;
                    }
                    throw ParserException.a("Invalid integer size: " + this.g, null);
                }
                if (e == 3) {
                    long j2 = this.g;
                    if (j2 <= 2147483647L) {
                        this.d.g(this.f, g(z72Var, (int) j2));
                        this.e = 0;
                        return true;
                    }
                    throw ParserException.a("String element size: " + this.g, null);
                }
                if (e == 4) {
                    this.d.c(this.f, (int) this.g, z72Var);
                    this.e = 0;
                    return true;
                }
                if (e != 5) {
                    throw ParserException.a("Invalid element type " + e, null);
                }
                long j3 = this.g;
                if (j3 == 4 || j3 == 8) {
                    this.d.b(this.f, e(z72Var, (int) j3));
                    this.e = 0;
                    return true;
                }
                throw ParserException.a("Invalid float size: " + this.g, null);
            }
            z72Var.p((int) this.g);
            this.e = 0;
        }
    }

    @Override // defpackage.zx1
    public void c(yx1 yx1Var) {
        this.d = yx1Var;
    }
}
