package defpackage;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzae;
import com.google.android.gms.internal.ads.zzahm;
import com.google.android.gms.internal.ads.zzbx;
import com.google.android.gms.internal.ads.zzby;
import com.google.android.gms.internal.ads.zzcc;
import com.google.android.gms.internal.ads.zzgaa;
import com.google.android.gms.internal.ads.zzgc;
import com.google.android.gms.internal.ads.zzgf;
import com.google.android.gms.internal.ads.zzgi;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
abstract class k2a {
    private static final byte[] a;

    static {
        int i = khe.a;
        a = "OpusHead".getBytes(ege.c);
    }

    public static zzby a(a2a a2aVar) {
        zzgc zzgcVar;
        b2a d = a2aVar.d(1751411826);
        b2a d2 = a2aVar.d(1801812339);
        b2a d3 = a2aVar.d(1768715124);
        if (d != null && d2 != null && d3 != null && g(d.b) == 1835299937) {
            b9e b9eVar = d2.b;
            b9eVar.k(12);
            int v = b9eVar.v();
            String[] strArr = new String[v];
            for (int i = 0; i < v; i++) {
                int v2 = b9eVar.v();
                b9eVar.l(4);
                strArr[i] = b9eVar.a(v2 - 8, ege.c);
            }
            b9e b9eVar2 = d3.b;
            b9eVar2.k(8);
            ArrayList arrayList = new ArrayList();
            while (b9eVar2.q() > 8) {
                int s = b9eVar2.s() + b9eVar2.v();
                int v3 = b9eVar2.v() - 1;
                if (v3 < 0 || v3 >= v) {
                    ezd.f("AtomParsers", "Skipped metadata with unknown key index: " + v3);
                } else {
                    String str = strArr[v3];
                    String[] strArr2 = y2a.a;
                    while (true) {
                        int s2 = b9eVar2.s();
                        if (s2 >= s) {
                            zzgcVar = null;
                            break;
                        }
                        int v4 = b9eVar2.v();
                        if (b9eVar2.v() == 1684108385) {
                            int v5 = b9eVar2.v();
                            int v6 = b9eVar2.v();
                            int i2 = v4 - 16;
                            byte[] bArr = new byte[i2];
                            b9eVar2.g(bArr, 0, i2);
                            zzgcVar = new zzgc(str, bArr, v6, v5);
                            break;
                        }
                        b9eVar2.k(s2 + v4);
                    }
                    if (zzgcVar != null) {
                        arrayList.add(zzgcVar);
                    }
                }
                b9eVar2.k(s);
            }
            if (!arrayList.isEmpty()) {
                return new zzby(arrayList);
            }
        }
        return null;
    }

