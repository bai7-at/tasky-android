package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.SpinnerAdapter;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.i0;
import defpackage.nk;
import defpackage.x3;
import java.util.ArrayList;

/* loaded from: classes.dex */
class pn8 extends x3 {
    final ad1 a;
    final Window.Callback b;
    final nk.g c;
    boolean d;
    private boolean e;
    private boolean f;
    private ArrayList g = new ArrayList();
    private final Runnable h = new a();
    private final Toolbar.h i;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            pn8.this.g();
        }
    }

    class b implements Toolbar.h {
        b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.h
        public boolean onMenuItemClick(MenuItem menuItem) {
            return pn8.this.b.onMenuItemSelected(0, menuItem);
        }
    }

    private final class c implements j.a {
        private boolean a;

        c() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void c(androidx.appcompat.view.menu.e eVar, boolean z) {
            if (this.a) {
                return;
            }
            this.a = true;
            pn8.this.a.z();
            pn8.this.b.onPanelClosed(108, eVar);
            this.a = false;
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean d(androidx.appcompat.view.menu.e eVar) {
            pn8.this.b.onMenuOpened(108, eVar);
            return true;
        }
    }

    private final class d implements e.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (pn8.this.a.e()) {
                pn8.this.b.onPanelClosed(108, eVar);
            } else if (pn8.this.b.onPreparePanel(0, null, eVar)) {
                pn8.this.b.onMenuOpened(108, eVar);
            }
        }
    }

    private class e implements nk.g {
        e() {
        }

        @Override // nk.g
        public boolean a(int i) {
            if (i != 0) {
                return false;
            }
            pn8 pn8Var = pn8.this;
            if (pn8Var.d) {
                return false;
            }
            pn8Var.a.f();
            pn8.this.d = true;
            return false;
        }

        @Override // nk.g
        public View onCreatePanelView(int i) {
            if (i == 0) {
                return new View(pn8.this.a.getContext());
            }
            return null;
        }
    }

    pn8(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.i = bVar;
        h16.g(toolbar);
        i0 i0Var = new i0(toolbar, false);
        this.a = i0Var;
        this.b = (Window.Callback) h16.g(callback);
        i0Var.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        i0Var.setWindowTitle(charSequence);
        this.c = new e();
    }

    private Menu f() {
        if (!this.e) {
            this.a.F(new c(), new d());
            this.e = true;
        }
        return this.a.o();
    }

    @Override // defpackage.x3
    public void addOnMenuVisibilityListener(x3.b bVar) {
        this.g.add(bVar);
    }

    @Override // defpackage.x3
    public void addTab(x3.d dVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // defpackage.x3
    public boolean closeOptionsMenu() {
        return this.a.b();
    }

    @Override // defpackage.x3
    public boolean collapseActionView() {
        if (!this.a.i()) {
            return false;
        }
        this.a.collapseActionView();
        return true;
    }

    @Override // defpackage.x3
    public void dispatchMenuVisibilityChanged(boolean z) {
        if (z == this.f) {
            return;
        }
        this.f = z;
        if (this.g.size() <= 0) {
            return;
        }
        lh4.a(this.g.get(0));
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void g() {
        /*
            r5 = this;
            android.view.Menu r0 = r5.f()
            boolean r1 = r0 instanceof androidx.appcompat.view.menu.e
            r2 = 0
            if (r1 == 0) goto Ld
            r1 = r0
            androidx.appcompat.view.menu.e r1 = (androidx.appcompat.view.menu.e) r1
            goto Le
        Ld:
            r1 = r2
        Le:
            if (r1 == 0) goto L13
            r1.d0()
        L13:
            r0.clear()     // Catch: java.lang.Throwable -> L28
            android.view.Window$Callback r3 = r5.b     // Catch: java.lang.Throwable -> L28
            r4 = 0
            boolean r3 = r3.onCreatePanelMenu(r4, r0)     // Catch: java.lang.Throwable -> L28
            if (r3 == 0) goto L2a
            android.view.Window$Callback r5 = r5.b     // Catch: java.lang.Throwable -> L28
            boolean r5 = r5.onPreparePanel(r4, r2, r0)     // Catch: java.lang.Throwable -> L28
            if (r5 != 0) goto L2d
            goto L2a
        L28:
            r5 = move-exception
            goto L33
        L2a:
            r0.clear()     // Catch: java.lang.Throwable -> L28
        L2d:
            if (r1 == 0) goto L32
            r1.c0()
        L32:
            return
        L33:
            if (r1 == 0) goto L38
            r1.c0()
        L38:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pn8.g():void");
    }

    @Override // defpackage.x3
    public View getCustomView() {
        return this.a.A();
    }

    @Override // defpackage.x3
    public int getDisplayOptions() {
        return this.a.J();
    }

    @Override // defpackage.x3
    public float getElevation() {
        return k99.s(this.a.s());
    }

    @Override // defpackage.x3
    public int getHeight() {
        return this.a.getHeight();
    }

    @Override // defpackage.x3
    public int getNavigationItemCount() {
        return 0;
    }

    @Override // defpackage.x3
    public int getNavigationMode() {
        return 0;
    }

    @Override // defpackage.x3
    public int getSelectedNavigationIndex() {
        return -1;
    }

    @Override // defpackage.x3
    public x3.d getSelectedTab() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // defpackage.x3
    public CharSequence getSubtitle() {
        return this.a.I();
    }

    @Override // defpackage.x3
    public x3.d getTabAt(int i) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // defpackage.x3
    public int getTabCount() {
        return 0;
    }

    @Override // defpackage.x3
    public Context getThemedContext() {
        return this.a.getContext();
    }

    @Override // defpackage.x3
    public CharSequence getTitle() {
        return this.a.getTitle();
    }

    @Override // defpackage.x3
    public void hide() {
        this.a.G(8);
    }

    @Override // defpackage.x3
    public boolean invalidateOptionsMenu() {
        this.a.s().removeCallbacks(this.h);
        k99.d0(this.a.s(), this.h);
        return true;
    }

    @Override // defpackage.x3
    public boolean isShowing() {
        return this.a.getVisibility() == 0;
    }

    @Override // defpackage.x3
    public boolean isTitleTruncated() {
        return super.isTitleTruncated();
    }

    @Override // defpackage.x3
    public x3.d newTab() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // defpackage.x3
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // defpackage.x3
    void onDestroy() {
        this.a.s().removeCallbacks(this.h);
    }

    @Override // defpackage.x3
    public boolean onKeyShortcut(int i, KeyEvent keyEvent) {
        Menu f = f();
        if (f == null) {
            return false;
        }
        f.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return f.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.x3
    public boolean onMenuKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            openOptionsMenu();
        }
        return true;
    }

    @Override // defpackage.x3
    public boolean openOptionsMenu() {
        return this.a.c();
    }

    @Override // defpackage.x3
    public void removeAllTabs() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // defpackage.x3
    public void removeOnMenuVisibilityListener(x3.b bVar) {
        this.g.remove(bVar);
    }

    @Override // defpackage.x3
    public void removeTab(x3.d dVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // defpackage.x3
    public void removeTabAt(int i) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // defpackage.x3
    public boolean requestFocus() {
        ViewGroup s = this.a.s();
        if (s == null || s.hasFocus()) {
            return false;
        }
        s.requestFocus();
        return true;
    }

    @Override // defpackage.x3
    public void selectTab(x3.d dVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // defpackage.x3
    public void setBackgroundDrawable(Drawable drawable) {
        this.a.g(drawable);
    }

    @Override // defpackage.x3
    public void setCustomView(View view) {
        setCustomView(view, new x3.a(-2, -2));
    }

    @Override // defpackage.x3
    public void setDefaultDisplayHomeAsUpEnabled(boolean z) {
    }

    @Override // defpackage.x3
    public void setDisplayHomeAsUpEnabled(boolean z) {
        setDisplayOptions(z ? 4 : 0, 4);
    }

    @Override // defpackage.x3
    public void setDisplayOptions(int i) {
        setDisplayOptions(i, -1);
    }

    @Override // defpackage.x3
    public void setDisplayShowCustomEnabled(boolean z) {
        setDisplayOptions(z ? 16 : 0, 16);
    }

    @Override // defpackage.x3
    public void setDisplayShowHomeEnabled(boolean z) {
        setDisplayOptions(z ? 2 : 0, 2);
    }

    @Override // defpackage.x3
    public void setDisplayShowTitleEnabled(boolean z) {
        setDisplayOptions(z ? 8 : 0, 8);
    }

    @Override // defpackage.x3
    public void setDisplayUseLogoEnabled(boolean z) {
        setDisplayOptions(z ? 1 : 0, 1);
    }

    @Override // defpackage.x3
    public void setElevation(float f) {
        k99.t0(this.a.s(), f);
    }

    @Override // defpackage.x3
    public void setHomeActionContentDescription(CharSequence charSequence) {
        this.a.l(charSequence);
    }

    @Override // defpackage.x3
    public void setHomeAsUpIndicator(Drawable drawable) {
        this.a.M(drawable);
    }

    @Override // defpackage.x3
    public void setHomeButtonEnabled(boolean z) {
    }

    @Override // defpackage.x3
    public void setIcon(int i) {
        this.a.setIcon(i);
    }

    @Override // defpackage.x3
    public void setListNavigationCallbacks(SpinnerAdapter spinnerAdapter, x3.c cVar) {
        this.a.H(spinnerAdapter, new o25(cVar));
    }

    @Override // defpackage.x3
    public void setLogo(int i) {
        this.a.D(i);
    }

    @Override // defpackage.x3
    public void setNavigationMode(int i) {
        if (i == 2) {
            throw new IllegalArgumentException("Tabs not supported in this configuration");
        }
        this.a.r(i);
    }

    @Override // defpackage.x3
    public void setSelectedNavigationItem(int i) {
        if (this.a.p() != 1) {
            throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
        }
        this.a.n(i);
    }

    @Override // defpackage.x3
    public void setShowHideAnimationEnabled(boolean z) {
    }

    @Override // defpackage.x3
    public void setSplitBackgroundDrawable(Drawable drawable) {
    }

    @Override // defpackage.x3
    public void setStackedBackgroundDrawable(Drawable drawable) {
    }

    @Override // defpackage.x3
    public void setSubtitle(CharSequence charSequence) {
        this.a.m(charSequence);
    }

    @Override // defpackage.x3
    public void setTitle(CharSequence charSequence) {
        this.a.setTitle(charSequence);
    }

    @Override // defpackage.x3
    public void setWindowTitle(CharSequence charSequence) {
        this.a.setWindowTitle(charSequence);
    }

    @Override // defpackage.x3
    public void show() {
        this.a.G(0);
    }

    @Override // defpackage.x3
    public void addTab(x3.d dVar, boolean z) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // defpackage.x3
    public void setCustomView(View view, x3.a aVar) {
        if (view != null) {
            view.setLayoutParams(aVar);
        }
        this.a.K(view);
    }

    @Override // defpackage.x3
    public void setDisplayOptions(int i, int i2) {
        this.a.k((i & i2) | ((~i2) & this.a.J()));
    }

    @Override // defpackage.x3
    public void setHomeActionContentDescription(int i) {
        this.a.v(i);
    }

    @Override // defpackage.x3
    public void setHomeAsUpIndicator(int i) {
        this.a.E(i);
    }

    @Override // defpackage.x3
    public void setIcon(Drawable drawable) {
        this.a.setIcon(drawable);
    }

    @Override // defpackage.x3
    public void setLogo(Drawable drawable) {
        this.a.C(drawable);
    }

    @Override // defpackage.x3
    public void setSubtitle(int i) {
        ad1 ad1Var = this.a;
        ad1Var.m(i != 0 ? ad1Var.getContext().getText(i) : null);
    }

    @Override // defpackage.x3
    public void setTitle(int i) {
        ad1 ad1Var = this.a;
        ad1Var.setTitle(i != 0 ? ad1Var.getContext().getText(i) : null);
    }

    @Override // defpackage.x3
    public void addTab(x3.d dVar, int i) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // defpackage.x3
    public void addTab(x3.d dVar, int i, boolean z) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // defpackage.x3
    public void setCustomView(int i) {
        setCustomView(LayoutInflater.from(this.a.getContext()).inflate(i, this.a.s(), false));
    }
}
