package defpackage;

import android.net.Uri;
import android.util.SparseArray;
import com.comscore.streaming.AdvertisementType;
import com.google.android.gms.internal.ads.zzcc;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class f1a implements nv9 {
    public static final fw9 c0 = new fw9() { // from class: b1a
        @Override // defpackage.fw9
        public final /* synthetic */ nv9[] a(Uri uri, Map map) {
            int i = dw9.a;
            return new nv9[]{new f1a(0)};
        }
    };
    private static final byte[] d0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] e0;
    private static final byte[] f0;
    private static final byte[] g0;
    private static final UUID h0;
    private static final Map i0;
    private long A;
    private long B;
    private f0e C;
    private f0e D;
    private boolean E;
    private boolean F;
    private int G;
    private long H;
    private long I;
    private int J;
    private int K;
    private int[] L;
    private int M;
    private int N;
    private int O;
    private int P;
    private boolean Q;
    private long R;
    private int S;
    private int T;
    private int U;
    private boolean V;
    private boolean W;
    private boolean X;
    private int Y;
    private byte Z;
    private final a1a a;
    private boolean a0;
    private final p1a b;
    private sv9 b0;
    private final SparseArray c;
    private final boolean d;
    private final b9e e;
    private final b9e f;
    private final b9e g;
    private final b9e h;
    private final b9e i;
    private final b9e j;
    private final b9e k;
    private final b9e l;
    private final b9e m;
    private final b9e n;
    private ByteBuffer o;
    private long p;
    private long q;
    private long r;
    private long s;
    private long t;
    private e1a u;
    private boolean v;
    private int w;
    private long x;
    private boolean y;
    private long z;

    static {
        int i = khe.a;
        e0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(ege.c);
        f0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        g0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        h0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        i0 = Collections.unmodifiableMap(hashMap);
    }

    public f1a(int i) {
        y0a y0aVar = new y0a();
        this.q = -1L;
        this.r = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.t = -9223372036854775807L;
        this.z = -1L;
        this.A = -1L;
        this.B = -9223372036854775807L;
        this.a = y0aVar;
        y0aVar.b(new d1a(this, null));
        this.d = true;
        this.b = new p1a();
        this.c = new SparseArray();
        this.g = new b9e(4);
        this.h = new b9e(ByteBuffer.allocate(4).putInt(-1).array());
        this.i = new b9e(4);
        this.e = new b9e(kre.a);
        this.f = new b9e(4);
        this.j = new b9e();
        this.k = new b9e();
        this.l = new b9e(8);
        this.m = new b9e();
        this.n = new b9e();
        this.L = new int[1];
    }

    private final int j(ov9 ov9Var, e1a e1aVar, int i, boolean z) {
        int i2;
        if ("S_TEXT/UTF8".equals(e1aVar.b)) {
            v(ov9Var, d0, i);
            int i3 = this.T;
            u();
            return i3;
        }
        if ("S_TEXT/ASS".equals(e1aVar.b)) {
            v(ov9Var, f0, i);
            int i4 = this.T;
            u();
            return i4;
        }
        if ("S_TEXT/WEBVTT".equals(e1aVar.b)) {
            v(ov9Var, g0, i);
            int i5 = this.T;
            u();
            return i5;
        }
        tx9 tx9Var = e1aVar.Y;
        if (!this.V) {
            if (e1aVar.h) {
                this.O &= -1073741825;
                if (!this.W) {
                    ((bv9) ov9Var).c(this.g.m(), 0, 1, false);
                    this.S++;
                    if ((this.g.m()[0] & 128) == 128) {
                        throw zzcc.a("Extension bit is set in signal byte", null);
                    }
                    this.Z = this.g.m()[0];
                    this.W = true;
                }
                byte b = this.Z;
                if ((b & 1) == 1) {
                    int i6 = b & 2;
                    this.O |= 1073741824;
                    if (!this.a0) {
                        ((bv9) ov9Var).c(this.l.m(), 0, 8, false);
                        this.S += 8;
                        this.a0 = true;
                        this.g.m()[0] = (byte) ((i6 != 2 ? 0 : 128) | 8);
                        this.g.k(0);
                        tx9Var.d(this.g, 1, 1);
                        this.T++;
                        this.l.k(0);
                        tx9Var.d(this.l, 8, 1);
                        this.T += 8;
                    }
                    if (i6 == 2) {
                        if (!this.X) {
                            ((bv9) ov9Var).c(this.g.m(), 0, 1, false);
                            this.S++;
                            this.g.k(0);
                            this.Y = this.g.B();
                            this.X = true;
                        }
                        int i7 = this.Y * 4;
                        this.g.h(i7);
                        ((bv9) ov9Var).c(this.g.m(), 0, i7, false);
                        this.S += i7;
                        int i8 = (this.Y >> 1) + 1;
                        int i9 = (i8 * 6) + 2;
                        ByteBuffer byteBuffer = this.o;
                        if (byteBuffer == null || byteBuffer.capacity() < i9) {
                            this.o = ByteBuffer.allocate(i9);
                        }
                        this.o.position(0);
                        this.o.putShort((short) i8);
                        int i10 = 0;
                        int i11 = 0;
                        while (true) {
                            i2 = this.Y;
                            if (i10 >= i2) {
                                break;
                            }
                            int E = this.g.E();
                            int i12 = E - i11;
                            if (i10 % 2 == 0) {
                                this.o.putShort((short) i12);
                            } else {
                                this.o.putInt(i12);
                            }
                            i10++;
                            i11 = E;
                        }
                        int i13 = (i - this.S) - i11;
                        if ((i2 & 1) == 1) {
                            this.o.putInt(i13);
                        } else {
                            this.o.putShort((short) i13);
                            this.o.putInt(0);
                        }
                        this.m.i(this.o.array(), i9);
                        tx9Var.d(this.m, i9, 1);
                        this.T += i9;
                    }
                }
            } else {
                byte[] bArr = e1aVar.i;
                if (bArr != null) {
                    this.j.i(bArr, bArr.length);
                }
            }
            if (!"A_OPUS".equals(e1aVar.b) ? e1aVar.f > 0 : z) {
                this.O |= 268435456;
                this.n.h(0);
                int t = (this.j.t() + i) - this.S;
                this.g.h(4);
                this.g.m()[0] = (byte) ((t >> 24) & 255);
                this.g.m()[1] = (byte) ((t >> 16) & 255);
                this.g.m()[2] = (byte) ((t >> 8) & 255);
                this.g.m()[3] = (byte) (t & 255);
                tx9Var.d(this.g, 4, 2);
                this.T += 4;
            }
            this.V = true;
        }
        int t2 = i + this.j.t();
        if (!"V_MPEG4/ISO/AVC".equals(e1aVar.b) && !"V_MPEGH/ISO/HEVC".equals(e1aVar.b)) {
            if (e1aVar.U != null) {
                wad.f(this.j.t() == 0);
                e1aVar.U.d(ov9Var);
            }
            while (true) {
                int i14 = this.S;
                if (i14 >= t2) {
                    break;
                }
                int o = o(ov9Var, tx9Var, t2 - i14);
                this.S += o;
                this.T += o;
            }
        } else {
            byte[] m = this.f.m();
            m[0] = 0;
            m[1] = 0;
            m[2] = 0;
            int i15 = e1aVar.Z;
            int i16 = 4 - i15;
            while (this.S < t2) {
                int i17 = this.U;
                if (i17 == 0) {
                    int min = Math.min(i15, this.j.q());
                    ((bv9) ov9Var).c(m, i16 + min, i15 - min, false);
                    if (min > 0) {
                        this.j.g(m, i16, min);
                    }
                    this.S += i15;
                    this.f.k(0);
                    this.U = this.f.E();
                    this.e.k(0);
                    kx9.b(tx9Var, this.e, 4);
                    this.T += 4;
                } else {
                    int o2 = o(ov9Var, tx9Var, i17);
                    this.S += o2;
                    this.T += o2;
                    this.U -= o2;
                }
            }
        }
        if ("A_VORBIS".equals(e1aVar.b)) {
            this.h.k(0);
            kx9.b(tx9Var, this.h, 4);
            this.T += 4;
        }
        int i18 = this.T;
        u();
        return i18;
    }

    private final int o(ov9 ov9Var, tx9 tx9Var, int i) {
        int q = this.j.q();
        if (q <= 0) {
            return kx9.a(tx9Var, ov9Var, i, false);
        }
        int min = Math.min(i, q);
        kx9.b(tx9Var, this.j, min);
        return min;
    }

    private final long p(long j) {
        long j2 = this.r;
        if (j2 != -9223372036854775807L) {
            return khe.H(j, j2, 1000L, RoundingMode.FLOOR);
        }
        throw zzcc.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private final void q(int i) {
        if (this.C == null || this.D == null) {
            throw zzcc.a("Element " + i + " must be in a Cues", null);
        }
    }

    private final void r(int i) {
        if (this.u != null) {
            return;
        }
        throw zzcc.a("Element " + i + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e0 A[EDGE_INSN: B:50:0x00e0->B:49:0x00e0 BREAK  A[LOOP:0: B:42:0x00c5->B:46:0x00dd], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void s(defpackage.e1a r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f1a.s(e1a, long, int, int, int):void");
    }

    private final void t(ov9 ov9Var, int i) {
        if (this.g.t() >= i) {
            return;
        }
        if (this.g.r() < i) {
            b9e b9eVar = this.g;
            int r = b9eVar.r();
            b9eVar.e(Math.max(r + r, i));
        }
        b9e b9eVar2 = this.g;
        ((bv9) ov9Var).c(b9eVar2.m(), b9eVar2.t(), i - b9eVar2.t(), false);
        this.g.j(i);
    }

    private final void u() {
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = 0;
        this.Z = (byte) 0;
        this.a0 = false;
        this.j.h(0);
    }

    private final void v(ov9 ov9Var, byte[] bArr, int i) {
        int length = bArr.length;
        int i2 = length + i;
        if (this.k.r() < i2) {
            b9e b9eVar = this.k;
            byte[] copyOf = Arrays.copyOf(bArr, i2 + i);
            b9eVar.i(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, this.k.m(), 0, length);
        }
        ((bv9) ov9Var).c(this.k.m(), length, i, false);
        this.k.k(0);
        this.k.j(i2);
    }

    private static byte[] w(long j, String str, long j2) {
        wad.d(j != -9223372036854775807L);
        Locale locale = Locale.US;
        int i = (int) (j / 3600000000L);
        Integer valueOf = Integer.valueOf(i);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        Integer valueOf2 = Integer.valueOf(i2);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        String format = String.format(locale, str, valueOf, valueOf2, Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2)));
        int i4 = khe.a;
        return format.getBytes(ege.c);
    }

    private static int[] x(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x0288, code lost:
    
        throw com.google.android.gms.internal.ads.zzcc.a("EBML lacing sample size out of range.", null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void c(int r22, int r23, defpackage.ov9 r24) {
        /*
            Method dump skipped, instructions count: 817
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f1a.c(int, int, ov9):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x025c, code lost:
    
        if (r5.equals("V_AV1") != false) goto L188;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void d(int r22) {
        /*
            Method dump skipped, instructions count: 1146
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f1a.d(int):void");
    }

    protected final void e(int i, double d) {
        if (i == 181) {
            r(i);
            this.u.R = (int) d;
            return;
        }
        if (i == 17545) {
            this.s = (long) d;
            return;
        }
        switch (i) {
            case 21969:
                r(i);
                this.u.E = (float) d;
                break;
            case 21970:
                r(i);
                this.u.F = (float) d;
                break;
            case 21971:
                r(i);
                this.u.G = (float) d;
                break;
            case 21972:
                r(i);
                this.u.H = (float) d;
                break;
            case 21973:
                r(i);
                this.u.I = (float) d;
                break;
            case 21974:
                r(i);
                this.u.J = (float) d;
                break;
            case 21975:
                r(i);
                this.u.K = (float) d;
                break;
            case 21976:
                r(i);
                this.u.L = (float) d;
                break;
            case 21977:
                r(i);
                this.u.M = (float) d;
                break;
            case 21978:
                r(i);
                this.u.N = (float) d;
                break;
            default:
                switch (i) {
                    case 30323:
                        r(i);
                        this.u.t = (float) d;
                        break;
                    case 30324:
                        r(i);
                        this.u.u = (float) d;
                        break;
                    case 30325:
                        r(i);
                        this.u.v = (float) d;
                        break;
                }
        }
    }

    protected final void f(int i, long j) {
        boolean z;
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw zzcc.a("ContentEncodingOrder " + j + " not supported", null);
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw zzcc.a("ContentEncodingScope " + j + " not supported", null);
        }
        switch (i) {
            case 131:
                r(i);
                this.u.d = (int) j;
                return;
            case 136:
                z = j == 1;
                r(i);
                this.u.W = z;
                return;
            case 155:
                this.I = p(j);
                return;
            case 159:
                r(i);
                this.u.P = (int) j;
                return;
            case 176:
                r(i);
                this.u.m = (int) j;
                return;
            case 179:
                q(i);
                this.C.c(p(j));
                return;
            case 186:
                r(i);
                this.u.n = (int) j;
                return;
            case 215:
                r(i);
                this.u.c = (int) j;
                return;
            case AdvertisementType.BRANDED_ON_DEMAND_PRE_ROLL /* 231 */:
                this.B = p(j);
                return;
            case 238:
                this.P = (int) j;
                return;
            case 241:
                if (this.E) {
                    return;
                }
                q(i);
                this.D.c(j);
                this.E = true;
                return;
            case 251:
                this.Q = true;
                return;
            case 16871:
                r(i);
                this.u.g = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw zzcc.a("ContentCompAlgo " + j + " not supported", null);
            case 17029:
                if (j < 1 || j > 2) {
                    throw zzcc.a("DocTypeReadVersion " + j + " not supported", null);
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw zzcc.a("EBMLReadVersion " + j + " not supported", null);
            case 18401:
                if (j == 5) {
                    return;
                }
                throw zzcc.a("ContentEncAlgo " + j + " not supported", null);
            case 18408:
                if (j == 1) {
                    return;
                }
                throw zzcc.a("AESSettingsCipherMode " + j + " not supported", null);
            case 21420:
                this.x = j + this.q;
                return;
            case 21432:
                int i2 = (int) j;
                r(i);
                if (i2 == 0) {
                    this.u.x = 0;
                    return;
                }
                if (i2 == 1) {
                    this.u.x = 2;
                    return;
                } else if (i2 == 3) {
                    this.u.x = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    this.u.x = 3;
                    return;
                }
            case 21680:
                r(i);
                this.u.p = (int) j;
                return;
            case 21682:
                r(i);
                this.u.r = (int) j;
                return;
            case 21690:
                r(i);
                this.u.q = (int) j;
                return;
            case 21930:
                z = j == 1;
                r(i);
                this.u.V = z;
                return;
            case 21938:
                r(i);
                e1a e1aVar = this.u;
                e1aVar.y = true;
                e1aVar.o = (int) j;
                return;
            case 21998:
                r(i);
                this.u.f = (int) j;
                return;
            case 22186:
                r(i);
                this.u.S = j;
                return;
            case 22203:
                r(i);
                this.u.T = j;
                return;
            case 25188:
                r(i);
                this.u.Q = (int) j;
                return;
            case 30114:
                this.R = j;
                return;
            case 30321:
                int i3 = (int) j;
                r(i);
                if (i3 == 0) {
                    this.u.s = 0;
                    return;
                }
                if (i3 == 1) {
                    this.u.s = 1;
                    return;
                } else if (i3 == 2) {
                    this.u.s = 2;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    this.u.s = 3;
                    return;
                }
            case 2352003:
                r(i);
                this.u.e = (int) j;
                return;
            case 2807729:
                this.r = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        int i4 = (int) j;
                        r(i);
                        if (i4 == 1) {
                            this.u.B = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            this.u.B = 1;
                            return;
                        }
                    case 21946:
                        r(i);
                        int b = ayf.b((int) j);
                        if (b != -1) {
                            this.u.A = b;
                            return;
                        }
                        return;
                    case 21947:
                        r(i);
                        this.u.y = true;
                        int a = ayf.a((int) j);
                        if (a != -1) {
                            this.u.z = a;
                            return;
                        }
                        return;
                    case 21948:
                        r(i);
                        this.u.C = (int) j;
                        return;
                    case 21949:
                        r(i);
                        this.u.D = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    protected final void g(int i, long j, long j2) {
        wad.b(this.b0);
        if (i == 160) {
            this.Q = false;
            this.R = 0L;
            return;
        }
        if (i == 174) {
            this.u = new e1a();
            return;
        }
        if (i == 187) {
            this.E = false;
            return;
        }
        if (i == 19899) {
            this.w = -1;
            this.x = -1L;
            return;
        }
        if (i == 20533) {
            r(i);
            this.u.h = true;
            return;
        }
        if (i == 21968) {
            r(i);
            this.u.y = true;
            return;
        }
        if (i == 408125543) {
            long j3 = this.q;
            if (j3 != -1 && j3 != j) {
                throw zzcc.a("Multiple Segment elements not supported", null);
            }
            this.q = j;
            this.p = j2;
            return;
        }
        if (i == 475249515) {
            this.C = new f0e(32);
            this.D = new f0e(32);
        } else if (i == 524531317 && !this.v) {
            if (this.d && this.z != -1) {
                this.y = true;
            } else {
                this.b0.m(new fx9(this.t, 0L));
                this.v = true;
            }
        }
    }

    protected final void h(int i, String str) {
        if (i == 134) {
            r(i);
            this.u.b = str;
            return;
        }
        if (i == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                return;
            }
            throw zzcc.a("DocType " + str + " not supported", null);
        }
        if (i == 21358) {
            r(i);
            this.u.a = str;
        } else {
            if (i != 2274716) {
                return;
            }
            r(i);
            this.u.X = str;
        }
    }

    @Override // defpackage.nv9
    public final void k(long j, long j2) {
        this.B = -9223372036854775807L;
        this.G = 0;
        this.a.zzb();
        this.b.e();
        u();
        for (int i = 0; i < this.c.size(); i++) {
            ux9 ux9Var = ((e1a) this.c.valueAt(i)).U;
            if (ux9Var != null) {
                ux9Var.b();
            }
        }
    }

    @Override // defpackage.nv9
    public final boolean l(ov9 ov9Var) {
        return new g1a().a(ov9Var);
    }

    @Override // defpackage.nv9
    public final void m(sv9 sv9Var) {
        this.b0 = sv9Var;
    }

    @Override // defpackage.nv9
    public final int n(ov9 ov9Var, cx9 cx9Var) {
        this.F = false;
        while (!this.F) {
            if (!this.a.a(ov9Var)) {
                for (int i = 0; i < this.c.size(); i++) {
                    e1a e1aVar = (e1a) this.c.valueAt(i);
                    e1aVar.Y.getClass();
                    ux9 ux9Var = e1aVar.U;
                    if (ux9Var != null) {
                        ux9Var.a(e1aVar.Y, e1aVar.j);
                    }
                }
                return -1;
            }
            long zzf = ov9Var.zzf();
            if (this.y) {
                this.A = zzf;
                cx9Var.a = this.z;
                this.y = false;
                return 1;
            }
            if (this.v) {
                long j = this.A;
                if (j != -1) {
                    cx9Var.a = j;
                    this.A = -1L;
                    return 1;
                }
            }
        }
        return 0;
    }
}
