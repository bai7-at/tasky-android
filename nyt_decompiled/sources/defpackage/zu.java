package defpackage;

import android.util.Pair;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.container.CreationTime;
import com.google.android.exoplayer2.container.Mp4LocationData;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry;
import com.google.android.exoplayer2.t0;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import defpackage.yu;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
abstract class zu {
    private static final byte[] a = z19.o0("OpusHead");

    private static final class a {
        public final int a;
        public int b;
        public int c;
        public long d;
        private final boolean e;
        private final yo5 f;
        private final yo5 g;
        private int h;
        private int i;

        public a(yo5 yo5Var, yo5 yo5Var2, boolean z) {
            this.g = yo5Var;
            this.f = yo5Var2;
            this.e = z;
            yo5Var2.U(12);
            this.a = yo5Var2.L();
            yo5Var.U(12);
            this.i = yo5Var.L();
            b82.a(yo5Var.q() == 1, "first_chunk must be 1");
            this.b = -1;
        }

        public boolean a() {
            int i = this.b + 1;
            this.b = i;
            if (i == this.a) {
                return false;
            }
            this.d = this.e ? this.f.M() : this.f.J();
            if (this.b == this.h) {
                this.c = this.g.L();
                this.g.V(4);
                int i2 = this.i - 1;
                this.i = i2;
                this.h = i2 > 0 ? this.g.L() - 1 : -1;
            }
            return true;
        }
    }

    private static final class b {
        private final String a;
        private final byte[] b;
        private final long c;
        private final long d;

        public b(String str, byte[] bArr, long j, long j2) {
            this.a = str;
            this.b = bArr;
            this.c = j;
            this.d = j2;
        }
    }

    public static final class c {
        public final Metadata a;
        public final long b;

        public c(Metadata metadata, long j) {
            this.a = metadata;
            this.b = j;
        }
    }

    private interface d {
        int a();

        int b();

        int c();
    }

    private static final class e {
        public final rp8[] a;
        public t0 b;
        public int c;
        public int d = 0;

        public e(int i) {
            this.a = new rp8[i];
        }
    }

    static final class f implements d {
        private final int a;
        private final int b;
        private final yo5 c;

        public f(yu.b bVar, t0 t0Var) {
            yo5 yo5Var = bVar.b;
            this.c = yo5Var;
            yo5Var.U(12);
            int L = yo5Var.L();
            if ("audio/raw".equals(t0Var.l)) {
                int g0 = z19.g0(t0Var.Q, t0Var.M);
                if (L == 0 || L % g0 != 0) {
                    a84.j("AtomParsers", "Audio sample size mismatch. stsd sample size: " + g0 + ", stsz sample size: " + L);
                    L = g0;
                }
            }
            this.a = L == 0 ? -1 : L;
            this.b = yo5Var.L();
        }

        @Override // zu.d
        public int a() {
            int i = this.a;
            return i == -1 ? this.c.L() : i;
        }

        @Override // zu.d
        public int b() {
            return this.a;
        }

        @Override // zu.d
        public int c() {
            return this.b;
        }
    }

    static final class g implements d {
        private final yo5 a;
        private final int b;
        private final int c;
        private int d;
        private int e;

        public g(yu.b bVar) {
            yo5 yo5Var = bVar.b;
            this.a = yo5Var;
            yo5Var.U(12);
            this.c = yo5Var.L() & 255;
            this.b = yo5Var.L();
        }

        @Override // zu.d
        public int a() {
            int i = this.c;
            if (i == 8) {
                return this.a.H();
            }
            if (i == 16) {
                return this.a.N();
            }
            int i2 = this.d;
            this.d = i2 + 1;
            if (i2 % 2 != 0) {
                return this.e & 15;
            }
            int H = this.a.H();
            this.e = H;
            return (H & 240) >> 4;
        }

        @Override // zu.d
        public int b() {
            return -1;
        }

        @Override // zu.d
        public int c() {
            return this.b;
        }
    }

    private static final class h {
        private final int a;
        private final long b;
        private final int c;

        public h(int i, long j, int i2) {
            this.a = i;
            this.b = j;
            this.c = i2;
        }
    }

    public static final class i {
        public final Metadata a;
        public final Metadata b;
        public final Metadata c;

        public i(Metadata metadata, Metadata metadata2, Metadata metadata3) {
            this.a = metadata;
            this.b = metadata2;
            this.c = metadata3;
        }
    }

