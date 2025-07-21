package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.Toolbar;
import defpackage.ab9;
import defpackage.ad1;
import defpackage.al;
import defpackage.db9;
import defpackage.e4;
import defpackage.fo6;
import defpackage.k99;
import defpackage.kf6;
import defpackage.nc6;
import defpackage.rm6;
import defpackage.zf6;
import io.embrace.android.embracesdk.ViewSwazzledHooks;

/* loaded from: classes.dex */
public class i0 implements ad1 {
    Toolbar a;
    private int b;
    private View c;
    private Spinner d;
    private View e;
    private Drawable f;
    private Drawable g;
    private Drawable h;
    private boolean i;
    CharSequence j;
    private CharSequence k;
    private CharSequence l;
    Window.Callback m;
    boolean n;
    private c o;
    private int p;
    private int q;
    private Drawable r;

    class a implements View.OnClickListener {
        final e4 a;

        a() {
            this.a = new e4(i0.this.a.getContext(), 0, R.id.home, 0, 0, i0.this.j);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewSwazzledHooks.OnClickListener._preOnClick(this, view);
            i0 i0Var = i0.this;
            Window.Callback callback = i0Var.m;
            if (callback == null || !i0Var.n) {
                return;
            }
            callback.onMenuItemSelected(0, this.a);
        }
    }

    class b extends db9 {
        private boolean a = false;
        final /* synthetic */ int b;

        b(int i) {
            this.b = i;
        }

        @Override // defpackage.db9, defpackage.cb9
        public void a(View view) {
            this.a = true;
        }

        @Override // defpackage.cb9
        public void b(View view) {
            if (this.a) {
                return;
            }
            i0.this.a.setVisibility(this.b);
        }

        @Override // defpackage.db9, defpackage.cb9
        public void c(View view) {
            i0.this.a.setVisibility(0);
        }
    }

    public i0(Toolbar toolbar, boolean z) {
        this(toolbar, z, rm6.abc_action_bar_up_description, kf6.abc_ic_ab_back_material);
    }

    private int N() {
        if (this.a.getNavigationIcon() == null) {
            return 11;
        }
        this.r = this.a.getNavigationIcon();
        return 15;
    }

    private void O() {
        if (this.d == null) {
            this.d = new AppCompatSpinner(getContext(), null, nc6.actionDropDownStyle);
            this.d.setLayoutParams(new Toolbar.g(-2, -2, 8388627));
        }
    }

    private void Q(CharSequence charSequence) {
        this.j = charSequence;
        if ((this.b & 8) != 0) {
            this.a.setTitle(charSequence);
            if (this.i) {
                k99.o0(this.a.getRootView(), charSequence);
            }
        }
    }

    private void R() {
        if ((this.b & 4) != 0) {
            if (TextUtils.isEmpty(this.l)) {
                this.a.setNavigationContentDescription(this.q);
            } else {
                this.a.setNavigationContentDescription(this.l);
            }
        }
    }

