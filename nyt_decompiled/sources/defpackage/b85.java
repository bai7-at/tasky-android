package defpackage;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.node.c;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public abstract class b85 {
    public static final void a(Modifier.c cVar) {
        if (!cVar.L1()) {
            throw new IllegalStateException("autoInvalidateInsertedNode called on unattached node");
        }
        b(cVar, -1, 1);
    }

    public static final void b(Modifier.c cVar, int i, int i2) {
        if (!(cVar instanceof ul1)) {
            c(cVar, i & cVar.G1(), i2);
            return;
        }
        ul1 ul1Var = (ul1) cVar;
        c(cVar, ul1Var.g2() & i, i2);
        int i3 = (~ul1Var.g2()) & i;
        for (Modifier.c f2 = ul1Var.f2(); f2 != null; f2 = f2.C1()) {
            b(f2, i3, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void c(Modifier.c cVar, int i, int i2) {
        if (i2 != 0 || cVar.J1()) {
            if ((a85.a(2) & i) != 0 && (cVar instanceof c)) {
                qz3.b((c) cVar);
                if (i2 == 2) {
                    rl1.h(cVar, a85.a(2)).F2();
                }
            }
            if ((a85.a(JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) & i) != 0 && (cVar instanceof f13)) {
                rl1.k(cVar).C0();
            }
            if ((a85.a(4) & i) != 0 && (cVar instanceof cv1)) {
                dv1.a((cv1) cVar);
            }
            if ((a85.a(8) & i) != 0 && (cVar instanceof ej7)) {
                fj7.b((ej7) cVar);
            }
            if ((a85.a(64) & i) != 0 && (cVar instanceof vo5)) {
                wo5.a((vo5) cVar);
            }
            if ((a85.a(1024) & i) != 0 && (cVar instanceof FocusTargetNode)) {
                if (i2 == 2) {
                    cVar.Q1();
                } else {
                    rl1.l(cVar).getFocusOwner().i((FocusTargetNode) cVar);
                }
            }
            if ((a85.a(ProgressEvent.PART_COMPLETED_EVENT_CODE) & i) != 0 && (cVar instanceof wl2)) {
                wl2 wl2Var = (wl2) cVar;
                if (k(wl2Var)) {
                    if (i2 == 2) {
                        j(wl2Var);
                    } else {
                        xl2.a(wl2Var);
                    }
                }
            }
            if ((i & a85.a(ProgressEvent.PART_FAILED_EVENT_CODE)) == 0 || !(cVar instanceof ql2)) {
                return;
            }
            rl2.b((ql2) cVar);
        }
    }

    public static final void d(Modifier.c cVar) {
        if (!cVar.L1()) {
            throw new IllegalStateException("autoInvalidateRemovedNode called on unattached node");
        }
        b(cVar, -1, 2);
    }

    public static final void e(Modifier.c cVar) {
        if (!cVar.L1()) {
            throw new IllegalStateException("autoInvalidateUpdatedNode called on unattached node");
        }
        b(cVar, -1, 0);
    }

    public static final int f(Modifier.b bVar) {
        int a = a85.a(1);
        if (bVar instanceof androidx.compose.ui.layout.c) {
            a |= a85.a(2);
        }
        if (bVar instanceof bv1) {
            a |= a85.a(4);
        }
        if (bVar instanceof cj7) {
            a |= a85.a(8);
        }
        if (bVar instanceof cy5) {
            a |= a85.a(16);
        }
        if ((bVar instanceof hv4) || (bVar instanceof mv4)) {
            a |= a85.a(32);
        }
        if (bVar instanceof ve5) {
            a |= a85.a(JceEncryptionConstants.SYMMETRIC_KEY_LENGTH);
        }
        if (bVar instanceof uo5) {
            a |= a85.a(64);
        }
        return bVar instanceof kf5 ? a | a85.a(128) : a;
    }

    public static final int g(Modifier.c cVar) {
        if (cVar.G1() != 0) {
            return cVar.G1();
        }
        int a = a85.a(1);
        if (cVar instanceof c) {
            a |= a85.a(2);
        }
        if (cVar instanceof cv1) {
            a |= a85.a(4);
        }
        if (cVar instanceof ej7) {
            a |= a85.a(8);
        }
        if (cVar instanceof dy5) {
            a |= a85.a(16);
        }
        if (cVar instanceof kv4) {
            a |= a85.a(32);
        }
        if (cVar instanceof vo5) {
            a |= a85.a(64);
        }
        if (cVar instanceof zy3) {
            a |= a85.a(128);
        }
        if (cVar instanceof f13) {
            a |= a85.a(JceEncryptionConstants.SYMMETRIC_KEY_LENGTH);
        }
        if (cVar instanceof FocusTargetNode) {
            a |= a85.a(1024);
        }
        if (cVar instanceof wl2) {
            a |= a85.a(ProgressEvent.PART_COMPLETED_EVENT_CODE);
        }
        if (cVar instanceof ql2) {
            a |= a85.a(ProgressEvent.PART_FAILED_EVENT_CODE);
        }
        if (cVar instanceof zv3) {
            a |= a85.a(8192);
        }
        if (cVar instanceof v27) {
            a |= a85.a(Http2.INITIAL_MAX_FRAME_SIZE);
        }
        if (cVar instanceof ct0) {
            a |= a85.a(32768);
        }
        return cVar instanceof ls8 ? a | a85.a(262144) : a;
    }

    public static final int h(Modifier.c cVar) {
        if (!(cVar instanceof ul1)) {
            return g(cVar);
        }
        ul1 ul1Var = (ul1) cVar;
        int g2 = ul1Var.g2();
        for (Modifier.c f2 = ul1Var.f2(); f2 != null; f2 = f2.C1()) {
            g2 |= h(f2);
        }
        return g2;
    }

    public static final boolean i(int i) {
        return (i & a85.a(128)) != 0;
    }

    private static final void j(wl2 wl2Var) {
        int a = a85.a(1024);
        if (!wl2Var.c0().L1()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        vy4 vy4Var = new vy4(new Modifier.c[16], 0);
        Modifier.c C1 = wl2Var.c0().C1();
        if (C1 == null) {
            rl1.c(vy4Var, wl2Var.c0());
        } else {
            vy4Var.b(C1);
        }
        while (vy4Var.t()) {
            Modifier.c cVar = (Modifier.c) vy4Var.y(vy4Var.q() - 1);
            if ((cVar.B1() & a) == 0) {
                rl1.c(vy4Var, cVar);
            } else {
                while (true) {
                    if (cVar == null) {
                        break;
                    }
                    if ((cVar.G1() & a) != 0) {
                        vy4 vy4Var2 = null;
                        while (cVar != null) {
                            if (cVar instanceof FocusTargetNode) {
                                dm2.c((FocusTargetNode) cVar);
                            } else if ((cVar.G1() & a) != 0 && (cVar instanceof ul1)) {
                                int i = 0;
                                for (Modifier.c f2 = ((ul1) cVar).f2(); f2 != null; f2 = f2.C1()) {
                                    if ((f2.G1() & a) != 0) {
                                        i++;
                                        if (i == 1) {
                                            cVar = f2;
                                        } else {
                                            if (vy4Var2 == null) {
                                                vy4Var2 = new vy4(new Modifier.c[16], 0);
                                            }
                                            if (cVar != null) {
                                                vy4Var2.b(cVar);
                                                cVar = null;
                                            }
                                            vy4Var2.b(f2);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            cVar = rl1.g(vy4Var2);
                        }
                    } else {
                        cVar = cVar.C1();
                    }
                }
            }
        }
    }

    private static final boolean k(wl2 wl2Var) {
        ih0 ih0Var = ih0.a;
        ih0Var.l();
        wl2Var.P0(ih0Var);
        return ih0Var.k();
    }
}
