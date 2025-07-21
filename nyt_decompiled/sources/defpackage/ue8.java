package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.view.Display;
import defpackage.qn4;
import defpackage.rn4;
import defpackage.sm4;
import defpackage.sn4;
import defpackage.vm4;
import defpackage.wm4;
import defpackage.zm4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
abstract class ue8 extends vm4 {

    private static class a extends d {
        public a(Context context, e eVar) {
            super(context, eVar);
        }

        @Override // ue8.d, ue8.c, ue8.b
        protected void O(b.C0545b c0545b, sm4.a aVar) {
            super.O(c0545b, aVar);
            aVar.i(pn4.a(c0545b.a));
        }
    }

    static class b extends ue8 implements qn4.a, qn4.e {
        private static final ArrayList w;
        private static final ArrayList x;
        private final e i;
        protected final Object j;
        protected final Object k;
        protected final Object l;
        protected final Object m;
        protected int n;
        protected boolean r;
        protected boolean s;
        protected final ArrayList t;
        protected final ArrayList u;

        protected static final class a extends vm4.e {
            private final Object a;

            public a(Object obj) {
                this.a = obj;
            }

            @Override // vm4.e
            public void f(int i) {
                qn4.c.i(this.a, i);
            }

            @Override // vm4.e
            public void i(int i) {
                qn4.c.j(this.a, i);
            }
        }

        /* renamed from: ue8$b$b, reason: collision with other inner class name */
        protected static final class C0545b {
            public final Object a;
            public final String b;
            public sm4 c;

            public C0545b(Object obj, String str) {
                this.a = obj;
                this.b = str;
            }
        }

        protected static final class c {
            public final zm4.h a;
            public final Object b;

            public c(zm4.h hVar, Object obj) {
                this.a = hVar;
                this.b = obj;
            }
        }

        static {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
            ArrayList arrayList = new ArrayList();
            w = arrayList;
            arrayList.add(intentFilter);
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
            ArrayList arrayList2 = new ArrayList();
            x = arrayList2;
            arrayList2.add(intentFilter2);
        }

        public b(Context context, e eVar) {
            super(context);
            this.t = new ArrayList();
            this.u = new ArrayList();
            this.i = eVar;
            Object e = qn4.e(context);
            this.j = e;
            this.k = G();
            this.l = H();
            this.m = qn4.b(e, context.getResources().getString(zk6.mr_user_route_category_name), false);
            T();
        }

        private boolean E(Object obj) {
            if (N(obj) != null || I(obj) >= 0) {
                return false;
            }
            C0545b c0545b = new C0545b(obj, F(obj));
            S(c0545b);
            this.t.add(c0545b);
            return true;
        }

        private String F(Object obj) {
            String format = L() == obj ? "DEFAULT_ROUTE" : String.format(Locale.US, "ROUTE_%08x", Integer.valueOf(M(obj).hashCode()));
            if (J(format) < 0) {
                return format;
            }
            int i = 2;
            while (true) {
                String format2 = String.format(Locale.US, "%s_%d", format, Integer.valueOf(i));
                if (J(format2) < 0) {
                    return format2;
                }
                i++;
            }
        }

        private void T() {
            R();
            Iterator it2 = qn4.f(this.j).iterator();
            boolean z = false;
            while (it2.hasNext()) {
                z |= E(it2.next());
            }
            if (z) {
                P();
            }
        }

        @Override // defpackage.ue8
        public void A(zm4.h hVar) {
            if (hVar.q() == this) {
                int I = I(qn4.g(this.j, 8388611));
                if (I < 0 || !((C0545b) this.t.get(I)).b.equals(hVar.e())) {
                    return;
                }
                hVar.H();
                return;
            }
            Object c2 = qn4.c(this.j, this.m);
            c cVar = new c(hVar, c2);
            qn4.c.k(c2, cVar);
            qn4.d.f(c2, this.l);
            U(cVar);
            this.u.add(cVar);
            qn4.a(this.j, c2);
        }

        @Override // defpackage.ue8
        public void B(zm4.h hVar) {
            int K;
            if (hVar.q() == this || (K = K(hVar)) < 0) {
                return;
            }
            U((c) this.u.get(K));
        }

