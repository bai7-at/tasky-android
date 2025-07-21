package androidx.constraintlayout.core.widgets.analyzer;

import defpackage.lm1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class DependencyNode implements lm1 {
    WidgetRun d;
    int f;
    public int g;
    public lm1 a = null;
    public boolean b = false;
    public boolean c = false;
    Type e = Type.UNKNOWN;
    int h = 1;
    e i = null;
    public boolean j = false;
    List k = new ArrayList();
    List l = new ArrayList();

    enum Type {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public DependencyNode(WidgetRun widgetRun) {
        this.d = widgetRun;
    }

    @Override // defpackage.lm1
    public void a(lm1 lm1Var) {
        Iterator it2 = this.l.iterator();
        while (it2.hasNext()) {
            if (!((DependencyNode) it2.next()).j) {
                return;
            }
        }
        this.c = true;
        lm1 lm1Var2 = this.a;
        if (lm1Var2 != null) {
            lm1Var2.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        DependencyNode dependencyNode = null;
        int i = 0;
        for (DependencyNode dependencyNode2 : this.l) {
            if (!(dependencyNode2 instanceof e)) {
                i++;
                dependencyNode = dependencyNode2;
            }
        }
        if (dependencyNode != null && i == 1 && dependencyNode.j) {
            e eVar = this.i;
            if (eVar != null) {
                if (!eVar.j) {
                    return;
                } else {
                    this.f = this.h * eVar.g;
                }
            }
            d(dependencyNode.g + this.f);
        }
        lm1 lm1Var3 = this.a;
        if (lm1Var3 != null) {
            lm1Var3.a(this);
        }
    }

    public void b(lm1 lm1Var) {
        this.k.add(lm1Var);
        if (this.j) {
            lm1Var.a(lm1Var);
        }
    }

    public void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (lm1 lm1Var : this.k) {
            lm1Var.a(lm1Var);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.t());
        sb.append(":");
        sb.append(this.e);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