    private static qp8 A(yu.a aVar, yu.b bVar, long j, DrmInitData drmInitData, boolean z, boolean z2) {
        yu.b bVar2;
        long j2;
        long[] jArr;
        long[] jArr2;
        yu.a f2;
        Pair i2;
        yu.a aVar2 = (yu.a) ur.e(aVar.f(1835297121));
        int e2 = e(l(((yu.b) ur.e(aVar2.g(1751411826))).b));
        if (e2 == -1) {
            return null;
        }
        h z3 = z(((yu.b) ur.e(aVar.g(1953196132))).b);
        if (j == -9223372036854775807L) {
            bVar2 = bVar;
            j2 = z3.b;
        } else {
            bVar2 = bVar;
            j2 = j;
        }
        long j3 = q(bVar2.b).b;
        long Q0 = j2 != -9223372036854775807L ? z19.Q0(j2, 1000000L, j3) : -9223372036854775807L;
        yu.a aVar3 = (yu.a) ur.e(((yu.a) ur.e(aVar2.f(1835626086))).f(1937007212));
        Pair n = n(((yu.b) ur.e(aVar2.g(1835296868))).b);
        yu.b g2 = aVar3.g(1937011556);
        if (g2 == null) {
            throw ParserException.a("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        e x = x(g2.b, z3.a, z3.c, (String) n.second, drmInitData, z2);
        if (z || (f2 = aVar.f(1701082227)) == null || (i2 = i(f2)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) i2.first;
            jArr2 = (long[]) i2.second;
            jArr = jArr3;
        }
        if (x.b == null) {
            return null;
        }
        return new qp8(z3.a, e2, ((Long) n.first).longValue(), j3, Q0, x.b, x.d, x.a, x.c, jArr, jArr2);
    }

    public static List B(yu.a aVar, bw2 bw2Var, long j, DrmInitData drmInitData, boolean z, boolean z2, ht2 ht2Var) {
        qp8 qp8Var;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < aVar.d.size(); i2++) {
            yu.a aVar2 = (yu.a) aVar.d.get(i2);
            if (aVar2.a == 1953653099 && (qp8Var = (qp8) ht2Var.apply(A(aVar2, (yu.b) ur.e(aVar.g(1836476516)), j, drmInitData, z, z2))) != null) {
                arrayList.add(w(qp8Var, (yu.a) ur.e(((yu.a) ur.e(((yu.a) ur.e(aVar2.f(1835297121))).f(1835626086))).f(1937007212)), bw2Var));
            }
        }
        return arrayList;
    }

    public static i C(yu.b bVar) {
        yo5 yo5Var = bVar.b;
        yo5Var.U(8);
        Metadata metadata = null;
        Metadata metadata2 = null;
        Metadata metadata3 = null;
        while (yo5Var.a() >= 8) {
            int f2 = yo5Var.f();
            int q = yo5Var.q();
            int q2 = yo5Var.q();
            if (q2 == 1835365473) {
                yo5Var.U(f2);
                metadata = D(yo5Var, f2 + q);
            } else if (q2 == 1936553057) {
                yo5Var.U(f2);
                metadata2 = v(yo5Var, f2 + q);
            } else if (q2 == -1451722374) {
                metadata3 = F(yo5Var);
            }
            yo5Var.U(f2 + q);
        }
        return new i(metadata, metadata2, metadata3);
    }

    private static Metadata D(yo5 yo5Var, int i2) {
        yo5Var.V(8);
        f(yo5Var);
        while (yo5Var.f() < i2) {
            int f2 = yo5Var.f();
            int q = yo5Var.q();
            if (yo5Var.q() == 1768715124) {
                yo5Var.U(f2);
                return m(yo5Var, f2 + q);
            }
            yo5Var.U(f2 + q);
        }
        return null;
    }

    private static void E(yo5 yo5Var, int i2, int i3, int i4, int i5, int i6, DrmInitData drmInitData, e eVar, int i7) {
        String str;
        DrmInitData drmInitData2;
        int i8;
        int i9;
        float f2;
        List list;
        int i10;
        int i11;
        String str2;
        int i12;
        int i13;
        int i14;
        String str3;
        int i15 = i3;
        int i16 = i4;
        DrmInitData drmInitData3 = drmInitData;
        e eVar2 = eVar;
        yo5Var.U(i15 + 16);
        yo5Var.V(16);
        int N = yo5Var.N();
        int N2 = yo5Var.N();
        yo5Var.V(50);
        int f3 = yo5Var.f();
        int i17 = i2;
        if (i17 == 1701733238) {
            Pair t = t(yo5Var, i15, i16);
            if (t != null) {
                i17 = ((Integer) t.first).intValue();
                drmInitData3 = drmInitData3 == null ? null : drmInitData3.c(((rp8) t.second).b);
                eVar2.a[i7] = (rp8) t.second;
            }
            yo5Var.U(f3);
        }
        String str4 = "video/3gpp";
        String str5 = i17 == 1831958048 ? "video/mpeg" : i17 == 1211250227 ? "video/3gpp" : null;
        float f4 = 1.0f;
        String str6 = null;
        List list2 = null;
        byte[] bArr = null;
        int i18 = -1;
        int i19 = -1;
        int i20 = -1;
        int i21 = -1;
        ByteBuffer byteBuffer = null;
        b bVar = null;
        boolean z = false;
        while (f3 - i15 < i16) {
            yo5Var.U(f3);
            int f5 = yo5Var.f();
            int q = yo5Var.q();
            if (q == 0) {
                str = str4;
                if (yo5Var.f() - i15 == i16) {
                    break;
                }
            } else {
                str = str4;
            }
            b82.a(q > 0, "childAtomSize must be positive");
            int q2 = yo5Var.q();
            if (q2 == 1635148611) {
                b82.a(str5 == null, null);
                yo5Var.U(f5 + 8);
                v20 b2 = v20.b(yo5Var);
                list2 = b2.a;
                eVar2.c = b2.b;
                if (!z) {
                    f4 = b2.h;
                }
                str6 = b2.i;
                i12 = b2.e;
                i13 = b2.f;
                i14 = b2.g;
                str3 = "video/avc";
            } else if (q2 == 1752589123) {
                b82.a(str5 == null, null);
                yo5Var.U(f5 + 8);
                z73 a2 = z73.a(yo5Var);
                list2 = a2.a;
                eVar2.c = a2.b;
                if (!z) {
                    f4 = a2.h;
                }
                str6 = a2.i;
                i12 = a2.e;
                i13 = a2.f;
                i14 = a2.g;
                str3 = "video/hevc";
            } else {
                if (q2 == 1685480259 || q2 == 1685485123) {
                    drmInitData2 = drmInitData3;
                    i8 = N2;
                    i9 = i17;
                    f2 = f4;
                    list = list2;
                    i10 = i19;
                    i11 = i21;
                    it1 a3 = it1.a(yo5Var);
                    if (a3 != null) {
                        str6 = a3.c;
                        str5 = "video/dolby-vision";
                    }
                } else {
                    if (q2 == 1987076931) {
                        b82.a(str5 == null, null);
                        str2 = i17 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                        yo5Var.U(f5 + 12);
                        yo5Var.V(2);
                        boolean z2 = (yo5Var.H() & 1) != 0;
                        int H = yo5Var.H();
                        int H2 = yo5Var.H();
                        i19 = sn0.i(H);
                        i20 = z2 ? 1 : 2;
                        i21 = sn0.j(H2);
                    } else if (q2 == 1635135811) {
                        b82.a(str5 == null, null);
                        str2 = "video/av01";
                    } else if (q2 == 1668050025) {
                        if (byteBuffer == null) {
                            byteBuffer = a();
                        }
                        ByteBuffer byteBuffer2 = byteBuffer;
                        byteBuffer2.position(21);
                        byteBuffer2.putShort(yo5Var.D());
                        byteBuffer2.putShort(yo5Var.D());
                        byteBuffer = byteBuffer2;
                        drmInitData2 = drmInitData3;
                        i8 = N2;
                        i9 = i17;
                        f3 += q;
                        i15 = i3;
                        i16 = i4;
                        eVar2 = eVar;
                        str4 = str;
                        i17 = i9;
                        drmInitData3 = drmInitData2;
                        N2 = i8;
                    } else if (q2 == 1835295606) {
                        if (byteBuffer == null) {
                            byteBuffer = a();
                        }
                        ByteBuffer byteBuffer3 = byteBuffer;
                        short D = yo5Var.D();
                        short D2 = yo5Var.D();
                        short D3 = yo5Var.D();
                        i9 = i17;
                        short D4 = yo5Var.D();
                        short D5 = yo5Var.D();
                        drmInitData2 = drmInitData3;
                        short D6 = yo5Var.D();
                        List list3 = list2;
                        short D7 = yo5Var.D();
                        float f6 = f4;
                        short D8 = yo5Var.D();
                        long J = yo5Var.J();
                        long J2 = yo5Var.J();
                        i8 = N2;
                        byteBuffer3.position(1);
                        byteBuffer3.putShort(D5);
                        byteBuffer3.putShort(D6);
                        byteBuffer3.putShort(D);
                        byteBuffer3.putShort(D2);
                        byteBuffer3.putShort(D3);
                        byteBuffer3.putShort(D4);
                        byteBuffer3.putShort(D7);
                        byteBuffer3.putShort(D8);
                        byteBuffer3.putShort((short) (J / 10000));
                        byteBuffer3.putShort((short) (J2 / 10000));
                        byteBuffer = byteBuffer3;
                        list2 = list3;
                        f4 = f6;
                        f3 += q;
                        i15 = i3;
                        i16 = i4;
                        eVar2 = eVar;
                        str4 = str;
                        i17 = i9;
                        drmInitData3 = drmInitData2;
                        N2 = i8;
                    } else {
                        drmInitData2 = drmInitData3;
                        i8 = N2;
                        i9 = i17;
                        f2 = f4;
                        list = list2;
                        if (q2 == 1681012275) {
                            b82.a(str5 == null, null);
                            str5 = str;
                        } else if (q2 == 1702061171) {
                            b82.a(str5 == null, null);
                            bVar = j(yo5Var, f5);
                            String str7 = bVar.a;
                            byte[] bArr2 = bVar.b;
                            list2 = bArr2 != null ? ImmutableList.y(bArr2) : list;
                            str5 = str7;
                            f4 = f2;
                            f3 += q;
                            i15 = i3;
                            i16 = i4;
                            eVar2 = eVar;
                            str4 = str;
                            i17 = i9;
                            drmInitData3 = drmInitData2;
                            N2 = i8;
                        } else if (q2 == 1885434736) {
                            f4 = r(yo5Var, f5);
                            list2 = list;
                            z = true;
                            f3 += q;
                            i15 = i3;
                            i16 = i4;
                            eVar2 = eVar;
                            str4 = str;
                            i17 = i9;
                            drmInitData3 = drmInitData2;
                            N2 = i8;
                        } else if (q2 == 1937126244) {
                            bArr = s(yo5Var, f5, q);
                        } else if (q2 == 1936995172) {
                            int H3 = yo5Var.H();
                            yo5Var.V(3);
                            if (H3 == 0) {
                                int H4 = yo5Var.H();
                                if (H4 == 0) {
                                    i18 = 0;
                                } else if (H4 == 1) {
                                    i18 = 1;
                                } else if (H4 == 2) {
                                    i18 = 2;
                                } else if (H4 == 3) {
                                    i18 = 3;
                                }
                            }
                        } else {
                            i10 = i19;
                            if (q2 == 1668246642) {
                                i11 = i21;
                                if (i10 == -1 && i11 == -1) {
                                    int q3 = yo5Var.q();
                                    if (q3 == 1852009592 || q3 == 1852009571) {
                                        int N3 = yo5Var.N();
                                        int N4 = yo5Var.N();
                                        yo5Var.V(2);
                                        boolean z3 = q == 19 && (yo5Var.H() & 128) != 0;
                                        i19 = sn0.i(N3);
                                        i20 = z3 ? 1 : 2;
                                        i21 = sn0.j(N4);
                                    } else {
                                        a84.j("AtomParsers", "Unsupported color type: " + yu.a(q3));
                                    }
                                }
                            } else {
                                i11 = i21;
                            }
                        }
                        list2 = list;
                        f4 = f2;
                        f3 += q;
                        i15 = i3;
                        i16 = i4;
                        eVar2 = eVar;
                        str4 = str;
                        i17 = i9;
                        drmInitData3 = drmInitData2;
                        N2 = i8;
                    }
                    str5 = str2;
                    drmInitData2 = drmInitData3;
                    i8 = N2;
                    i9 = i17;
                    f3 += q;
                    i15 = i3;
                    i16 = i4;
                    eVar2 = eVar;
                    str4 = str;
                    i17 = i9;
                    drmInitData3 = drmInitData2;
                    N2 = i8;
                }
                i21 = i11;
                i19 = i10;
                list2 = list;
                f4 = f2;
                f3 += q;
                i15 = i3;
                i16 = i4;
                eVar2 = eVar;
                str4 = str;
                i17 = i9;
                drmInitData3 = drmInitData2;
                N2 = i8;
            }
            i21 = i14;
            drmInitData2 = drmInitData3;
            i8 = N2;
            i19 = i12;
            i9 = i17;
            i20 = i13;
            str5 = str3;
            f3 += q;
            i15 = i3;
            i16 = i4;
            eVar2 = eVar;
            str4 = str;
            i17 = i9;
            drmInitData3 = drmInitData2;
            N2 = i8;
        }
        DrmInitData drmInitData4 = drmInitData3;
        int i22 = N2;
        float f7 = f4;
        List list4 = list2;
        int i23 = i19;
        int i24 = i21;
        if (str5 == null) {
            return;
        }
        t0.b O = new t0.b().T(i5).g0(str5).K(str6).n0(N).S(i22).c0(f7).f0(i6).d0(bArr).j0(i18).V(list4).O(drmInitData4);
        int i25 = i20;
        if (i23 != -1 || i25 != -1 || i24 != -1 || byteBuffer != null) {
            O.L(new sn0(i23, i25, i24, byteBuffer != null ? byteBuffer.array() : null));
        }
        if (bVar != null) {
            O.I(Ints.k(bVar.c)).b0(Ints.k(bVar.d));
        }
        eVar.b = O.G();
    }

    private static Metadata F(yo5 yo5Var) {
        short D = yo5Var.D();
        yo5Var.V(2);
        String E = yo5Var.E(D);
        int max = Math.max(E.lastIndexOf(43), E.lastIndexOf(45));
        try {
            return new Metadata(new Mp4LocationData(Float.parseFloat(E.substring(0, max)), Float.parseFloat(E.substring(max, E.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static ByteBuffer a() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static boolean b(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        return jArr[0] <= j2 && j2 < jArr[z19.q(4, 0, length)] && jArr[z19.q(jArr.length - 4, 0, length)] < j3 && j3 <= j;
    }

    private static boolean c(int i2) {
        return i2 != 1;
    }

    private static int d(yo5 yo5Var, int i2, int i3, int i4) {
        int f2 = yo5Var.f();
        b82.a(f2 >= i3, null);
        while (f2 - i3 < i4) {
            yo5Var.U(f2);
            int q = yo5Var.q();
            b82.a(q > 0, "childAtomSize must be positive");
            if (yo5Var.q() == i2) {
                return f2;
            }
            f2 += q;
        }
        return -1;
    }

    private static int e(int i2) {
        if (i2 == 1936684398) {
            return 1;
        }
        if (i2 == 1986618469) {
            return 2;
        }
        if (i2 == 1952807028 || i2 == 1935832172 || i2 == 1937072756 || i2 == 1668047728) {
            return 3;
        }
        return i2 == 1835365473 ? 5 : -1;
    }

    public static void f(yo5 yo5Var) {
        int f2 = yo5Var.f();
        yo5Var.V(4);
        if (yo5Var.q() != 1751411826) {
            f2 += 4;
        }
        yo5Var.U(f2);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void g(defpackage.yo5 r22, int r23, int r24, int r25, int r26, java.lang.String r27, boolean r28, com.google.android.exoplayer2.drm.DrmInitData r29, zu.e r30, int r31) {
        /*
            Method dump skipped, instructions count: 876
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu.g(yo5, int, int, int, int, java.lang.String, boolean, com.google.android.exoplayer2.drm.DrmInitData, zu$e, int):void");
    }

    static Pair h(yo5 yo5Var, int i2, int i3) {
        int i4 = i2 + 8;
        int i5 = -1;
        int i6 = 0;
        String str = null;
        Integer num = null;
        while (i4 - i2 < i3) {
            yo5Var.U(i4);
            int q = yo5Var.q();
            int q2 = yo5Var.q();
            if (q2 == 1718775137) {
                num = Integer.valueOf(yo5Var.q());
            } else if (q2 == 1935894637) {
                yo5Var.V(4);
                str = yo5Var.E(4);
            } else if (q2 == 1935894633) {
                i5 = i4;
                i6 = q;
            }
            i4 += q;
        }
        if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
            return null;
        }
        b82.a(num != null, "frma atom is mandatory");
        b82.a(i5 != -1, "schi atom is mandatory");
        rp8 u = u(yo5Var, i5, i6, str);
        b82.a(u != null, "tenc atom is mandatory");
        return Pair.create(num, (rp8) z19.j(u));
    }

    private static Pair i(yu.a aVar) {
        yu.b g2 = aVar.g(1701606260);
        if (g2 == null) {
            return null;
        }
        yo5 yo5Var = g2.b;
        yo5Var.U(8);
        int c2 = yu.c(yo5Var.q());
        int L = yo5Var.L();
        long[] jArr = new long[L];
        long[] jArr2 = new long[L];
        for (int i2 = 0; i2 < L; i2++) {
            jArr[i2] = c2 == 1 ? yo5Var.M() : yo5Var.J();
            jArr2[i2] = c2 == 1 ? yo5Var.A() : yo5Var.q();
            if (yo5Var.D() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            yo5Var.V(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static b j(yo5 yo5Var, int i2) {
        yo5Var.U(i2 + 12);
        yo5Var.V(1);
        k(yo5Var);
        yo5Var.V(2);
        int H = yo5Var.H();
        if ((H & 128) != 0) {
            yo5Var.V(2);
        }
        if ((H & 64) != 0) {
            yo5Var.V(yo5Var.H());
        }
        if ((H & 32) != 0) {
            yo5Var.V(2);
        }
        yo5Var.V(1);
        k(yo5Var);
        String h2 = ku4.h(yo5Var.H());
        if ("audio/mpeg".equals(h2) || "audio/vnd.dts".equals(h2) || "audio/vnd.dts.hd".equals(h2)) {
            return new b(h2, null, -1L, -1L);
        }
        yo5Var.V(4);
        long J = yo5Var.J();
        long J2 = yo5Var.J();
        yo5Var.V(1);
        int k = k(yo5Var);
        byte[] bArr = new byte[k];
        yo5Var.l(bArr, 0, k);
        return new b(h2, bArr, J2 > 0 ? J2 : -1L, J > 0 ? J : -1L);
    }

    private static int k(yo5 yo5Var) {
        int H = yo5Var.H();
        int i2 = H & 127;
        while ((H & 128) == 128) {
            H = yo5Var.H();
            i2 = (i2 << 7) | (H & 127);
        }
        return i2;
    }

    private static int l(yo5 yo5Var) {
        yo5Var.U(16);
        return yo5Var.q();
    }

    private static Metadata m(yo5 yo5Var, int i2) {
        yo5Var.V(8);
        ArrayList arrayList = new ArrayList();
        while (yo5Var.f() < i2) {
            Metadata.Entry c2 = zs4.c(yo5Var);
            if (c2 != null) {
                arrayList.add(c2);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static Pair n(yo5 yo5Var) {
        yo5Var.U(8);
        int c2 = yu.c(yo5Var.q());
        yo5Var.V(c2 == 0 ? 8 : 16);
        long J = yo5Var.J();
        yo5Var.V(c2 == 0 ? 4 : 8);
        int N = yo5Var.N();
        return Pair.create(Long.valueOf(J), "" + ((char) (((N >> 10) & 31) + 96)) + ((char) (((N >> 5) & 31) + 96)) + ((char) ((N & 31) + 96)));
    }

    public static Metadata o(yu.a aVar) {
        yu.b g2 = aVar.g(1751411826);
        yu.b g3 = aVar.g(1801812339);
        yu.b g4 = aVar.g(1768715124);
        if (g2 == null || g3 == null || g4 == null || l(g2.b) != 1835299937) {
            return null;
        }
        yo5 yo5Var = g3.b;
        yo5Var.U(12);
        int q = yo5Var.q();
        String[] strArr = new String[q];
        for (int i2 = 0; i2 < q; i2++) {
            int q2 = yo5Var.q();
            yo5Var.V(4);
            strArr[i2] = yo5Var.E(q2 - 8);
        }
        yo5 yo5Var2 = g4.b;
        yo5Var2.U(8);
        ArrayList arrayList = new ArrayList();
        while (yo5Var2.a() > 8) {
            int f2 = yo5Var2.f();
            int q3 = yo5Var2.q();
            int q4 = yo5Var2.q() - 1;
            if (q4 < 0 || q4 >= q) {
                a84.j("AtomParsers", "Skipped metadata with unknown key index: " + q4);
            } else {
                MdtaMetadataEntry f3 = zs4.f(yo5Var2, f2 + q3, strArr[q4]);
                if (f3 != null) {
                    arrayList.add(f3);
                }
            }
            yo5Var2.U(f2 + q3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static void p(yo5 yo5Var, int i2, int i3, int i4, e eVar) {
        yo5Var.U(i3 + 16);
        if (i2 == 1835365492) {
            yo5Var.B();
            String B = yo5Var.B();
            if (B != null) {
                eVar.b = new t0.b().T(i4).g0(B).G();
            }
        }
    }

    public static c q(yo5 yo5Var) {
        long j;
        yo5Var.U(8);
        if (yu.c(yo5Var.q()) == 0) {
            j = yo5Var.J();
            yo5Var.V(4);
        } else {
            long A = yo5Var.A();
            yo5Var.V(8);
            j = A;
        }
        return new c(new Metadata(new CreationTime((j - 2082844800) * 1000)), yo5Var.J());
    }

    private static float r(yo5 yo5Var, int i2) {
        yo5Var.U(i2 + 8);
        return yo5Var.L() / yo5Var.L();
    }

    private static byte[] s(yo5 yo5Var, int i2, int i3) {
        int i4 = i2 + 8;
        while (i4 - i2 < i3) {
            yo5Var.U(i4);
            int q = yo5Var.q();
            if (yo5Var.q() == 1886547818) {
                return Arrays.copyOfRange(yo5Var.e(), i4, q + i4);
            }
            i4 += q;
        }
        return null;
    }

    private static Pair t(yo5 yo5Var, int i2, int i3) {
        Pair h2;
        int f2 = yo5Var.f();
        while (f2 - i2 < i3) {
            yo5Var.U(f2);
            int q = yo5Var.q();
            b82.a(q > 0, "childAtomSize must be positive");
            if (yo5Var.q() == 1936289382 && (h2 = h(yo5Var, f2, q)) != null) {
                return h2;
            }
            f2 += q;
        }
        return null;
    }

    private static rp8 u(yo5 yo5Var, int i2, int i3, String str) {
        int i4;
        int i5;
        int i6 = i2 + 8;
        while (true) {
            byte[] bArr = null;
            if (i6 - i2 >= i3) {
                return null;
            }
            yo5Var.U(i6);
            int q = yo5Var.q();
            if (yo5Var.q() == 1952804451) {
                int c2 = yu.c(yo5Var.q());
                yo5Var.V(1);
                if (c2 == 0) {
                    yo5Var.V(1);
                    i5 = 0;
                    i4 = 0;
                } else {
                    int H = yo5Var.H();
                    i4 = H & 15;
                    i5 = (H & 240) >> 4;
                }
                boolean z = yo5Var.H() == 1;
                int H2 = yo5Var.H();
                byte[] bArr2 = new byte[16];
                yo5Var.l(bArr2, 0, 16);
                if (z && H2 == 0) {
                    int H3 = yo5Var.H();
                    bArr = new byte[H3];
                    yo5Var.l(bArr, 0, H3);
                }
                return new rp8(z, str, H2, bArr2, i5, i4, bArr);
            }
            i6 += q;
        }
    }

    private static Metadata v(yo5 yo5Var, int i2) {
        yo5Var.V(12);
        while (yo5Var.f() < i2) {
            int f2 = yo5Var.f();
            int q = yo5Var.q();
            if (yo5Var.q() == 1935766900) {
                if (q < 14) {
                    return null;
                }
                yo5Var.V(5);
                int H = yo5Var.H();
                if (H != 12 && H != 13) {
                    return null;
                }
                float f3 = H == 12 ? 240.0f : 120.0f;
                yo5Var.V(1);
                return new Metadata(new SmtaMetadataEntry(f3, yo5Var.H()));
            }
            yo5Var.U(f2 + q);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0429 A[EDGE_INSN: B:97:0x0429->B:98:0x0429 BREAK  A[LOOP:2: B:76:0x03c8->B:92:0x0422], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static defpackage.zp8 w(defpackage.qp8 r37, yu.a r38, defpackage.bw2 r39) {
        /*
            Method dump skipped, instructions count: 1326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zu.w(qp8, yu$a, bw2):zp8");
    }

    private static e x(yo5 yo5Var, int i2, int i3, String str, DrmInitData drmInitData, boolean z) {
        int i4;
        yo5Var.U(12);
        int q = yo5Var.q();
        e eVar = new e(q);
        for (int i5 = 0; i5 < q; i5++) {
            int f2 = yo5Var.f();
            int q2 = yo5Var.q();
            b82.a(q2 > 0, "childAtomSize must be positive");
            int q3 = yo5Var.q();
            if (q3 == 1635148593 || q3 == 1635148595 || q3 == 1701733238 || q3 == 1831958048 || q3 == 1836070006 || q3 == 1752589105 || q3 == 1751479857 || q3 == 1932670515 || q3 == 1211250227 || q3 == 1987063864 || q3 == 1987063865 || q3 == 1635135537 || q3 == 1685479798 || q3 == 1685479729 || q3 == 1685481573 || q3 == 1685481521) {
                i4 = f2;
                E(yo5Var, q3, i4, q2, i2, i3, drmInitData, eVar, i5);
            } else if (q3 == 1836069985 || q3 == 1701733217 || q3 == 1633889587 || q3 == 1700998451 || q3 == 1633889588 || q3 == 1835823201 || q3 == 1685353315 || q3 == 1685353317 || q3 == 1685353320 || q3 == 1685353324 || q3 == 1685353336 || q3 == 1935764850 || q3 == 1935767394 || q3 == 1819304813 || q3 == 1936684916 || q3 == 1953984371 || q3 == 778924082 || q3 == 778924083 || q3 == 1835557169 || q3 == 1835560241 || q3 == 1634492771 || q3 == 1634492791 || q3 == 1970037111 || q3 == 1332770163 || q3 == 1716281667) {
                i4 = f2;
                g(yo5Var, q3, f2, q2, i2, str, z, drmInitData, eVar, i5);
            } else {
                if (q3 == 1414810956 || q3 == 1954034535 || q3 == 2004251764 || q3 == 1937010800 || q3 == 1664495672) {
                    y(yo5Var, q3, f2, q2, i2, str, eVar);
                } else if (q3 == 1835365492) {
                    p(yo5Var, q3, f2, i2, eVar);
                } else if (q3 == 1667329389) {
                    eVar.b = new t0.b().T(i2).g0("application/x-camera-motion").G();
                }
                i4 = f2;
            }
            yo5Var.U(i4 + q2);
        }
        return eVar;
    }

    private static void y(yo5 yo5Var, int i2, int i3, int i4, int i5, String str, e eVar) {
        yo5Var.U(i3 + 16);
        String str2 = "application/ttml+xml";
        ImmutableList immutableList = null;
        long j = Long.MAX_VALUE;
        if (i2 != 1414810956) {
            if (i2 == 1954034535) {
                int i6 = i4 - 16;
                byte[] bArr = new byte[i6];
                yo5Var.l(bArr, 0, i6);
                immutableList = ImmutableList.y(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i2 == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i2 == 1937010800) {
                j = 0;
            } else {
                if (i2 != 1664495672) {
                    throw new IllegalStateException();
                }
                eVar.d = 1;
                str2 = "application/x-mp4-cea-608";
            }
        }
        eVar.b = new t0.b().T(i5).g0(str2).X(str).k0(j).V(immutableList).G();
    }

    private static h z(yo5 yo5Var) {
        long j;
        yo5Var.U(8);
        int c2 = yu.c(yo5Var.q());
        yo5Var.V(c2 == 0 ? 8 : 16);
        int q = yo5Var.q();
        yo5Var.V(4);
        int f2 = yo5Var.f();
        int i2 = c2 == 0 ? 4 : 8;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            j = -9223372036854775807L;
            if (i4 >= i2) {
                yo5Var.V(i2);
                break;
            }
            if (yo5Var.e()[f2 + i4] != -1) {
                long J = c2 == 0 ? yo5Var.J() : yo5Var.M();
                if (J != 0) {
                    j = J;
                }
            } else {
                i4++;
            }
        }
        yo5Var.V(16);
        int q2 = yo5Var.q();
        int q3 = yo5Var.q();
        yo5Var.V(4);
        int q4 = yo5Var.q();
        int q5 = yo5Var.q();
        if (q2 == 0 && q3 == 65536 && q4 == -65536 && q5 == 0) {
            i3 = 90;
        } else if (q2 == 0 && q3 == -65536 && q4 == 65536 && q5 == 0) {
            i3 = 270;
        } else if (q2 == -65536 && q3 == 0 && q4 == 0 && q5 == -65536) {
            i3 = 180;
        }
        return new h(q, j, i3);
    }
}
