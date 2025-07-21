package androidx.compose.animation;

import androidx.compose.ui.layout.l;
import defpackage.hn3;
import defpackage.in3;
import defpackage.qg4;
import defpackage.rg4;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.xh;
import defpackage.xq3;
import defpackage.yq3;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes.dex */
final class AnimatedEnterExitMeasurePolicy implements rg4 {
    private final xh a;

    public AnimatedEnterExitMeasurePolicy(xh xhVar) {
        this.a = xhVar;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v20 */
    @Override // defpackage.rg4
    public sg4 d(androidx.compose.ui.layout.f fVar, List list, long j) {
        Object obj;
        final ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((qg4) list.get(i)).W(j));
        }
        l lVar = null;
        int i2 = 1;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int F0 = ((l) obj).F0();
            int n = i.n(arrayList);
            if (1 <= n) {
                int i3 = 1;
                while (true) {
                    Object obj2 = arrayList.get(i3);
                    int F02 = ((l) obj2).F0();
                    if (F0 < F02) {
                        obj = obj2;
                        F0 = F02;
                    }
                    if (i3 == n) {
                        break;
                    }
                    i3++;
                }
            }
        }
        l lVar2 = (l) obj;
        int F03 = lVar2 != null ? lVar2.F0() : 0;
        if (!arrayList.isEmpty()) {
            ?? r12 = arrayList.get(0);
            int v0 = ((l) r12).v0();
            int n2 = i.n(arrayList);
            boolean z = r12;
            if (1 <= n2) {
                while (true) {
                    Object obj3 = arrayList.get(i2);
                    int v02 = ((l) obj3).v0();
                    r12 = z;
                    if (v0 < v02) {
                        r12 = obj3;
                        v0 = v02;
                    }
                    if (i2 == n2) {
                        break;
                    }
                    i2++;
                    z = r12;
                }
            }
            lVar = r12;
        }
        l lVar3 = lVar;
        int v03 = lVar3 != null ? lVar3.v0() : 0;
        this.a.a().setValue(hn3.b(in3.a(F03, v03)));
        return androidx.compose.ui.layout.f.J(fVar, F03, v03, null, new ss2() { // from class: androidx.compose.animation.AnimatedEnterExitMeasurePolicy$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(l.a aVar) {
                List<l> list2 = arrayList;
                int size2 = list2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    l.a.f(aVar, list2.get(i4), 0, 0, 0.0f, 4, null);
                }
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj4) {
                b((l.a) obj4);
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
}
