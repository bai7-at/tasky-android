package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.ui.layout.l;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.an3;
import defpackage.in3;
import defpackage.qg4;
import defpackage.qm3;
import defpackage.rg4;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.vm3;
import defpackage.ww8;
import defpackage.xq3;
import defpackage.yq3;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes.dex */
final class AnimatedContentMeasurePolicy implements rg4 {
    private final AnimatedContentTransitionScopeImpl a;

    public AnimatedContentMeasurePolicy(AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
        this.a = animatedContentTransitionScopeImpl;
    }

    @Override // defpackage.rg4
    public int a(yq3 yq3Var, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((xq3) list.get(0)).V(i));
            int n = i.n(list);
            int i2 = 1;
            if (1 <= n) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((xq3) list.get(i2)).V(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == n) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.rg4
    public sg4 d(androidx.compose.ui.layout.f fVar, List list, long j) {
        l lVar;
        l lVar2;
        int size = list.size();
        final l[] lVarArr = new l[size];
        int size2 = list.size();
        int i = 0;
        while (true) {
            lVar = null;
            if (i >= size2) {
                break;
            }
            qg4 qg4Var = (qg4) list.get(i);
            Object d = qg4Var.d();
            AnimatedContentTransitionScopeImpl.a aVar = d instanceof AnimatedContentTransitionScopeImpl.a ? (AnimatedContentTransitionScopeImpl.a) d : null;
            if (aVar != null && aVar.l()) {
                lVarArr[i] = qg4Var.W(j);
            }
            i++;
        }
        int size3 = list.size();
        for (int i2 = 0; i2 < size3; i2++) {
            qg4 qg4Var2 = (qg4) list.get(i2);
            if (lVarArr[i2] == null) {
                lVarArr[i2] = qg4Var2.W(j);
            }
        }
        if (size == 0) {
            lVar2 = null;
        } else {
            lVar2 = lVarArr[0];
            int e0 = kotlin.collections.d.e0(lVarArr);
            if (e0 != 0) {
                int F0 = lVar2 != null ? lVar2.F0() : 0;
                qm3 it2 = new an3(1, e0).iterator();
                while (it2.hasNext()) {
                    l lVar3 = lVarArr[it2.c()];
                    int F02 = lVar3 != null ? lVar3.F0() : 0;
                    if (F0 < F02) {
                        lVar2 = lVar3;
                        F0 = F02;
                    }
                }
            }
        }
        final int F03 = lVar2 != null ? lVar2.F0() : 0;
        if (size != 0) {
            lVar = lVarArr[0];
            int e02 = kotlin.collections.d.e0(lVarArr);
            if (e02 != 0) {
                int v0 = lVar != null ? lVar.v0() : 0;
                qm3 it3 = new an3(1, e02).iterator();
                while (it3.hasNext()) {
                    l lVar4 = lVarArr[it3.c()];
                    int v02 = lVar4 != null ? lVar4.v0() : 0;
                    if (v0 < v02) {
                        lVar = lVar4;
                        v0 = v02;
                    }
                }
            }
        }
        final int v03 = lVar != null ? lVar.v0() : 0;
        this.a.x(in3.a(F03, v03));
        return androidx.compose.ui.layout.f.J(fVar, F03, v03, null, new ss2() { // from class: androidx.compose.animation.AnimatedContentMeasurePolicy$measure$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(l.a aVar2) {
                l[] lVarArr2 = lVarArr;
                AnimatedContentMeasurePolicy animatedContentMeasurePolicy = this;
                int i3 = F03;
                int i4 = v03;
                for (l lVar5 : lVarArr2) {
                    if (lVar5 != null) {
                        long a = animatedContentMeasurePolicy.j().n().a(in3.a(lVar5.F0(), lVar5.v0()), in3.a(i3, i4), LayoutDirection.Ltr);
                        l.a.f(aVar2, lVar5, vm3.j(a), vm3.k(a), 0.0f, 4, null);
                    }
                }
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((l.a) obj);
                return ww8.a;
            }
        }, 4, null);
    }

    @Override // defpackage.rg4
    public int e(yq3 yq3Var, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((xq3) list.get(0)).S(i));
            int n = i.n(list);
            int i2 = 1;
            if (1 <= n) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((xq3) list.get(i2)).S(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == n) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.rg4
    public int g(yq3 yq3Var, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((xq3) list.get(0)).i(i));
            int n = i.n(list);
            int i2 = 1;
            if (1 <= n) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((xq3) list.get(i2)).i(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == n) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.rg4
    public int i(yq3 yq3Var, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((xq3) list.get(0)).H(i));
            int n = i.n(list);
            int i2 = 1;
            if (1 <= n) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((xq3) list.get(i2)).H(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == n) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    public final AnimatedContentTransitionScopeImpl j() {
        return this.a;
    }
}
