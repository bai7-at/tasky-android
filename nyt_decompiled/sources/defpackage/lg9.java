package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.SpinnerAdapter;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.b0;
import androidx.fragment.app.f;
import androidx.fragment.app.r;
import com.amazonaws.services.s3.internal.Constants;
import defpackage.f4;
import defpackage.x3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class lg9 extends x3 implements ActionBarOverlayLayout.d {
    private static final Interpolator F = new AccelerateInterpolator();
    private static final Interpolator G = new DecelerateInterpolator();
    private boolean A;
    boolean B;
    Context a;
    private Context b;
    private Activity c;
    ActionBarOverlayLayout d;
    ActionBarContainer e;
    ad1 f;
    ActionBarContextView g;
    View h;
    b0 i;
    private e k;
    private boolean m;
    d n;
    f4 o;
    f4.a p;
    private boolean q;
    private boolean s;
    boolean v;
    boolean w;
    private boolean x;
    bb9 z;
    private ArrayList j = new ArrayList();
    private int l = -1;
    private ArrayList r = new ArrayList();
    private int t = 0;
    boolean u = true;
    private boolean y = true;
    final cb9 C = new a();
    final cb9 D = new b();
    final eb9 E = new c();

    class a extends db9 {
        a() {
        }

        @Override // defpackage.cb9
        public void b(View view) {
            View view2;
            lg9 lg9Var = lg9.this;
            if (lg9Var.u && (view2 = lg9Var.h) != null) {
                view2.setTranslationY(0.0f);
                lg9.this.e.setTranslationY(0.0f);
            }
            lg9.this.e.setVisibility(8);
            lg9.this.e.setTransitioning(false);
            lg9 lg9Var2 = lg9.this;
            lg9Var2.z = null;
            lg9Var2.i();
            ActionBarOverlayLayout actionBarOverlayLayout = lg9.this.d;
            if (actionBarOverlayLayout != null) {
                k99.i0(actionBarOverlayLayout);
            }
        }
    }

    class b extends db9 {
        b() {
        }

        @Override // defpackage.cb9
        public void b(View view) {
            lg9 lg9Var = lg9.this;
            lg9Var.z = null;
            lg9Var.e.requestLayout();
        }
    }

    class c implements eb9 {
        c() {
        }

        @Override // defpackage.eb9
        public void a(View view) {
            ((View) lg9.this.e.getParent()).invalidate();
        }
    }

    public class d extends f4 implements e.a {
        private final Context c;
        private final androidx.appcompat.view.menu.e d;
        private f4.a e;
        private WeakReference f;

        public d(Context context, f4.a aVar) {
            this.c = context;
            this.e = aVar;
            androidx.appcompat.view.menu.e S = new androidx.appcompat.view.menu.e(context).S(1);
            this.d = S;
            S.R(this);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            f4.a aVar = this.e;
            if (aVar != null) {
                return aVar.a(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (this.e == null) {
                return;
            }
            k();
            lg9.this.g.l();
        }

        @Override // defpackage.f4
        public void c() {
            lg9 lg9Var = lg9.this;
            if (lg9Var.n != this) {
                return;
            }
            if (lg9.g(lg9Var.v, lg9Var.w, false)) {
                this.e.b(this);
            } else {
                lg9 lg9Var2 = lg9.this;
                lg9Var2.o = this;
                lg9Var2.p = this.e;
            }
            this.e = null;
            lg9.this.f(false);
            lg9.this.g.g();
            lg9 lg9Var3 = lg9.this;
            lg9Var3.d.setHideOnContentScrollEnabled(lg9Var3.B);
            lg9.this.n = null;
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
            return this.d;
        }

        @Override // defpackage.f4
        public MenuInflater f() {
            return new kc8(this.c);
        }

        @Override // defpackage.f4
        public CharSequence g() {
            return lg9.this.g.getSubtitle();
        }

        @Override // defpackage.f4
        public CharSequence i() {
            return lg9.this.g.getTitle();
        }

        @Override // defpackage.f4
        public void k() {
            if (lg9.this.n != this) {
                return;
            }
            this.d.d0();
            try {
                this.e.d(this, this.d);
            } finally {
                this.d.c0();
            }
        }

        @Override // defpackage.f4
        public boolean l() {
            return lg9.this.g.j();
        }

        @Override // defpackage.f4
        public void m(View view) {
            lg9.this.g.setCustomView(view);
            this.f = new WeakReference(view);
        }

        @Override // defpackage.f4
        public void n(int i) {
            o(lg9.this.a.getResources().getString(i));
        }

        @Override // defpackage.f4
        public void o(CharSequence charSequence) {
            lg9.this.g.setSubtitle(charSequence);
        }

        @Override // defpackage.f4
        public void q(int i) {
            r(lg9.this.a.getResources().getString(i));
        }

        @Override // defpackage.f4
        public void r(CharSequence charSequence) {
            lg9.this.g.setTitle(charSequence);
        }

        @Override // defpackage.f4
        public void s(boolean z) {
            super.s(z);
            lg9.this.g.setTitleOptional(z);
        }

        public boolean t() {
            this.d.d0();
            try {
                return this.e.c(this, this.d);
            } finally {
                this.d.c0();
            }
        }
    }

    public class e extends x3.d {
        private Drawable a;
        private CharSequence b;
        private CharSequence c;
        private int d = -1;
        private View e;

        public e() {
        }

        @Override // x3.d
        public CharSequence a() {
            return this.c;
        }

        @Override // x3.d
        public View b() {
            return this.e;
        }

        @Override // x3.d
        public Drawable c() {
            return this.a;
        }

        @Override // x3.d
        public int d() {
            return this.d;
        }

        @Override // x3.d
        public CharSequence e() {
            return this.b;
        }

        @Override // x3.d
        public void f() {
            lg9.this.selectTab(this);
        }

        public x3.e g() {
            return null;
        }

        public void h(int i) {
            this.d = i;
        }
    }

    public lg9(Activity activity, boolean z) {
        this.c = activity;
        View decorView = activity.getWindow().getDecorView();
        p(decorView);
        if (z) {
            return;
        }
        this.h = decorView.findViewById(R.id.content);
    }

    static boolean g(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    private void h() {
        if (this.k != null) {
            selectTab(null);
        }
        this.j.clear();
        b0 b0Var = this.i;
        if (b0Var != null) {
            b0Var.j();
        }
        this.l = -1;
    }

    private void j(x3.d dVar, int i) {
        ((e) dVar).g();
        throw new IllegalStateException("Action Bar Tab must have a Callback");
    }

    private void m() {
        if (this.i != null) {
            return;
        }
        b0 b0Var = new b0(this.a);
        if (this.s) {
            b0Var.setVisibility(0);
            this.f.B(b0Var);
        } else {
            if (getNavigationMode() == 2) {
                b0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.d;
                if (actionBarOverlayLayout != null) {
                    k99.i0(actionBarOverlayLayout);
                }
            } else {
                b0Var.setVisibility(8);
            }
            this.e.setTabContainer(b0Var);
        }
        this.i = b0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ad1 n(View view) {
        if (view instanceof ad1) {
            return (ad1) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != 0 ? view.getClass().getSimpleName() : Constants.NULL_VERSION_ID);
        throw new IllegalStateException(sb.toString());
    }

    private void o() {
        if (this.x) {
            this.x = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            t(false);
        }
    }

    private void p(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(zf6.decor_content_parent);
        this.d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f = n(view.findViewById(zf6.action_bar));
        this.g = (ActionBarContextView) view.findViewById(zf6.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(zf6.action_bar_container);
        this.e = actionBarContainer;
        ad1 ad1Var = this.f;
        if (ad1Var == null || this.g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.a = ad1Var.getContext();
        boolean z = (this.f.J() & 4) != 0;
        if (z) {
            this.m = true;
        }
        z3 b2 = z3.b(this.a);
        setHomeButtonEnabled(b2.a() || z);
        q(b2.g());
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, fo6.ActionBar, nc6.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(fo6.ActionBar_hideOnContentScroll, false)) {
            setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(fo6.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            setElevation(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    private void q(boolean z) {
        this.s = z;
        if (z) {
            this.e.setTabContainer(null);
            this.f.B(this.i);
        } else {
            this.f.B(null);
            this.e.setTabContainer(this.i);
        }
        boolean z2 = getNavigationMode() == 2;
        b0 b0Var = this.i;
        if (b0Var != null) {
            if (z2) {
                b0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.d;
                if (actionBarOverlayLayout != null) {
                    k99.i0(actionBarOverlayLayout);
                }
            } else {
                b0Var.setVisibility(8);
            }
        }
        this.f.y(!this.s && z2);
        this.d.setHasNonEmbeddedTabs(!this.s && z2);
    }

    private boolean r() {
        return k99.P(this.e);
    }

    private void s() {
        if (this.x) {
            return;
        }
        this.x = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        t(false);
    }

    private void t(boolean z) {
        if (g(this.v, this.w, this.x)) {
            if (this.y) {
                return;
            }
            this.y = true;
            l(z);
            return;
        }
        if (this.y) {
            this.y = false;
            k(z);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.w) {
            this.w = false;
            t(true);
        }
    }

    @Override // defpackage.x3
    public void addOnMenuVisibilityListener(x3.b bVar) {
        this.r.add(bVar);
    }

    @Override // defpackage.x3
    public void addTab(x3.d dVar) {
        addTab(dVar, this.j.isEmpty());
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c(boolean z) {
        this.u = z;
    }

    @Override // defpackage.x3
    public boolean collapseActionView() {
        ad1 ad1Var = this.f;
        if (ad1Var == null || !ad1Var.i()) {
            return false;
        }
        this.f.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
        if (this.w) {
            return;
        }
        this.w = true;
        t(true);
    }

    @Override // defpackage.x3
    public void dispatchMenuVisibilityChanged(boolean z) {
        if (z == this.q) {
            return;
        }
        this.q = z;
        if (this.r.size() <= 0) {
            return;
        }
        lh4.a(this.r.get(0));
        throw null;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        bb9 bb9Var = this.z;
        if (bb9Var != null) {
            bb9Var.a();
            this.z = null;
        }
    }

    public void f(boolean z) {
        ab9 f;
        ab9 ab9Var;
        if (z) {
            s();
        } else {
            o();
        }
        if (!r()) {
            if (z) {
                this.f.G(4);
                this.g.setVisibility(0);
                return;
            } else {
                this.f.G(0);
                this.g.setVisibility(8);
                return;
            }
        }
        if (z) {
            f = this.f.q(4, 100L);
            ab9Var = this.g.f(0, 200L);
        } else {
            ab9 q = this.f.q(0, 200L);
            f = this.g.f(8, 100L);
            ab9Var = q;
        }
        bb9 bb9Var = new bb9();
        bb9Var.d(f, ab9Var);
        bb9Var.h();
    }

    @Override // defpackage.x3
    public View getCustomView() {
        return this.f.A();
    }

    @Override // defpackage.x3
    public int getDisplayOptions() {
        return this.f.J();
    }

    @Override // defpackage.x3
    public float getElevation() {
        return k99.s(this.e);
    }

    @Override // defpackage.x3
    public int getHeight() {
        return this.e.getHeight();
    }

    @Override // defpackage.x3
    public int getHideOffset() {
        return this.d.getActionBarHideOffset();
    }

    @Override // defpackage.x3
    public int getNavigationItemCount() {
        int p = this.f.p();
        if (p == 1) {
            return this.f.x();
        }
        if (p != 2) {
            return 0;
        }
        return this.j.size();
    }

    @Override // defpackage.x3
    public int getNavigationMode() {
        return this.f.p();
    }

    @Override // defpackage.x3
    public int getSelectedNavigationIndex() {
        e eVar;
        int p = this.f.p();
        if (p == 1) {
            return this.f.u();
        }
        if (p == 2 && (eVar = this.k) != null) {
            return eVar.d();
        }
        return -1;
    }

    @Override // defpackage.x3
    public x3.d getSelectedTab() {
        return this.k;
    }

    @Override // defpackage.x3
    public CharSequence getSubtitle() {
        return this.f.I();
    }

    @Override // defpackage.x3
    public x3.d getTabAt(int i) {
        return (x3.d) this.j.get(i);
    }

    @Override // defpackage.x3
    public int getTabCount() {
        return this.j.size();
    }

    @Override // defpackage.x3
    public Context getThemedContext() {
        if (this.b == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(nc6.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.b = new ContextThemeWrapper(this.a, i);
            } else {
                this.b = this.a;
            }
        }
        return this.b;
    }

    @Override // defpackage.x3
    public CharSequence getTitle() {
        return this.f.getTitle();
    }

    @Override // defpackage.x3
    public void hide() {
        if (this.v) {
            return;
        }
        this.v = true;
        t(false);
    }

    void i() {
        f4.a aVar = this.p;
        if (aVar != null) {
            aVar.b(this.o);
            this.o = null;
            this.p = null;
        }
    }

    @Override // defpackage.x3
    public boolean isHideOnContentScrollEnabled() {
        return this.d.q();
    }

    @Override // defpackage.x3
    public boolean isShowing() {
        int height = getHeight();
        return this.y && (height == 0 || getHideOffset() < height);
    }

    @Override // defpackage.x3
    public boolean isTitleTruncated() {
        ad1 ad1Var = this.f;
        return ad1Var != null && ad1Var.j();
    }

    public void k(boolean z) {
        View view;
        bb9 bb9Var = this.z;
        if (bb9Var != null) {
            bb9Var.a();
        }
        if (this.t != 0 || (!this.A && !z)) {
            this.C.b(null);
            return;
        }
        this.e.setAlpha(1.0f);
        this.e.setTransitioning(true);
        bb9 bb9Var2 = new bb9();
        float f = -this.e.getHeight();
        if (z) {
            this.e.getLocationInWindow(new int[]{0, 0});
            f -= r5[1];
        }
        ab9 m = k99.e(this.e).m(f);
        m.k(this.E);
        bb9Var2.c(m);
        if (this.u && (view = this.h) != null) {
            bb9Var2.c(k99.e(view).m(f));
        }
        bb9Var2.f(F);
        bb9Var2.e(250L);
        bb9Var2.g(this.C);
        this.z = bb9Var2;
        bb9Var2.h();
    }

    public void l(boolean z) {
        View view;
        View view2;
        bb9 bb9Var = this.z;
        if (bb9Var != null) {
            bb9Var.a();
        }
        this.e.setVisibility(0);
        if (this.t == 0 && (this.A || z)) {
            this.e.setTranslationY(0.0f);
            float f = -this.e.getHeight();
            if (z) {
                this.e.getLocationInWindow(new int[]{0, 0});
                f -= r5[1];
            }
            this.e.setTranslationY(f);
            bb9 bb9Var2 = new bb9();
            ab9 m = k99.e(this.e).m(0.0f);
            m.k(this.E);
            bb9Var2.c(m);
            if (this.u && (view2 = this.h) != null) {
                view2.setTranslationY(f);
                bb9Var2.c(k99.e(this.h).m(0.0f));
            }
            bb9Var2.f(G);
            bb9Var2.e(250L);
            bb9Var2.g(this.D);
            this.z = bb9Var2;
            bb9Var2.h();
        } else {
            this.e.setAlpha(1.0f);
            this.e.setTranslationY(0.0f);
            if (this.u && (view = this.h) != null) {
                view.setTranslationY(0.0f);
            }
            this.D.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.d;
        if (actionBarOverlayLayout != null) {
            k99.i0(actionBarOverlayLayout);
        }
    }

    @Override // defpackage.x3
    public x3.d newTab() {
        return new e();
    }

    @Override // defpackage.x3
    public void onConfigurationChanged(Configuration configuration) {
        q(z3.b(this.a).g());
    }

    @Override // defpackage.x3
    public boolean onKeyShortcut(int i, KeyEvent keyEvent) {
        Menu e2;
        d dVar = this.n;
        if (dVar == null || (e2 = dVar.e()) == null) {
            return false;
        }
        e2.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return e2.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void onWindowVisibilityChanged(int i) {
        this.t = i;
    }

    @Override // defpackage.x3
    public void removeAllTabs() {
        h();
    }

    @Override // defpackage.x3
    public void removeOnMenuVisibilityListener(x3.b bVar) {
        this.r.remove(bVar);
    }

    @Override // defpackage.x3
    public void removeTab(x3.d dVar) {
        removeTabAt(dVar.d());
    }

    @Override // defpackage.x3
    public void removeTabAt(int i) {
        if (this.i == null) {
            return;
        }
        e eVar = this.k;
        int d2 = eVar != null ? eVar.d() : this.l;
        this.i.k(i);
        e eVar2 = (e) this.j.remove(i);
        if (eVar2 != null) {
            eVar2.h(-1);
        }
        int size = this.j.size();
        for (int i2 = i; i2 < size; i2++) {
            ((e) this.j.get(i2)).h(i2);
        }
        if (d2 == i) {
            selectTab(this.j.isEmpty() ? null : (x3.d) this.j.get(Math.max(0, i - 1)));
        }
    }

    @Override // defpackage.x3
    public boolean requestFocus() {
        ViewGroup s = this.f.s();
        if (s == null || s.hasFocus()) {
            return false;
        }
        s.requestFocus();
        return true;
    }

    @Override // defpackage.x3
    public void selectTab(x3.d dVar) {
        if (getNavigationMode() != 2) {
            this.l = dVar != null ? dVar.d() : -1;
            return;
        }
        r m = (!(this.c instanceof f) || this.f.s().isInEditMode()) ? null : ((f) this.c).getSupportFragmentManager().p().m();
        e eVar = this.k;
        if (eVar != dVar) {
            this.i.setTabSelected(dVar != null ? dVar.d() : -1);
            e eVar2 = this.k;
            if (eVar2 != null) {
                eVar2.g();
                throw null;
            }
            e eVar3 = (e) dVar;
            this.k = eVar3;
            if (eVar3 != null) {
                eVar3.g();
                throw null;
            }
        } else if (eVar != null) {
            eVar.g();
            throw null;
        }
        if (m == null || m.o()) {
            return;
        }
        m.h();
    }

    @Override // defpackage.x3
    public void setBackgroundDrawable(Drawable drawable) {
        this.e.setPrimaryBackground(drawable);
    }

    @Override // defpackage.x3
    public void setCustomView(int i) {
        setCustomView(LayoutInflater.from(getThemedContext()).inflate(i, this.f.s(), false));
    }

    @Override // defpackage.x3
    public void setDefaultDisplayHomeAsUpEnabled(boolean z) {
        if (this.m) {
            return;
        }
        setDisplayHomeAsUpEnabled(z);
    }

    @Override // defpackage.x3
    public void setDisplayHomeAsUpEnabled(boolean z) {
        setDisplayOptions(z ? 4 : 0, 4);
    }

    @Override // defpackage.x3
    public void setDisplayOptions(int i) {
        if ((i & 4) != 0) {
            this.m = true;
        }
        this.f.k(i);
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
        k99.t0(this.e, f);
    }

    @Override // defpackage.x3
    public void setHideOffset(int i) {
        if (i != 0 && !this.d.r()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to set a non-zero hide offset");
        }
        this.d.setActionBarHideOffset(i);
    }

    @Override // defpackage.x3
    public void setHideOnContentScrollEnabled(boolean z) {
        if (z && !this.d.r()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.B = z;
        this.d.setHideOnContentScrollEnabled(z);
    }

    @Override // defpackage.x3
    public void setHomeActionContentDescription(CharSequence charSequence) {
        this.f.l(charSequence);
    }

    @Override // defpackage.x3
    public void setHomeAsUpIndicator(Drawable drawable) {
        this.f.M(drawable);
    }

    @Override // defpackage.x3
    public void setHomeButtonEnabled(boolean z) {
        this.f.t(z);
    }

    @Override // defpackage.x3
    public void setIcon(int i) {
        this.f.setIcon(i);
    }

    @Override // defpackage.x3
    public void setListNavigationCallbacks(SpinnerAdapter spinnerAdapter, x3.c cVar) {
        this.f.H(spinnerAdapter, new o25(cVar));
    }

    @Override // defpackage.x3
    public void setLogo(int i) {
        this.f.D(i);
    }

    @Override // defpackage.x3
    public void setNavigationMode(int i) {
        ActionBarOverlayLayout actionBarOverlayLayout;
        int p = this.f.p();
        if (p == 2) {
            this.l = getSelectedNavigationIndex();
            selectTab(null);
            this.i.setVisibility(8);
        }
        if (p != i && !this.s && (actionBarOverlayLayout = this.d) != null) {
            k99.i0(actionBarOverlayLayout);
        }
        this.f.r(i);
        boolean z = false;
        if (i == 2) {
            m();
            this.i.setVisibility(0);
            int i2 = this.l;
            if (i2 != -1) {
                setSelectedNavigationItem(i2);
                this.l = -1;
            }
        }
        this.f.y(i == 2 && !this.s);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.d;
        if (i == 2 && !this.s) {
            z = true;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z);
    }

    @Override // defpackage.x3
    public void setSelectedNavigationItem(int i) {
        int p = this.f.p();
        if (p == 1) {
            this.f.n(i);
        } else {
            if (p != 2) {
                throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
            }
            selectTab((x3.d) this.j.get(i));
        }
    }

    @Override // defpackage.x3
    public void setShowHideAnimationEnabled(boolean z) {
        bb9 bb9Var;
        this.A = z;
        if (z || (bb9Var = this.z) == null) {
            return;
        }
        bb9Var.a();
    }

    @Override // defpackage.x3
    public void setSplitBackgroundDrawable(Drawable drawable) {
    }

    @Override // defpackage.x3
    public void setStackedBackgroundDrawable(Drawable drawable) {
        this.e.setStackedBackground(drawable);
    }

    @Override // defpackage.x3
    public void setSubtitle(int i) {
        setSubtitle(this.a.getString(i));
    }

    @Override // defpackage.x3
    public void setTitle(int i) {
        setTitle(this.a.getString(i));
    }

    @Override // defpackage.x3
    public void setWindowTitle(CharSequence charSequence) {
        this.f.setWindowTitle(charSequence);
    }

    @Override // defpackage.x3
    public void show() {
        if (this.v) {
            this.v = false;
            t(false);
        }
    }

    @Override // defpackage.x3
    public f4 startActionMode(f4.a aVar) {
        d dVar = this.n;
        if (dVar != null) {
            dVar.c();
        }
        this.d.setHideOnContentScrollEnabled(false);
        this.g.k();
        d dVar2 = new d(this.g.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.n = dVar2;
        dVar2.k();
        this.g.h(dVar2);
        f(true);
        return dVar2;
    }

    @Override // defpackage.x3
    public void addTab(x3.d dVar, int i) {
        addTab(dVar, i, this.j.isEmpty());
    }

    @Override // defpackage.x3
    public void setHomeActionContentDescription(int i) {
        this.f.v(i);
    }

    @Override // defpackage.x3
    public void setHomeAsUpIndicator(int i) {
        this.f.E(i);
    }

    @Override // defpackage.x3
    public void setIcon(Drawable drawable) {
        this.f.setIcon(drawable);
    }

    @Override // defpackage.x3
    public void setLogo(Drawable drawable) {
        this.f.C(drawable);
    }

    @Override // defpackage.x3
    public void setSubtitle(CharSequence charSequence) {
        this.f.m(charSequence);
    }

    @Override // defpackage.x3
    public void setTitle(CharSequence charSequence) {
        this.f.setTitle(charSequence);
    }

    @Override // defpackage.x3
    public void addTab(x3.d dVar, boolean z) {
        m();
        this.i.b(dVar, z);
        j(dVar, this.j.size());
        if (z) {
            selectTab(dVar);
        }
    }

    @Override // defpackage.x3
    public void setDisplayOptions(int i, int i2) {
        int J = this.f.J();
        if ((i2 & 4) != 0) {
            this.m = true;
        }
        this.f.k((i & i2) | ((~i2) & J));
    }

    @Override // defpackage.x3
    public void setCustomView(View view) {
        this.f.K(view);
    }

    @Override // defpackage.x3
    public void setCustomView(View view, x3.a aVar) {
        view.setLayoutParams(aVar);
        this.f.K(view);
    }

    @Override // defpackage.x3
    public void addTab(x3.d dVar, int i, boolean z) {
        m();
        this.i.a(dVar, i, z);
        j(dVar, i);
        if (z) {
            selectTab(dVar);
        }
    }

    public lg9(Dialog dialog) {
        p(dialog.getWindow().getDecorView());
    }
}
