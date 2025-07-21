package androidx.compose.ui.node;

import androidx.compose.ui.layout.AlignmentLineKt;
import defpackage.ba3;
import defpackage.dg4;
import defpackage.fb;
import defpackage.fd5;
import defpackage.gb;
import defpackage.hd5;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class AlignmentLines {
    private final gb a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private gb h;
    private final Map i;

    public /* synthetic */ AlignmentLines(gb gbVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(gbVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(fb fbVar, int i, NodeCoordinator nodeCoordinator) {
        float f = i;
        long a = hd5.a(f, f);
        while (true) {
            a = d(nodeCoordinator, a);
            nodeCoordinator = nodeCoordinator.m2();
            zq3.e(nodeCoordinator);
            if (zq3.c(nodeCoordinator, this.a.O())) {
                break;
            } else if (e(nodeCoordinator).containsKey(fbVar)) {
                float i2 = i(nodeCoordinator, fbVar);
                a = hd5.a(i2, i2);
            }
        }
        int d = fbVar instanceof ba3 ? dg4.d(fd5.p(a)) : dg4.d(fd5.o(a));
        Map map = this.i;
        if (map.containsKey(fbVar)) {
            d = AlignmentLineKt.c(fbVar, ((Number) t.j(this.i, fbVar)).intValue(), d);
        }
        map.put(fbVar, Integer.valueOf(d));
    }

    protected abstract long d(NodeCoordinator nodeCoordinator, long j);

    protected abstract Map e(NodeCoordinator nodeCoordinator);

    public final gb f() {
        return this.a;
    }

    public final boolean g() {
        return this.b;
    }

    public final Map h() {
        return this.i;
    }

    protected abstract int i(NodeCoordinator nodeCoordinator, fb fbVar);

    public final boolean j() {
        return this.c || this.e || this.f || this.g;
    }

    public final boolean k() {
        o();
        return this.h != null;
    }

    public final boolean l() {
        return this.d;
    }

    public final void m() {
        this.b = true;
        gb l = this.a.l();
        if (l == null) {
            return;
        }
        if (this.c) {
            l.h0();
        } else if (this.e || this.d) {
            l.requestLayout();
        }
        if (this.f) {
            this.a.h0();
        }
        if (this.g) {
            this.a.requestLayout();
        }
        l.f().m();
    }

    public final void n() {
        this.i.clear();
        this.a.I(new ss2() { // from class: androidx.compose.ui.node.AlignmentLines$recalculate$1
            {
                super(1);
            }

            public final void b(gb gbVar) {
                Map map;
                if (gbVar.e()) {
                    if (gbVar.f().g()) {
                        gbVar.w();
                    }
                    map = gbVar.f().i;
                    AlignmentLines alignmentLines = AlignmentLines.this;
                    for (Map.Entry entry : map.entrySet()) {
                        alignmentLines.c((fb) entry.getKey(), ((Number) entry.getValue()).intValue(), gbVar.O());
                    }
                    NodeCoordinator m2 = gbVar.O().m2();
                    zq3.e(m2);
                    while (!zq3.c(m2, AlignmentLines.this.f().O())) {
                        Set<fb> keySet = AlignmentLines.this.e(m2).keySet();
                        AlignmentLines alignmentLines2 = AlignmentLines.this;
                        for (fb fbVar : keySet) {
                            alignmentLines2.c(fbVar, alignmentLines2.i(m2, fbVar), m2);
                        }
                        m2 = m2.m2();
                        zq3.e(m2);
                    }
                }
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((gb) obj);
                return ww8.a;
            }
        });
        this.i.putAll(e(this.a.O()));
        this.b = false;
    }

    public final void o() {
        gb gbVar;
        AlignmentLines f;
        AlignmentLines f2;
        if (j()) {
            gbVar = this.a;
        } else {
            gb l = this.a.l();
            if (l == null) {
                return;
            }
            gbVar = l.f().h;
            if (gbVar == null || !gbVar.f().j()) {
                gb gbVar2 = this.h;
                if (gbVar2 == null || gbVar2.f().j()) {
                    return;
                }
                gb l2 = gbVar2.l();
                if (l2 != null && (f2 = l2.f()) != null) {
                    f2.o();
                }
                gb l3 = gbVar2.l();
                gbVar = (l3 == null || (f = l3.f()) == null) ? null : f.h;
            }
        }
        this.h = gbVar;
    }

    public final void p() {
        this.b = true;
        this.c = false;
        this.e = false;
        this.d = false;
        this.f = false;
        this.g = false;
        this.h = null;
    }

    public final void q(boolean z) {
        this.e = z;
    }

    public final void r(boolean z) {
        this.g = z;
    }

    public final void s(boolean z) {
        this.f = z;
    }

    public final void t(boolean z) {
        this.d = z;
    }

    public final void u(boolean z) {
        this.c = z;
    }

    private AlignmentLines(gb gbVar) {
        this.a = gbVar;
        this.b = true;
        this.i = new HashMap();
    }
}
