package com.squareup.moshi;

import defpackage.qd0;
import defpackage.sd0;
import java.io.Closeable;
import java.io.Flushable;
import java.util.Arrays;

/* loaded from: classes4.dex */
public abstract class h implements Closeable, Flushable {
    String e;
    boolean f;
    boolean g;
    boolean h;
    int a = 0;
    int[] b = new int[32];
    String[] c = new String[32];
    int[] d = new int[32];
    int i = -1;

    h() {
    }

    public static h L(qd0 qd0Var) {
        return new e(qd0Var);
    }

    public abstract h C(String str);

    public abstract h F0(long j);

    public abstract h G();

    public final h G0(sd0 sd0Var) {
        if (this.h) {
            throw new IllegalStateException("BufferedSource cannot be used as a map key in JSON at path " + getPath());
        }
        qd0 X0 = X0();
        try {
            sd0Var.S0(X0);
            if (X0 != null) {
                X0.close();
            }
            return this;
        } catch (Throwable th) {
            if (X0 != null) {
                try {
                    X0.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public abstract h H0(Number number);

    public abstract h K0(String str);

    final int P() {
        int i = this.a;
        if (i != 0) {
            return this.b[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public abstract h W0(boolean z);

    public final void X() {
        int P = P();
        if (P != 5 && P != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.h = true;
    }

    public abstract qd0 X0();

    public abstract h a();

    public final int b() {
        int P = P();
        if (P != 5 && P != 3 && P != 2 && P != 1) {
            throw new IllegalStateException("Nesting problem.");
        }
        int i = this.i;
        this.i = this.a;
        return i;
    }

    final void c0(int i) {
        int[] iArr = this.b;
        int i2 = this.a;
        this.a = i2 + 1;
        iArr[i2] = i;
    }

    public abstract h d();

    final void e0(int i) {
        this.b[this.a - 1] = i;
    }

    public void f0(String str) {
        if (str.isEmpty()) {
            str = null;
        }
        this.e = str;
    }

    public final String getPath() {
        return c.a(this.a, this.b, this.c, this.d);
    }

    final boolean h() {
        int i = this.a;
        int[] iArr = this.b;
        if (i != iArr.length) {
            return false;
        }
        if (i == 256) {
            throw new JsonDataException("Nesting too deep at " + getPath() + ": circular reference?");
        }
        this.b = Arrays.copyOf(iArr, iArr.length * 2);
        String[] strArr = this.c;
        this.c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        int[] iArr2 = this.d;
        this.d = Arrays.copyOf(iArr2, iArr2.length * 2);
        if (!(this instanceof g)) {
            return true;
        }
        g gVar = (g) this;
        Object[] objArr = gVar.j;
        gVar.j = Arrays.copyOf(objArr, objArr.length * 2);
        return true;
    }

    public abstract h i();

    public final void j(int i) {
        this.i = i;
    }

    public abstract h l();

    public final String m() {
        String str = this.e;
        return str != null ? str : "";
    }

    public final void m0(boolean z) {
        this.f = z;
    }

    public final boolean r() {
        return this.g;
    }

    public final boolean s() {
        return this.f;
    }

    public final void t0(boolean z) {
        this.g = z;
    }

    public abstract h w0(double d);
}
