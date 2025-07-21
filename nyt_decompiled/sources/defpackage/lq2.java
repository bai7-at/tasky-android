package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.u;
import defpackage.dr8;
import defpackage.mh0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class lq2 extends u {

    class a extends dr8.e {
        final /* synthetic */ Rect a;

        a(Rect rect) {
            this.a = rect;
        }
    }

    class b implements dr8.f {
        final /* synthetic */ View a;
        final /* synthetic */ ArrayList b;

        b(View view, ArrayList arrayList) {
            this.a = view;
            this.b = arrayList;
        }

        @Override // dr8.f
        public void a(dr8 dr8Var) {
            dr8Var.U(this);
            dr8Var.a(this);
        }

        @Override // dr8.f
        public void b(dr8 dr8Var) {
            dr8Var.U(this);
            this.a.setVisibility(8);
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.b.get(i)).setVisibility(0);
            }
        }

        @Override // dr8.f
        public void d(dr8 dr8Var) {
        }

        @Override // dr8.f
        public void e(dr8 dr8Var) {
        }

        @Override // dr8.f
        public void g(dr8 dr8Var) {
        }
    }

    class c extends nr8 {
        final /* synthetic */ Object a;
        final /* synthetic */ ArrayList b;
        final /* synthetic */ Object c;
        final /* synthetic */ ArrayList d;
        final /* synthetic */ Object e;
        final /* synthetic */ ArrayList f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.a = obj;
            this.b = arrayList;
            this.c = obj2;
            this.d = arrayList2;
            this.e = obj3;
            this.f = arrayList3;
        }

        @Override // defpackage.nr8, dr8.f
        public void a(dr8 dr8Var) {
            Object obj = this.a;
            if (obj != null) {
                lq2.this.y(obj, this.b, null);
            }
            Object obj2 = this.c;
            if (obj2 != null) {
                lq2.this.y(obj2, this.d, null);
            }
            Object obj3 = this.e;
            if (obj3 != null) {
                lq2.this.y(obj3, this.f, null);
            }
        }

        @Override // dr8.f
        public void b(dr8 dr8Var) {
            dr8Var.U(this);
        }
    }

    class d implements dr8.f {
        final /* synthetic */ Runnable a;

        d(Runnable runnable) {
            this.a = runnable;
        }

        @Override // dr8.f
        public void a(dr8 dr8Var) {
        }

        @Override // dr8.f
        public void b(dr8 dr8Var) {
            this.a.run();
        }

        @Override // dr8.f
        public void d(dr8 dr8Var) {
        }

        @Override // dr8.f
        public void e(dr8 dr8Var) {
        }

        @Override // dr8.f
        public void g(dr8 dr8Var) {
        }
    }

    class e extends dr8.e {
        final /* synthetic */ Rect a;

        e(Rect rect) {
            this.a = rect;
        }
    }

    private static boolean w(dr8 dr8Var) {
        return (u.i(dr8Var.A()) && u.i(dr8Var.B()) && u.i(dr8Var.D())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void x(Runnable runnable, dr8 dr8Var, Runnable runnable2) {
        if (runnable != null) {
            runnable.run();
        } else {
            dr8Var.cancel();
            runnable2.run();
        }
    }

    @Override // androidx.fragment.app.u
    public void a(Object obj, View view) {
        if (obj != null) {
            ((dr8) obj).b(view);
        }
    }

    @Override // androidx.fragment.app.u
    public void b(Object obj, ArrayList arrayList) {
        dr8 dr8Var = (dr8) obj;
        if (dr8Var == null) {
            return;
        }
        int i = 0;
        if (dr8Var instanceof qr8) {
            qr8 qr8Var = (qr8) dr8Var;
            int p0 = qr8Var.p0();
            while (i < p0) {
                b(qr8Var.o0(i), arrayList);
                i++;
            }
            return;
        }
        if (w(dr8Var) || !u.i(dr8Var.E())) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            dr8Var.b((View) arrayList.get(i));
            i++;
        }
    }

    @Override // androidx.fragment.app.u
    public void c(ViewGroup viewGroup, Object obj) {
        or8.b(viewGroup, (dr8) obj);
    }

    @Override // androidx.fragment.app.u
    public boolean e(Object obj) {
        return obj instanceof dr8;
    }

    @Override // androidx.fragment.app.u
    public Object f(Object obj) {
        if (obj != null) {
            return ((dr8) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.u
    public Object j(Object obj, Object obj2, Object obj3) {
        dr8 dr8Var = (dr8) obj;
        dr8 dr8Var2 = (dr8) obj2;
        dr8 dr8Var3 = (dr8) obj3;
        if (dr8Var != null && dr8Var2 != null) {
            dr8Var = new qr8().l0(dr8Var).l0(dr8Var2).v0(1);
        } else if (dr8Var == null) {
            dr8Var = dr8Var2 != null ? dr8Var2 : null;
        }
        if (dr8Var3 == null) {
            return dr8Var;
        }
        qr8 qr8Var = new qr8();
        if (dr8Var != null) {
            qr8Var.l0(dr8Var);
        }
        qr8Var.l0(dr8Var3);
        return qr8Var;
    }

    @Override // androidx.fragment.app.u
    public Object k(Object obj, Object obj2, Object obj3) {
        qr8 qr8Var = new qr8();
        if (obj != null) {
            qr8Var.l0((dr8) obj);
        }
        if (obj2 != null) {
            qr8Var.l0((dr8) obj2);
        }
        if (obj3 != null) {
            qr8Var.l0((dr8) obj3);
        }
        return qr8Var;
    }

    @Override // androidx.fragment.app.u
    public void m(Object obj, View view, ArrayList arrayList) {
        ((dr8) obj).a(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.u
    public void n(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((dr8) obj).a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.u
    public void o(Object obj, Rect rect) {
        if (obj != null) {
            ((dr8) obj).a0(new e(rect));
        }
    }

    @Override // androidx.fragment.app.u
    public void p(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            h(view, rect);
            ((dr8) obj).a0(new a(rect));
        }
    }

    @Override // androidx.fragment.app.u
    public void q(Fragment fragment, Object obj, mh0 mh0Var, Runnable runnable) {
        z(fragment, obj, mh0Var, null, runnable);
    }

    @Override // androidx.fragment.app.u
    public void s(Object obj, View view, ArrayList arrayList) {
        qr8 qr8Var = (qr8) obj;
        List E = qr8Var.E();
        E.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            u.d(E, (View) arrayList.get(i));
        }
        E.add(view);
        arrayList.add(view);
        b(qr8Var, arrayList);
    }

    @Override // androidx.fragment.app.u
    public void t(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        qr8 qr8Var = (qr8) obj;
        if (qr8Var != null) {
            qr8Var.E().clear();
            qr8Var.E().addAll(arrayList2);
            y(qr8Var, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.u
    public Object u(Object obj) {
        if (obj == null) {
            return null;
        }
        qr8 qr8Var = new qr8();
        qr8Var.l0((dr8) obj);
        return qr8Var;
    }

    public void y(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        dr8 dr8Var = (dr8) obj;
        int i = 0;
        if (dr8Var instanceof qr8) {
            qr8 qr8Var = (qr8) dr8Var;
            int p0 = qr8Var.p0();
            while (i < p0) {
                y(qr8Var.o0(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (w(dr8Var)) {
            return;
        }
        List E = dr8Var.E();
        if (E.size() == arrayList.size() && E.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                dr8Var.b((View) arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                dr8Var.V((View) arrayList.get(size2));
            }
        }
    }

    public void z(Fragment fragment, Object obj, mh0 mh0Var, final Runnable runnable, final Runnable runnable2) {
        final dr8 dr8Var = (dr8) obj;
        mh0Var.b(new mh0.a() { // from class: kq2
            @Override // mh0.a
            public final void b() {
                lq2.x(runnable, dr8Var, runnable2);
            }
        });
        dr8Var.a(new d(runnable2));
    }
}
