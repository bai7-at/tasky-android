package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import defpackage.er7;
import defpackage.g4;
import defpackage.kp2;
import defpackage.kv1;
import defpackage.nc6;
import defpackage.sn8;
import defpackage.z3;
import defpackage.zi6;
import java.util.ArrayList;

/* loaded from: classes.dex */
class c extends androidx.appcompat.view.menu.a implements g4.a {
    private boolean B;
    private int H;
    private final SparseBooleanArray L;
    e M;
    a N;
    RunnableC0015c Q;
    private b S;
    final f X;
    int Y;
    d k;
    private Drawable l;
    private boolean m;
    private boolean n;
    private boolean r;
    private int s;
    private int t;
    private int u;
    private boolean w;
    private boolean x;
    private boolean y;

    private class a extends androidx.appcompat.view.menu.i {
        public a(Context context, androidx.appcompat.view.menu.m mVar, View view) {
            super(context, mVar, view, false, nc6.actionOverflowMenuStyle);
            if (!((androidx.appcompat.view.menu.g) mVar.getItem()).l()) {
                View view2 = c.this.k;
                f(view2 == null ? (View) ((androidx.appcompat.view.menu.a) c.this).i : view2);
            }
            j(c.this.X);
        }

        @Override // androidx.appcompat.view.menu.i
        protected void e() {
            c cVar = c.this;
            cVar.N = null;
            cVar.Y = 0;
            super.e();
        }
    }

    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public er7 a() {
            a aVar = c.this.N;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c, reason: collision with other inner class name */
    private class RunnableC0015c implements Runnable {
        private e a;

        public RunnableC0015c(e eVar) {
            this.a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.a) c.this).c != null) {
                ((androidx.appcompat.view.menu.a) c.this).c.d();
            }
            View view = (View) ((androidx.appcompat.view.menu.a) c.this).i;
            if (view != null && view.getWindowToken() != null && this.a.m()) {
                c.this.M = this.a;
            }
            c.this.Q = null;
        }
    }

    private class d extends AppCompatImageView implements ActionMenuView.a {

        class a extends kp2 {
            final /* synthetic */ c j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, c cVar) {
                super(view);
                this.j = cVar;
            }

            @Override // defpackage.kp2
            public er7 b() {
                e eVar = c.this.M;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // defpackage.kp2
            public boolean c() {
                c.this.K();
                return true;
            }

            @Override // defpackage.kp2
            public boolean d() {
                c cVar = c.this;
                if (cVar.Q != null) {
                    return false;
                }
                cVar.B();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, nc6.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            sn8.a(this, getContentDescription());
            setOnTouchListener(new a(this, c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.K();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                kv1.l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    private class e extends androidx.appcompat.view.menu.i {
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view, boolean z) {
            super(context, eVar, view, z, nc6.actionOverflowMenuStyle);
            h(8388613);
            j(c.this.X);
        }

        @Override // androidx.appcompat.view.menu.i
        protected void e() {
            if (((androidx.appcompat.view.menu.a) c.this).c != null) {
                ((androidx.appcompat.view.menu.a) c.this).c.close();
            }
            c.this.M = null;
            super.e();
        }
    }

    private class f implements j.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void c(androidx.appcompat.view.menu.e eVar, boolean z) {
            if (eVar instanceof androidx.appcompat.view.menu.m) {
                eVar.D().e(false);
            }
            j.a m = c.this.m();
            if (m != null) {
                m.c(eVar, z);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean d(androidx.appcompat.view.menu.e eVar) {
            if (eVar == ((androidx.appcompat.view.menu.a) c.this).c) {
                return false;
            }
            c.this.Y = ((androidx.appcompat.view.menu.m) eVar).getItem().getItemId();
            j.a m = c.this.m();
            if (m != null) {
                return m.d(eVar);
            }
            return false;
        }
    }

    public c(Context context) {
        super(context, zi6.abc_action_menu_layout, zi6.abc_action_menu_item_layout);
        this.L = new SparseBooleanArray();
        this.X = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View z(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof k.a) && ((k.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable A() {
        d dVar = this.k;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.m) {
            return this.l;
        }
        return null;
    }

    public boolean B() {
        Object obj;
        RunnableC0015c runnableC0015c = this.Q;
        if (runnableC0015c != null && (obj = this.i) != null) {
            ((View) obj).removeCallbacks(runnableC0015c);
            this.Q = null;
            return true;
        }
        e eVar = this.M;
        if (eVar == null) {
            return false;
        }
        eVar.b();
        return true;
    }

    public boolean C() {
        a aVar = this.N;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean D() {
        return this.Q != null || E();
    }

    public boolean E() {
        e eVar = this.M;
        return eVar != null && eVar.d();
    }

    public void F(Configuration configuration) {
        if (!this.w) {
            this.u = z3.b(this.b).d();
        }
        androidx.appcompat.view.menu.e eVar = this.c;
        if (eVar != null) {
            eVar.K(true);
        }
    }

    public void G(boolean z) {
        this.B = z;
    }

    public void H(ActionMenuView actionMenuView) {
        this.i = actionMenuView;
        actionMenuView.a(this.c);
    }

    public void I(Drawable drawable) {
        d dVar = this.k;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.m = true;
            this.l = drawable;
        }
    }

    public void J(boolean z) {
        this.n = z;
        this.r = true;
    }

    public boolean K() {
        androidx.appcompat.view.menu.e eVar;
        if (!this.n || E() || (eVar = this.c) == null || this.i == null || this.Q != null || eVar.z().isEmpty()) {
            return false;
        }
        RunnableC0015c runnableC0015c = new RunnableC0015c(new e(this.b, this.c, this.k, true));
        this.Q = runnableC0015c;
        ((View) this.i).post(runnableC0015c);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a
    public void b(androidx.appcompat.view.menu.g gVar, k.a aVar) {
        aVar.c(gVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.i);
        if (this.S == null) {
            this.S = new b();
        }
        actionMenuItemView.setPopupCallback(this.S);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void c(androidx.appcompat.view.menu.e eVar, boolean z) {
        y();
        super.c(eVar, z);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public boolean f(androidx.appcompat.view.menu.m mVar) {
        boolean z = false;
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.m mVar2 = mVar;
        while (mVar2.e0() != this.c) {
            mVar2 = (androidx.appcompat.view.menu.m) mVar2.e0();
        }
        View z2 = z(mVar2.getItem());
        if (z2 == null) {
            return false;
        }
        this.Y = mVar.getItem().getItemId();
        int size = mVar.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = mVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        a aVar = new a(this.b, mVar, z2);
        this.N = aVar;
        aVar.g(z);
        this.N.k();
        super.f(mVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void g(boolean z) {
        super.g(z);
        ((View) this.i).requestLayout();
        androidx.appcompat.view.menu.e eVar = this.c;
        boolean z2 = false;
        if (eVar != null) {
            ArrayList s = eVar.s();
            int size = s.size();
            for (int i = 0; i < size; i++) {
                g4 b2 = ((androidx.appcompat.view.menu.g) s.get(i)).b();
                if (b2 != null) {
                    b2.k(this);
                }
            }
        }
        androidx.appcompat.view.menu.e eVar2 = this.c;
        ArrayList z3 = eVar2 != null ? eVar2.z() : null;
        if (this.n && z3 != null) {
            int size2 = z3.size();
            if (size2 == 1) {
                z2 = !((androidx.appcompat.view.menu.g) z3.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.k == null) {
                this.k = new d(this.a);
            }
            ViewGroup viewGroup = (ViewGroup) this.k.getParent();
            if (viewGroup != this.i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.i;
                actionMenuView.addView(this.k, actionMenuView.F());
            }
        } else {
            d dVar = this.k;
            if (dVar != null) {
                Object parent = dVar.getParent();
                Object obj = this.i;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.k);
                }
            }
        }
        ((ActionMenuView) this.i).setOverflowReserved(this.n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.j
    public boolean h() {
        ArrayList arrayList;
        int i;
        int i2;
        int i3;
        boolean z;
        int i4;
        c cVar = this;
        androidx.appcompat.view.menu.e eVar = cVar.c;
        View view = null;
        ?? r3 = 0;
        if (eVar != null) {
            arrayList = eVar.E();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i5 = cVar.u;
        int i6 = cVar.t;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.i;
        boolean z2 = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) arrayList.get(i9);
            if (gVar.o()) {
                i7++;
            } else if (gVar.n()) {
                i8++;
            } else {
                z2 = true;
            }
            if (cVar.B && gVar.isActionViewExpanded()) {
                i5 = 0;
            }
        }
        if (cVar.n && (z2 || i8 + i7 > i5)) {
            i5--;
        }
        int i10 = i5 - i7;
        SparseBooleanArray sparseBooleanArray = cVar.L;
        sparseBooleanArray.clear();
        if (cVar.x) {
            int i11 = cVar.H;
            i3 = i6 / i11;
            i2 = i11 + ((i6 % i11) / i3);
        } else {
            i2 = 0;
            i3 = 0;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < i) {
            androidx.appcompat.view.menu.g gVar2 = (androidx.appcompat.view.menu.g) arrayList.get(i12);
            if (gVar2.o()) {
                View n = cVar.n(gVar2, view, viewGroup);
                if (cVar.x) {
                    i3 -= ActionMenuView.L(n, i2, i3, makeMeasureSpec, r3);
                } else {
                    n.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = n.getMeasuredWidth();
                i6 -= measuredWidth;
                if (i13 == 0) {
                    i13 = measuredWidth;
                }
                int groupId = gVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                gVar2.u(true);
                z = r3;
                i4 = i;
            } else if (gVar2.n()) {
                int groupId2 = gVar2.getGroupId();
                boolean z3 = sparseBooleanArray.get(groupId2);
                boolean z4 = (i10 > 0 || z3) && i6 > 0 && (!cVar.x || i3 > 0);
                boolean z5 = z4;
                i4 = i;
                if (z4) {
                    View n2 = cVar.n(gVar2, null, viewGroup);
                    if (cVar.x) {
                        int L = ActionMenuView.L(n2, i2, i3, makeMeasureSpec, 0);
                        i3 -= L;
                        if (L == 0) {
                            z5 = false;
                        }
                    } else {
                        n2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z6 = z5;
                    int measuredWidth2 = n2.getMeasuredWidth();
                    i6 -= measuredWidth2;
                    if (i13 == 0) {
                        i13 = measuredWidth2;
                    }
                    z4 = z6 & (!cVar.x ? i6 + i13 <= 0 : i6 < 0);
                }
                if (z4 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z3) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i14 = 0; i14 < i12; i14++) {
                        androidx.appcompat.view.menu.g gVar3 = (androidx.appcompat.view.menu.g) arrayList.get(i14);
                        if (gVar3.getGroupId() == groupId2) {
                            if (gVar3.l()) {
                                i10++;
                            }
                            gVar3.u(false);
                        }
                    }
                }
                if (z4) {
                    i10--;
                }
                gVar2.u(z4);
                z = false;
            } else {
                z = r3;
                i4 = i;
                gVar2.u(z);
            }
            i12++;
            r3 = z;
            i = i4;
            view = null;
            cVar = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void j(Context context, androidx.appcompat.view.menu.e eVar) {
        super.j(context, eVar);
        Resources resources = context.getResources();
        z3 b2 = z3.b(context);
        if (!this.r) {
            this.n = b2.h();
        }
        if (!this.y) {
            this.s = b2.c();
        }
        if (!this.w) {
            this.u = b2.d();
        }
        int i = this.s;
        if (this.n) {
            if (this.k == null) {
                d dVar = new d(this.a);
                this.k = dVar;
                if (this.m) {
                    dVar.setImageDrawable(this.l);
                    this.l = null;
                    this.m = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.k.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.k.getMeasuredWidth();
        } else {
            this.k = null;
        }
        this.t = i;
        this.H = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean l(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.k) {
            return false;
        }
        return super.l(viewGroup, i);
    }

    @Override // androidx.appcompat.view.menu.a
    public View n(androidx.appcompat.view.menu.g gVar, View view, ViewGroup viewGroup) {
        View actionView = gVar.getActionView();
        if (actionView == null || gVar.j()) {
            actionView = super.n(gVar, view, viewGroup);
        }
        actionView.setVisibility(gVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.a
    public androidx.appcompat.view.menu.k o(ViewGroup viewGroup) {
        androidx.appcompat.view.menu.k kVar = this.i;
        androidx.appcompat.view.menu.k o = super.o(viewGroup);
        if (kVar != o) {
            ((ActionMenuView) o).setPresenter(this);
        }
        return o;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean q(int i, androidx.appcompat.view.menu.g gVar) {
        return gVar.l();
    }

    public boolean y() {
        return C() | B();
    }
}
