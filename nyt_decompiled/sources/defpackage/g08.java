package defpackage;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContextView;
import defpackage.f4;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class g08 extends f4 implements e.a {
    private Context c;
    private ActionBarContextView d;
    private f4.a e;
    private WeakReference f;
    private boolean g;
    private boolean h;
    private e i;

    public g08(Context context, ActionBarContextView actionBarContextView, f4.a aVar, boolean z) {
        this.c = context;
        this.d = actionBarContextView;
        this.e = aVar;
        e S = new e(actionBarContextView.getContext()).S(1);
        this.i = S;
        S.R(this);
        this.h = z;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(e eVar, MenuItem menuItem) {
        return this.e.a(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(e eVar) {
        k();
        this.d.l();
    }

    @Override // defpackage.f4
    public void c() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.e.b(this);
    }

    @Override // defpackage.f4
    public View d() {
        WeakReference weakReference = this.f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.f4
    public Menu e() {
        return this.i;
    }

    @Override // defpackage.f4
    public MenuInflater f() {
        return new kc8(this.d.getContext());
    }

    @Override // defpackage.f4
    public CharSequence g() {
        return this.d.getSubtitle();
    }

    @Override // defpackage.f4
    public CharSequence i() {
        return this.d.getTitle();
    }

    @Override // defpackage.f4
    public void k() {
        this.e.d(this, this.i);
    }

    @Override // defpackage.f4
    public boolean l() {
        return this.d.j();
    }

    @Override // defpackage.f4
    public void m(View view) {
        this.d.setCustomView(view);
        this.f = view != null ? new WeakReference(view) : null;
    }

    @Override // defpackage.f4
    public void n(int i) {
        o(this.c.getString(i));
    }

    @Override // defpackage.f4
    public void o(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override // defpackage.f4
    public void q(int i) {
        r(this.c.getString(i));
    }

    @Override // defpackage.f4
    public void r(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override // defpackage.f4
    public void s(boolean z) {
        super.s(z);
        this.d.setTitleOptional(z);
    }
}
