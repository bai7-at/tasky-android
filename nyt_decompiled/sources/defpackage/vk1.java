package defpackage;

import android.util.SparseArray;
import com.google.android.exoplayer2.t0;
import com.google.common.collect.ImmutableList;
import defpackage.st8;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class vk1 implements st8.c {
    private final int a;
    private final List b;

    public vk1(int i) {
        this(i, ImmutableList.x());
    }

    private mi7 c(st8.b bVar) {
        return new mi7(e(bVar));
    }

    private sz8 d(st8.b bVar) {
        return new sz8(e(bVar));
    }

    private List e(st8.b bVar) {
        String str;
        int i;
        if (f(32)) {
            return this.b;
        }
        yo5 yo5Var = new yo5(bVar.d);
        List list = this.b;
        while (yo5Var.a() > 0) {
            int H = yo5Var.H();
            int f = yo5Var.f() + yo5Var.H();
            if (H == 134) {
                list = new ArrayList();
                int H2 = yo5Var.H() & 31;
                for (int i2 = 0; i2 < H2; i2++) {
                    String E = yo5Var.E(3);
                    int H3 = yo5Var.H();
                    boolean z = (H3 & 128) != 0;
                    if (z) {
                        i = H3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte H4 = (byte) yo5Var.H();
                    yo5Var.V(1);
                    list.add(new t0.b().g0(str).X(E).H(i).V(z ? wm0.b((H4 & 64) != 0) : null).G());
                }
            }
            yo5Var.U(f);
        }
        return list;
    }

    private boolean f(int i) {
        return (this.a & i) != 0;
    }

    @Override // st8.c
    public SparseArray a() {
        return new SparseArray();
    }

    @Override // st8.c
    public st8 b(int i, st8.b bVar) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new us5(new uw4(bVar.b));
            }
            if (i == 21) {
                return new us5(new te3());
            }
            if (i == 27) {
                if (f(4)) {
                    return null;
                }
                return new us5(new l63(c(bVar), f(1), f(8)));
            }
            if (i == 36) {
                return new us5(new m63(c(bVar)));
            }
            if (i == 89) {
                return new us5(new yw1(bVar.c));
            }
            if (i != 138) {
                if (i == 172) {
                    return new us5(new l2(bVar.b));
                }
                if (i == 257) {
                    return new xh7(new gp5("application/vnd.dvb.ait"));
                }
                if (i == 134) {
                    if (f(16)) {
                        return null;
                    }
                    return new xh7(new gp5("application/x-scte35"));
                }
                if (i != 135) {
                    switch (i) {
                        case 15:
                            if (!f(2)) {
                                break;
                            }
                            break;
                        case 16:
                            break;
                        case 17:
                            if (!f(2)) {
                                break;
                            }
                            break;
                        default:
                            switch (i) {
                                case 130:
                                    if (!f(64)) {
                                    }
                                    break;
                            }
                    }
                    return null;
                }
                return new us5(new h2(bVar.b));
            }
            return new us5(new nw1(bVar.b));
        }
        return new us5(new j63(d(bVar)));
    }

    public vk1(int i, List list) {
        this.a = i;
        this.b = list;
    }
}
