package defpackage;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.font.m;
import androidx.compose.ui.text.font.o;
import defpackage.ph8;
import kotlin.collections.i;

/* loaded from: classes.dex */
public final class rc1 {
    private final Parcel a;

    public rc1(String str) {
        Parcel obtain = Parcel.obtain();
        this.a = obtain;
        byte[] decode = Base64.decode(str, 0);
        obtain.unmarshall(decode, 0, decode.length);
        obtain.setDataPosition(0);
    }

    private final int a() {
        return this.a.dataAvail();
    }

    private final float b() {
        return m60.c(e());
    }

    private final byte c() {
        return this.a.readByte();
    }

    private final float e() {
        return this.a.readFloat();
    }

    private final int i() {
        return this.a.readInt();
    }

    private final jo7 j() {
        return new jo7(d(), hd5.a(e(), e()), e(), null);
    }

    private final String l() {
        return this.a.readString();
    }

    private final ph8 m() {
        int i = i();
        ph8.a aVar = ph8.b;
        boolean z = (aVar.b().e() & i) != 0;
        boolean z2 = (i & aVar.d().e()) != 0;
        return (z && z2) ? aVar.a(i.o(aVar.b(), aVar.d())) : z ? aVar.b() : z2 ? aVar.d() : aVar.c();
    }

    private final li8 n() {
        return new li8(e(), e());
    }

    private final long p() {
        return pv8.b(this.a.readLong());
    }

    public final long d() {
        return nn0.o(p());
    }

    public final int f() {
        byte c = c();
        if (c != 0 && c == 1) {
            return l.b.a();
        }
        return l.b.b();
    }

    public final int g() {
        byte c = c();
        return c == 0 ? m.b.b() : c == 1 ? m.b.a() : c == 3 ? m.b.c() : c == 2 ? m.b.d() : m.b.b();
    }

    public final o h() {
        return new o(i());
    }

    public final jy7 k() {
        ry4 ry4Var;
        ry4 ry4Var2 = r15;
        ry4 ry4Var3 = new ry4(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 16383, null);
        while (this.a.dataAvail() > 1) {
            byte c = c();
            if (c != 1) {
                ry4Var = ry4Var2;
                if (c == 2) {
                    if (a() < 5) {
                        break;
                    }
                    ry4Var.e(o());
                    ry4Var2 = ry4Var;
                } else if (c == 3) {
                    if (a() < 4) {
                        break;
                    }
                    ry4Var.h(h());
                    ry4Var2 = ry4Var;
                } else if (c == 4) {
                    if (a() < 1) {
                        break;
                    }
                    ry4Var.f(l.c(f()));
                    ry4Var2 = ry4Var;
                } else if (c != 5) {
                    if (c != 6) {
                        if (c != 7) {
                            if (c != 8) {
                                if (c != 9) {
                                    if (c != 10) {
                                        if (c != 11) {
                                            if (c == 12) {
                                                if (a() < 20) {
                                                    break;
                                                }
                                                ry4Var.j(j());
                                            }
                                        } else {
                                            if (a() < 4) {
                                                break;
                                            }
                                            ry4Var.k(m());
                                        }
                                    } else {
                                        if (a() < 8) {
                                            break;
                                        }
                                        ry4Var.a(d());
                                    }
                                } else {
                                    if (a() < 8) {
                                        break;
                                    }
                                    ry4Var.l(n());
                                }
                            } else {
                                if (a() < 4) {
                                    break;
                                }
                                ry4Var.b(m60.b(b()));
                            }
                        } else {
                            if (a() < 5) {
                                break;
                            }
                            ry4Var.i(o());
                        }
                    } else {
                        ry4Var.d(l());
                    }
                    ry4Var2 = ry4Var;
                } else {
                    if (a() < 1) {
                        break;
                    }
                    ry4Var.g(m.e(g()));
                    ry4Var2 = ry4Var;
                }
            } else {
                if (a() < 8) {
                    break;
                }
                ry4Var2.c(d());
            }
        }
        ry4Var = ry4Var2;
        return ry4Var.m();
    }

    public final long o() {
        byte c = c();
        long b = c == 1 ? fk8.b.b() : c == 2 ? fk8.b.a() : fk8.b.c();
        return fk8.g(b, fk8.b.c()) ? dk8.b.a() : ek8.a(e(), b);
    }
}
