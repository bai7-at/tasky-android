package defpackage;

import java.util.Arrays;
import kotlin.collections.d;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class ji7 {
    public static final a h = new a(null);
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public ji7 f;
    public ji7 g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public ji7() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public final void a() {
        int i;
        ji7 ji7Var = this.g;
        if (ji7Var == this) {
            throw new IllegalStateException("cannot compact");
        }
        zq3.e(ji7Var);
        if (ji7Var.e) {
            int i2 = this.c - this.b;
            ji7 ji7Var2 = this.g;
            zq3.e(ji7Var2);
            int i3 = 8192 - ji7Var2.c;
            ji7 ji7Var3 = this.g;
            zq3.e(ji7Var3);
            if (ji7Var3.d) {
                i = 0;
            } else {
                ji7 ji7Var4 = this.g;
                zq3.e(ji7Var4);
                i = ji7Var4.b;
            }
            if (i2 > i3 + i) {
                return;
            }
            ji7 ji7Var5 = this.g;
            zq3.e(ji7Var5);
            g(ji7Var5, i2);
            b();
            li7.b(this);
        }
    }

    public final ji7 b() {
        ji7 ji7Var = this.f;
        if (ji7Var == this) {
            ji7Var = null;
        }
        ji7 ji7Var2 = this.g;
        zq3.e(ji7Var2);
        ji7Var2.f = this.f;
        ji7 ji7Var3 = this.f;
        zq3.e(ji7Var3);
        ji7Var3.g = this.g;
        this.f = null;
        this.g = null;
        return ji7Var;
    }

    public final ji7 c(ji7 ji7Var) {
        zq3.h(ji7Var, "segment");
        ji7Var.g = this;
        ji7Var.f = this.f;
        ji7 ji7Var2 = this.f;
        zq3.e(ji7Var2);
        ji7Var2.g = ji7Var;
        this.f = ji7Var;
        return ji7Var;
    }

    public final ji7 d() {
        this.d = true;
        return new ji7(this.a, this.b, this.c, true, false);
    }

    public final ji7 e(int i) {
        ji7 c;
        if (i <= 0 || i > this.c - this.b) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if (i >= 1024) {
            c = d();
        } else {
            c = li7.c();
            byte[] bArr = this.a;
            byte[] bArr2 = c.a;
            int i2 = this.b;
            d.l(bArr, bArr2, 0, i2, i2 + i, 2, null);
        }
        c.c = c.b + i;
        this.b += i;
        ji7 ji7Var = this.g;
        zq3.e(ji7Var);
        ji7Var.c(c);
        return c;
    }

    public final ji7 f() {
        byte[] bArr = this.a;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        zq3.g(copyOf, "copyOf(...)");
        return new ji7(copyOf, this.b, this.c, false, true);
    }

    public final void g(ji7 ji7Var, int i) {
        zq3.h(ji7Var, "sink");
        if (!ji7Var.e) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = ji7Var.c;
        if (i2 + i > 8192) {
            if (ji7Var.d) {
                throw new IllegalArgumentException();
            }
            int i3 = ji7Var.b;
            if ((i2 + i) - i3 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = ji7Var.a;
            d.l(bArr, bArr, 0, i3, i2, 2, null);
            ji7Var.c -= ji7Var.b;
            ji7Var.b = 0;
        }
        byte[] bArr2 = this.a;
        byte[] bArr3 = ji7Var.a;
        int i4 = ji7Var.c;
        int i5 = this.b;
        d.f(bArr2, bArr3, i4, i5, i5 + i);
        ji7Var.c += i;
        this.b += i;
    }

    public ji7(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        zq3.h(bArr, "data");
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }
}
