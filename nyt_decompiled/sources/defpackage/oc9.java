package defpackage;

import android.util.Base64;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.metadata.vorbis.VorbisComment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class oc9 {

    public static final class a {
        public final String a;
        public final String[] b;
        public final int c;

        public a(String str, String[] strArr, int i) {
            this.a = str;
            this.b = strArr;
            this.c = i;
        }
    }

    public static final class b {
        public final boolean a;
        public final int b;
        public final int c;
        public final int d;

        public b(boolean z, int i, int i2, int i3) {
            this.a = z;
            this.b = i;
            this.c = i2;
            this.d = i3;
        }
    }

    public static final class c {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final boolean i;
        public final byte[] j;

        public c(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, byte[] bArr) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = i7;
            this.h = i8;
            this.i = z;
            this.j = bArr;
        }
    }

    public static int a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    private static long b(long j, long j2) {
        return (long) Math.floor(Math.pow(j, 1.0d / j2));
    }

    public static Metadata c(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String[] W0 = z19.W0(str, "=");
            if (W0.length != 2) {
                a84.j("VorbisUtil", "Failed to parse Vorbis comment: " + str);
            } else if (W0[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(PictureFrame.a(new yo5(Base64.decode(W0[1], 0))));
                } catch (RuntimeException e) {
                    a84.k("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new VorbisComment(W0[0], W0[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static void d(mc9 mc9Var) {
        int d = mc9Var.d(6) + 1;
        for (int i = 0; i < d; i++) {
            int d2 = mc9Var.d(16);
            if (d2 == 0) {
                mc9Var.e(8);
                mc9Var.e(16);
                mc9Var.e(16);
                mc9Var.e(6);
                mc9Var.e(8);
                int d3 = mc9Var.d(4) + 1;
                for (int i2 = 0; i2 < d3; i2++) {
                    mc9Var.e(8);
                }
            } else {
                if (d2 != 1) {
                    throw ParserException.a("floor type greater than 1 not decodable: " + d2, null);
                }
                int d4 = mc9Var.d(5);
                int[] iArr = new int[d4];
                int i3 = -1;
                for (int i4 = 0; i4 < d4; i4++) {
                    int d5 = mc9Var.d(4);
                    iArr[i4] = d5;
                    if (d5 > i3) {
                        i3 = d5;
                    }
                }
                int i5 = i3 + 1;
                int[] iArr2 = new int[i5];
                for (int i6 = 0; i6 < i5; i6++) {
                    iArr2[i6] = mc9Var.d(3) + 1;
                    int d6 = mc9Var.d(2);
                    if (d6 > 0) {
                        mc9Var.e(8);
                    }
                    for (int i7 = 0; i7 < (1 << d6); i7++) {
                        mc9Var.e(8);
                    }
                }
                mc9Var.e(2);
                int d7 = mc9Var.d(4);
                int i8 = 0;
                int i9 = 0;
                for (int i10 = 0; i10 < d4; i10++) {
                    i8 += iArr2[iArr[i10]];
                    while (i9 < i8) {
                        mc9Var.e(d7);
                        i9++;
                    }
                }
            }
        }
    }

    private static void e(int i, mc9 mc9Var) {
        int d = mc9Var.d(6) + 1;
        for (int i2 = 0; i2 < d; i2++) {
            int d2 = mc9Var.d(16);
            if (d2 != 0) {
                a84.d("VorbisUtil", "mapping type other than 0 not supported: " + d2);
            } else {
                int d3 = mc9Var.c() ? mc9Var.d(4) + 1 : 1;
                if (mc9Var.c()) {
                    int d4 = mc9Var.d(8) + 1;
                    for (int i3 = 0; i3 < d4; i3++) {
                        int i4 = i - 1;
                        mc9Var.e(a(i4));
                        mc9Var.e(a(i4));
                    }
                }
                if (mc9Var.d(2) != 0) {
                    throw ParserException.a("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (d3 > 1) {
                    for (int i5 = 0; i5 < i; i5++) {
                        mc9Var.e(4);
                    }
                }
                for (int i6 = 0; i6 < d3; i6++) {
                    mc9Var.e(8);
                    mc9Var.e(8);
                    mc9Var.e(8);
                }
            }
        }
    }

    private static b[] f(mc9 mc9Var) {
        int d = mc9Var.d(6) + 1;
        b[] bVarArr = new b[d];
        for (int i = 0; i < d; i++) {
            bVarArr[i] = new b(mc9Var.c(), mc9Var.d(16), mc9Var.d(16), mc9Var.d(8));
        }
        return bVarArr;
    }

    private static void g(mc9 mc9Var) {
        int d = mc9Var.d(6) + 1;
        for (int i = 0; i < d; i++) {
            if (mc9Var.d(16) > 2) {
                throw ParserException.a("residueType greater than 2 is not decodable", null);
            }
            mc9Var.e(24);
            mc9Var.e(24);
            mc9Var.e(24);
            int d2 = mc9Var.d(6) + 1;
            mc9Var.e(8);
            int[] iArr = new int[d2];
            for (int i2 = 0; i2 < d2; i2++) {
                iArr[i2] = ((mc9Var.c() ? mc9Var.d(5) : 0) * 8) + mc9Var.d(3);
            }
            for (int i3 = 0; i3 < d2; i3++) {
                for (int i4 = 0; i4 < 8; i4++) {
                    if ((iArr[i3] & (1 << i4)) != 0) {
                        mc9Var.e(8);
                    }
                }
            }
        }
    }

    public static a h(yo5 yo5Var) {
        return i(yo5Var, true, true);
    }

    public static a i(yo5 yo5Var, boolean z, boolean z2) {
        if (z) {
            m(3, yo5Var, false);
        }
        String E = yo5Var.E((int) yo5Var.x());
        int length = E.length();
        long x = yo5Var.x();
        String[] strArr = new String[(int) x];
        int i = length + 15;
        for (int i2 = 0; i2 < x; i2++) {
            String E2 = yo5Var.E((int) yo5Var.x());
            strArr[i2] = E2;
            i = i + 4 + E2.length();
        }
        if (z2 && (yo5Var.H() & 1) == 0) {
            throw ParserException.a("framing bit expected to be set", null);
        }
        return new a(E, strArr, i + 1);
    }

    public static c j(yo5 yo5Var) {
        m(1, yo5Var, false);
        int y = yo5Var.y();
        int H = yo5Var.H();
        int y2 = yo5Var.y();
        int u = yo5Var.u();
        if (u <= 0) {
            u = -1;
        }
        int u2 = yo5Var.u();
        if (u2 <= 0) {
            u2 = -1;
        }
        int u3 = yo5Var.u();
        if (u3 <= 0) {
            u3 = -1;
        }
        int H2 = yo5Var.H();
        return new c(y, H, y2, u, u2, u3, (int) Math.pow(2.0d, H2 & 15), (int) Math.pow(2.0d, (H2 & 240) >> 4), (yo5Var.H() & 1) > 0, Arrays.copyOf(yo5Var.e(), yo5Var.g()));
    }

    public static b[] k(yo5 yo5Var, int i) {
        m(5, yo5Var, false);
        int H = yo5Var.H() + 1;
        mc9 mc9Var = new mc9(yo5Var.e());
        mc9Var.e(yo5Var.f() * 8);
        for (int i2 = 0; i2 < H; i2++) {
            l(mc9Var);
        }
        int d = mc9Var.d(6) + 1;
        for (int i3 = 0; i3 < d; i3++) {
            if (mc9Var.d(16) != 0) {
                throw ParserException.a("placeholder of time domain transforms not zeroed out", null);
            }
        }
        d(mc9Var);
        g(mc9Var);
        e(i, mc9Var);
        b[] f = f(mc9Var);
        if (mc9Var.c()) {
            return f;
        }
        throw ParserException.a("framing bit after modes not set as expected", null);
    }

    private static void l(mc9 mc9Var) {
        if (mc9Var.d(24) != 5653314) {
            throw ParserException.a("expected code book to start with [0x56, 0x43, 0x42] at " + mc9Var.b(), null);
        }
        int d = mc9Var.d(16);
        int d2 = mc9Var.d(24);
        int i = 0;
        if (mc9Var.c()) {
            mc9Var.e(5);
            while (i < d2) {
                i += mc9Var.d(a(d2 - i));
            }
        } else {
            boolean c2 = mc9Var.c();
            while (i < d2) {
                if (!c2) {
                    mc9Var.e(5);
                } else if (mc9Var.c()) {
                    mc9Var.e(5);
                }
                i++;
            }
        }
        int d3 = mc9Var.d(4);
        if (d3 > 2) {
            throw ParserException.a("lookup type greater than 2 not decodable: " + d3, null);
        }
        if (d3 == 1 || d3 == 2) {
            mc9Var.e(32);
            mc9Var.e(32);
            int d4 = mc9Var.d(4) + 1;
            mc9Var.e(1);
            mc9Var.e((int) ((d3 == 1 ? d != 0 ? b(d2, d) : 0L : d * d2) * d4));
        }
    }

    public static boolean m(int i, yo5 yo5Var, boolean z) {
        if (yo5Var.a() < 7) {
            if (z) {
                return false;
            }
            throw ParserException.a("too short header: " + yo5Var.a(), null);
        }
        if (yo5Var.H() != i) {
            if (z) {
                return false;
            }
            throw ParserException.a("expected header type " + Integer.toHexString(i), null);
        }
        if (yo5Var.H() == 118 && yo5Var.H() == 111 && yo5Var.H() == 114 && yo5Var.H() == 98 && yo5Var.H() == 105 && yo5Var.H() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw ParserException.a("expected characters 'vorbis'", null);
    }
}
