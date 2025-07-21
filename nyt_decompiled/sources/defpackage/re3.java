package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.BinaryFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterTocFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.GeobFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.id3.UrlLinkFrame;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class re3 extends ls7 {
    public static final a b = new a() { // from class: qe3
        @Override // re3.a
        public final boolean a(int i, int i2, int i3, int i4, int i5) {
            boolean A;
            A = re3.A(i, i2, i3, i4, i5);
            return A;
        }
    };
    private final a a;

    public interface a {
        boolean a(int i, int i2, int i3, int i4, int i5);
    }

    private static final class b {
        private final int a;
        private final boolean b;
        private final int c;

        public b(int i, boolean z, int i2) {
            this.a = i;
            this.b = z;
            this.c = i2;
        }
    }

    public re3() {
        this(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean A(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    private static int B(yo5 yo5Var, int i) {
        byte[] e = yo5Var.e();
        int f = yo5Var.f();
        int i2 = f;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= f + i) {
                return i;
            }
            if ((e[i2] & 255) == 255 && e[i3] == 0) {
                System.arraycopy(e, i2 + 2, e, i3, (i - (i2 - f)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
    
        if ((r10 & 1) != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0089, code lost:
    
        if ((r10 & 128) != 0) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean C(defpackage.yo5 r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.f()
        L8:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> L22
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lae
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L25
            int r7 = r18.q()     // Catch: java.lang.Throwable -> L22
            long r8 = r18.J()     // Catch: java.lang.Throwable -> L22
            int r10 = r18.N()     // Catch: java.lang.Throwable -> L22
            goto L2f
        L22:
            r0 = move-exception
            goto Lb2
        L25:
            int r7 = r18.K()     // Catch: java.lang.Throwable -> L22
            int r8 = r18.K()     // Catch: java.lang.Throwable -> L22
            long r8 = (long) r8
            r10 = r6
        L2f:
            r11 = 0
            if (r7 != 0) goto L3d
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3d
            if (r10 != 0) goto L3d
            r1.U(r2)
            return r4
        L3d:
            r7 = 4
            if (r0 != r7) goto L6e
            if (r21 != 0) goto L6e
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4e
            r1.U(r2)
            return r6
        L4e:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6e:
            if (r0 != r7) goto L7e
            r3 = r10 & 64
            if (r3 == 0) goto L76
            r3 = r4
            goto L77
        L76:
            r3 = r6
        L77:
            r7 = r10 & 1
            if (r7 == 0) goto L7c
            goto L8e
        L7c:
            r4 = r6
            goto L8e
        L7e:
            if (r0 != r3) goto L8c
            r3 = r10 & 32
            if (r3 == 0) goto L86
            r3 = r4
            goto L87
        L86:
            r3 = r6
        L87:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L7c
            goto L8e
        L8c:
            r3 = r6
            r4 = r3
        L8e:
            if (r4 == 0) goto L92
            int r3 = r3 + 4
        L92:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L9b
            r1.U(r2)
            return r6
        L9b:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> L22
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La8
            r1.U(r2)
            return r6
        La8:
            int r3 = (int) r8
            r1.V(r3)     // Catch: java.lang.Throwable -> L22
            goto L8
        Lae:
            r1.U(r2)
            return r4
        Lb2:
            r1.U(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.re3.C(yo5, int, int, boolean):boolean");
    }

    private static byte[] d(byte[] bArr, int i, int i2) {
        return i2 <= i ? z19.f : Arrays.copyOfRange(bArr, i, i2);
    }

    private static ApicFrame f(yo5 yo5Var, int i, int i2) {
        int z;
        String str;
        int H = yo5Var.H();
        Charset w = w(H);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        yo5Var.l(bArr, 0, i3);
        if (i2 == 2) {
            str = "image/" + tr.e(new String(bArr, 0, 3, zj0.b));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            z = 2;
        } else {
            z = z(bArr, 0);
            String e = tr.e(new String(bArr, 0, z, zj0.b));
            if (e.indexOf(47) == -1) {
                str = "image/" + e;
            } else {
                str = e;
            }
        }
        int i4 = bArr[z + 1] & 255;
        int i5 = z + 2;
        int y = y(bArr, i5, H);
        return new ApicFrame(str, new String(bArr, i5, y - i5, w), i4, d(bArr, y + v(H), i3));
    }

    private static BinaryFrame g(yo5 yo5Var, int i, String str) {
        byte[] bArr = new byte[i];
        yo5Var.l(bArr, 0, i);
        return new BinaryFrame(str, bArr);
    }

    private static ChapterFrame h(yo5 yo5Var, int i, int i2, boolean z, int i3, a aVar) {
        int f = yo5Var.f();
        int z2 = z(yo5Var.e(), f);
        String str = new String(yo5Var.e(), f, z2 - f, zj0.b);
        yo5Var.U(z2 + 1);
        int q = yo5Var.q();
        int q2 = yo5Var.q();
        long J = yo5Var.J();
        long j = J == 4294967295L ? -1L : J;
        long J2 = yo5Var.J();
        long j2 = J2 == 4294967295L ? -1L : J2;
        ArrayList arrayList = new ArrayList();
        int i4 = f + i;
        while (yo5Var.f() < i4) {
            Id3Frame k = k(i2, yo5Var, z, i3, aVar);
            if (k != null) {
                arrayList.add(k);
            }
        }
        return new ChapterFrame(str, q, q2, j, j2, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    private static ChapterTocFrame i(yo5 yo5Var, int i, int i2, boolean z, int i3, a aVar) {
        int f = yo5Var.f();
        int z2 = z(yo5Var.e(), f);
        String str = new String(yo5Var.e(), f, z2 - f, zj0.b);
        yo5Var.U(z2 + 1);
        int H = yo5Var.H();
        boolean z3 = (H & 2) != 0;
        boolean z4 = (H & 1) != 0;
        int H2 = yo5Var.H();
        String[] strArr = new String[H2];
        for (int i4 = 0; i4 < H2; i4++) {
            int f2 = yo5Var.f();
            int z5 = z(yo5Var.e(), f2);
            strArr[i4] = new String(yo5Var.e(), f2, z5 - f2, zj0.b);
            yo5Var.U(z5 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i5 = f + i;
        while (yo5Var.f() < i5) {
            Id3Frame k = k(i2, yo5Var, z, i3, aVar);
            if (k != null) {
                arrayList.add(k);
            }
        }
        return new ChapterTocFrame(str, z3, z4, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    private static CommentFrame j(yo5 yo5Var, int i) {
        if (i < 4) {
            return null;
        }
        int H = yo5Var.H();
        Charset w = w(H);
        byte[] bArr = new byte[3];
        yo5Var.l(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        yo5Var.l(bArr2, 0, i2);
        int y = y(bArr2, 0, H);
        String str2 = new String(bArr2, 0, y, w);
        int v = y + v(H);
        return new CommentFrame(str, str2, p(bArr2, v, y(bArr2, v, H), w));
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0190, code lost:
    
        if (r13 == 67) goto L132;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.exoplayer2.metadata.id3.Id3Frame k(int r19, defpackage.yo5 r20, boolean r21, int r22, re3.a r23) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.re3.k(int, yo5, boolean, int, re3$a):com.google.android.exoplayer2.metadata.id3.Id3Frame");
    }

    private static GeobFrame l(yo5 yo5Var, int i) {
        int H = yo5Var.H();
        Charset w = w(H);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        yo5Var.l(bArr, 0, i2);
        int z = z(bArr, 0);
        String str = new String(bArr, 0, z, zj0.b);
        int i3 = z + 1;
        int y = y(bArr, i3, H);
        String p = p(bArr, i3, y, w);
        int v = y + v(H);
        int y2 = y(bArr, v, H);
        return new GeobFrame(str, p, p(bArr, v, y2, w), d(bArr, y2 + v(H), i2));
    }

    private static b m(yo5 yo5Var) {
        if (yo5Var.a() < 10) {
            a84.j("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int K = yo5Var.K();
        if (K != 4801587) {
            a84.j("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", Integer.valueOf(K)));
            return null;
        }
        int H = yo5Var.H();
        yo5Var.V(1);
        int H2 = yo5Var.H();
        int G = yo5Var.G();
        if (H == 2) {
            if ((H2 & 64) != 0) {
                a84.j("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (H == 3) {
            if ((H2 & 64) != 0) {
                int q = yo5Var.q();
                yo5Var.V(q);
                G -= q + 4;
            }
        } else {
            if (H != 4) {
                a84.j("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + H);
                return null;
            }
            if ((H2 & 64) != 0) {
                int G2 = yo5Var.G();
                yo5Var.V(G2 - 4);
                G -= G2;
            }
            if ((H2 & 16) != 0) {
                G -= 10;
            }
        }
        return new b(H, H < 4 && (H2 & 128) != 0, G);
    }

    private static MlltFrame n(yo5 yo5Var, int i) {
        int N = yo5Var.N();
        int K = yo5Var.K();
        int K2 = yo5Var.K();
        int H = yo5Var.H();
        int H2 = yo5Var.H();
        xo5 xo5Var = new xo5();
        xo5Var.m(yo5Var);
        int i2 = ((i - 10) * 8) / (H + H2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int h = xo5Var.h(H);
            int h2 = xo5Var.h(H2);
            iArr[i3] = h;
            iArr2[i3] = h2;
        }
        return new MlltFrame(N, K, K2, iArr, iArr2);
    }

    private static PrivFrame o(yo5 yo5Var, int i) {
        byte[] bArr = new byte[i];
        yo5Var.l(bArr, 0, i);
        int z = z(bArr, 0);
        return new PrivFrame(new String(bArr, 0, z, zj0.b), d(bArr, z + 1, i));
    }

    private static String p(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    private static TextInformationFrame q(yo5 yo5Var, int i, String str) {
        if (i < 1) {
            return null;
        }
        int H = yo5Var.H();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        yo5Var.l(bArr, 0, i2);
        return new TextInformationFrame(str, null, r(bArr, H, 0));
    }

    private static ImmutableList r(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return ImmutableList.y("");
        }
        ImmutableList.a p = ImmutableList.p();
        int y = y(bArr, i2, i);
        while (i2 < y) {
            p.a(new String(bArr, i2, y - i2, w(i)));
            i2 = v(i) + y;
            y = y(bArr, i2, i);
        }
        ImmutableList k = p.k();
        return k.isEmpty() ? ImmutableList.y("") : k;
    }

    private static TextInformationFrame s(yo5 yo5Var, int i) {
        if (i < 1) {
            return null;
        }
        int H = yo5Var.H();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        yo5Var.l(bArr, 0, i2);
        int y = y(bArr, 0, H);
        return new TextInformationFrame("TXXX", new String(bArr, 0, y, w(H)), r(bArr, H, y + v(H)));
    }

    private static UrlLinkFrame t(yo5 yo5Var, int i, String str) {
        byte[] bArr = new byte[i];
        yo5Var.l(bArr, 0, i);
        return new UrlLinkFrame(str, null, new String(bArr, 0, z(bArr, 0), zj0.b));
    }

    private static UrlLinkFrame u(yo5 yo5Var, int i) {
        if (i < 1) {
            return null;
        }
        int H = yo5Var.H();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        yo5Var.l(bArr, 0, i2);
        int y = y(bArr, 0, H);
        String str = new String(bArr, 0, y, w(H));
        int v = y + v(H);
        return new UrlLinkFrame("WXXX", str, p(bArr, v, z(bArr, v), zj0.b));
    }

    private static int v(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    private static Charset w(int i) {
        return i != 1 ? i != 2 ? i != 3 ? zj0.b : zj0.c : zj0.d : zj0.f;
    }

    private static String x(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    private static int y(byte[] bArr, int i, int i2) {
        int z = z(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return z;
        }
        while (z < bArr.length - 1) {
            if ((z - i) % 2 == 0 && bArr[z + 1] == 0) {
                return z;
            }
            z = z(bArr, z + 1);
        }
        return bArr.length;
    }

    private static int z(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    @Override // defpackage.ls7
    protected Metadata b(ts4 ts4Var, ByteBuffer byteBuffer) {
        return e(byteBuffer.array(), byteBuffer.limit());
    }

    public Metadata e(byte[] bArr, int i) {
        ArrayList arrayList = new ArrayList();
        yo5 yo5Var = new yo5(bArr, i);
        b m = m(yo5Var);
        if (m == null) {
            return null;
        }
        int f = yo5Var.f();
        int i2 = m.a == 2 ? 6 : 10;
        int i3 = m.c;
        if (m.b) {
            i3 = B(yo5Var, m.c);
        }
        yo5Var.T(f + i3);
        boolean z = false;
        if (!C(yo5Var, m.a, i2, false)) {
            if (m.a != 4 || !C(yo5Var, 4, i2, true)) {
                a84.j("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + m.a);
                return null;
            }
            z = true;
        }
        while (yo5Var.a() >= i2) {
            Id3Frame k = k(m.a, yo5Var, z, i2, this.a);
            if (k != null) {
                arrayList.add(k);
            }
        }
        return new Metadata(arrayList);
    }

    public re3(a aVar) {
        this.a = aVar;
    }
}
