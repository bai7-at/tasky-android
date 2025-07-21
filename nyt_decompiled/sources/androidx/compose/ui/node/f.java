package androidx.compose.ui.node;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.j;
import defpackage.om1;
import defpackage.zq3;
import java.util.List;

/* loaded from: classes.dex */
public final class f {
    private final LayoutNode a;
    private final om1 b;
    private final List c;

    public f(LayoutNode layoutNode, om1 om1Var, List list) {
        this.a = layoutNode;
        this.b = om1Var;
        this.c = list;
    }

    private final boolean b(LayoutNode layoutNode) {
        Object obj;
        LayoutNode k0 = layoutNode.k0();
        Object obj2 = null;
        LayoutNode.LayoutState U = k0 != null ? k0.U() : null;
        if (layoutNode.e() || (layoutNode.l0() != Integer.MAX_VALUE && k0 != null && k0.e())) {
            if (layoutNode.b0()) {
                List list = this.c;
                int size = list.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        obj = null;
                        break;
                    }
                    obj = list.get(i);
                    j.a aVar = (j.a) obj;
                    if (zq3.c(aVar.a(), layoutNode) && !aVar.c()) {
                        break;
                    }
                    i++;
                }
                if (obj != null) {
                    return true;
                }
            }
            if (layoutNode.b0()) {
                return this.b.d(layoutNode) || layoutNode.U() == LayoutNode.LayoutState.LookaheadMeasuring || (k0 != null && k0.b0()) || ((k0 != null && k0.W()) || U == LayoutNode.LayoutState.Measuring);
            }
            if (layoutNode.T()) {
                return this.b.d(layoutNode) || k0 == null || k0.b0() || k0.T() || U == LayoutNode.LayoutState.Measuring || U == LayoutNode.LayoutState.LayingOut;
            }
        }
        if (zq3.c(layoutNode.J0(), Boolean.TRUE)) {
            if (layoutNode.W()) {
                List list2 = this.c;
                int size2 = list2.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size2) {
                        break;
                    }
                    Object obj3 = list2.get(i2);
                    j.a aVar2 = (j.a) obj3;
                    if (zq3.c(aVar2.a(), layoutNode) && aVar2.c()) {
                        obj2 = obj3;
                        break;
                    }
                    i2++;
                }
                if (obj2 != null) {
                    return true;
                }
            }
            if (layoutNode.W()) {
                return this.b.e(layoutNode, true) || (k0 != null && k0.W()) || U == LayoutNode.LayoutState.LookaheadMeasuring || (k0 != null && k0.b0() && zq3.c(layoutNode.Y(), layoutNode));
            }
            if (layoutNode.V()) {
                return this.b.e(layoutNode, true) || k0 == null || k0.W() || k0.V() || U == LayoutNode.LayoutState.LookaheadMeasuring || U == LayoutNode.LayoutState.LookaheadLayingOut || (k0.T() && zq3.c(layoutNode.Y(), layoutNode));
            }
        }
        return true;
    }

    private final boolean c(LayoutNode layoutNode) {
        if (!b(layoutNode)) {
            return false;
        }
        List F = layoutNode.F();
        int size = F.size();
        for (int i = 0; i < size; i++) {
            if (!c((LayoutNode) F.get(i))) {
                return false;
            }
        }
        return true;
    }

    private final String d() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tree state:");
        zq3.g(sb, "append(value)");
        sb.append('\n');
        zq3.g(sb, "append('\\n')");
        e(this, sb, this.a, 0);
        return sb.toString();
    }

    private static final void e(f fVar, StringBuilder sb, LayoutNode layoutNode, int i) {
        String f = fVar.f(layoutNode);
        if (f.length() > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                sb.append("..");
            }
            sb.append(f);
            zq3.g(sb, "append(value)");
            sb.append('\n');
            zq3.g(sb, "append('\\n')");
            i++;
        }
        List F = layoutNode.F();
        int size = F.size();
        for (int i3 = 0; i3 < size; i3++) {
            e(fVar, sb, (LayoutNode) F.get(i3), i);
        }
    }

    private final String f(LayoutNode layoutNode) {
        StringBuilder sb = new StringBuilder();
        sb.append(layoutNode);
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        sb2.append(layoutNode.U());
        sb2.append(']');
        sb.append(sb2.toString());
        if (!layoutNode.e()) {
            sb.append("[!isPlaced]");
        }
        sb.append("[measuredByParent=" + layoutNode.d0() + ']');
        if (!b(layoutNode)) {
            sb.append("[INCONSISTENT]");
        }
        return sb.toString();
    }

    public final void a() {
        if (c(this.a)) {
            return;
        }
        System.out.println((Object) d());
        throw new IllegalStateException("Inconsistency found!");
    }
}