        @Override // defpackage.ue8
        public void C(zm4.h hVar) {
            int K;
            if (hVar.q() == this || (K = K(hVar)) < 0) {
                return;
            }
            c cVar = (c) this.u.remove(K);
            qn4.c.k(cVar.b, null);
            qn4.d.f(cVar.b, null);
            qn4.i(this.j, cVar.b);
        }

        @Override // defpackage.ue8
        public void D(zm4.h hVar) {
            if (hVar.B()) {
                if (hVar.q() != this) {
                    int K = K(hVar);
                    if (K >= 0) {
                        Q(((c) this.u.get(K)).b);
                        return;
                    }
                    return;
                }
                int J = J(hVar.e());
                if (J >= 0) {
                    Q(((C0545b) this.t.get(J)).a);
                }
            }
        }

        protected abstract Object G();

        protected Object H() {
            return qn4.d(this);
        }

        protected int I(Object obj) {
            int size = this.t.size();
            for (int i = 0; i < size; i++) {
                if (((C0545b) this.t.get(i)).a == obj) {
                    return i;
                }
            }
            return -1;
        }

        protected int J(String str) {
            int size = this.t.size();
            for (int i = 0; i < size; i++) {
                if (((C0545b) this.t.get(i)).b.equals(str)) {
                    return i;
                }
            }
            return -1;
        }

        protected int K(zm4.h hVar) {
            int size = this.u.size();
            for (int i = 0; i < size; i++) {
                if (((c) this.u.get(i)).a == hVar) {
                    return i;
                }
            }
            return -1;
        }

        protected abstract Object L();

        protected String M(Object obj) {
            CharSequence a2 = qn4.c.a(obj, n());
            return a2 != null ? a2.toString() : "";
        }

        protected c N(Object obj) {
            Object e = qn4.c.e(obj);
            if (e instanceof c) {
                return (c) e;
            }
            return null;
        }

        protected void O(C0545b c0545b, sm4.a aVar) {
            int d = qn4.c.d(c0545b.a);
            if ((d & 1) != 0) {
                aVar.b(w);
            }
            if ((d & 2) != 0) {
                aVar.b(x);
            }
            aVar.p(qn4.c.c(c0545b.a));
            aVar.o(qn4.c.b(c0545b.a));
            aVar.r(qn4.c.f(c0545b.a));
            aVar.t(qn4.c.h(c0545b.a));
            aVar.s(qn4.c.g(c0545b.a));
        }

        protected void P() {
            wm4.a aVar = new wm4.a();
            int size = this.t.size();
            for (int i = 0; i < size; i++) {
                aVar.a(((C0545b) this.t.get(i)).c);
            }
            w(aVar.c());
        }

        protected abstract void Q(Object obj);

        protected abstract void R();

        protected void S(C0545b c0545b) {
            sm4.a aVar = new sm4.a(c0545b.b, M(c0545b.a));
            O(c0545b, aVar);
            c0545b.c = aVar.e();
        }

        protected void U(c cVar) {
            qn4.d.a(cVar.b, cVar.a.l());
            qn4.d.c(cVar.b, cVar.a.n());
            qn4.d.b(cVar.b, cVar.a.m());
            qn4.d.e(cVar.b, cVar.a.r());
            qn4.d.h(cVar.b, cVar.a.t());
            qn4.d.g(cVar.b, cVar.a.s());
        }

        @Override // qn4.e
        public void a(Object obj, int i) {
            c N = N(obj);
            if (N != null) {
                N.a.G(i);
            }
        }

        @Override // qn4.a
        public void b(Object obj, Object obj2) {
        }

        @Override // qn4.a
        public void c(Object obj, Object obj2, int i) {
        }

        @Override // qn4.e
        public void d(Object obj, int i) {
            c N = N(obj);
            if (N != null) {
                N.a.F(i);
            }
        }

        @Override // qn4.a
        public void e(Object obj) {
            int I;
            if (N(obj) != null || (I = I(obj)) < 0) {
                return;
            }
            S((C0545b) this.t.get(I));
            P();
        }

        @Override // qn4.a
        public void f(int i, Object obj) {
        }

        @Override // qn4.a
        public void g(Object obj) {
            int I;
            if (N(obj) != null || (I = I(obj)) < 0) {
                return;
            }
            this.t.remove(I);
            P();
        }

