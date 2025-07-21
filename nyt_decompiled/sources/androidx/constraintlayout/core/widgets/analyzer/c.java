package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class c extends WidgetRun {
    ArrayList k;
    private int l;

    public c(ConstraintWidget constraintWidget, int i) {
        super(constraintWidget);
        this.k = new ArrayList();
        this.f = i;
        q();
    }

    private void q() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2 = this.b;
        ConstraintWidget M = constraintWidget2.M(this.f);
        while (true) {
            ConstraintWidget constraintWidget3 = M;
            constraintWidget = constraintWidget2;
            constraintWidget2 = constraintWidget3;
            if (constraintWidget2 == null) {
                break;
            } else {
                M = constraintWidget2.M(this.f);
            }
        }
        this.b = constraintWidget;
        this.k.add(constraintWidget.O(this.f));
        ConstraintWidget K = constraintWidget.K(this.f);
        while (K != null) {
            this.k.add(K.O(this.f));
            K = K.K(this.f);
        }
        Iterator it2 = this.k.iterator();
        while (it2.hasNext()) {
            WidgetRun widgetRun = (WidgetRun) it2.next();
            int i = this.f;
            if (i == 0) {
                widgetRun.b.c = this;
            } else if (i == 1) {
                widgetRun.b.d = this;
            }
        }
        if (this.f == 0 && ((androidx.constraintlayout.core.widgets.d) this.b.L()).S1() && this.k.size() > 1) {
            ArrayList arrayList = this.k;
            this.b = ((WidgetRun) arrayList.get(arrayList.size() - 1)).b;
        }
        this.l = this.f == 0 ? this.b.z() : this.b.U();
    }

    private ConstraintWidget r() {
        for (int i = 0; i < this.k.size(); i++) {
            WidgetRun widgetRun = (WidgetRun) this.k.get(i);
            if (widgetRun.b.X() != 8) {
                return widgetRun.b;
            }
        }
        return null;
    }

    private ConstraintWidget s() {
        for (int size = this.k.size() - 1; size >= 0; size--) {
            WidgetRun widgetRun = (WidgetRun) this.k.get(size);
            if (widgetRun.b.X() != 8) {
                return widgetRun.b;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:288:0x03fe, code lost:
    
        r7 = r7 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e9  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, defpackage.lm1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(defpackage.lm1 r27) {
        /*
            Method dump skipped, instructions count: 1062
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.c.a(lm1):void");
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void d() {
        Iterator it2 = this.k.iterator();
        while (it2.hasNext()) {
            ((WidgetRun) it2.next()).d();
        }
        int size = this.k.size();
        if (size < 1) {
            return;
        }
        ConstraintWidget constraintWidget = ((WidgetRun) this.k.get(0)).b;
        ConstraintWidget constraintWidget2 = ((WidgetRun) this.k.get(size - 1)).b;
        if (this.f == 0) {
            ConstraintAnchor constraintAnchor = constraintWidget.O;
            ConstraintAnchor constraintAnchor2 = constraintWidget2.Q;
            DependencyNode i = i(constraintAnchor, 0);
            int f = constraintAnchor.f();
            ConstraintWidget r = r();
            if (r != null) {
                f = r.O.f();
            }
            if (i != null) {
                b(this.h, i, f);
            }
            DependencyNode i2 = i(constraintAnchor2, 0);
            int f2 = constraintAnchor2.f();
            ConstraintWidget s = s();
            if (s != null) {
                f2 = s.Q.f();
            }
            if (i2 != null) {
                b(this.i, i2, -f2);
            }
        } else {
            ConstraintAnchor constraintAnchor3 = constraintWidget.P;
            ConstraintAnchor constraintAnchor4 = constraintWidget2.R;
            DependencyNode i3 = i(constraintAnchor3, 1);
            int f3 = constraintAnchor3.f();
            ConstraintWidget r2 = r();
            if (r2 != null) {
                f3 = r2.P.f();
            }
            if (i3 != null) {
                b(this.h, i3, f3);
            }
            DependencyNode i4 = i(constraintAnchor4, 1);
            int f4 = constraintAnchor4.f();
            ConstraintWidget s2 = s();
            if (s2 != null) {
                f4 = s2.R.f();
            }
            if (i4 != null) {
                b(this.i, i4, -f4);
            }
        }
        this.h.a = this;
        this.i.a = this;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void e() {
        for (int i = 0; i < this.k.size(); i++) {
            ((WidgetRun) this.k.get(i)).e();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void f() {
        this.c = null;
        Iterator it2 = this.k.iterator();
        while (it2.hasNext()) {
            ((WidgetRun) it2.next()).f();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public long j() {
        int size = this.k.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = j + r4.h.f + ((WidgetRun) this.k.get(i)).j() + r4.i.f;
        }
        return j;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    boolean m() {
        int size = this.k.size();
        for (int i = 0; i < size; i++) {
            if (!((WidgetRun) this.k.get(i)).m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        Iterator it2 = this.k.iterator();
        while (it2.hasNext()) {
            WidgetRun widgetRun = (WidgetRun) it2.next();
            sb.append("<");
            sb.append(widgetRun);
            sb.append("> ");
        }
        return sb.toString();
    }
}
