package defpackage;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.k;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes.dex */
public abstract class gj7 {
    public static final SemanticsNode a(LayoutNode layoutNode, boolean z) {
        int i;
        k h0 = layoutNode.h0();
        int a = a85.a(8);
        i = h0.i();
        Object obj = null;
        if ((i & a) != 0) {
            Modifier.c k = h0.k();
            loop0: while (true) {
                if (k == null) {
                    break;
                }
                if ((k.G1() & a) != 0) {
                    Modifier.c cVar = k;
                    vy4 vy4Var = null;
                    while (cVar != null) {
                        if (cVar instanceof ej7) {
                            obj = cVar;
                            break loop0;
                        }
                        if ((cVar.G1() & a) != 0 && (cVar instanceof ul1)) {
                            int i2 = 0;
                            for (Modifier.c f2 = ((ul1) cVar).f2(); f2 != null; f2 = f2.C1()) {
                                if ((f2.G1() & a) != 0) {
                                    i2++;
                                    if (i2 == 1) {
                                        cVar = f2;
                                    } else {
                                        if (vy4Var == null) {
                                            vy4Var = new vy4(new Modifier.c[16], 0);
                                        }
                                        if (cVar != null) {
                                            vy4Var.b(cVar);
                                            cVar = null;
                                        }
                                        vy4Var.b(f2);
                                    }
                                }
                            }
                            if (i2 == 1) {
                            }
                        }
                        cVar = rl1.g(vy4Var);
                    }
                }
                if ((k.B1() & a) == 0) {
                    break;
                }
                k = k.C1();
            }
        }
        zq3.e(obj);
        Modifier.c c0 = ((ej7) obj).c0();
        bj7 G = layoutNode.G();
        zq3.e(G);
        return new SemanticsNode(c0, z, layoutNode, G);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(SemanticsNode semanticsNode) {
        return semanticsNode.n() + 2000000000;
    }

    public static final LayoutNode f(LayoutNode layoutNode, ss2 ss2Var) {
        for (LayoutNode k0 = layoutNode.k0(); k0 != null; k0 = k0.k0()) {
            if (((Boolean) ss2Var.invoke(k0)).booleanValue()) {
                return k0;
            }
        }
        return null;
    }

    public static final ej7 g(LayoutNode layoutNode) {
        int i;
        k h0 = layoutNode.h0();
        int a = a85.a(8);
        i = h0.i();
        Object obj = null;
        if ((i & a) != 0) {
            Modifier.c k = h0.k();
            loop0: while (true) {
                if (k == null) {
                    break;
                }
                if ((k.G1() & a) != 0) {
                    Modifier.c cVar = k;
                    vy4 vy4Var = null;
                    while (cVar != null) {
                        if (cVar instanceof ej7) {
                            if (((ej7) cVar).x1()) {
                                obj = cVar;
                                break loop0;
                            }
                        } else if ((cVar.G1() & a) != 0 && (cVar instanceof ul1)) {
                            int i2 = 0;
                            for (Modifier.c f2 = ((ul1) cVar).f2(); f2 != null; f2 = f2.C1()) {
                                if ((f2.G1() & a) != 0) {
                                    i2++;
                                    if (i2 == 1) {
                                        cVar = f2;
                                    } else {
                                        if (vy4Var == null) {
                                            vy4Var = new vy4(new Modifier.c[16], 0);
                                        }
                                        if (cVar != null) {
                                            vy4Var.b(cVar);
                                            cVar = null;
                                        }
                                        vy4Var.b(f2);
                                    }
                                }
                            }
                            if (i2 == 1) {
                            }
                        }
                        cVar = rl1.g(vy4Var);
                    }
                }
                if ((k.B1() & a) == 0) {
                    break;
                }
                k = k.C1();
            }
        }
        return (ej7) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n27 h(SemanticsNode semanticsNode) {
        return (n27) SemanticsConfigurationKt.a(semanticsNode.v(), SemanticsProperties.a.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(SemanticsNode semanticsNode) {
        return semanticsNode.n() + Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
    }
}
