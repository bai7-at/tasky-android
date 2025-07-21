package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import defpackage.dr8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class dr8 implements Cloneable {
    private static final Animator[] h0 = new Animator[0];
    private static final int[] i0 = {2, 1, 3, 4};
    private static final tp5 j0 = new a();
    private static ThreadLocal k0 = new ThreadLocal();
    private f[] B;
    private e e0;
    private so f0;
    private ArrayList x;
    private ArrayList y;
    private String a = getClass().getName();
    private long b = -1;
    long c = -1;
    private TimeInterpolator d = null;
    ArrayList e = new ArrayList();
    ArrayList f = new ArrayList();
    private ArrayList g = null;
    private ArrayList h = null;
    private ArrayList i = null;
    private ArrayList j = null;
    private ArrayList k = null;
    private ArrayList l = null;
    private ArrayList m = null;
    private ArrayList n = null;
    private ArrayList r = null;
    private xr8 s = new xr8();
    private xr8 t = new xr8();
    qr8 u = null;
    private int[] w = i0;
    boolean H = false;
    ArrayList L = new ArrayList();
    private Animator[] M = h0;
    int N = 0;
    private boolean Q = false;
    boolean S = false;
    private dr8 X = null;
    private ArrayList Y = null;
    ArrayList Z = new ArrayList();
    private tp5 g0 = j0;

    class a extends tp5 {
        a() {
        }

        @Override // defpackage.tp5
        public Path a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    class b extends AnimatorListenerAdapter {
        final /* synthetic */ so a;

        b(so soVar) {
            this.a = soVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.remove(animator);
            dr8.this.L.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            dr8.this.L.add(animator);
        }
    }

    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            dr8.this.p();
            animator.removeListener(this);
        }
    }

    private static class d {
        View a;
        String b;
        wr8 c;
        WindowId d;
        dr8 e;
        Animator f;

        d(View view, String str, dr8 dr8Var, WindowId windowId, wr8 wr8Var, Animator animator) {
            this.a = view;
            this.b = str;
            this.c = wr8Var;
            this.d = windowId;
            this.e = dr8Var;
            this.f = animator;
        }
    }

    public static abstract class e {
    }

    public interface f {
        void a(dr8 dr8Var);

        void b(dr8 dr8Var);

        default void c(dr8 dr8Var, boolean z) {
            a(dr8Var);
        }

        void d(dr8 dr8Var);

        void e(dr8 dr8Var);

        default void f(dr8 dr8Var, boolean z) {
            b(dr8Var);
        }

        void g(dr8 dr8Var);
    }

    interface g {
        public static final g a = new g() { // from class: er8
            @Override // dr8.g
            public final void c(dr8.f fVar, dr8 dr8Var, boolean z) {
                fVar.c(dr8Var, z);
            }
        };
        public static final g b = new g() { // from class: fr8
            @Override // dr8.g
            public final void c(dr8.f fVar, dr8 dr8Var, boolean z) {
                fVar.f(dr8Var, z);
            }
        };
        public static final g c = new g() { // from class: gr8
            @Override // dr8.g
            public final void c(dr8.f fVar, dr8 dr8Var, boolean z) {
                fVar.d(dr8Var);
            }
        };
        public static final g d = new g() { // from class: hr8
            @Override // dr8.g
            public final void c(dr8.f fVar, dr8 dr8Var, boolean z) {
                fVar.g(dr8Var);
            }
        };
        public static final g e = new g() { // from class: ir8
            @Override // dr8.g
            public final void c(dr8.f fVar, dr8 dr8Var, boolean z) {
                fVar.e(dr8Var);
            }
        };

        void c(f fVar, dr8 dr8Var, boolean z);
    }

    private static boolean J(wr8 wr8Var, wr8 wr8Var2, String str) {
        Object obj = wr8Var.a.get(str);
        Object obj2 = wr8Var2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private void K(so soVar, so soVar2, SparseArray sparseArray, SparseArray sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) sparseArray.valueAt(i);
            if (view2 != null && I(view2) && (view = (View) sparseArray2.get(sparseArray.keyAt(i))) != null && I(view)) {
                wr8 wr8Var = (wr8) soVar.get(view2);
                wr8 wr8Var2 = (wr8) soVar2.get(view);
                if (wr8Var != null && wr8Var2 != null) {
                    this.x.add(wr8Var);
                    this.y.add(wr8Var2);
                    soVar.remove(view2);
                    soVar2.remove(view);
                }
            }
        }
    }

    private void M(so soVar, so soVar2) {
        wr8 wr8Var;
        for (int size = soVar.size() - 1; size >= 0; size--) {
            View view = (View) soVar.i(size);
            if (view != null && I(view) && (wr8Var = (wr8) soVar2.remove(view)) != null && I(wr8Var.b)) {
                this.x.add((wr8) soVar.l(size));
                this.y.add(wr8Var);
            }
        }
    }

    private void N(so soVar, so soVar2, lb4 lb4Var, lb4 lb4Var2) {
        View view;
        int l = lb4Var.l();
        for (int i = 0; i < l; i++) {
            View view2 = (View) lb4Var.m(i);
            if (view2 != null && I(view2) && (view = (View) lb4Var2.d(lb4Var.g(i))) != null && I(view)) {
                wr8 wr8Var = (wr8) soVar.get(view2);
                wr8 wr8Var2 = (wr8) soVar2.get(view);
                if (wr8Var != null && wr8Var2 != null) {
                    this.x.add(wr8Var);
                    this.y.add(wr8Var2);
                    soVar.remove(view2);
                    soVar2.remove(view);
                }
            }
        }
    }

    private void O(so soVar, so soVar2, so soVar3, so soVar4) {
        View view;
        int size = soVar3.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) soVar3.n(i);
            if (view2 != null && I(view2) && (view = (View) soVar4.get(soVar3.i(i))) != null && I(view)) {
                wr8 wr8Var = (wr8) soVar.get(view2);
                wr8 wr8Var2 = (wr8) soVar2.get(view);
                if (wr8Var != null && wr8Var2 != null) {
                    this.x.add(wr8Var);
                    this.y.add(wr8Var2);
                    soVar.remove(view2);
                    soVar2.remove(view);
                }
            }
        }
    }

    private void P(xr8 xr8Var, xr8 xr8Var2) {
        so soVar = new so(xr8Var.a);
        so soVar2 = new so(xr8Var2.a);
        int i = 0;
        while (true) {
            int[] iArr = this.w;
            if (i >= iArr.length) {
                c(soVar, soVar2);
                return;
            }
            int i2 = iArr[i];
            if (i2 == 1) {
                M(soVar, soVar2);
            } else if (i2 == 2) {
                O(soVar, soVar2, xr8Var.d, xr8Var2.d);
            } else if (i2 == 3) {
                K(soVar, soVar2, xr8Var.b, xr8Var2.b);
            } else if (i2 == 4) {
                N(soVar, soVar2, xr8Var.c, xr8Var2.c);
            }
            i++;
        }
    }

    private void Q(dr8 dr8Var, g gVar, boolean z) {
        dr8 dr8Var2 = this.X;
        if (dr8Var2 != null) {
            dr8Var2.Q(dr8Var, gVar, z);
        }
        ArrayList arrayList = this.Y;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.Y.size();
        f[] fVarArr = this.B;
        if (fVarArr == null) {
            fVarArr = new f[size];
        }
        this.B = null;
        f[] fVarArr2 = (f[]) this.Y.toArray(fVarArr);
        for (int i = 0; i < size; i++) {
            gVar.c(fVarArr2[i], dr8Var, z);
            fVarArr2[i] = null;
        }
        this.B = fVarArr2;
    }

    private void X(Animator animator, so soVar) {
        if (animator != null) {
            animator.addListener(new b(soVar));
            e(animator);
        }
    }

    private void c(so soVar, so soVar2) {
        for (int i = 0; i < soVar.size(); i++) {
            wr8 wr8Var = (wr8) soVar.n(i);
            if (I(wr8Var.b)) {
                this.x.add(wr8Var);
                this.y.add(null);
            }
        }
        for (int i2 = 0; i2 < soVar2.size(); i2++) {
            wr8 wr8Var2 = (wr8) soVar2.n(i2);
            if (I(wr8Var2.b)) {
                this.y.add(wr8Var2);
                this.x.add(null);
            }
        }
    }

    private static void d(xr8 xr8Var, View view, wr8 wr8Var) {
        xr8Var.a.put(view, wr8Var);
        int id = view.getId();
        if (id >= 0) {
            if (xr8Var.b.indexOfKey(id) >= 0) {
                xr8Var.b.put(id, null);
            } else {
                xr8Var.b.put(id, view);
            }
        }
        String G = k99.G(view);
        if (G != null) {
            if (xr8Var.d.containsKey(G)) {
                xr8Var.d.put(G, null);
            } else {
                xr8Var.d.put(G, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (xr8Var.c.e(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    xr8Var.c.h(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) xr8Var.c.d(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    xr8Var.c.h(itemIdAtPosition, null);
                }
            }
        }
    }

    private void g(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList arrayList = this.i;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList arrayList2 = this.j;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList arrayList3 = this.k;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i = 0; i < size; i++) {
                        if (((Class) this.k.get(i)).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    wr8 wr8Var = new wr8(view);
                    if (z) {
                        i(wr8Var);
                    } else {
                        f(wr8Var);
                    }
                    wr8Var.c.add(this);
                    h(wr8Var);
                    if (z) {
                        d(this.s, view, wr8Var);
                    } else {
                        d(this.t, view, wr8Var);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList arrayList4 = this.m;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList arrayList5 = this.n;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList arrayList6 = this.r;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i2 = 0; i2 < size2; i2++) {
                                    if (((Class) this.r.get(i2)).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                g(viewGroup.getChildAt(i3), z);
                            }
                        }
                    }
                }
            }
        }
    }

    private static so y() {
        so soVar = (so) k0.get();
        if (soVar != null) {
            return soVar;
        }
        so soVar2 = new so();
        k0.set(soVar2);
        return soVar2;
    }

    public List A() {
        return this.e;
    }

    public List B() {
        return this.g;
    }

    public List D() {
        return this.h;
    }

    public List E() {
        return this.f;
    }

    public String[] F() {
        return null;
    }

    public wr8 G(View view, boolean z) {
        qr8 qr8Var = this.u;
        if (qr8Var != null) {
            return qr8Var.G(view, z);
        }
        return (wr8) (z ? this.s : this.t).a.get(view);
    }

    public boolean H(wr8 wr8Var, wr8 wr8Var2) {
        if (wr8Var == null || wr8Var2 == null) {
            return false;
        }
        String[] F = F();
        if (F == null) {
            Iterator it2 = wr8Var.a.keySet().iterator();
            while (it2.hasNext()) {
                if (J(wr8Var, wr8Var2, (String) it2.next())) {
                }
            }
            return false;
        }
        for (String str : F) {
            if (!J(wr8Var, wr8Var2, str)) {
            }
        }
        return false;
        return true;
    }

    boolean I(View view) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int id = view.getId();
        ArrayList arrayList3 = this.i;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList arrayList4 = this.j;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList arrayList5 = this.k;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i = 0; i < size; i++) {
                if (((Class) this.k.get(i)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.l != null && k99.G(view) != null && this.l.contains(k99.G(view))) {
            return false;
        }
        if ((this.e.size() == 0 && this.f.size() == 0 && (((arrayList = this.h) == null || arrayList.isEmpty()) && ((arrayList2 = this.g) == null || arrayList2.isEmpty()))) || this.e.contains(Integer.valueOf(id)) || this.f.contains(view)) {
            return true;
        }
        ArrayList arrayList6 = this.g;
        if (arrayList6 != null && arrayList6.contains(k99.G(view))) {
            return true;
        }
        if (this.h != null) {
            for (int i2 = 0; i2 < this.h.size(); i2++) {
                if (((Class) this.h.get(i2)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    void R(g gVar, boolean z) {
        Q(this, gVar, z);
    }

    public void S(View view) {
        if (this.S) {
            return;
        }
        int size = this.L.size();
        Animator[] animatorArr = (Animator[]) this.L.toArray(this.M);
        this.M = h0;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.M = animatorArr;
        R(g.d, false);
        this.Q = true;
    }

    void T(ViewGroup viewGroup) {
        d dVar;
        this.x = new ArrayList();
        this.y = new ArrayList();
        P(this.s, this.t);
        so y = y();
        int size = y.size();
        WindowId windowId = viewGroup.getWindowId();
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = (Animator) y.i(i);
            if (animator != null && (dVar = (d) y.get(animator)) != null && dVar.a != null && windowId.equals(dVar.d)) {
                wr8 wr8Var = dVar.c;
                View view = dVar.a;
                wr8 G = G(view, true);
                wr8 t = t(view, true);
                if (G == null && t == null) {
                    t = (wr8) this.t.a.get(view);
                }
                if ((G != null || t != null) && dVar.e.H(wr8Var, t)) {
                    dVar.e.x().getClass();
                    if (animator.isRunning() || animator.isStarted()) {
                        animator.cancel();
                    } else {
                        y.remove(animator);
                    }
                }
            }
        }
        o(viewGroup, this.s, this.t, this.x, this.y);
        Y();
    }

    public dr8 U(f fVar) {
        dr8 dr8Var;
        ArrayList arrayList = this.Y;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(fVar) && (dr8Var = this.X) != null) {
            dr8Var.U(fVar);
        }
        if (this.Y.size() == 0) {
            this.Y = null;
        }
        return this;
    }

    public dr8 V(View view) {
        this.f.remove(view);
        return this;
    }

    public void W(View view) {
        if (this.Q) {
            if (!this.S) {
                int size = this.L.size();
                Animator[] animatorArr = (Animator[]) this.L.toArray(this.M);
                this.M = h0;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.M = animatorArr;
                R(g.e, false);
            }
            this.Q = false;
        }
    }

    protected void Y() {
        h0();
        so y = y();
        Iterator it2 = this.Z.iterator();
        while (it2.hasNext()) {
            Animator animator = (Animator) it2.next();
            if (y.containsKey(animator)) {
                h0();
                X(animator, y);
            }
        }
        this.Z.clear();
        p();
    }

    public dr8 Z(long j) {
        this.c = j;
        return this;
    }

    public dr8 a(f fVar) {
        if (this.Y == null) {
            this.Y = new ArrayList();
        }
        this.Y.add(fVar);
        return this;
    }

    public void a0(e eVar) {
        this.e0 = eVar;
    }

    public dr8 b(View view) {
        this.f.add(view);
        return this;
    }

    public dr8 b0(TimeInterpolator timeInterpolator) {
        this.d = timeInterpolator;
        return this;
    }

    public void c0(tp5 tp5Var) {
        if (tp5Var == null) {
            this.g0 = j0;
        } else {
            this.g0 = tp5Var;
        }
    }

    protected void cancel() {
        int size = this.L.size();
        Animator[] animatorArr = (Animator[]) this.L.toArray(this.M);
        this.M = h0;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.M = animatorArr;
        R(g.c, false);
    }

    public void d0(pr8 pr8Var) {
    }

    protected void e(Animator animator) {
        if (animator == null) {
            p();
            return;
        }
        if (q() >= 0) {
            animator.setDuration(q());
        }
        if (z() >= 0) {
            animator.setStartDelay(z() + animator.getStartDelay());
        }
        if (s() != null) {
            animator.setInterpolator(s());
        }
        animator.addListener(new c());
        animator.start();
    }

    public abstract void f(wr8 wr8Var);

    public dr8 g0(long j) {
        this.b = j;
        return this;
    }

    void h(wr8 wr8Var) {
    }

    protected void h0() {
        if (this.N == 0) {
            R(g.a, false);
            this.S = false;
        }
        this.N++;
    }

    public abstract void i(wr8 wr8Var);

    String i0(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.c != -1) {
            sb.append("dur(");
            sb.append(this.c);
            sb.append(") ");
        }
        if (this.b != -1) {
            sb.append("dly(");
            sb.append(this.b);
            sb.append(") ");
        }
        if (this.d != null) {
            sb.append("interp(");
            sb.append(this.d);
            sb.append(") ");
        }
        if (this.e.size() > 0 || this.f.size() > 0) {
            sb.append("tgts(");
            if (this.e.size() > 0) {
                for (int i = 0; i < this.e.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.e.get(i));
                }
            }
            if (this.f.size() > 0) {
                for (int i2 = 0; i2 < this.f.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.f.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    void k(ViewGroup viewGroup, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        so soVar;
        l(z);
        if ((this.e.size() > 0 || this.f.size() > 0) && (((arrayList = this.g) == null || arrayList.isEmpty()) && ((arrayList2 = this.h) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.e.size(); i++) {
                View findViewById = viewGroup.findViewById(((Integer) this.e.get(i)).intValue());
                if (findViewById != null) {
                    wr8 wr8Var = new wr8(findViewById);
                    if (z) {
                        i(wr8Var);
                    } else {
                        f(wr8Var);
                    }
                    wr8Var.c.add(this);
                    h(wr8Var);
                    if (z) {
                        d(this.s, findViewById, wr8Var);
                    } else {
                        d(this.t, findViewById, wr8Var);
                    }
                }
            }
            for (int i2 = 0; i2 < this.f.size(); i2++) {
                View view = (View) this.f.get(i2);
                wr8 wr8Var2 = new wr8(view);
                if (z) {
                    i(wr8Var2);
                } else {
                    f(wr8Var2);
                }
                wr8Var2.c.add(this);
                h(wr8Var2);
                if (z) {
                    d(this.s, view, wr8Var2);
                } else {
                    d(this.t, view, wr8Var2);
                }
            }
        } else {
            g(viewGroup, z);
        }
        if (z || (soVar = this.f0) == null) {
            return;
        }
        int size = soVar.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList3.add((View) this.s.d.remove((String) this.f0.i(i3)));
        }
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) arrayList3.get(i4);
            if (view2 != null) {
                this.s.d.put((String) this.f0.n(i4), view2);
            }
        }
    }

    void l(boolean z) {
        if (z) {
            this.s.a.clear();
            this.s.b.clear();
            this.s.c.a();
        } else {
            this.t.a.clear();
            this.t.b.clear();
            this.t.c.a();
        }
    }

    @Override // 
    /* renamed from: m */
    public dr8 clone() {
        try {
            dr8 dr8Var = (dr8) super.clone();
            dr8Var.Z = new ArrayList();
            dr8Var.s = new xr8();
            dr8Var.t = new xr8();
            dr8Var.x = null;
            dr8Var.y = null;
            dr8Var.X = this;
            dr8Var.Y = null;
            return dr8Var;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public Animator n(ViewGroup viewGroup, wr8 wr8Var, wr8 wr8Var2) {
        return null;
    }

    void o(ViewGroup viewGroup, xr8 xr8Var, xr8 xr8Var2, ArrayList arrayList, ArrayList arrayList2) {
        View view;
        Animator animator;
        wr8 wr8Var;
        int i;
        Animator animator2;
        wr8 wr8Var2;
        so y = y();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        x().getClass();
        int i2 = 0;
        while (i2 < size) {
            wr8 wr8Var3 = (wr8) arrayList.get(i2);
            wr8 wr8Var4 = (wr8) arrayList2.get(i2);
            if (wr8Var3 != null && !wr8Var3.c.contains(this)) {
                wr8Var3 = null;
            }
            if (wr8Var4 != null && !wr8Var4.c.contains(this)) {
                wr8Var4 = null;
            }
            if ((wr8Var3 != null || wr8Var4 != null) && (wr8Var3 == null || wr8Var4 == null || H(wr8Var3, wr8Var4))) {
                Animator n = n(viewGroup, wr8Var3, wr8Var4);
                if (n != null) {
                    if (wr8Var4 != null) {
                        View view2 = wr8Var4.b;
                        String[] F = F();
                        if (F != null && F.length > 0) {
                            wr8Var2 = new wr8(view2);
                            wr8 wr8Var5 = (wr8) xr8Var2.a.get(view2);
                            if (wr8Var5 != null) {
                                int i3 = 0;
                                while (i3 < F.length) {
                                    Map map = wr8Var2.a;
                                    Animator animator3 = n;
                                    String str = F[i3];
                                    map.put(str, wr8Var5.a.get(str));
                                    i3++;
                                    n = animator3;
                                    F = F;
                                }
                            }
                            Animator animator4 = n;
                            int size2 = y.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 >= size2) {
                                    animator2 = animator4;
                                    break;
                                }
                                d dVar = (d) y.get((Animator) y.i(i4));
                                if (dVar.c != null && dVar.a == view2 && dVar.b.equals(u()) && dVar.c.equals(wr8Var2)) {
                                    animator2 = null;
                                    break;
                                }
                                i4++;
                            }
                        } else {
                            animator2 = n;
                            wr8Var2 = null;
                        }
                        view = view2;
                        animator = animator2;
                        wr8Var = wr8Var2;
                    } else {
                        view = wr8Var3.b;
                        animator = n;
                        wr8Var = null;
                    }
                    if (animator != null) {
                        i = size;
                        y.put(animator, new d(view, u(), this, viewGroup.getWindowId(), wr8Var, animator));
                        this.Z.add(animator);
                        i2++;
                        size = i;
                    }
                }
            }
            i = size;
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                d dVar2 = (d) y.get((Animator) this.Z.get(sparseIntArray.keyAt(i5)));
                dVar2.f.setStartDelay((sparseIntArray.valueAt(i5) - Long.MAX_VALUE) + dVar2.f.getStartDelay());
            }
        }
    }

    protected void p() {
        int i = this.N - 1;
        this.N = i;
        if (i == 0) {
            R(g.b, false);
            for (int i2 = 0; i2 < this.s.c.l(); i2++) {
                View view = (View) this.s.c.m(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < this.t.c.l(); i3++) {
                View view2 = (View) this.t.c.m(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.S = true;
        }
    }

    public long q() {
        return this.c;
    }

    public e r() {
        return this.e0;
    }

    public TimeInterpolator s() {
        return this.d;
    }

    wr8 t(View view, boolean z) {
        qr8 qr8Var = this.u;
        if (qr8Var != null) {
            return qr8Var.t(view, z);
        }
        ArrayList arrayList = z ? this.x : this.y;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            wr8 wr8Var = (wr8) arrayList.get(i);
            if (wr8Var == null) {
                return null;
            }
            if (wr8Var.b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (wr8) (z ? this.y : this.x).get(i);
        }
        return null;
    }

    public String toString() {
        return i0("");
    }

    public String u() {
        return this.a;
    }

    public tp5 v() {
        return this.g0;
    }

    public pr8 w() {
        return null;
    }

    public final dr8 x() {
        qr8 qr8Var = this.u;
        return qr8Var != null ? qr8Var.x() : this;
    }

    public long z() {
        return this.b;
    }
}
