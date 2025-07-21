package defpackage;

import androidx.compose.ui.node.LayoutNode;
import java.util.Comparator;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class ef5 {
    public static final a c = new a(null);
    public static final int d = 8;
    private final vy4 a = new vy4(new LayoutNode[16], 0);
    private LayoutNode[] b;

    public static final class a {

        /* renamed from: ef5$a$a, reason: collision with other inner class name */
        private static final class C0481a implements Comparator {
            public static final C0481a a = new C0481a();

            private C0481a() {
            }

            @Override // java.util.Comparator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(LayoutNode layoutNode, LayoutNode layoutNode2) {
                int j = zq3.j(layoutNode2.J(), layoutNode.J());
                return j != 0 ? j : zq3.j(layoutNode.hashCode(), layoutNode2.hashCode());
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final void b(LayoutNode layoutNode) {
        layoutNode.z();
        int i = 0;
        layoutNode.u1(false);
        vy4 s0 = layoutNode.s0();
        int q = s0.q();
        if (q > 0) {
            Object[] p = s0.p();
            do {
                b((LayoutNode) p[i]);
                i++;
            } while (i < q);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r2 < r0) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r4 = this;
            vy4 r0 = r4.a
            ef5$a$a r1 = ef5.a.C0481a.a
            r0.D(r1)
            vy4 r0 = r4.a
            int r0 = r0.q()
            androidx.compose.ui.node.LayoutNode[] r1 = r4.b
            if (r1 == 0) goto L14
            int r2 = r1.length
            if (r2 >= r0) goto L22
        L14:
            vy4 r1 = r4.a
            int r1 = r1.q()
            r2 = 16
            int r1 = java.lang.Math.max(r2, r1)
            androidx.compose.ui.node.LayoutNode[] r1 = new androidx.compose.ui.node.LayoutNode[r1]
        L22:
            r2 = 0
            r4.b = r2
            r2 = 0
        L26:
            if (r2 >= r0) goto L35
            vy4 r3 = r4.a
            java.lang.Object[] r3 = r3.p()
            r3 = r3[r2]
            r1[r2] = r3
            int r2 = r2 + 1
            goto L26
        L35:
            vy4 r2 = r4.a
            r2.h()
            int r0 = r0 + (-1)
        L3c:
            r2 = -1
            if (r2 >= r0) goto L50
            r2 = r1[r0]
            defpackage.zq3.e(r2)
            boolean r3 = r2.g0()
            if (r3 == 0) goto L4d
            r4.b(r2)
        L4d:
            int r0 = r0 + (-1)
            goto L3c
        L50:
            r4.b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ef5.a():void");
    }

    public final boolean c() {
        return this.a.t();
    }

    public final void d(LayoutNode layoutNode) {
        this.a.b(layoutNode);
        layoutNode.u1(true);
    }

    public final void e(LayoutNode layoutNode) {
        this.a.h();
        this.a.b(layoutNode);
        layoutNode.u1(true);
    }
}
