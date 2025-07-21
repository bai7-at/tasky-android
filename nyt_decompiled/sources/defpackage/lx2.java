package defpackage;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;

/* loaded from: classes3.dex */
public final class lx2 {
    public static final lx2 h = new lx2(4201, ProgressEvent.PART_FAILED_EVENT_CODE, 1);
    public static final lx2 i = new lx2(1033, 1024, 1);
    public static final lx2 j;
    public static final lx2 k;
    public static final lx2 l;
    public static final lx2 m;
    public static final lx2 n;
    public static final lx2 o;
    private final int[] a;
    private final int[] b;
    private final mx2 c;
    private final mx2 d;
    private final int e;
    private final int f;
    private final int g;

    static {
        lx2 lx2Var = new lx2(67, 64, 1);
        j = lx2Var;
        k = new lx2(19, 16, 1);
        l = new lx2(285, JceEncryptionConstants.SYMMETRIC_KEY_LENGTH, 0);
        lx2 lx2Var2 = new lx2(301, JceEncryptionConstants.SYMMETRIC_KEY_LENGTH, 1);
        m = lx2Var2;
        n = lx2Var2;
        o = lx2Var;
    }

    public lx2(int i2, int i3, int i4) {
        this.f = i2;
        this.e = i3;
        this.g = i4;
        this.a = new int[i3];
        this.b = new int[i3];
        int i5 = 1;
        for (int i6 = 0; i6 < i3; i6++) {
            this.a[i6] = i5;
            i5 <<= 1;
            if (i5 >= i3) {
                i5 = (i5 ^ i2) & (i3 - 1);
            }
        }
        for (int i7 = 0; i7 < i3 - 1; i7++) {
            this.b[this.a[i7]] = i7;
        }
        this.c = new mx2(this, new int[]{0});
        this.d = new mx2(this, new int[]{1});
    }

    static int a(int i2, int i3) {
        return i2 ^ i3;
    }

    mx2 b(int i2, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        if (i3 == 0) {
            return this.c;
        }
        int[] iArr = new int[i2 + 1];
        iArr[0] = i3;
        return new mx2(this, iArr);
    }

    int c(int i2) {
        return this.a[i2];
    }

    public int d() {
        return this.g;
    }

    mx2 e() {
        return this.c;
    }

    int f(int i2) {
        if (i2 != 0) {
            return this.a[(this.e - this.b[i2]) - 1];
        }
        throw new ArithmeticException();
    }

    int g(int i2) {
        if (i2 != 0) {
            return this.b[i2];
        }
        throw new IllegalArgumentException();
    }

    int h(int i2, int i3) {
        if (i2 == 0 || i3 == 0) {
            return 0;
        }
        int[] iArr = this.a;
        int[] iArr2 = this.b;
        return iArr[(iArr2[i2] + iArr2[i3]) % (this.e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f) + ',' + this.e + ')';
    }
}
