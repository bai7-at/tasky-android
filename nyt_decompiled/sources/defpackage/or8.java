package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class or8 {
    private static dr8 a = new m00();
    private static ThreadLocal b = new ThreadLocal();
    static ArrayList c = new ArrayList();

    private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
        dr8 a;
        ViewGroup b;

        /* renamed from: or8$a$a, reason: collision with other inner class name */
        class C0508a extends nr8 {
            final /* synthetic */ so a;

            C0508a(so soVar) {
                this.a = soVar;
            }

            @Override // dr8.f
            public void b(dr8 dr8Var) {
                ((ArrayList) this.a.get(a.this.b)).remove(dr8Var);
                dr8Var.U(this);
            }
        }

        a(dr8 dr8Var, ViewGroup viewGroup) {
            this.a = dr8Var;
            this.b = viewGroup;
        }

        private void a() {
            this.b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!or8.c.remove(this.b)) {
                return true;
            }
            so c = or8.c();
            ArrayList arrayList = (ArrayList) c.get(this.b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                c.put(this.b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.a);
            this.a.a(new C0508a(c));
            this.a.k(this.b, false);
            if (arrayList2 != null) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((dr8) it2.next()).W(this.b);
                }
            }
            this.a.T(this.b);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            or8.c.remove(this.b);
            ArrayList arrayList = (ArrayList) or8.c().get(this.b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((dr8) it2.next()).W(this.b);
                }
            }
            this.a.l(true);
        }
    }

    public static void a(ViewGroup viewGroup) {
        b(viewGroup, null);
    }

    public static void b(ViewGroup viewGroup, dr8 dr8Var) {
        if (c.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        c.add(viewGroup);
        if (dr8Var == null) {
            dr8Var = a;
        }
        dr8 clone = dr8Var.clone();
        e(viewGroup, clone);
        va7.b(viewGroup, null);
        d(viewGroup, clone);
    }

    static so c() {
        so soVar;
        WeakReference weakReference = (WeakReference) b.get();
        if (weakReference != null && (soVar = (so) weakReference.get()) != null) {
            return soVar;
        }
        so soVar2 = new so();
        b.set(new WeakReference(soVar2));
        return soVar2;
    }

    private static void d(ViewGroup viewGroup, dr8 dr8Var) {
        if (dr8Var == null || viewGroup == null) {
            return;
        }
        a aVar = new a(dr8Var, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    private static void e(ViewGroup viewGroup, dr8 dr8Var) {
        ArrayList arrayList = (ArrayList) c().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((dr8) it2.next()).S(viewGroup);
            }
        }
        if (dr8Var != null) {
            dr8Var.k(viewGroup, true);
        }
        va7.a(viewGroup);
    }
}
