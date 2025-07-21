package defpackage;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzae;
import com.google.android.gms.internal.ads.zzcc;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class e1a {
    public byte[] O;
    public ux9 U;
    public boolean V;
    public tx9 Y;
    public int Z;
    public String a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    private int g;
    public boolean h;
    public byte[] i;
    public lx9 j;
    public byte[] k;
    public zzae l;
    public int m = -1;
    public int n = -1;
    public int o = -1;
    public int p = -1;
    public int q = -1;
    public int r = 0;
    public int s = -1;
    public float t = 0.0f;
    public float u = 0.0f;
    public float v = 0.0f;
    public byte[] w = null;
    public int x = -1;
    public boolean y = false;
    public int z = -1;
    public int A = -1;
    public int B = -1;
    public int C = NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
    public int D = 200;
    public float E = -1.0f;
    public float F = -1.0f;
    public float G = -1.0f;
    public float H = -1.0f;
    public float I = -1.0f;
    public float J = -1.0f;
    public float K = -1.0f;
    public float L = -1.0f;
    public float M = -1.0f;
    public float N = -1.0f;
    public int P = 1;
    public int Q = -1;
    public int R = 8000;
    public long S = 0;
    public long T = 0;
    public boolean W = true;
    private String X = "eng";

    protected e1a() {
    }

    private static Pair f(b9e b9eVar) {
        try {
            b9eVar.l(16);
            long H = b9eVar.H();
            if (H == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (H == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (H != 826496599) {
                ezd.f("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
            int s = b9eVar.s() + 20;
            byte[] m = b9eVar.m();
            while (true) {
                int length = m.length;
                if (s >= length - 4) {
                    throw zzcc.a("Failed to find FourCC VC1 initialization data", null);
                }
                int i = s + 1;
                if (m[s] == 0 && m[i] == 0 && m[s + 2] == 1 && m[s + 3] == 15) {
                    return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(m, s, length)));
                }
                s = i;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzcc.a("Error parsing FourCC private data", null);
        }
    }

    private static List g(byte[] bArr) {
        int i;
        int i2;
        try {
            if (bArr[0] != 2) {
                throw zzcc.a("Error parsing vorbis codec private", null);
            }
            int i3 = 0;
            int i4 = 1;
            while (true) {
                int i5 = bArr[i4];
                i4++;
                i = i5 & 255;
                if (i != 255) {
                    break;
                }
                i3 += 255;
            }
            int i6 = i3 + i;
            int i7 = 0;
            while (true) {
                int i8 = bArr[i4];
                i4++;
                i2 = i8 & 255;
                if (i2 != 255) {
                    break;
                }
                i7 += 255;
            }
            int i9 = i7 + i2;
            if (bArr[i4] != 1) {
                throw zzcc.a("Error parsing vorbis codec private", null);
            }
            byte[] bArr2 = new byte[i6];
            System.arraycopy(bArr, i4, bArr2, 0, i6);
            int i10 = i4 + i6;
            if (bArr[i10] != 3) {
                throw zzcc.a("Error parsing vorbis codec private", null);
            }
            int i11 = i10 + i9;
            if (bArr[i11] != 5) {
                throw zzcc.a("Error parsing vorbis codec private", null);
            }
            int length = bArr.length - i11;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, i11, bArr3, 0, length);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzcc.a("Error parsing vorbis codec private", null);
        }
    }

    private static boolean h(b9e b9eVar) {
        try {
            int z = b9eVar.z();
            if (z == 1) {
                return true;
            }
            if (z == 65534) {
                b9eVar.k(24);
                if (b9eVar.I() == f1a.h0.getMostSignificantBits()) {
                    if (b9eVar.I() == f1a.h0.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzcc.a("Error parsing MS/ACM codec private", null);
        }
    }

    private final byte[] i(String str) {
        byte[] bArr = this.k;
        if (bArr != null) {
            return bArr;
        }
        throw zzcc.a("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x03e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.sv9 r19, int r20) {
        /*
            Method dump skipped, instructions count: 1742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e1a.e(sv9, int):void");
    }
}