    private void S() {
        if ((this.b & 4) == 0) {
            this.a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.a;
        Drawable drawable = this.h;
        if (drawable == null) {
            drawable = this.r;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void T() {
        Drawable drawable;
        int i = this.b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.g;
            if (drawable == null) {
                drawable = this.f;
            }
        } else {
            drawable = this.f;
        }
        this.a.setLogo(drawable);
    }

    @Override // defpackage.ad1
    public View A() {
        return this.e;
    }

    @Override // defpackage.ad1
    public void B(b0 b0Var) {
        View view = this.c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.a;
            if (parent == toolbar) {
                toolbar.removeView(this.c);
            }
        }
        this.c = b0Var;
        if (b0Var == null || this.p != 2) {
            return;
        }
        this.a.addView(b0Var, 0);
        Toolbar.g gVar = (Toolbar.g) this.c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) gVar).width = -2;
        ((ViewGroup.MarginLayoutParams) gVar).height = -2;
        gVar.a = 8388691;
        b0Var.setAllowCollapse(true);
    }

    @Override // defpackage.ad1
    public void C(Drawable drawable) {
        this.g = drawable;
        T();
    }

    @Override // defpackage.ad1
    public void D(int i) {
        C(i != 0 ? al.b(getContext(), i) : null);
    }

    @Override // defpackage.ad1
    public void E(int i) {
        M(i != 0 ? al.b(getContext(), i) : null);
    }

    @Override // defpackage.ad1
    public void F(j.a aVar, e.a aVar2) {
        this.a.setMenuCallbacks(aVar, aVar2);
    }

    @Override // defpackage.ad1
    public void G(int i) {
        this.a.setVisibility(i);
    }

    @Override // defpackage.ad1
    public void H(SpinnerAdapter spinnerAdapter, AdapterView.OnItemSelectedListener onItemSelectedListener) {
        O();
        this.d.setAdapter(spinnerAdapter);
        this.d.setOnItemSelectedListener(onItemSelectedListener);
    }

    @Override // defpackage.ad1
    public CharSequence I() {
        return this.a.getSubtitle();
    }

    @Override // defpackage.ad1
    public int J() {
        return this.b;
    }

    @Override // defpackage.ad1
    public void K(View view) {
        View view2 = this.e;
        if (view2 != null && (this.b & 16) != 0) {
            this.a.removeView(view2);
        }
        this.e = view;
        if (view == null || (this.b & 16) == 0) {
            return;
        }
        this.a.addView(view);
    }

    @Override // defpackage.ad1
    public void L() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // defpackage.ad1
    public void M(Drawable drawable) {
        this.h = drawable;
        S();
    }

    public void P(int i) {
        if (i == this.q) {
            return;
        }
        this.q = i;
        if (TextUtils.isEmpty(this.a.getNavigationContentDescription())) {
            v(this.q);
        }
    }

    @Override // defpackage.ad1
    public boolean a() {
        return this.a.canShowOverflowMenu();
    }

    @Override // defpackage.ad1
    public boolean b() {
        return this.a.hideOverflowMenu();
    }

    @Override // defpackage.ad1
    public boolean c() {
        return this.a.showOverflowMenu();
    }

    @Override // defpackage.ad1
    public void collapseActionView() {
        this.a.collapseActionView();
    }

    @Override // defpackage.ad1
    public void d(Menu menu, j.a aVar) {
        if (this.o == null) {
            c cVar = new c(this.a.getContext());
            this.o = cVar;
            cVar.p(zf6.action_menu_presenter);
        }
        this.o.e(aVar);
        this.a.setMenu((androidx.appcompat.view.menu.e) menu, this.o);
    }

    @Override // defpackage.ad1
    public boolean e() {
        return this.a.isOverflowMenuShowing();
    }

    @Override // defpackage.ad1
    public void f() {
        this.n = true;
    }

    @Override // defpackage.ad1
    public void g(Drawable drawable) {
        k99.p0(this.a, drawable);
    }

    @Override // defpackage.ad1
    public Context getContext() {
        return this.a.getContext();
    }

    @Override // defpackage.ad1
    public int getHeight() {
        return this.a.getHeight();
    }

    @Override // defpackage.ad1
    public CharSequence getTitle() {
        return this.a.getTitle();
    }

    @Override // defpackage.ad1
    public int getVisibility() {
        return this.a.getVisibility();
    }

    @Override // defpackage.ad1
    public boolean h() {
        return this.a.isOverflowMenuShowPending();
    }

    @Override // defpackage.ad1
    public boolean i() {
        return this.a.hasExpandedActionView();
    }

    @Override // defpackage.ad1
    public boolean j() {
        return this.a.isTitleTruncated();
    }

    @Override // defpackage.ad1
    public void k(int i) {
        View view;
        int i2 = this.b ^ i;
        this.b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    R();
                }
                S();
            }
            if ((i2 & 3) != 0) {
                T();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.a.setTitle(this.j);
                    this.a.setSubtitle(this.k);
                } else {
                    this.a.setTitle((CharSequence) null);
                    this.a.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.e) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.a.addView(view);
            } else {
                this.a.removeView(view);
            }
        }
    }

    @Override // defpackage.ad1
    public void l(CharSequence charSequence) {
        this.l = charSequence;
        R();
    }

    @Override // defpackage.ad1
    public void m(CharSequence charSequence) {
        this.k = charSequence;
        if ((this.b & 8) != 0) {
            this.a.setSubtitle(charSequence);
        }
    }

    @Override // defpackage.ad1
    public void n(int i) {
        Spinner spinner = this.d;
        if (spinner == null) {
            throw new IllegalStateException("Can't set dropdown selected position without an adapter");
        }
        spinner.setSelection(i);
    }

    @Override // defpackage.ad1
    public Menu o() {
        return this.a.getMenu();
    }

    @Override // defpackage.ad1
    public int p() {
        return this.p;
    }

    @Override // defpackage.ad1
    public ab9 q(int i, long j) {
        return k99.e(this.a).b(i == 0 ? 1.0f : 0.0f).f(j).h(new b(i));
    }

    @Override // defpackage.ad1
    public void r(int i) {
        View view;
        int i2 = this.p;
        if (i != i2) {
            if (i2 == 1) {
                Spinner spinner = this.d;
                if (spinner != null) {
                    ViewParent parent = spinner.getParent();
                    Toolbar toolbar = this.a;
                    if (parent == toolbar) {
                        toolbar.removeView(this.d);
                    }
                }
            } else if (i2 == 2 && (view = this.c) != null) {
                ViewParent parent2 = view.getParent();
                Toolbar toolbar2 = this.a;
                if (parent2 == toolbar2) {
                    toolbar2.removeView(this.c);
                }
            }
            this.p = i;
            if (i != 0) {
                if (i == 1) {
                    O();
                    this.a.addView(this.d, 0);
                    return;
                }
                if (i != 2) {
                    throw new IllegalArgumentException("Invalid navigation mode " + i);
                }
                View view2 = this.c;
                if (view2 != null) {
                    this.a.addView(view2, 0);
                    Toolbar.g gVar = (Toolbar.g) this.c.getLayoutParams();
                    ((ViewGroup.MarginLayoutParams) gVar).width = -2;
                    ((ViewGroup.MarginLayoutParams) gVar).height = -2;
                    gVar.a = 8388691;
                }
            }
        }
    }

    @Override // defpackage.ad1
    public ViewGroup s() {
        return this.a;
    }

    @Override // defpackage.ad1
    public void setIcon(int i) {
        setIcon(i != 0 ? al.b(getContext(), i) : null);
    }

    @Override // defpackage.ad1
    public void setTitle(CharSequence charSequence) {
        this.i = true;
        Q(charSequence);
    }

    @Override // defpackage.ad1
    public void setWindowCallback(Window.Callback callback) {
        this.m = callback;
    }

    @Override // defpackage.ad1
    public void setWindowTitle(CharSequence charSequence) {
        if (this.i) {
            return;
        }
        Q(charSequence);
    }

    @Override // defpackage.ad1
    public void t(boolean z) {
    }

    @Override // defpackage.ad1
    public int u() {
        Spinner spinner = this.d;
        if (spinner != null) {
            return spinner.getSelectedItemPosition();
        }
        return 0;
    }

    @Override // defpackage.ad1
    public void v(int i) {
        l(i == 0 ? null : getContext().getString(i));
    }

    @Override // defpackage.ad1
    public void w() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // defpackage.ad1
    public int x() {
        Spinner spinner = this.d;
        if (spinner != null) {
            return spinner.getCount();
        }
        return 0;
    }

    @Override // defpackage.ad1
    public void y(boolean z) {
        this.a.setCollapsible(z);
    }

    @Override // defpackage.ad1
    public void z() {
        this.a.dismissPopupMenus();
    }

    public i0(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.p = 0;
        this.q = 0;
        this.a = toolbar;
        this.j = toolbar.getTitle();
        this.k = toolbar.getSubtitle();
        this.i = this.j != null;
        this.h = toolbar.getNavigationIcon();
        h0 v = h0.v(toolbar.getContext(), null, fo6.ActionBar, nc6.actionBarStyle, 0);
        this.r = v.g(fo6.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence p = v.p(fo6.ActionBar_title);
            if (!TextUtils.isEmpty(p)) {
                setTitle(p);
            }
            CharSequence p2 = v.p(fo6.ActionBar_subtitle);
            if (!TextUtils.isEmpty(p2)) {
                m(p2);
            }
            Drawable g = v.g(fo6.ActionBar_logo);
            if (g != null) {
                C(g);
            }
            Drawable g2 = v.g(fo6.ActionBar_icon);
            if (g2 != null) {
                setIcon(g2);
            }
            if (this.h == null && (drawable = this.r) != null) {
                M(drawable);
            }
            k(v.k(fo6.ActionBar_displayOptions, 0));
            int n = v.n(fo6.ActionBar_customNavigationLayout, 0);
            if (n != 0) {
                K(LayoutInflater.from(this.a.getContext()).inflate(n, (ViewGroup) this.a, false));
                k(this.b | 16);
            }
            int m = v.m(fo6.ActionBar_height, 0);
            if (m > 0) {
                ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
                layoutParams.height = m;
                this.a.setLayoutParams(layoutParams);
            }
            int e = v.e(fo6.ActionBar_contentInsetStart, -1);
            int e2 = v.e(fo6.ActionBar_contentInsetEnd, -1);
            if (e >= 0 || e2 >= 0) {
                this.a.setContentInsetsRelative(Math.max(e, 0), Math.max(e2, 0));
            }
            int n2 = v.n(fo6.ActionBar_titleTextStyle, 0);
            if (n2 != 0) {
                Toolbar toolbar2 = this.a;
                toolbar2.setTitleTextAppearance(toolbar2.getContext(), n2);
            }
            int n3 = v.n(fo6.ActionBar_subtitleTextStyle, 0);
            if (n3 != 0) {
                Toolbar toolbar3 = this.a;
                toolbar3.setSubtitleTextAppearance(toolbar3.getContext(), n3);
            }
            int n4 = v.n(fo6.ActionBar_popupTheme, 0);
            if (n4 != 0) {
                this.a.setPopupTheme(n4);
            }
        } else {
            this.b = N();
        }
        v.w();
        P(i);
        this.l = this.a.getNavigationContentDescription();
        this.a.setNavigationOnClickListener(new a());
    }

    @Override // defpackage.ad1
    public void setIcon(Drawable drawable) {
        this.f = drawable;
        T();
    }
}
