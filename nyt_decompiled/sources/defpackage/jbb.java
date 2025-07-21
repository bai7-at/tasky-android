package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class jbb {
    private static final String i = Integer.toString(0, 36);
    private static final String j = Integer.toString(1, 36);
    private static final String k = Integer.toString(2, 36);
    private static final String l = Integer.toString(3, 36);
    private static final String m = Integer.toString(4, 36);
    private static final String n = Integer.toString(5, 36);
    private static final String o = Integer.toString(6, 36);
    private static final String p = Integer.toString(7, 36);
    static final String q = Integer.toString(8, 36);
    public static final zhf r = new zhf() { // from class: pka
    };
    public final long a;
    public final int b;
    public final Uri[] c;
    public final cza[] d;
    public final int[] e;
    public final long[] f;
    public final long g;
    public final boolean h;

    public jbb(long j2) {
        this(0L, -1, -1, new int[0], new cza[0], new long[0], 0L, false);
    }

    public final int a(int i2) {
        int i3;
        int i4 = i2 + 1;
        while (true) {
            int[] iArr = this.e;
            if (i4 >= iArr.length || (i3 = iArr[i4]) == 0 || i3 == 1) {
                break;
            }
            i4++;
        }
        return i4;
    }

    public final jbb b(int i2) {
        int[] iArr = this.e;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = this.f;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        return new jbb(0L, 0, -1, copyOf, (cza[]) Arrays.copyOf(this.d, 0), copyOf2, 0L, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jbb.class == obj.getClass()) {
            jbb jbbVar = (jbb) obj;
            if (this.b == jbbVar.b && Arrays.equals(this.d, jbbVar.d) && Arrays.equals(this.e, jbbVar.e) && Arrays.equals(this.f, jbbVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.b * 31) - 1) * 961) + Arrays.hashCode(this.d)) * 31) + Arrays.hashCode(this.e)) * 31) + Arrays.hashCode(this.f)) * 961;
    }

    private jbb(long j2, int i2, int i3, int[] iArr, cza[] czaVarArr, long[] jArr, long j3, boolean z) {
        Uri uri;
        int length = iArr.length;
        int length2 = czaVarArr.length;
        int i4 = 0;
        wad.d(length == length2);
        this.a = 0L;
        this.b = i2;
        this.e = iArr;
        this.d = czaVarArr;
        this.f = jArr;
        this.g = 0L;
        this.h = false;
        this.c = new Uri[length2];
        while (true) {
            Uri[] uriArr = this.c;
            if (i4 >= uriArr.length) {
                return;
            }
            cza czaVar = czaVarArr[i4];
            if (czaVar == null) {
                uri = null;
            } else {
                rra rraVar = czaVar.b;
                rraVar.getClass();
                uri = rraVar.a;
            }
            uriArr[i4] = uri;
            i4++;
        }
    }
}