    public static zzby b(b2a b2aVar) {
        int C;
        b9e b9eVar = b2aVar.b;
        b9eVar.k(8);
        zzby zzbyVar = new zzby(-9223372036854775807L, new zzbx[0]);
        while (b9eVar.q() >= 8) {
            int s = b9eVar.s();
            int v = b9eVar.v() + s;
            int v2 = b9eVar.v();
            zzby zzbyVar2 = null;
            if (v2 == 1835365473) {
                b9eVar.k(s);
                b9eVar.l(8);
                e(b9eVar);
                while (true) {
                    if (b9eVar.s() >= v) {
                        break;
                    }
                    int s2 = b9eVar.s();
                    int v3 = b9eVar.v() + s2;
                    if (b9eVar.v() == 1768715124) {
                        b9eVar.k(s2);
                        b9eVar.l(8);
                        ArrayList arrayList = new ArrayList();
                        while (b9eVar.s() < v3) {
                            zzbx a2 = y2a.a(b9eVar);
                            if (a2 != null) {
                                arrayList.add(a2);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            zzbyVar2 = new zzby(arrayList);
                        }
                    } else {
                        b9eVar.k(v3);
                    }
                }
                zzbyVar = zzbyVar.d(zzbyVar2);
            } else if (v2 == 1936553057) {
                b9eVar.k(s);
                b9eVar.l(12);
                while (true) {
                    if (b9eVar.s() >= v) {
                        break;
                    }
                    int s3 = b9eVar.s();
                    int v4 = b9eVar.v();
                    if (b9eVar.v() != 1935766900) {
                        b9eVar.k(s3 + v4);
                    } else if (v4 >= 16) {
                        b9eVar.l(4);
                        int i = -1;
                        int i2 = 0;
                        for (int i3 = 0; i3 < 2; i3++) {
                            int B = b9eVar.B();
                            int B2 = b9eVar.B();
                            if (B == 0) {
                                i = B2;
                            } else if (B == 1) {
                                i2 = B2;
                            }
                        }
                        if (i == 12) {
                            C = 240;
                        } else if (i == 13) {
                            C = 120;
                        } else {
                            if (i == 21 && b9eVar.q() >= 8 && b9eVar.s() + 8 <= v) {
                                int v5 = b9eVar.v();
                                int v6 = b9eVar.v();
                                if (v5 >= 12 && v6 == 1936877170) {
                                    C = b9eVar.C();
                                }
                            }
                            C = -2147483647;
                        }
                        if (C != -2147483647) {
                            zzbyVar2 = new zzby(-9223372036854775807L, new zzahm(C, i2));
                        }
                    }
                }
                zzbyVar = zzbyVar.d(zzbyVar2);
            } else if (v2 == -1451722374) {
                zzbyVar = zzbyVar.d(i(b9eVar));
            }
            b9eVar.k(v);
        }
        return zzbyVar;
    }

    public static zzgi c(b9e b9eVar) {
        long I;
        long I2;
        b9eVar.k(8);
        if (c2a.a(b9eVar.v()) == 0) {
            I = b9eVar.J();
            I2 = b9eVar.J();
        } else {
            I = b9eVar.I();
            I2 = b9eVar.I();
        }
        return new zzgi(I, I2, b9eVar.J());
    }

    /* JADX WARN: Code restructure failed: missing block: B:338:0x0757, code lost:
    
        if (r15 == 1) goto L366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0733, code lost:
    
        if (r8.d(1) > 0) goto L354;
     */
    /* JADX WARN: Removed duplicated region for block: B:265:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0769  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x079b  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x098e  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0990  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0b06  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0b0a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x0b70 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:511:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List d(defpackage.a2a r56, defpackage.sw9 r57, long r58, com.google.android.gms.internal.ads.zzae r60, boolean r61, boolean r62, defpackage.gge r63) {
        /*
            Method dump skipped, instructions count: 2938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k2a.d(a2a, sw9, long, com.google.android.gms.internal.ads.zzae, boolean, boolean, gge):java.util.List");
    }

    public static void e(b9e b9eVar) {
        int s = b9eVar.s();
        b9eVar.l(4);
        if (b9eVar.v() != 1751411826) {
            s += 4;
        }
        b9eVar.k(s);
    }

    private static int f(b9e b9eVar) {
        int B = b9eVar.B();
        int i = B & 127;
        while ((B & 128) == 128) {
            B = b9eVar.B();
            i = (i << 7) | (B & 127);
        }
        return i;
    }

    private static int g(b9e b9eVar) {
        b9eVar.k(16);
        return b9eVar.v();
    }

    private static Pair h(b9e b9eVar, int i, int i2) {
        Integer num;
        i3a i3aVar;
        Pair create;
        int i3;
        int i4;
        byte[] bArr;
        int s = b9eVar.s();
        while (s - i < i2) {
            b9eVar.k(s);
            int v = b9eVar.v();
            tv9.b(v > 0, "childAtomSize must be positive");
            if (b9eVar.v() == 1936289382) {
                int i5 = s + 8;
                int i6 = 0;
                int i7 = -1;
                String str = null;
                Integer num2 = null;
                while (i5 - s < v) {
                    b9eVar.k(i5);
                    int v2 = b9eVar.v();
                    int v3 = b9eVar.v();
                    if (v3 == 1718775137) {
                        num2 = Integer.valueOf(b9eVar.v());
                    } else if (v3 == 1935894637) {
                        b9eVar.l(4);
                        str = b9eVar.a(4, ege.c);
                    } else if (v3 == 1935894633) {
                        i7 = i5;
                        i6 = v2;
                    }
                    i5 += v2;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    tv9.b(num2 != null, "frma atom is mandatory");
                    tv9.b(i7 != -1, "schi atom is mandatory");
                    int i8 = i7 + 8;
                    while (true) {
                        if (i8 - i7 >= i6) {
                            num = num2;
                            i3aVar = null;
                            break;
                        }
                        b9eVar.k(i8);
                        int v4 = b9eVar.v();
                        if (b9eVar.v() == 1952804451) {
                            int a2 = c2a.a(b9eVar.v());
                            b9eVar.l(1);
                            if (a2 == 0) {
                                b9eVar.l(1);
                                i3 = 0;
                                i4 = 0;
                            } else {
                                int B = b9eVar.B();
                                int i9 = (B & 240) >> 4;
                                i3 = B & 15;
                                i4 = i9;
                            }
                            boolean z = b9eVar.B() == 1;
                            int B2 = b9eVar.B();
                            byte[] bArr2 = new byte[16];
                            b9eVar.g(bArr2, 0, 16);
                            if (z && B2 == 0) {
                                int B3 = b9eVar.B();
                                byte[] bArr3 = new byte[B3];
                                b9eVar.g(bArr3, 0, B3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = num2;
                            i3aVar = new i3a(z, str, B2, bArr2, i4, i3, bArr);
                        } else {
                            i8 += v4;
                        }
                    }
                    tv9.b(i3aVar != null, "tenc atom is mandatory");
                    int i10 = khe.a;
                    create = Pair.create(num, i3aVar);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            s += v;
        }
        return null;
    }

    private static zzby i(b9e b9eVar) {
        short d = b9eVar.d();
        b9eVar.l(2);
        String a2 = b9eVar.a(d, ege.c);
        int max = Math.max(a2.lastIndexOf(43), a2.lastIndexOf(45));
        try {
            return new zzby(-9223372036854775807L, new zzgf(Float.parseFloat(a2.substring(0, max)), Float.parseFloat(a2.substring(max, a2.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static e2a j(b9e b9eVar, int i) {
        b9eVar.k(i + 12);
        b9eVar.l(1);
        f(b9eVar);
        b9eVar.l(2);
        int B = b9eVar.B();
        if ((B & 128) != 0) {
            b9eVar.l(2);
        }
        if ((B & 64) != 0) {
            b9eVar.l(b9eVar.B());
        }
        if ((B & 32) != 0) {
            b9eVar.l(2);
        }
        b9eVar.l(1);
        f(b9eVar);
        String d = qcb.d(b9eVar.B());
        if ("audio/mpeg".equals(d) || "audio/vnd.dts".equals(d) || "audio/vnd.dts.hd".equals(d)) {
            return new e2a(d, null, -1L, -1L);
        }
        b9eVar.l(4);
        long J = b9eVar.J();
        long J2 = b9eVar.J();
        b9eVar.l(1);
        int f = f(b9eVar);
        byte[] bArr = new byte[f];
        b9eVar.g(bArr, 0, f);
        return new e2a(d, bArr, J2 <= 0 ? -1L : J2, J > 0 ? J : -1L);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x04d7 A[EDGE_INSN: B:114:0x04d7->B:115:0x04d7 BREAK  A[LOOP:5: B:94:0x0477->B:110:0x04d1], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x047c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static defpackage.k3a k(defpackage.h3a r36, defpackage.a2a r37, defpackage.sw9 r38) {
        /*
            Method dump skipped, instructions count: 1501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k2a.k(h3a, a2a, sw9):k3a");
    }

    private static ByteBuffer l() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static void m(b9e b9eVar, int i, int i2, int i3, int i4, String str, boolean z, zzae zzaeVar, g2a g2aVar, int i5) {
        int i6;
        int C;
        int v;
        int i7;
        int i8;
        String str2;
        long j;
        long j2;
        String str3;
        boolean z2;
        int i9;
        int i10;
        int i11;
        String str4;
        String str5;
        String str6;
        byte[] bArr;
        String str7;
        int i12;
        String str8;
        boolean z3;
        b9e b9eVar2 = b9eVar;
        int i13 = i2;
        int i14 = i3;
        zzae zzaeVar2 = zzaeVar;
        b9eVar2.k(i13 + 16);
        if (z) {
            i6 = b9eVar.F();
            b9eVar2.l(6);
        } else {
            b9eVar2.l(8);
            i6 = 0;
        }
        if (i6 == 0 || i6 == 1) {
            int F = b9eVar.F();
            b9eVar2.l(6);
            C = b9eVar.C();
            b9eVar2.k(b9eVar.s() - 4);
            v = b9eVar.v();
            if (i6 == 1) {
                b9eVar2.l(16);
            }
            i7 = F;
            i8 = -1;
        } else {
            if (i6 != 2) {
                return;
            }
            b9eVar2.l(16);
            C = (int) Math.round(Double.longBitsToDouble(b9eVar.I()));
            i7 = b9eVar.E();
            b9eVar2.l(4);
            int E = b9eVar.E();
            int E2 = b9eVar.E();
            int i15 = E2 & 1;
            int i16 = E2 & 2;
            if (i15 == 0) {
                if (E == 8) {
                    i8 = 3;
                } else if (E == 16) {
                    i8 = i16 != 0 ? 268435456 : 2;
                } else if (E == 24) {
                    i8 = i16 != 0 ? 1342177280 : 21;
                } else {
                    if (E == 32) {
                        i8 = i16 != 0 ? 1610612736 : 22;
                    }
                    i8 = -1;
                }
                b9eVar2.l(8);
                v = 0;
            } else {
                if (E == 32) {
                    i8 = 4;
                    b9eVar2.l(8);
                    v = 0;
                }
                i8 = -1;
                b9eVar2.l(8);
                v = 0;
            }
        }
        int s = b9eVar.s();
        int i17 = 1701733217;
        if (i == 1701733217) {
            Pair h = h(b9eVar2, i13, i14);
            if (h != null) {
                i17 = ((Integer) h.first).intValue();
                zzaeVar2 = zzaeVar2 == null ? null : zzaeVar2.b(((i3a) h.second).b);
                g2aVar.a[i5] = (i3a) h.second;
            }
            b9eVar2.k(s);
        } else {
            i17 = i;
        }
        String str9 = "audio/mhm1";
        String str10 = "audio/ac4";
        if (i17 == 1633889587) {
            str2 = "audio/ac3";
        } else if (i17 == 1700998451) {
            str2 = "audio/eac3";
        } else if (i17 == 1633889588) {
            str2 = "audio/ac4";
        } else if (i17 == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (i17 == 1685353320 || i17 == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (i17 == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (i17 == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (i17 == 1935764850) {
            str2 = "audio/3gpp";
        } else if (i17 == 1935767394) {
            str2 = "audio/amr-wb";
        } else {
            if (i17 != 1936684916) {
                if (i17 == 1953984371) {
                    str2 = "audio/raw";
                    i8 = 268435456;
                } else if (i17 != 1819304813) {
                    str2 = (i17 == 778924082 || i17 == 778924083) ? "audio/mpeg" : i17 == 1835557169 ? "audio/mha1" : i17 == 1835560241 ? "audio/mhm1" : i17 == 1634492771 ? "audio/alac" : i17 == 1634492791 ? "audio/g711-alaw" : i17 == 1970037111 ? "audio/g711-mlaw" : i17 == 1332770163 ? "audio/opus" : i17 == 1716281667 ? "audio/flac" : i17 == 1835823201 ? "audio/true-hd" : null;
                } else if (i8 != -1) {
                    str2 = "audio/raw";
                }
            }
            str2 = "audio/raw";
            i8 = 2;
        }
        int i18 = i8;
        String str11 = null;
        List list = null;
        e2a e2aVar = null;
        while (s - i13 < i14) {
            b9eVar2.k(s);
            int v2 = b9eVar.v();
            String str12 = "childAtomSize must be positive";
            tv9.b(v2 > 0, "childAtomSize must be positive");
            int v3 = b9eVar.v();
            int i19 = C;
            if (v3 == 1835557187) {
                b9eVar2.k(s + 8);
                b9eVar2.l(1);
                int B = b9eVar.B();
                b9eVar2.l(1);
                str5 = Objects.equals(str2, str9) ? String.format("mhm1.%02X", Integer.valueOf(B)) : String.format("mha1.%02X", Integer.valueOf(B));
                int F2 = b9eVar.F();
                byte[] bArr2 = new byte[F2];
                str3 = str9;
                z2 = false;
                b9eVar2.g(bArr2, 0, F2);
                list = list == null ? zzgaa.u(bArr2) : zzgaa.v(bArr2, (byte[]) list.get(0));
            } else {
                str3 = str9;
                z2 = false;
                if (v3 == 1835557200) {
                    b9eVar2.k(s + 8);
                    int B2 = b9eVar.B();
                    if (B2 > 0) {
                        byte[] bArr3 = new byte[B2];
                        b9eVar2.g(bArr3, 0, B2);
                        if (list == null) {
                            list = zzgaa.u(bArr3);
                            str5 = str11;
                        } else {
                            list = zzgaa.v((byte[]) list.get(0), bArr3);
                            str5 = str11;
                            C = i19;
                            str4 = str10;
                        }
                    } else {
                        i9 = i19;
                        str4 = str10;
                        str5 = str11;
                        C = i9;
                    }
                } else {
                    if (v3 == 1702061171) {
                        i9 = i19;
                        i10 = s;
                        i11 = -1;
                    } else if (z && v3 == 2002876005) {
                        i10 = b9eVar.s();
                        if (i10 >= s) {
                            str8 = null;
                            z3 = true;
                        } else {
                            str8 = null;
                            z3 = false;
                        }
                        tv9.b(z3, str8);
                        while (true) {
                            if (i10 - s >= v2) {
                                i9 = i19;
                                i10 = -1;
                                break;
                            }
                            b9eVar2.k(i10);
                            int v4 = b9eVar.v();
                            tv9.b(v4 > 0, str12);
                            String str13 = str12;
                            if (b9eVar.v() == 1702061171) {
                                i9 = i19;
                                break;
                            } else {
                                i10 += v4;
                                str12 = str13;
                            }
                        }
                        i11 = -1;
                    } else {
                        if (v3 == 1684103987) {
                            b9eVar2.k(s + 8);
                            g2aVar.b = bu9.c(b9eVar2, Integer.toString(i4), str, zzaeVar2);
                        } else if (v3 == 1684366131) {
                            b9eVar2.k(s + 8);
                            g2aVar.b = bu9.d(b9eVar2, Integer.toString(i4), str, zzaeVar2);
                        } else if (v3 == 1684103988) {
                            b9eVar2.k(s + 8);
                            String num = Integer.toString(i4);
                            int i20 = fu9.b;
                            b9eVar2.l(1);
                            int B3 = b9eVar.B() & 32;
                            x3a x3aVar = new x3a();
                            x3aVar.k(num);
                            x3aVar.w(str10);
                            x3aVar.k0(2);
                            x3aVar.x(1 != (B3 >> 5) ? 44100 : 48000);
                            x3aVar.e(zzaeVar2);
                            x3aVar.n(str);
                            g2aVar.b = x3aVar.D();
                        } else if (v3 != 1684892784) {
                            if (v3 == 1684305011 || v3 == 1969517683) {
                                x3a x3aVar2 = new x3a();
                                x3aVar2.j(i4);
                                x3aVar2.w(str2);
                                x3aVar2.k0(i7);
                                i9 = i19;
                                x3aVar2.x(i9);
                                x3aVar2.e(zzaeVar2);
                                x3aVar2.n(str);
                                g2aVar.b = x3aVar2.D();
                            } else if (v3 == 1682927731) {
                                int i21 = v2 - 8;
                                byte[] bArr4 = a;
                                byte[] copyOf = Arrays.copyOf(bArr4, bArr4.length + i21);
                                b9eVar2.k(s + 8);
                                b9eVar2.g(copyOf, bArr4.length, i21);
                                list = bx9.e(copyOf);
                                str5 = str11;
                                C = i19;
                                str4 = str10;
                            } else if (v3 == 1684425825) {
                                byte[] bArr5 = new byte[v2 - 8];
                                bArr5[0] = 102;
                                bArr5[1] = 76;
                                bArr5[2] = 97;
                                bArr5[3] = 67;
                                b9eVar2.k(s + 12);
                                b9eVar2.g(bArr5, 4, v2 - 12);
                                list = zzgaa.u(bArr5);
                                str5 = str11;
                                C = i19;
                                str4 = str10;
                            } else if (v3 == 1634492771) {
                                int i22 = v2 - 12;
                                byte[] bArr6 = new byte[i22];
                                b9eVar2.k(s + 12);
                                b9eVar2.g(bArr6, 0, i22);
                                int i23 = edd.c;
                                b9e b9eVar3 = new b9e(bArr6);
                                b9eVar3.k(9);
                                int B4 = b9eVar3.B();
                                b9eVar3.k(20);
                                Pair create = Pair.create(Integer.valueOf(b9eVar3.E()), Integer.valueOf(B4));
                                int intValue = ((Integer) create.first).intValue();
                                int intValue2 = ((Integer) create.second).intValue();
                                list = zzgaa.u(bArr6);
                                i7 = intValue2;
                                C = intValue;
                                str4 = str10;
                                str5 = str11;
                            } else {
                                i9 = i19;
                            }
                            str4 = str10;
                            str5 = str11;
                            C = i9;
                        } else {
                            if (v <= 0) {
                                throw zzcc.a("Invalid sample rate for Dolby TrueHD MLP stream: " + v, null);
                            }
                            str5 = str11;
                            str4 = str10;
                            C = v;
                            i7 = 2;
                        }
                        i9 = i19;
                        str4 = str10;
                        str5 = str11;
                        C = i9;
                    }
                    if (i10 != i11) {
                        e2aVar = j(b9eVar2, i10);
                        str6 = e2aVar.a;
                        bArr = e2aVar.b;
                        if (bArr == null) {
                            str4 = str10;
                        } else if ("audio/vorbis".equals(str6)) {
                            b9e b9eVar4 = new b9e(bArr);
                            int i24 = 1;
                            b9eVar4.l(1);
                            int i25 = 0;
                            while (true) {
                                if (b9eVar4.q() <= 0) {
                                    str4 = str10;
                                    i12 = 255;
                                    break;
                                }
                                str4 = str10;
                                i12 = 255;
                                if (b9eVar4.u() != 255) {
                                    break;
                                }
                                b9eVar4.l(i24);
                                i25 += 255;
                                str10 = str4;
                                i24 = 1;
                            }
                            int B5 = i25 + b9eVar4.B();
                            int i26 = 0;
                            while (b9eVar4.q() > 0 && b9eVar4.u() == i12) {
                                b9eVar4.l(1);
                                i26 += i12;
                            }
                            int B6 = i26 + b9eVar4.B();
                            byte[] bArr7 = new byte[B5];
                            int s2 = b9eVar4.s();
                            System.arraycopy(bArr, s2, bArr7, 0, B5);
                            int i27 = s2 + B5 + B6;
                            int length = bArr.length - i27;
                            byte[] bArr8 = new byte[length];
                            System.arraycopy(bArr, i27, bArr8, 0, length);
                            list = zzgaa.v(bArr7, bArr8);
                        } else {
                            str4 = str10;
                            if ("audio/mp4a-latm".equals(str6)) {
                                wt9 a2 = xt9.a(bArr);
                                C = a2.a;
                                i7 = a2.b;
                                str7 = a2.c;
                            } else {
                                str7 = str11;
                                C = i9;
                            }
                            list = zzgaa.u(bArr);
                            str2 = str6;
                            str5 = str7;
                        }
                        str2 = str6;
                        C = i9;
                        str5 = str11;
                    }
                    str4 = str10;
                    str5 = str11;
                    C = i9;
                }
                s += v2;
                b9eVar2 = b9eVar;
                i14 = i3;
                str10 = str4;
                str11 = str5;
                str9 = str3;
                i13 = i2;
            }
            C = i19;
            str4 = str10;
            s += v2;
            b9eVar2 = b9eVar;
            i14 = i3;
            str10 = str4;
            str11 = str5;
            str9 = str3;
            i13 = i2;
        }
        int i28 = C;
        if (g2aVar.b != null || str2 == null) {
            return;
        }
        x3a x3aVar3 = new x3a();
        x3aVar3.j(i4);
        x3aVar3.w(str2);
        x3aVar3.l0(str11);
        x3aVar3.k0(i7);
        x3aVar3.x(i28);
        x3aVar3.q(i18);
        x3aVar3.l(list);
        x3aVar3.e(zzaeVar2);
        x3aVar3.n(str);
        if (e2aVar != null) {
            j = e2aVar.c;
            x3aVar3.j0(oje.c(j));
            j2 = e2aVar.d;
            x3aVar3.r(oje.c(j2));
        }
        g2aVar.b = x3aVar3.D();
    }
}
