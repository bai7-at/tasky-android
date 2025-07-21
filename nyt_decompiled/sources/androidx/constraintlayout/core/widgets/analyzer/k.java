package androidx.constraintlayout.core.widgets.analyzer;

import defpackage.lm1;
import java.util.ArrayList;

/* loaded from: classes.dex */
class k {
    public static int h;
    WidgetRun c;
    WidgetRun d;
    int f;
    int g;
    public int a = 0;
    public boolean b = false;
    ArrayList e = new ArrayList();

    public k(WidgetRun widgetRun, int i) {
        this.c = null;
        this.d = null;
        int i2 = h;
        this.f = i2;
        h = i2 + 1;
        this.c = widgetRun;
        this.d = widgetRun;
        this.g = i;
    }

    private long c(DependencyNode dependencyNode, long j) {
        WidgetRun widgetRun = dependencyNode.d;
        if (widgetRun instanceof i) {
            return j;
        }
        int size = dependencyNode.k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            lm1 lm1Var = (lm1) dependencyNode.k.get(i);
            if (lm1Var instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) lm1Var;
                if (dependencyNode2.d != widgetRun) {
                    j2 = Math.min(j2, c(dependencyNode2, dependencyNode2.f + j));
                }
            }
        }
        if (dependencyNode != widgetRun.i) {
            return j2;
        }
        long j3 = j - widgetRun.j();
        return Math.min(Math.min(j2, c(widgetRun.h, j3)), j3 - widgetRun.h.f);
    }

    private long d(DependencyNode dependencyNode, long j) {
        WidgetRun widgetRun = dependencyNode.d;
        if (widgetRun instanceof i) {
            return j;
        }
        int size = dependencyNode.k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            lm1 lm1Var = (lm1) dependencyNode.k.get(i);
            if (lm1Var instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) lm1Var;
                if (dependencyNode2.d != widgetRun) {
                    j2 = Math.max(j2, d(dependencyNode2, dependencyNode2.f + j));
                }
            }
        }
        if (dependencyNode != widgetRun.h) {
            return j2;
        }
        long j3 = j + widgetRun.j();
        return Math.max(Math.max(j2, d(widgetRun.i, j3)), j3 - widgetRun.i.f);
    }

    public void a(WidgetRun widgetRun) {
        this.e.add(widgetRun);
        this.d = widgetRun;
    }

    public long b(androidx.constraintlayout.core.widgets.d dVar, int i) {
        WidgetRun widgetRun = this.c;
        if (widgetRun instanceof c) {
            if (((c) widgetRun).f != i) {
                return 0L;
            }
        } else if (i == 0) {
            if (!(widgetRun instanceof j)) {
                return 0L;
            }
        } else if (!(widgetRun instanceof l)) {
            return 0L;
        }
        DependencyNode dependencyNode = (i == 0 ? dVar.e : dVar.f).h;
        DependencyNode dependencyNode2 = (i == 0 ? dVar.e : dVar.f).i;
        boolean contains = widgetRun.h.l.contains(dependencyNode);
        boolean contains2 = this.c.i.l.contains(dependencyNode2);
        long j = this.c.j();
        if (!contains || !contains2) {
            if (contains) {
                return Math.max(d(this.c.h, r12.f), this.c.h.f + j);
            }
            if (!contains2) {
                return (r12.h.f + this.c.j()) - this.c.i.f;
            }
            return Math.max(-c(this.c.i, r12.f), (-this.c.i.f) + j);
        }
        long d = d(this.c.h, 0L);
        long c = c(this.c.i, 0L);
        long j2 = d - j;
        WidgetRun widgetRun2 = this.c;
        int i2 = widgetRun2.i.f;
        if (j2 >= (-i2)) {
            j2 += i2;
        }
        int i3 = widgetRun2.h.f;
        long j3 = ((-c) - j) - i3;
        if (j3 >= i3) {
            j3 -= i3;
        }
        float q = widgetRun2.b.q(i);
        float f = q > 0.0f ? (long) ((j3 / q) + (j2 / (1.0f - q))) : 0L;
        long j4 = ((long) ((f * q) + 0.5f)) + j + ((long) ((f * (1.0f - q)) + 0.5f));
        WidgetRun widgetRun3 = this.c;
        return (widgetRun3.h.f + j4) - widgetRun3.i.f;
    }
}
