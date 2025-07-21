package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.amazonaws.services.s3.internal.Constants;
import com.google.android.gms.internal.pal.f7;
import com.google.android.gms.internal.pal.h7;
import com.google.android.gms.internal.pal.p7;
import com.google.android.gms.internal.pal.q7;
import com.google.android.gms.internal.pal.s7;
import com.google.android.gms.internal.pal.t7;
import com.google.android.gms.internal.pal.zzaby;
import com.google.android.gms.internal.pal.zzvn;
import com.google.android.gms.internal.pal.zzzc;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public final class oaf implements bcf {
    private static final Charset b = Charset.forName(Constants.DEFAULT_ENCODING);
    private final InputStream a;

    private oaf(InputStream inputStream) {
        this.a = inputStream;
    }

    public static bcf a(InputStream inputStream) {
        return new oaf(inputStream);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.bcf
    public final t7 zzb() {
        char c;
        int i;
        char c2;
        int i2;
        char c3;
        zzvn zzvnVar;
        String str = "status";
        try {
            try {
                i8g e = e9g.a(new ct9(new StringReader(new String(vdf.c(this.a), b)))).e();
                if (!e.o(TransferTable.COLUMN_KEY) || e.f(TransferTable.COLUMN_KEY).f() == 0) {
                    throw new zzzc("invalid keyset");
                }
                p7 u = t7.u();
                if (e.o("primaryKeyId")) {
                    u.l(e.g("primaryKeyId").a());
                }
                r7g f = e.f(TransferTable.COLUMN_KEY);
                int i3 = 0;
                while (i3 < f.f()) {
                    i8g e2 = f.g(i3).e();
                    if (!e2.o("keyData") || !e2.o(str) || !e2.o("keyId") || !e2.o("outputPrefixType")) {
                        throw new zzzc("invalid key");
                    }
                    q7 u2 = s7.u();
                    String c4 = e2.g(str).c();
                    int hashCode = c4.hashCode();
                    String str2 = str;
                    if (hashCode == -891611359) {
                        if (c4.equals("ENABLED")) {
                            c = 0;
                        }
                        c = 65535;
                    } else if (hashCode != 478389753) {
                        if (hashCode == 1053567612 && c4.equals("DISABLED")) {
                            c = 1;
                        }
                        c = 65535;
                    } else {
                        if (c4.equals("DESTROYED")) {
                            c = 2;
                        }
                        c = 65535;
                    }
                    if (c == 0) {
                        i = 3;
                    } else if (c == 1) {
                        i = 4;
                    } else {
                        if (c != 2) {
                            throw new zzzc("unknown status: ".concat(c4));
                        }
                        i = 5;
                    }
                    u2.n(i);
                    u2.l(e2.g("keyId").a());
                    String c5 = e2.g("outputPrefixType").c();
                    switch (c5.hashCode()) {
                        case -2053249079:
                            if (c5.equals("LEGACY")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 80904:
                            if (c5.equals("RAW")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 2575090:
                            if (c5.equals("TINK")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1761684556:
                            if (c5.equals("CRUNCHY")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    if (c2 == 0) {
                        i2 = 3;
                    } else if (c2 == 1) {
                        i2 = 5;
                    } else if (c2 == 2) {
                        i2 = 4;
                    } else {
                        if (c2 != 3) {
                            throw new zzzc("unknown output prefix type: ".concat(c5));
                        }
                        i2 = 6;
                    }
                    u2.m(i2);
                    i8g j = e2.j("keyData");
                    if (!j.o("typeUrl") || !j.o("value") || !j.o("keyMaterialType")) {
                        throw new zzzc("invalid keyData");
                    }
                    byte[] a = o4g.a(j.g("value").c(), 2);
                    f7 s = h7.s();
                    s.l(j.g("typeUrl").c());
                    s.m(zzaby.u(a));
                    String c6 = j.g("keyMaterialType").c();
                    switch (c6.hashCode()) {
                        case -1881281466:
                            if (c6.equals("REMOTE")) {
                                c3 = 3;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -1609477353:
                            if (c6.equals("SYMMETRIC")) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 249237018:
                            if (c6.equals("ASYMMETRIC_PRIVATE")) {
                                c3 = 1;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1534613202:
                            if (c6.equals("ASYMMETRIC_PUBLIC")) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        default:
                            c3 = 65535;
                            break;
                    }
                    if (c3 == 0) {
                        zzvnVar = zzvn.SYMMETRIC;
                    } else if (c3 == 1) {
                        zzvnVar = zzvn.ASYMMETRIC_PRIVATE;
                    } else if (c3 == 2) {
                        zzvnVar = zzvn.ASYMMETRIC_PUBLIC;
                    } else {
                        if (c3 != 3) {
                            throw new zzzc("unknown key material type: ".concat(c6));
                        }
                        zzvnVar = zzvn.REMOTE;
                    }
                    s.k(zzvnVar);
                    u2.k((h7) s.g());
                    u.k((s7) u2.g());
                    i3++;
                    str = str2;
                }
                t7 t7Var = (t7) u.g();
                InputStream inputStream = this.a;
                if (inputStream != null) {
                    inputStream.close();
                }
                return t7Var;
            } catch (zzzc | IllegalStateException e3) {
                throw new IOException(e3);
            }
        } catch (Throwable th) {
            InputStream inputStream2 = this.a;
            if (inputStream2 != null) {
                inputStream2.close();
            }
            throw th;
        }
    }
}
