package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import defpackage.fe6;
import defpackage.jq4;
import defpackage.k99;
import defpackage.zi6;

/* loaded from: classes.dex */
final class l extends h implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, j, View.OnKeyListener {
    private static final int B = zi6.abc_popup_menu_item_layout;
    private final Context b;
    private final e c;
    private final d d;
    private final boolean e;
    private final int f;
    private final int g;
    private final int h;
    final jq4 i;
    private PopupWindow.OnDismissListener l;
    private View m;
    View n;
    private j.a r;
    ViewTreeObserver s;
    private boolean t;
    private boolean u;
    private int w;
    private boolean y;
    final ViewTreeObserver.OnGlobalLayoutListener j = new a();
    private final View.OnAttachStateChangeListener k = new b();
    private int x = 0;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!l.this.b() || l.this.i.B()) {
                return;
            }
            View view = l.this.n;
            if (view == null || !view.isShown()) {
                l.this.dismiss();
            } else {
                l.this.i.a();
            }
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = l.this.s;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    l.this.s = view.getViewTreeObserver();
                }
                l lVar = l.this;
                lVar.s.removeGlobalOnLayoutListener(lVar.j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public l(Context context, e eVar, View view, int i, int i2, boolean z) {
        this.b = context;
        this.c = eVar;
        this.e = z;
        this.d = new d(eVar, LayoutInflater.from(context), z, B);
        this.g = i;
        this.h = i2;
        Resources resources = context.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(fe6.abc_config_prefDialogWidth));
        this.m = view;
        this.i = new jq4(context, null, i, i2);
        eVar.c(this, context);
    }

    private boolean z() {
        View view;
        if (b()) {
            return true;
        }
        if (this.t || (view = this.m) == null) {
            return false;
        }
        this.n = view;
        this.i.K(this);
        this.i.L(this);
        this.i.J(true);
        View view2 = this.n;
        boolean z = this.s == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.s = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.j);
        }
        view2.addOnAttachStateChangeListener(this.k);
        this.i.D(view2);
        this.i.G(this.x);
        if (!this.u) {
            this.w = h.n(this.d, null, this.b, this.f);
            this.u = true;
        }
        this.i.F(this.w);
        this.i.I(2);
        this.i.H(m());
        this.i.a();
        ListView p = this.i.p();
        p.setOnKeyListener(this);
        if (this.y && this.c.x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.b).inflate(zi6.abc_popup_menu_header_item_layout, (ViewGroup) p, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.c.x());
            }
            frameLayout.setEnabled(false);
            p.addHeaderView(frameLayout, null, false);
        }
        this.i.n(this.d);
        this.i.a();
        return true;
    }

    @Override // defpackage.er7
    public void a() {
        if (!z()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // defpackage.er7
    public boolean b() {
        return !this.t && this.i.b();
    }

    @Override // androidx.appcompat.view.menu.j
    public void c(e eVar, boolean z) {
        if (eVar != this.c) {
            return;
        }
        dismiss();
        j.a aVar = this.r;
        if (aVar != null) {
            aVar.c(eVar, z);
        }
    }

    @Override // defpackage.er7
    public void dismiss() {
        if (b()) {
            this.i.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void e(j.a aVar) {
        this.r = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean f(m mVar) {
        if (mVar.hasVisibleItems()) {
            i iVar = new i(this.b, mVar, this.n, this.e, this.g, this.h);
            iVar.j(this.r);
            iVar.g(h.x(mVar));
            iVar.i(this.l);
            this.l = null;
            this.c.e(false);
            int c = this.i.c();
            int m = this.i.m();
            if ((Gravity.getAbsoluteGravity(this.x, k99.x(this.m)) & 7) == 5) {
                c += this.m.getWidth();
            }
            if (iVar.n(c, m)) {
                j.a aVar = this.r;
                if (aVar == null) {
                    return true;
                }
                aVar.d(mVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void g(boolean z) {
        this.u = false;
        d dVar = this.d;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean h() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.h
    public void k(e eVar) {
    }

    @Override // androidx.appcompat.view.menu.h
    public void o(View view) {
        this.m = view;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.t = true;
        this.c.close();
        ViewTreeObserver viewTreeObserver = this.s;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.s = this.n.getViewTreeObserver();
            }
            this.s.removeGlobalOnLayoutListener(this.j);
            this.s = null;
        }
        this.n.removeOnAttachStateChangeListener(this.k);
        PopupWindow.OnDismissListener onDismissListener = this.l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.er7
    public ListView p() {
        return this.i.p();
    }

    @Override // androidx.appcompat.view.menu.h
    public void r(boolean z) {
        this.d.d(z);
    }

    @Override // androidx.appcompat.view.menu.h
    public void s(int i) {
        this.x = i;
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(int i) {
        this.i.e(i);
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.l = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(boolean z) {
        this.y = z;
    }

    @Override // androidx.appcompat.view.menu.h
    public void w(int i) {
        this.i.j(i);
    }
}
