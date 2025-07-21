package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import defpackage.lm1;

/* loaded from: classes.dex */
class e extends DependencyNode {
    public int m;

    public e(WidgetRun widgetRun) {
        super(widgetRun);
        if (widgetRun instanceof j) {
            this.e = DependencyNode.Type.HORIZONTAL_DIMENSION;
        } else {
            this.e = DependencyNode.Type.VERTICAL_DIMENSION;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.DependencyNode
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
}
