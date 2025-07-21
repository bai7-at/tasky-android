package androidx.compose.ui.node;

import defpackage.c04;
import defpackage.qs2;
import defpackage.zq3;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;

/* loaded from: classes.dex */
public final class DepthSortedSet {
    private final boolean a;
    private final c04 b = kotlin.c.b(LazyThreadSafetyMode.NONE, new qs2() { // from class: androidx.compose.ui.node.DepthSortedSet$mapOfOriginalDepth$2
        @Override // defpackage.qs2
        /* renamed from: invoke */
        public final Map mo865invoke() {
            return new LinkedHashMap();
        }
    });
    private final Comparator c;
    private final TreeSet d;

    public static final class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(LayoutNode layoutNode, LayoutNode layoutNode2) {
            int j = zq3.j(layoutNode.J(), layoutNode2.J());
            return j != 0 ? j : zq3.j(layoutNode.hashCode(), layoutNode2.hashCode());
        }
    }

    public DepthSortedSet(boolean z) {
        this.a = z;
        a aVar = new a();
        this.c = aVar;
        this.d = new TreeSet(aVar);
    }

    private final Map c() {
        return (Map) this.b.getValue();
    }

    public final void a(LayoutNode layoutNode) {
        if (!layoutNode.G0()) {
            throw new IllegalStateException("DepthSortedSet.add called on an unattached node");
        }
        if (this.a) {
            Integer num = (Integer) c().get(layoutNode);
            if (num == null) {
                c().put(layoutNode, Integer.valueOf(layoutNode.J()));
            } else {
                if (num.intValue() != layoutNode.J()) {
                    throw new IllegalStateException("invalid node depth");
                }
            }
        }
        this.d.add(layoutNode);
    }

    public final boolean b(LayoutNode layoutNode) {
        boolean contains = this.d.contains(layoutNode);
        if (!this.a || contains == c().containsKey(layoutNode)) {
            return contains;
        }
        throw new IllegalStateException("inconsistency in TreeSet");
    }

    public final boolean d() {
        return this.d.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final LayoutNode e() {
        LayoutNode layoutNode = (LayoutNode) this.d.first();
        f(layoutNode);
        return layoutNode;
    }

    public final boolean f(LayoutNode layoutNode) {
        if (!layoutNode.G0()) {
            throw new IllegalStateException("DepthSortedSet.remove called on an unattached node");
        }
        boolean remove = this.d.remove(layoutNode);
        if (this.a) {
            if (!zq3.c((Integer) c().remove(layoutNode), remove ? Integer.valueOf(layoutNode.J()) : null)) {
                throw new IllegalStateException("invalid node depth");
            }
        }
        return remove;
    }

    public String toString() {
        return this.d.toString();
    }
}
