package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.d;
import defpackage.lh4;
import defpackage.ut6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class State {
    public static final Integer f = 0;
    protected HashMap a = new HashMap();
    protected HashMap b = new HashMap();
    HashMap c = new HashMap();
    public final a d;
    private int e;

    public enum Constraint {
        LEFT_TO_LEFT,
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT,
        RIGHT_TO_RIGHT,
        START_TO_START,
        START_TO_END,
        END_TO_START,
        END_TO_END,
        TOP_TO_TOP,
        TOP_TO_BOTTOM,
        BOTTOM_TO_TOP,
        BOTTOM_TO_BOTTOM,
        BASELINE_TO_BASELINE,
        BASELINE_TO_TOP,
        BASELINE_TO_BOTTOM,
        CENTER_HORIZONTALLY,
        CENTER_VERTICALLY,
        CIRCULAR_CONSTRAINT
    }

    public State() {
        a aVar = new a(this);
        this.d = aVar;
        this.e = 0;
        this.a.put(f, aVar);
    }

    public void a(d dVar) {
        dVar.w1();
        this.d.p().d(this, dVar, 0);
        this.d.n().d(this, dVar, 1);
        Iterator it2 = this.b.keySet().iterator();
        if (it2.hasNext()) {
            lh4.a(this.b.get(it2.next()));
            throw null;
        }
        Iterator it3 = this.a.keySet().iterator();
        while (it3.hasNext()) {
            ut6 ut6Var = (ut6) this.a.get(it3.next());
            if (ut6Var != this.d) {
                ut6Var.d();
            }
        }
        Iterator it4 = this.a.keySet().iterator();
        while (it4.hasNext()) {
            ut6 ut6Var2 = (ut6) this.a.get(it4.next());
            if (ut6Var2 != this.d) {
                ConstraintWidget b = ut6Var2.b();
                b.E0(ut6Var2.getKey().toString());
                b.e1(null);
                ut6Var2.d();
                dVar.a(b);
            } else {
                ut6Var2.a(dVar);
            }
        }
        Iterator it5 = this.b.keySet().iterator();
        if (it5.hasNext()) {
            lh4.a(this.b.get(it5.next()));
            throw null;
        }
        Iterator it6 = this.a.keySet().iterator();
        while (it6.hasNext()) {
            ut6 ut6Var3 = (ut6) this.a.get(it6.next());
            if (ut6Var3 != this.d) {
                ut6Var3.d();
            }
        }
        for (Object obj : this.a.keySet()) {
            ut6 ut6Var4 = (ut6) this.a.get(obj);
            ut6Var4.apply();
            ConstraintWidget b2 = ut6Var4.b();
            if (b2 != null && obj != null) {
                b2.o = obj.toString();
            }
        }
    }

    public a b(Object obj) {
        ut6 ut6Var = (ut6) this.a.get(obj);
        if (ut6Var == null) {
            ut6Var = d(obj);
            this.a.put(obj, ut6Var);
            ut6Var.c(obj);
        }
        if (ut6Var instanceof a) {
            return (a) ut6Var;
        }
        return null;
    }

    public int c(Object obj) {
        if (obj instanceof Float) {
            return ((Float) obj).intValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public a d(Object obj) {
        return new a(this);
    }

    public State e(b bVar) {
        return i(bVar);
    }

    public void f(Object obj, Object obj2) {
        a b = b(obj);
        if (b != null) {
            b.B(obj2);
        }
    }

    ut6 g(Object obj) {
        return (ut6) this.a.get(obj);
    }

    public void h() {
        this.b.clear();
        this.c.clear();
    }

    public State i(b bVar) {
        this.d.z(bVar);
        return this;
    }

    public void j(String str, String str2) {
        ArrayList arrayList;
        a b = b(str);
        if (b != null) {
            b.A(str2);
            if (this.c.containsKey(str2)) {
                arrayList = (ArrayList) this.c.get(str2);
            } else {
                arrayList = new ArrayList();
                this.c.put(str2, arrayList);
            }
            arrayList.add(str);
        }
    }

    public State k(b bVar) {
        this.d.C(bVar);
        return this;
    }

    public State l(b bVar) {
        return k(bVar);
    }
}
