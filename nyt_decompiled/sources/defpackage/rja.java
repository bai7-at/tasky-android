package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class rja {
    private final int a;
    private final int b;
    private final int c;
    private final boolean d;
    private final gka e;
    private final sla f;
    private int n;
    private final Object g = new Object();
    private final ArrayList h = new ArrayList();
    private final ArrayList i = new ArrayList();
    private final ArrayList j = new ArrayList();
    private int k = 0;
    private int l = 0;
    private int m = 0;
    private String o = "";
    private String p = "";
    private String q = "";

    public rja(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
        this.e = new gka(i4);
        this.f = new sla(i5, i6, i7);
    }

    private final void p(String str, boolean z, float f, float f2, float f3, float f4) {
        if (str != null) {
            if (str.length() < this.c) {
                return;
            }
            synchronized (this.g) {
                try {
                    this.h.add(str);
                    this.k += str.length();
                    if (z) {
                        this.i.add(str);
                        this.j.add(new cka(f, f2, f3, f4, this.i.size() - 1));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static final String q(ArrayList arrayList, int i) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            sb.append((String) arrayList.get(i2));
            sb.append(' ');
            i2++;
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String sb2 = sb.toString();
        return sb2.length() < 100 ? sb2 : sb2.substring(0, 100);
    }

    final int a(int i, int i2) {
        return this.d ? this.b : (i * this.a) + (i2 * this.b);
    }

    public final int b() {
        return this.n;
    }

    final int c() {
        return this.k;
    }

    public final String d() {
        return this.o;
    }

    public final String e() {
        return this.p;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rja)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((rja) obj).o;
        return str != null && str.equals(this.o);
    }

    public final String f() {
        return this.q;
    }

    public final void g() {
        synchronized (this.g) {
            this.m--;
        }
    }

    public final void h() {
        synchronized (this.g) {
            this.m++;
        }
    }

    public final int hashCode() {
        return this.o.hashCode();
    }

    public final void i() {
        synchronized (this.g) {
            this.n -= 100;
        }
    }

    public final void j(int i) {
        this.l = i;
    }

    public final void k(String str, boolean z, float f, float f2, float f3, float f4) {
        p(str, z, f, f2, f3, f4);
    }

    public final void l(String str, boolean z, float f, float f2, float f3, float f4) {
        p(str, z, f, f2, f3, f4);
        synchronized (this.g) {
            try {
                if (this.m < 0) {
                    fgb.b("ActivityContent: negative number of WebViews.");
                }
                m();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m() {
        synchronized (this.g) {
            try {
                int a = a(this.k, this.l);
                if (a > this.n) {
                    this.n = a;
                    if (!dyf.q().i().zzN()) {
                        this.o = this.e.a(this.h);
                        this.p = this.e.a(this.i);
                    }
                    if (!dyf.q().i().zzO()) {
                        this.q = this.f.a(this.i, this.j);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n() {
        synchronized (this.g) {
            try {
                int a = a(this.k, this.l);
                if (a > this.n) {
                    this.n = a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean o() {
        boolean z;
        synchronized (this.g) {
            z = this.m == 0;
        }
        return z;
    }

    public final String toString() {
        ArrayList arrayList = this.h;
        return "ActivityContent fetchId: " + this.l + " score:" + this.n + " total_length:" + this.k + "\n text: " + q(arrayList, 100) + "\n viewableText" + q(this.i, 100) + "\n signture: " + this.o + "\n viewableSignture: " + this.p + "\n viewableSignatureForVertical: " + this.q;
    }
}
