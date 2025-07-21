package defpackage;

import com.chartbeat.androidsdk.QueryKeys;

/* loaded from: classes5.dex */
public class ms0 {
    public final ku3 a;
    private boolean b;

    public ms0(ku3 ku3Var) {
        zq3.h(ku3Var, "writer");
        this.a = ku3Var;
        this.b = true;
    }

    public final boolean a() {
        return this.b;
    }

    public void b() {
        this.b = true;
    }

    public void c() {
        this.b = false;
    }

    public void d(byte b) {
        this.a.c(b);
    }

    public final void e(char c) {
        this.a.a(c);
    }

    public void f(double d) {
        this.a.d(String.valueOf(d));
    }

    public void g(float f) {
        this.a.d(String.valueOf(f));
    }

    public void h(int i) {
        this.a.c(i);
    }

    public void i(long j) {
        this.a.c(j);
    }

    public final void j(String str) {
        zq3.h(str, QueryKeys.INTERNAL_REFERRER);
        this.a.d(str);
    }

    public void k(short s) {
        this.a.c(s);
    }

    public void l(boolean z) {
        this.a.d(String.valueOf(z));
    }

    public void m(String str) {
        zq3.h(str, "value");
        this.a.b(str);
    }

    protected final void n(boolean z) {
        this.b = z;
    }

    public void o() {
    }

    public void p() {
    }
}
