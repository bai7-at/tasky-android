package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import defpackage.a85;
import defpackage.ql2;
import defpackage.qs2;
import defpackage.rl1;
import defpackage.rl2;
import defpackage.ss2;
import defpackage.ul1;
import defpackage.vy4;
import defpackage.wl2;
import defpackage.ww8;
import defpackage.zl2;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class FocusInvalidationManager {
    private final ss2 a;
    private Set b = new LinkedHashSet();
    private Set c = new LinkedHashSet();
    private Set d = new LinkedHashSet();
    private final qs2 e = new qs2() { // from class: androidx.compose.ui.focus.FocusInvalidationManager$invalidateNodes$1
        {
            super(0);
        }

        @Override // defpackage.qs2
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo865invoke() {
            m67invoke();
            return ww8.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m67invoke() {
            Set set;
            Set set2;
            Set<ql2> set3;
            Set set4;
            Set<FocusTargetNode> set5;
            Set set6;
            Set set7;
            Set set8;
            Set set9;
            int i;
            int i2;
            zl2 zl2Var;
            int i3;
            int i4;
            Set set10;
            Set set11;
            Set set12;
            Set set13;
            set = FocusInvalidationManager.this.d;
            FocusInvalidationManager focusInvalidationManager = FocusInvalidationManager.this;
            Iterator it2 = set.iterator();
            while (true) {
                int i5 = 1024;
                int i6 = 16;
                int i7 = 0;
                int i8 = 1;
                if (!it2.hasNext()) {
                    set2 = FocusInvalidationManager.this.d;
                    set2.clear();
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    set3 = FocusInvalidationManager.this.c;
                    FocusInvalidationManager focusInvalidationManager2 = FocusInvalidationManager.this;
                    for (ql2 ql2Var : set3) {
                        if (ql2Var.c0().L1()) {
                            int a = a85.a(i5);
                            Modifier.c c0 = ql2Var.c0();
                            int i9 = i7;
                            int i10 = i8;
                            FocusTargetNode focusTargetNode = null;
                            vy4 vy4Var = null;
                            while (c0 != null) {
                                if (c0 instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode2 = (FocusTargetNode) c0;
                                    if (focusTargetNode != null) {
                                        i9 = i8;
                                    }
                                    set11 = focusInvalidationManager2.b;
                                    if (set11.contains(focusTargetNode2)) {
                                        linkedHashSet.add(focusTargetNode2);
                                        i10 = i7;
                                    }
                                    focusTargetNode = focusTargetNode2;
                                } else if ((c0.G1() & a) != 0 && (c0 instanceof ul1)) {
                                    Modifier.c f2 = ((ul1) c0).f2();
                                    int i11 = i7;
                                    while (f2 != null) {
                                        if ((f2.G1() & a) != 0) {
                                            i11++;
                                            if (i11 == i8) {
                                                c0 = f2;
                                            } else {
                                                if (vy4Var == null) {
                                                    vy4Var = new vy4(new Modifier.c[i6], i7);
                                                }
                                                if (c0 != null) {
                                                    vy4Var.b(c0);
                                                    c0 = null;
                                                }
                                                vy4Var.b(f2);
                                            }
                                        }
                                        f2 = f2.C1();
                                        i8 = 1;
                                    }
                                    int i12 = i8;
                                    if (i11 == i12) {
                                        i8 = i12;
                                    }
                                }
                                c0 = rl1.g(vy4Var);
                                i8 = 1;
                            }
                            if (!ql2Var.c0().L1()) {
                                throw new IllegalStateException("visitChildren called on an unattached node");
                            }
                            vy4 vy4Var2 = new vy4(new Modifier.c[i6], i7);
                            Modifier.c C1 = ql2Var.c0().C1();
                            if (C1 == null) {
                                rl1.c(vy4Var2, ql2Var.c0());
                            } else {
                                vy4Var2.b(C1);
                            }
                            while (vy4Var2.t()) {
                                Modifier.c cVar = (Modifier.c) vy4Var2.y(vy4Var2.q() - 1);
                                if ((cVar.B1() & a) == 0) {
                                    rl1.c(vy4Var2, cVar);
                                } else {
                                    while (cVar != null) {
                                        if ((cVar.G1() & a) != 0) {
                                            vy4 vy4Var3 = null;
                                            while (cVar != null) {
                                                if (cVar instanceof FocusTargetNode) {
                                                    FocusTargetNode focusTargetNode3 = (FocusTargetNode) cVar;
                                                    if (focusTargetNode != null) {
                                                        i9 = 1;
                                                    }
                                                    set10 = focusInvalidationManager2.b;
                                                    if (set10.contains(focusTargetNode3)) {
                                                        linkedHashSet.add(focusTargetNode3);
                                                        i10 = i7;
                                                    }
                                                    focusTargetNode = focusTargetNode3;
                                                } else if ((cVar.G1() & a) != 0 && (cVar instanceof ul1)) {
                                                    Modifier.c f22 = ((ul1) cVar).f2();
                                                    int i13 = i7;
                                                    while (f22 != null) {
                                                        if ((f22.G1() & a) != 0) {
                                                            i13++;
                                                            if (i13 == 1) {
                                                                cVar = f22;
                                                                i4 = 0;
                                                            } else {
                                                                if (vy4Var3 == null) {
                                                                    Modifier.c[] cVarArr = new Modifier.c[i6];
                                                                    i4 = 0;
                                                                    vy4Var3 = new vy4(cVarArr, 0);
                                                                } else {
                                                                    i4 = 0;
                                                                }
                                                                if (cVar != null) {
                                                                    vy4Var3.b(cVar);
                                                                    cVar = null;
                                                                }
                                                                vy4Var3.b(f22);
                                                            }
                                                        } else {
                                                            i4 = i7;
                                                        }
                                                        f22 = f22.C1();
                                                        i7 = i4;
                                                        i6 = 16;
                                                    }
                                                    i3 = i7;
                                                    if (i13 == 1) {
                                                        i7 = i3;
                                                        i6 = 16;
                                                    }
                                                    cVar = rl1.g(vy4Var3);
                                                    i7 = i3;
                                                    i6 = 16;
                                                }
                                                i3 = i7;
                                                cVar = rl1.g(vy4Var3);
                                                i7 = i3;
                                                i6 = 16;
                                            }
                                        } else {
                                            cVar = cVar.C1();
                                            i7 = i7;
                                            i6 = 16;
                                        }
                                    }
                                }
                                i7 = i7;
                                i6 = 16;
                            }
                            i = i7;
                            i2 = 1;
                            if (i10 != 0) {
                                if (i9 != 0) {
                                    zl2Var = rl2.a(ql2Var);
                                } else if (focusTargetNode == null || (zl2Var = focusTargetNode.l2()) == null) {
                                    zl2Var = FocusStateImpl.Inactive;
                                }
                                ql2Var.h1(zl2Var);
                            }
                        } else {
                            ql2Var.h1(FocusStateImpl.Inactive);
                            i = i7;
                            i2 = i8;
                        }
                        i8 = i2;
                        i5 = 1024;
                        i7 = i;
                        i6 = 16;
                    }
                    set4 = FocusInvalidationManager.this.c;
                    set4.clear();
                    set5 = FocusInvalidationManager.this.b;
                    for (FocusTargetNode focusTargetNode4 : set5) {
                        if (focusTargetNode4.L1()) {
                            FocusStateImpl l2 = focusTargetNode4.l2();
                            focusTargetNode4.m2();
                            if (l2 != focusTargetNode4.l2() || linkedHashSet.contains(focusTargetNode4)) {
                                rl2.c(focusTargetNode4);
                            }
                        }
                    }
                    set6 = FocusInvalidationManager.this.b;
                    set6.clear();
                    linkedHashSet.clear();
                    set7 = FocusInvalidationManager.this.d;
                    if (!set7.isEmpty()) {
                        throw new IllegalStateException("Unprocessed FocusProperties nodes");
                    }
                    set8 = FocusInvalidationManager.this.c;
                    if (!set8.isEmpty()) {
                        throw new IllegalStateException("Unprocessed FocusEvent nodes");
                    }
                    set9 = FocusInvalidationManager.this.b;
                    if (!set9.isEmpty()) {
                        throw new IllegalStateException("Unprocessed FocusTarget nodes");
                    }
                    return;
                }
                wl2 wl2Var = (wl2) it2.next();
                if (wl2Var.c0().L1()) {
                    int a2 = a85.a(1024);
                    Modifier.c c02 = wl2Var.c0();
                    vy4 vy4Var4 = null;
                    while (c02 != null) {
                        if (c02 instanceof FocusTargetNode) {
                            set13 = focusInvalidationManager.b;
                            set13.add((FocusTargetNode) c02);
                        } else if ((c02.G1() & a2) != 0 && (c02 instanceof ul1)) {
                            int i14 = 0;
                            for (Modifier.c f23 = ((ul1) c02).f2(); f23 != null; f23 = f23.C1()) {
                                if ((f23.G1() & a2) != 0) {
                                    i14++;
                                    if (i14 == 1) {
                                        c02 = f23;
                                    } else {
                                        if (vy4Var4 == null) {
                                            vy4Var4 = new vy4(new Modifier.c[16], 0);
                                        }
                                        if (c02 != null) {
                                            vy4Var4.b(c02);
                                            c02 = null;
                                        }
                                        vy4Var4.b(f23);
                                    }
                                }
                            }
                            if (i14 == 1) {
                            }
                        }
                        c02 = rl1.g(vy4Var4);
                    }
                    if (!wl2Var.c0().L1()) {
                        throw new IllegalStateException("visitChildren called on an unattached node");
                    }
                    vy4 vy4Var5 = new vy4(new Modifier.c[16], 0);
                    Modifier.c C12 = wl2Var.c0().C1();
                    if (C12 == null) {
                        rl1.c(vy4Var5, wl2Var.c0());
                    } else {
                        vy4Var5.b(C12);
                    }
                    while (vy4Var5.t()) {
                        Modifier.c cVar2 = (Modifier.c) vy4Var5.y(vy4Var5.q() - 1);
                        if ((cVar2.B1() & a2) == 0) {
                            rl1.c(vy4Var5, cVar2);
                        } else {
                            while (true) {
                                if (cVar2 == null) {
                                    break;
                                }
                                if ((cVar2.G1() & a2) != 0) {
                                    vy4 vy4Var6 = null;
                                    while (cVar2 != null) {
                                        if (cVar2 instanceof FocusTargetNode) {
                                            set12 = focusInvalidationManager.b;
                                            set12.add((FocusTargetNode) cVar2);
                                        } else if ((cVar2.G1() & a2) != 0 && (cVar2 instanceof ul1)) {
                                            int i15 = 0;
                                            for (Modifier.c f24 = ((ul1) cVar2).f2(); f24 != null; f24 = f24.C1()) {
                                                if ((f24.G1() & a2) != 0) {
                                                    i15++;
                                                    if (i15 == 1) {
                                                        cVar2 = f24;
                                                    } else {
                                                        if (vy4Var6 == null) {
                                                            vy4Var6 = new vy4(new Modifier.c[16], 0);
                                                        }
                                                        if (cVar2 != null) {
                                                            vy4Var6.b(cVar2);
                                                            cVar2 = null;
                                                        }
                                                        vy4Var6.b(f24);
                                                    }
                                                }
                                            }
                                            if (i15 == 1) {
                                            }
                                        }
                                        cVar2 = rl1.g(vy4Var6);
                                    }
                                } else {
                                    cVar2 = cVar2.C1();
                                }
                            }
                        }
                    }
                }
            }
        }
    };

    public FocusInvalidationManager(ss2 ss2Var) {
        this.a = ss2Var;
    }

    private final void g(Set set, Object obj) {
        if (set.add(obj) && this.b.size() + this.c.size() + this.d.size() == 1) {
            this.a.invoke(this.e);
        }
    }

    public final void d(ql2 ql2Var) {
        g(this.c, ql2Var);
    }

    public final void e(wl2 wl2Var) {
        g(this.d, wl2Var);
    }

    public final void f(FocusTargetNode focusTargetNode) {
        g(this.b, focusTargetNode);
    }
}