        @Override // qn4.a
        public void h(int i, Object obj) {
            if (obj != qn4.g(this.j, 8388611)) {
                return;
            }
            c N = N(obj);
            if (N != null) {
                N.a.H();
                return;
            }
            int I = I(obj);
            if (I >= 0) {
                this.i.c(((C0545b) this.t.get(I)).b);
            }
        }

        @Override // qn4.a
        public void j(Object obj) {
            if (E(obj)) {
                P();
            }
        }

        @Override // qn4.a
        public void k(Object obj) {
            int I;
            if (N(obj) != null || (I = I(obj)) < 0) {
                return;
            }
            C0545b c0545b = (C0545b) this.t.get(I);
            int f = qn4.c.f(obj);
            if (f != c0545b.c.t()) {
                c0545b.c = new sm4.a(c0545b.c).r(f).e();
                P();
            }
        }

        @Override // defpackage.vm4
        public vm4.e s(String str) {
            int J = J(str);
            if (J >= 0) {
                return new a(((C0545b) this.t.get(J)).a);
            }
            return null;
        }

        @Override // defpackage.vm4
        public void u(um4 um4Var) {
            boolean z;
            int i = 0;
            if (um4Var != null) {
                List e = um4Var.c().e();
                int size = e.size();
                int i2 = 0;
                while (i < size) {
                    String str = (String) e.get(i);
                    i2 = str.equals("android.media.intent.category.LIVE_AUDIO") ? i2 | 1 : str.equals("android.media.intent.category.LIVE_VIDEO") ? i2 | 2 : i2 | 8388608;
                    i++;
                }
                z = um4Var.d();
                i = i2;
            } else {
                z = false;
            }
            if (this.n == i && this.r == z) {
                return;
            }
            this.n = i;
            this.r = z;
            T();
        }
    }

    private static class c extends b implements rn4.a {
        public c(Context context, e eVar) {
            super(context, eVar);
        }

        @Override // ue8.b
        protected Object G() {
            return rn4.a(this);
        }

        @Override // ue8.b
        protected void O(b.C0545b c0545b, sm4.a aVar) {
            super.O(c0545b, aVar);
            if (!rn4.c.b(c0545b.a)) {
                aVar.j(false);
            }
            if (V(c0545b)) {
                aVar.g(1);
            }
            Display a = rn4.c.a(c0545b.a);
            if (a != null) {
                aVar.q(a.getDisplayId());
            }
        }

        protected abstract boolean V(b.C0545b c0545b);

        @Override // rn4.a
        public void i(Object obj) {
            int I = I(obj);
            if (I >= 0) {
                b.C0545b c0545b = (b.C0545b) this.t.get(I);
                Display a = rn4.c.a(obj);
                int displayId = a != null ? a.getDisplayId() : -1;
                if (displayId != c0545b.c.r()) {
                    c0545b.c = new sm4.a(c0545b.c).q(displayId).e();
                    P();
                }
            }
        }
    }

    private static class d extends c {
        public d(Context context, e eVar) {
            super(context, eVar);
        }

        @Override // ue8.b
        protected Object L() {
            return sn4.b(this.j);
        }

        @Override // ue8.c, ue8.b
        protected void O(b.C0545b c0545b, sm4.a aVar) {
            super.O(c0545b, aVar);
            CharSequence a = sn4.a.a(c0545b.a);
            if (a != null) {
                aVar.h(a.toString());
            }
        }

        @Override // ue8.b
        protected void Q(Object obj) {
            qn4.j(this.j, 8388611, obj);
        }

        @Override // ue8.b
        protected void R() {
            if (this.s) {
                qn4.h(this.j, this.k);
            }
            this.s = true;
            sn4.a(this.j, this.n, this.k, (this.r ? 1 : 0) | 2);
        }

        @Override // ue8.b
        protected void U(b.c cVar) {
            super.U(cVar);
            sn4.b.a(cVar.b, cVar.a.d());
        }

        @Override // ue8.c
        protected boolean V(b.C0545b c0545b) {
            return sn4.a.b(c0545b.a);
        }
    }

    public interface e {
        void c(String str);
    }

    protected ue8(Context context) {
        super(context, new vm4.d(new ComponentName("android", ue8.class.getName())));
    }

    public static ue8 z(Context context, e eVar) {
        return new a(context, eVar);
    }

    public abstract void A(zm4.h hVar);

    public abstract void B(zm4.h hVar);

    public abstract void C(zm4.h hVar);

    public abstract void D(zm4.h hVar);
}
