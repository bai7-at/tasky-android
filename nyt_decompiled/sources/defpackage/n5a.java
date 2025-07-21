package defpackage;

import android.graphics.Bitmap;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class n5a {
    private final b9e a = new b9e();
    private final int[] b = new int[JceEncryptionConstants.SYMMETRIC_KEY_LENGTH];
    private boolean c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;

    static /* bridge */ /* synthetic */ void b(n5a n5aVar, b9e b9eVar, int i) {
        int D;
        if (i < 4) {
            return;
        }
        b9eVar.l(3);
        int i2 = i - 4;
        if ((b9eVar.B() & 128) != 0) {
            if (i2 < 7 || (D = b9eVar.D()) < 4) {
                return;
            }
            n5aVar.h = b9eVar.F();
            n5aVar.i = b9eVar.F();
            n5aVar.a.h(D - 4);
            i2 = i - 11;
        }
        b9e b9eVar2 = n5aVar.a;
        int s = b9eVar2.s();
        int t = b9eVar2.t();
        if (s >= t || i2 <= 0) {
            return;
        }
        int min = Math.min(i2, t - s);
        b9eVar.g(b9eVar2.m(), s, min);
        n5aVar.a.k(s + min);
    }

    static /* bridge */ /* synthetic */ void c(n5a n5aVar, b9e b9eVar, int i) {
        if (i < 19) {
            return;
        }
        n5aVar.d = b9eVar.F();
        n5aVar.e = b9eVar.F();
        b9eVar.l(11);
        n5aVar.f = b9eVar.F();
        n5aVar.g = b9eVar.F();
    }

    static /* bridge */ /* synthetic */ void d(n5a n5aVar, b9e b9eVar, int i) {
        if (i % 5 != 2) {
            return;
        }
        b9eVar.l(2);
        int i2 = 0;
        Arrays.fill(n5aVar.b, 0);
        int i3 = i / 5;
        int i4 = 0;
        while (i4 < i3) {
            int B = b9eVar.B();
            int B2 = b9eVar.B();
            int B3 = b9eVar.B();
            int B4 = b9eVar.B();
            int B5 = b9eVar.B();
            double d = B2;
            int[] iArr = n5aVar.b;
            double d2 = B3 - 128;
            int max = Math.max(i2, Math.min((int) ((1.402d * d2) + d), 255)) << 16;
            double d3 = B4 - 128;
            iArr[B] = Math.max(0, Math.min((int) (d + (d3 * 1.772d)), 255)) | (B5 << 24) | max | (Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)) << 8);
            i4++;
            i2 = 0;
        }
        n5aVar.c = true;
    }

    public final e2d a() {
        int i;
        if (this.d == 0 || this.e == 0 || this.h == 0 || this.i == 0) {
            return null;
        }
        b9e b9eVar = this.a;
        if (b9eVar.t() == 0 || b9eVar.s() != b9eVar.t() || !this.c) {
            return null;
        }
        b9eVar.k(0);
        int i2 = this.h * this.i;
        int[] iArr = new int[i2];
        int i3 = 0;
        while (i3 < i2) {
            int B = this.a.B();
            if (B != 0) {
                i = i3 + 1;
                iArr[i3] = this.b[B];
            } else {
                int B2 = this.a.B();
                if (B2 != 0) {
                    int i4 = B2 & 63;
                    if ((B2 & 64) != 0) {
                        i4 = (i4 << 8) | this.a.B();
                    }
                    i = i4 + i3;
                    Arrays.fill(iArr, i3, i, (B2 & 128) == 0 ? 0 : this.b[this.a.B()]);
                }
            }
            i3 = i;
        }
        Bitmap createBitmap = Bitmap.createBitmap(iArr, this.h, this.i, Bitmap.Config.ARGB_8888);
        zzc zzcVar = new zzc();
        zzcVar.c(createBitmap);
        zzcVar.h(this.f / this.d);
        zzcVar.i(0);
        zzcVar.e(this.g / this.e, 0);
        zzcVar.f(0);
        zzcVar.k(this.h / this.d);
        zzcVar.d(this.i / this.e);
        return zzcVar.p();
    }

    public final void e() {
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.a.h(0);
        this.c = false;
    }
}
