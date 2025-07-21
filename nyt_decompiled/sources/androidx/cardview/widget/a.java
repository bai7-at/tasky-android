package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* loaded from: classes.dex */
class a implements c {
    a() {
    }

    private d o(b bVar) {
        return (d) bVar.c();
    }

    @Override // androidx.cardview.widget.c
    public void a(b bVar, float f) {
        o(bVar).h(f);
    }

    @Override // androidx.cardview.widget.c
    public float b(b bVar) {
        return o(bVar).d();
    }

    @Override // androidx.cardview.widget.c
    public void c(b bVar, float f) {
        bVar.f().setElevation(f);
    }

    @Override // androidx.cardview.widget.c
    public float d(b bVar) {
        return o(bVar).c();
    }

    @Override // androidx.cardview.widget.c
    public ColorStateList e(b bVar) {
        return o(bVar).b();
    }

    @Override // androidx.cardview.widget.c
    public float f(b bVar) {
        return b(bVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.c
    public void g(b bVar) {
        n(bVar, d(bVar));
    }

    @Override // androidx.cardview.widget.c
    public void h(b bVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        bVar.a(new d(colorStateList, f));
        View f4 = bVar.f();
        f4.setClipToOutline(true);
        f4.setElevation(f2);
        n(bVar, f3);
    }

    @Override // androidx.cardview.widget.c
    public float i(b bVar) {
        return bVar.f().getElevation();
    }

    @Override // androidx.cardview.widget.c
    public void j(b bVar) {
        n(bVar, d(bVar));
    }

    @Override // androidx.cardview.widget.c
    public void k() {
    }

    @Override // androidx.cardview.widget.c
    public float l(b bVar) {
        return b(bVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.c
    public void m(b bVar, ColorStateList colorStateList) {
        o(bVar).f(colorStateList);
    }

    @Override // androidx.cardview.widget.c
    public void n(b bVar, float f) {
        o(bVar).g(f, bVar.b(), bVar.e());
        p(bVar);
    }

    public void p(b bVar) {
        if (!bVar.b()) {
            bVar.d(0, 0, 0, 0);
            return;
        }
        float d = d(bVar);
        float b = b(bVar);
        int ceil = (int) Math.ceil(e.a(d, b, bVar.e()));
        int ceil2 = (int) Math.ceil(e.b(d, b, bVar.e()));
        bVar.d(ceil, ceil2, ceil, ceil2);
    }
}
