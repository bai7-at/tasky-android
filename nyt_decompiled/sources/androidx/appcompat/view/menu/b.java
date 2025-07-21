package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import defpackage.dq4;
import defpackage.fe6;
import defpackage.jq4;
import defpackage.k99;
import defpackage.p23;
import defpackage.zi6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class b extends h implements j, View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int S = zi6.abc_cascading_menu_item_layout;
    private boolean H;
    private j.a L;
    ViewTreeObserver M;
    private PopupWindow.OnDismissListener N;
    boolean Q;
    private final Context b;
    private final int c;
    private final int d;
    private final int e;
    private final boolean f;
    final Handler g;
    private View r;
    View s;
    private boolean u;
    private boolean w;
    private int x;
    private int y;
    private final List h = new ArrayList();
    final List i = new ArrayList();
    final ViewTreeObserver.OnGlobalLayoutListener j = new a();
    private final View.OnAttachStateChangeListener k = new ViewOnAttachStateChangeListenerC0013b();
    private final dq4 l = new c();
    private int m = 0;
    private int n = 0;
    private boolean B = false;
    private int t = D();

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!b.this.b() || b.this.i.size() <= 0 || ((d) b.this.i.get(0)).a.B()) {
                return;
            }
            View view = b.this.s;
            if (view == null || !view.isShown()) {
                b.this.dismiss();
                return;
            }
            Iterator it2 = b.this.i.iterator();
            while (it2.hasNext()) {
                ((d) it2.next()).a.a();
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b, reason: collision with other inner class name */
    class ViewOnAttachStateChangeListenerC0013b implements View.OnAttachStateChangeListener {
        ViewOnAttachStateChangeListenerC0013b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.M;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.M = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.M.removeGlobalOnLayoutListener(bVar.j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    class c implements dq4 {

        class a implements Runnable {
            final /* synthetic */ d a;
            final /* synthetic */ MenuItem b;
            final /* synthetic */ e c;

            a(d dVar, MenuItem menuItem, e eVar) {
                this.a = dVar;
                this.b = menuItem;
                this.c = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.a;
                if (dVar != null) {
                    b.this.Q = true;
                    dVar.b.e(false);
                    b.this.Q = false;
                }
                if (this.b.isEnabled() && this.b.hasSubMenu()) {
                    this.c.L(this.b, 4);
                }
            }
        }

        c() {
        }

        @Override // defpackage.dq4
        public void d(e eVar, MenuItem menuItem) {
            b.this.g.removeCallbacksAndMessages(null);
            int size = b.this.i.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (eVar == ((d) b.this.i.get(i)).b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            b.this.g.postAtTime(new a(i2 < b.this.i.size() ? (d) b.this.i.get(i2) : null, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // defpackage.dq4
        public void o(e eVar, MenuItem menuItem) {
            b.this.g.removeCallbacksAndMessages(eVar);
        }
    }

    private static class d {
        public final jq4 a;
        public final e b;
        public final int c;

        public d(jq4 jq4Var, e eVar, int i) {
            this.a = jq4Var;
            this.b = eVar;
            this.c = i;
        }

        public ListView a() {
            return this.a.p();
        }
    }

    public b(Context context, View view, int i, int i2, boolean z) {
        this.b = context;
        this.r = view;
        this.d = i;
        this.e = i2;
        this.f = z;
        Resources resources = context.getResources();
        this.c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(fe6.abc_config_prefDialogWidth));
        this.g = new Handler();
    }

    private int A(e eVar) {
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            if (eVar == ((d) this.i.get(i)).b) {
                return i;
            }
        }
        return -1;
    }

    private MenuItem B(e eVar, e eVar2) {
        int size = eVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = eVar.getItem(i);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View C(d dVar, e eVar) {
        androidx.appcompat.view.menu.d dVar2;
        int i;
        int firstVisiblePosition;
        MenuItem B = B(dVar.b, eVar);
        if (B == null) {
            return null;
        }
        ListView a2 = dVar.a();
        ListAdapter adapter = a2.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            dVar2 = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (androidx.appcompat.view.menu.d) adapter;
            i = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            }
            if (B == dVar2.getItem(i2)) {
                break;
            }
            i2++;
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + i) - a2.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a2.getChildCount()) {
            return a2.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int D() {
        return k99.x(this.r) == 1 ? 0 : 1;
    }

    private int E(int i) {
        List list = this.i;
        ListView a2 = ((d) list.get(list.size() - 1)).a();
        int[] iArr = new int[2];
        a2.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.s.getWindowVisibleDisplayFrame(rect);
        return this.t == 1 ? (iArr[0] + a2.getWidth()) + i > rect.right ? 0 : 1 : iArr[0] - i < 0 ? 1 : 0;
    }

    private void F(e eVar) {
        d dVar;
        View view;
        LayoutInflater from = LayoutInflater.from(this.b);
        androidx.appcompat.view.menu.d dVar2 = new androidx.appcompat.view.menu.d(eVar, from, this.f, S);
        if (!b() && this.B) {
            dVar2.d(true);
        } else if (b()) {
            dVar2.d(h.x(eVar));
        }
        int n = h.n(dVar2, null, this.b, this.c);
        jq4 z = z();
        z.n(dVar2);
        z.F(n);
        z.G(this.n);
        if (this.i.size() > 0) {
            List list = this.i;
            dVar = (d) list.get(list.size() - 1);
            view = C(dVar, eVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            z.V(false);
            z.S(null);
            int E = E(n);
            boolean z2 = E == 1;
            this.t = E;
            z.D(view);
            if ((this.n & 5) != 5) {
                n = z2 ? view.getWidth() : 0 - n;
            } else if (!z2) {
                n = 0 - view.getWidth();
            }
            z.e(n);
            z.N(true);
            z.j(0);
        } else {
            if (this.u) {
                z.e(this.x);
            }
            if (this.w) {
                z.j(this.y);
            }
            z.H(m());
        }
        this.i.add(new d(z, eVar, this.t));
        z.a();
        ListView p = z.p();
        p.setOnKeyListener(this);
        if (dVar == null && this.H && eVar.x() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(zi6.abc_popup_menu_header_item_layout, (ViewGroup) p, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(eVar.x());
            p.addHeaderView(frameLayout, null, false);
            z.a();
        }
    }

    private jq4 z() {
        jq4 jq4Var = new jq4(this.b, null, this.d, this.e);
        jq4Var.U(this.l);
        jq4Var.L(this);
        jq4Var.K(this);
        jq4Var.D(this.r);
        jq4Var.G(this.n);
        jq4Var.J(true);
        jq4Var.I(2);
        return jq4Var;
    }

    @Override // defpackage.er7
    public void a() {
        if (b()) {
            return;
        }
        Iterator it2 = this.h.iterator();
        while (it2.hasNext()) {
            F((e) it2.next());
        }
        this.h.clear();
        View view = this.r;
        this.s = view;
        if (view != null) {
            boolean z = this.M == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.M = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.j);
            }
            this.s.addOnAttachStateChangeListener(this.k);
        }
    }

    @Override // defpackage.er7
    public boolean b() {
        return this.i.size() > 0 && ((d) this.i.get(0)).a.b();
    }

    @Override // androidx.appcompat.view.menu.j
    public void c(e eVar, boolean z) {
        int A = A(eVar);
        if (A < 0) {
            return;
        }
        int i = A + 1;
        if (i < this.i.size()) {
            ((d) this.i.get(i)).b.e(false);
        }
        d dVar = (d) this.i.remove(A);
        dVar.b.O(this);
        if (this.Q) {
            dVar.a.T(null);
            dVar.a.E(0);
        }
        dVar.a.dismiss();
        int size = this.i.size();
        if (size > 0) {
            this.t = ((d) this.i.get(size - 1)).c;
        } else {
            this.t = D();
        }
        if (size != 0) {
            if (z) {
                ((d) this.i.get(0)).b.e(false);
                return;
            }
            return;
        }
        dismiss();
        j.a aVar = this.L;
        if (aVar != null) {
            aVar.c(eVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.M;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.M.removeGlobalOnLayoutListener(this.j);
            }
            this.M = null;
        }
        this.s.removeOnAttachStateChangeListener(this.k);
        this.N.onDismiss();
    }

    @Override // defpackage.er7
    public void dismiss() {
        int size = this.i.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.i.toArray(new d[size]);
            for (int i = size - 1; i >= 0; i--) {
                d dVar = dVarArr[i];
                if (dVar.a.b()) {
                    dVar.a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void e(j.a aVar) {
        this.L = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean f(m mVar) {
        for (d dVar : this.i) {
            if (mVar == dVar.b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        k(mVar);
        j.a aVar = this.L;
        if (aVar != null) {
            aVar.d(mVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public void g(boolean z) {
        Iterator it2 = this.i.iterator();
        while (it2.hasNext()) {
            h.y(((d) it2.next()).a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean h() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.h
    public void k(e eVar) {
        eVar.c(this, this.b);
        if (b()) {
            F(eVar);
        } else {
            this.h.add(eVar);
        }
    }

    @Override // androidx.appcompat.view.menu.h
    protected boolean l() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.h
    public void o(View view) {
        if (this.r != view) {
            this.r = view;
            this.n = p23.b(this.m, k99.x(view));
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.i.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = (d) this.i.get(i);
            if (!dVar.a.b()) {
                break;
            } else {
                i++;
            }
        }
        if (dVar != null) {
            dVar.b.e(false);
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
        if (this.i.isEmpty()) {
            return null;
        }
        return ((d) this.i.get(r1.size() - 1)).a();
    }

    @Override // androidx.appcompat.view.menu.h
    public void r(boolean z) {
        this.B = z;
    }

    @Override // androidx.appcompat.view.menu.h
    public void s(int i) {
        if (this.m != i) {
            this.m = i;
            this.n = p23.b(i, k99.x(this.r));
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(int i) {
        this.u = true;
        this.x = i;
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.N = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(boolean z) {
        this.H = z;
    }

    @Override // androidx.appcompat.view.menu.h
    public void w(int i) {
        this.w = true;
        this.y = i;
    }
}
