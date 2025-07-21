package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import defpackage.h16;

/* loaded from: classes.dex */
public class h {
    private final j a;

    private h(j jVar) {
        this.a = jVar;
    }

    public static h b(j jVar) {
        return new h((j) h16.h(jVar, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        j jVar = this.a;
        jVar.e.n(jVar, jVar, fragment);
    }

    public void c() {
        this.a.e.y();
    }

    public boolean d(MenuItem menuItem) {
        return this.a.e.B(menuItem);
    }

    public void e() {
        this.a.e.C();
    }

    public void f() {
        this.a.e.E();
    }

    public void g() {
        this.a.e.N();
    }

    public void h() {
        this.a.e.R();
    }

    public void i() {
        this.a.e.S();
    }

    public void j() {
        this.a.e.U();
    }

    public boolean k() {
        return this.a.e.b0(true);
    }

    public FragmentManager l() {
        return this.a.e;
    }

    public void m() {
        this.a.e.c1();
    }

    public View n(View view, String str, Context context, AttributeSet attributeSet) {
        return this.a.e.z0().onCreateView(view, str, context, attributeSet);
    }
}
