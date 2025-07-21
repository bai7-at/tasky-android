package defpackage;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class tf9 {
    private int f;
    private int h;
    private float o;
    private String a = "";
    private String b = "";
    private Set c = Collections.emptySet();
    private String d = "";
    private String e = null;
    private boolean g = false;
    private boolean i = false;
    private int j = -1;
    private int k = -1;
    private int l = -1;
    private int m = -1;
    private int n = -1;
    private int p = -1;
    private boolean q = false;

    private static int B(int i, String str, String str2, int i2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }

    public tf9 A(boolean z) {
        this.k = z ? 1 : 0;
        return this;
    }

    public int a() {
        if (this.i) {
            return this.h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean b() {
        return this.q;
    }

    public int c() {
        if (this.g) {
            return this.f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public String d() {
        return this.e;
    }

    public float e() {
        return this.o;
    }

    public int f() {
        return this.n;
    }

    public int g() {
        return this.p;
    }

    public int h(String str, String str2, Set set, String str3) {
        if (this.a.isEmpty() && this.b.isEmpty() && this.c.isEmpty() && this.d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int B = B(B(B(0, this.a, str, 1073741824), this.b, str2, 2), this.d, str3, 4);
        if (B == -1 || !set.containsAll(this.c)) {
            return 0;
        }
        return B + (this.c.size() * 4);
    }

    public int i() {
        int i = this.l;
        if (i == -1 && this.m == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.m == 1 ? 2 : 0);
    }

    public boolean j() {
        return this.i;
    }

    public boolean k() {
        return this.g;
    }

    public boolean l() {
        return this.j == 1;
    }

    public boolean m() {
        return this.k == 1;
    }

    public tf9 n(int i) {
        this.h = i;
        this.i = true;
        return this;
    }

    public tf9 o(boolean z) {
        this.l = z ? 1 : 0;
        return this;
    }

    public tf9 p(boolean z) {
        this.q = z;
        return this;
    }

    public tf9 q(int i) {
        this.f = i;
        this.g = true;
        return this;
    }

    public tf9 r(String str) {
        this.e = str == null ? null : tr.e(str);
        return this;
    }

    public tf9 s(float f) {
        this.o = f;
        return this;
    }

    public tf9 t(int i) {
        this.n = i;
        return this;
    }

    public tf9 u(boolean z) {
        this.m = z ? 1 : 0;
        return this;
    }

    public tf9 v(int i) {
        this.p = i;
        return this;
    }

    public void w(String[] strArr) {
        this.c = new HashSet(Arrays.asList(strArr));
    }

    public void x(String str) {
        this.a = str;
    }

    public void y(String str) {
        this.b = str;
    }

    public void z(String str) {
        this.d = str;
    }
}
