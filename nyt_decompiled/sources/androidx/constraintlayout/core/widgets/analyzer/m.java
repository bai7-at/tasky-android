package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import io.embrace.android.embracesdk.okhttp3.EmbraceOkHttp3ApplicationInterceptor;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class m {
    static int g;
    int b;
    int d;
    ArrayList a = new ArrayList();
    boolean c = false;
    ArrayList e = null;
    private int f = -1;

    class a {
        WeakReference a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;

        public a(ConstraintWidget constraintWidget, androidx.constraintlayout.core.d dVar, int i) {
            this.a = new WeakReference(constraintWidget);
            this.b = dVar.y(constraintWidget.O);
            this.c = dVar.y(constraintWidget.P);
            this.d = dVar.y(constraintWidget.Q);
            this.e = dVar.y(constraintWidget.R);
            this.f = dVar.y(constraintWidget.S);
            this.g = i;
        }
    }

    public m(int i) {
        int i2 = g;
        g = i2 + 1;
        this.b = i2;
        this.d = i;
    }

    private String e() {
        int i = this.d;
        return i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : EmbraceOkHttp3ApplicationInterceptor.UNKNOWN_EXCEPTION;
    }

    private int j(androidx.constraintlayout.core.d dVar, ArrayList arrayList, int i) {
        int y;
        int y2;
        androidx.constraintlayout.core.widgets.d dVar2 = (androidx.constraintlayout.core.widgets.d) ((ConstraintWidget) arrayList.get(0)).L();
        dVar.E();
        dVar2.g(dVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((ConstraintWidget) arrayList.get(i2)).g(dVar, false);
        }
        if (i == 0 && dVar2.W0 > 0) {
            androidx.constraintlayout.core.widgets.b.b(dVar2, dVar, arrayList, 0);
        }
        if (i == 1 && dVar2.X0 > 0) {
            androidx.constraintlayout.core.widgets.b.b(dVar2, dVar, arrayList, 1);
        }
        try {
            dVar.A();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.e = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.e.add(new a((ConstraintWidget) arrayList.get(i3), dVar, i));
        }
        if (i == 0) {
            y = dVar.y(dVar2.O);
            y2 = dVar.y(dVar2.Q);
            dVar.E();
        } else {
            y = dVar.y(dVar2.P);
            y2 = dVar.y(dVar2.R);
            dVar.E();
        }
        return y2 - y;
    }

    public boolean a(ConstraintWidget constraintWidget) {
        if (this.a.contains(constraintWidget)) {
            return false;
        }
        this.a.add(constraintWidget);
        return true;
    }

    public void b(ArrayList arrayList) {
        int size = this.a.size();
        if (this.f != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                m mVar = (m) arrayList.get(i);
                if (this.f == mVar.b) {
                    g(this.d, mVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.d;
    }

    public int f(androidx.constraintlayout.core.d dVar, int i) {
        if (this.a.size() == 0) {
            return 0;
        }
        return j(dVar, this.a, i);
    }

    public void g(int i, m mVar) {
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            ConstraintWidget constraintWidget = (ConstraintWidget) it2.next();
            mVar.a(constraintWidget);
            if (i == 0) {
                constraintWidget.I0 = mVar.c();
            } else {
                constraintWidget.J0 = mVar.c();
            }
        }
        this.f = mVar.b;
    }

    public void h(boolean z) {
        this.c = z;
    }

    public void i(int i) {
        this.d = i;
    }

    public String toString() {
        String str = e() + " [" + this.b + "] <";
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            str = str + " " + ((ConstraintWidget) it2.next()).t();
        }
        return str + " >";
    }
}
