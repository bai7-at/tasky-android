package defpackage;

import com.google.android.gms.internal.ads.zzgaa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class j7a implements l9a {
    private final List a;

    public j7a(int i, List list) {
        this.a = list;
    }

    private final t8a b(k9a k9aVar) {
        return new t8a(d(k9aVar));
    }

    private final p9a c(k9a k9aVar) {
        return new p9a(d(k9aVar));
    }

    private final List d(k9a k9aVar) {
        String str;
        int i;
        List list;
        b9e b9eVar = new b9e(k9aVar.d);
        List list2 = this.a;
        while (b9eVar.q() > 0) {
            int B = b9eVar.B();
            int s = b9eVar.s() + b9eVar.B();
            if (B == 134) {
                list2 = new ArrayList();
                int B2 = b9eVar.B() & 31;
                for (int i2 = 0; i2 < B2; i2++) {
                    String a = b9eVar.a(3, ege.c);
                    int B3 = b9eVar.B();
                    boolean z = (B3 & 128) != 0;
                    if (z) {
                        i = B3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte B4 = (byte) b9eVar.B();
                    b9eVar.l(1);
                    if (z) {
                        int i3 = B4 & 64;
                        int i4 = edd.c;
                        list = Collections.singletonList(i3 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    x3a x3aVar = new x3a();
                    x3aVar.w(str);
                    x3aVar.n(a);
                    x3aVar.i0(i);
                    x3aVar.l(list);
                    list2.add(x3aVar.D());
                }
            }
            b9eVar.k(s);
        }
        return list2;
    }

    @Override // defpackage.l9a
    public final n9a a(int i, k9a k9aVar) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new j8a(new g8a(k9aVar.b));
            }
            if (i == 21) {
                return new j8a(new e8a());
            }
            if (i == 27) {
                return new j8a(new b8a(b(k9aVar), false, false));
            }
            if (i == 36) {
                return new j8a(new d8a(b(k9aVar)));
            }
            if (i == 89) {
                return new j8a(new l7a(k9aVar.c));
            }
            if (i == 138) {
                return new j8a(new k7a(k9aVar.b));
            }
            if (i == 172) {
                return new j8a(new f7a(k9aVar.b));
            }
            if (i == 257) {
                return new s8a(new i8a("application/vnd.dvb.ait"));
            }
            if (i != 128) {
                if (i != 129) {
                    if (i == 134) {
                        return new s8a(new i8a("application/x-scte35"));
                    }
                    if (i != 135) {
                        switch (i) {
                            case 15:
                                return new j8a(new i7a(false, k9aVar.b));
                            case 16:
                                return new j8a(new x7a(c(k9aVar)));
                            case 17:
                                return new j8a(new f8a(k9aVar.b));
                            default:
                                return null;
                        }
                    }
                }
                return new j8a(new c7a(k9aVar.b));
            }
        }
        return new j8a(new u7a(c(k9aVar)));
    }

    public j7a(int i) {
        this.a = zzgaa.t();
    }
}
