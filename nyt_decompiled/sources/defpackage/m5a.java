package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.google.android.gms.internal.ads.zzgaa;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class m5a implements t4a {
    private static final byte[] h = {0, 7, 8, 15};
    private static final byte[] i = {0, 119, -120, -1};
    private static final byte[] j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final Paint a;
    private final Paint b;
    private final Canvas c;
    private final y4a d;
    private final x4a e;
    private final l5a f;
    private Bitmap g;

    public m5a(List list) {
        b9e b9eVar = new b9e((byte[]) list.get(0));
        int F = b9eVar.F();
        int F2 = b9eVar.F();
        Paint paint = new Paint();
        this.a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.c = new Canvas();
        this.d = new y4a(719, 575, 0, 719, 0, 575);
        this.e = new x4a(0, g(), h(), i());
        this.f = new l5a(F, F2);
    }

    private static int b(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    private static x4a c(g8e g8eVar, int i2) {
        int d;
        int d2;
        int i3;
        int i4;
        int i5 = 8;
        int d3 = g8eVar.d(8);
        g8eVar.m(8);
        int[] g = g();
        int[] h2 = h();
        int[] i6 = i();
        int i7 = i2 - 2;
        while (i7 > 0) {
            int d4 = g8eVar.d(i5);
            int d5 = g8eVar.d(i5);
            int[] iArr = (d5 & 128) != 0 ? g : (d5 & 64) != 0 ? h2 : i6;
            if ((d5 & 1) != 0) {
                i3 = g8eVar.d(i5);
                i4 = g8eVar.d(i5);
                d = g8eVar.d(i5);
                d2 = g8eVar.d(i5);
                i7 -= 6;
            } else {
                int d6 = g8eVar.d(6) << 2;
                int d7 = g8eVar.d(4) << 4;
                i7 -= 4;
                d = g8eVar.d(4) << 4;
                d2 = g8eVar.d(2) << 6;
                i3 = d6;
                i4 = d7;
            }
            if (i3 == 0) {
                d2 = 255;
            }
            if (i3 == 0) {
                d = 0;
            }
            if (i3 == 0) {
                i4 = 0;
            }
            double d8 = i3;
            double d9 = i4 - 128;
            double d10 = d - 128;
            iArr[d4] = b((byte) (255 - (d2 & 255)), Math.max(0, Math.min((int) (d8 + (1.402d * d9)), 255)), Math.max(0, Math.min((int) ((d8 - (0.34414d * d10)) - (d9 * 0.71414d)), 255)), Math.max(0, Math.min((int) (d8 + (d10 * 1.772d)), 255)));
            d3 = d3;
            i5 = 8;
        }
        return new x4a(d3, g, h2, i6);
    }

    private static z4a d(g8e g8eVar) {
        byte[] bArr;
        int d = g8eVar.d(16);
        g8eVar.m(4);
        int d2 = g8eVar.d(2);
        boolean o = g8eVar.o();
        g8eVar.m(1);
        byte[] bArr2 = khe.f;
        if (d2 == 1) {
            g8eVar.m(g8eVar.d(8) * 16);
        } else if (d2 == 0) {
            int d3 = g8eVar.d(16);
            int d4 = g8eVar.d(16);
            if (d3 > 0) {
                bArr2 = new byte[d3];
                g8eVar.h(bArr2, 0, d3);
            }
            if (d4 > 0) {
                bArr = new byte[d4];
                g8eVar.h(bArr, 0, d4);
                return new z4a(d, o, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new z4a(d, o, bArr2, bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0228 A[LOOP:3: B:88:0x0172->B:101:0x0228, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0222 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ef A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void e(byte[] r24, int[] r25, int r26, int r27, int r28, android.graphics.Paint r29, android.graphics.Canvas r30) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m5a.e(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    private static byte[] f(int i2, int i3, g8e g8eVar) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) g8eVar.d(i3);
        }
        return bArr;
    }

    private static int[] g() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] h() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            int i3 = i2 & 4;
            int i4 = i2 & 2;
            int i5 = i2 & 1;
            if (i2 < 8) {
                iArr[i2] = b(255, 1 != i5 ? 0 : 255, i4 != 0 ? 255 : 0, i3 != 0 ? 255 : 0);
            } else {
                iArr[i2] = b(255, 1 != i5 ? 0 : 127, i4 != 0 ? 127 : 0, i3 == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] i() {
        int[] iArr = new int[JceEncryptionConstants.SYMMETRIC_KEY_LENGTH];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (i2 < 8) {
                iArr[i2] = b(63, 1 != (i2 & 1) ? 0 : 255, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) == 0 ? 0 : 255);
            } else {
                int i3 = i2 & 136;
                if (i3 == 0) {
                    iArr[i2] = b(255, (1 != (i2 & 1) ? 0 : 85) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 8) {
                    iArr[i2] = b(127, (1 != (i2 & 1) ? 0 : 85) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 128) {
                    iArr[i2] = b(255, (1 != (i2 & 1) ? 0 : 43) + 127 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + 127 + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i3 == 136) {
                    iArr[i2] = b(255, (1 != (i2 & 1) ? 0 : 43) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    @Override // defpackage.t4a
    public final void a(byte[] bArr, int i2, int i3, s4a s4aVar, pgd pgdVar) {
        m4a m4aVar;
        char c;
        char c2;
        int i4;
        SparseArray sparseArray;
        int i5;
        SparseArray sparseArray2;
        j5a j5aVar;
        int i6;
        int d;
        int d2;
        int i7;
        int i8;
        int i9;
        int i10;
        g8e g8eVar = new g8e(bArr, i2 + i3);
        g8eVar.k(i2);
        while (g8eVar.a() >= 48 && g8eVar.d(8) == 15) {
            l5a l5aVar = this.f;
            int d3 = g8eVar.d(8);
            int d4 = g8eVar.d(16);
            int d5 = g8eVar.d(16);
            int b = g8eVar.b() + d5;
            if (d5 * 8 > g8eVar.a()) {
                ezd.f("DvbParser", "Data field length exceeds limit");
                g8eVar.m(g8eVar.a());
            } else {
                switch (d3) {
                    case 16:
                        if (d4 == l5aVar.a) {
                            a5a a5aVar = l5aVar.i;
                            int d6 = g8eVar.d(8);
                            int d7 = g8eVar.d(4);
                            int d8 = g8eVar.d(2);
                            g8eVar.m(2);
                            SparseArray sparseArray3 = new SparseArray();
                            for (int i11 = d5 - 2; i11 > 0; i11 -= 6) {
                                int d9 = g8eVar.d(8);
                                g8eVar.m(8);
                                sparseArray3.put(d9, new b5a(g8eVar.d(16), g8eVar.d(16)));
                            }
                            a5a a5aVar2 = new a5a(d6, d7, d8, sparseArray3);
                            if (a5aVar2.b != 0) {
                                l5aVar.i = a5aVar2;
                                l5aVar.c.clear();
                                l5aVar.d.clear();
                                l5aVar.e.clear();
                                break;
                            } else if (a5aVar != null) {
                                if (a5aVar.a != a5aVar2.a) {
                                    l5aVar.i = a5aVar2;
                                    break;
                                }
                            }
                        }
                        break;
                    case 17:
                        a5a a5aVar3 = l5aVar.i;
                        if (d4 == l5aVar.a && a5aVar3 != null) {
                            int d10 = g8eVar.d(8);
                            g8eVar.m(4);
                            boolean o = g8eVar.o();
                            g8eVar.m(3);
                            int d11 = g8eVar.d(16);
                            int d12 = g8eVar.d(16);
                            int d13 = g8eVar.d(3);
                            int d14 = g8eVar.d(3);
                            g8eVar.m(2);
                            int d15 = g8eVar.d(8);
                            int d16 = g8eVar.d(8);
                            int d17 = g8eVar.d(4);
                            int d18 = g8eVar.d(2);
                            g8eVar.m(2);
                            int i12 = d5 - 10;
                            SparseArray sparseArray4 = new SparseArray();
                            while (i12 > 0) {
                                int d19 = g8eVar.d(16);
                                int d20 = g8eVar.d(2);
                                int d21 = g8eVar.d(2);
                                int d22 = g8eVar.d(12);
                                g8eVar.m(4);
                                int d23 = g8eVar.d(12);
                                int i13 = i12 - 6;
                                if (d20 != 1) {
                                    if (d20 == 2) {
                                        d20 = 2;
                                    } else {
                                        i6 = d20;
                                        i12 = i13;
                                        d = 0;
                                        d2 = 0;
                                        sparseArray4.put(d19, new k5a(i6, d21, d22, d23, d, d2));
                                    }
                                }
                                i12 -= 8;
                                i6 = d20;
                                d = g8eVar.d(8);
                                d2 = g8eVar.d(8);
                                sparseArray4.put(d19, new k5a(i6, d21, d22, d23, d, d2));
                            }
                            j5a j5aVar2 = new j5a(d10, o, d11, d12, d13, d14, d15, d16, d17, d18, sparseArray4);
                            if (a5aVar3.b == 0 && (j5aVar = (j5a) l5aVar.c.get(j5aVar2.a)) != null) {
                                int i14 = 0;
                                while (true) {
                                    SparseArray sparseArray5 = j5aVar.j;
                                    if (i14 < sparseArray5.size()) {
                                        j5aVar2.j.put(sparseArray5.keyAt(i14), (k5a) sparseArray5.valueAt(i14));
                                        i14++;
                                    }
                                }
                            }
                            l5aVar.c.put(j5aVar2.a, j5aVar2);
                            break;
                        }
                        break;
                    case 18:
                        if (d4 == l5aVar.a) {
                            x4a c3 = c(g8eVar, d5);
                            l5aVar.d.put(c3.a, c3);
                            break;
                        } else if (d4 == l5aVar.b) {
                            x4a c4 = c(g8eVar, d5);
                            l5aVar.f.put(c4.a, c4);
                            break;
                        }
                        break;
                    case 19:
                        if (d4 == l5aVar.a) {
                            z4a d24 = d(g8eVar);
                            l5aVar.e.put(d24.a, d24);
                            break;
                        } else if (d4 == l5aVar.b) {
                            z4a d25 = d(g8eVar);
                            l5aVar.g.put(d25.a, d25);
                            break;
                        }
                        break;
                    case 20:
                        if (d4 == l5aVar.a) {
                            g8eVar.m(4);
                            boolean o2 = g8eVar.o();
                            g8eVar.m(3);
                            int d26 = g8eVar.d(16);
                            int d27 = g8eVar.d(16);
                            if (o2) {
                                int d28 = g8eVar.d(16);
                                i7 = g8eVar.d(16);
                                i10 = g8eVar.d(16);
                                i8 = g8eVar.d(16);
                                i9 = d28;
                            } else {
                                i7 = d26;
                                i8 = d27;
                                i9 = 0;
                                i10 = 0;
                            }
                            l5aVar.h = new y4a(d26, d27, i9, i7, i10, i8);
                            break;
                        }
                        break;
                }
                g8eVar.n(b - g8eVar.b());
            }
        }
        l5a l5aVar2 = this.f;
        a5a a5aVar4 = l5aVar2.i;
        if (a5aVar4 == null) {
            m4aVar = new m4a(zzgaa.t(), -9223372036854775807L, -9223372036854775807L);
        } else {
            y4a y4aVar = l5aVar2.h;
            if (y4aVar == null) {
                y4aVar = this.d;
            }
            Bitmap bitmap = this.g;
            if (bitmap == null || y4aVar.a + 1 != bitmap.getWidth() || y4aVar.b + 1 != this.g.getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(y4aVar.a + 1, y4aVar.b + 1, Bitmap.Config.ARGB_8888);
                this.g = createBitmap;
                this.c.setBitmap(createBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray6 = a5aVar4.c;
            int i15 = 0;
            while (i15 < sparseArray6.size()) {
                this.c.save();
                b5a b5aVar = (b5a) sparseArray6.valueAt(i15);
                j5a j5aVar3 = (j5a) this.f.c.get(sparseArray6.keyAt(i15));
                int i16 = b5aVar.a + y4aVar.c;
                int i17 = b5aVar.b + y4aVar.e;
                this.c.clipRect(i16, i17, Math.min(j5aVar3.c + i16, y4aVar.d), Math.min(j5aVar3.d + i17, y4aVar.f));
                x4a x4aVar = (x4a) this.f.d.get(j5aVar3.f);
                if (x4aVar == null) {
                    x4aVar = (x4a) this.f.f.get(j5aVar3.f);
                    if (x4aVar == null) {
                        x4aVar = this.e;
                    }
                }
                SparseArray sparseArray7 = j5aVar3.j;
                int i18 = 0;
                while (i18 < sparseArray7.size()) {
                    int keyAt = sparseArray7.keyAt(i18);
                    k5a k5aVar = (k5a) sparseArray7.valueAt(i18);
                    z4a z4aVar = (z4a) this.f.e.get(keyAt);
                    if (z4aVar == null) {
                        z4aVar = (z4a) this.f.g.get(keyAt);
                    }
                    if (z4aVar != null) {
                        Paint paint = z4aVar.b ? null : this.a;
                        int i19 = j5aVar3.e;
                        int i20 = k5aVar.a + i16;
                        int i21 = k5aVar.b + i17;
                        sparseArray = sparseArray6;
                        Canvas canvas = this.c;
                        sparseArray2 = sparseArray7;
                        i5 = i15;
                        int[] iArr = i19 == 3 ? x4aVar.d : i19 == 2 ? x4aVar.c : x4aVar.b;
                        Paint paint2 = paint;
                        e(z4aVar.c, iArr, i19, i20, i21, paint2, canvas);
                        e(z4aVar.d, iArr, i19, i20, i21 + 1, paint2, canvas);
                    } else {
                        sparseArray = sparseArray6;
                        i5 = i15;
                        sparseArray2 = sparseArray7;
                    }
                    i18++;
                    sparseArray6 = sparseArray;
                    sparseArray7 = sparseArray2;
                    i15 = i5;
                }
                SparseArray sparseArray8 = sparseArray6;
                int i22 = i15;
                float f = i17;
                float f2 = i16;
                if (j5aVar3.b) {
                    int i23 = j5aVar3.e;
                    c = 3;
                    if (i23 == 3) {
                        i4 = x4aVar.d[j5aVar3.g];
                        c2 = 2;
                    } else {
                        c2 = 2;
                        i4 = i23 == 2 ? x4aVar.c[j5aVar3.h] : x4aVar.b[j5aVar3.i];
                    }
                    this.b.setColor(i4);
                    this.c.drawRect(f2, f, j5aVar3.c + i16, j5aVar3.d + i17, this.b);
                } else {
                    c = 3;
                    c2 = 2;
                }
                zzc zzcVar = new zzc();
                zzcVar.c(Bitmap.createBitmap(this.g, i16, i17, j5aVar3.c, j5aVar3.d));
                zzcVar.h(f2 / y4aVar.a);
                zzcVar.i(0);
                zzcVar.e(f / y4aVar.b, 0);
                zzcVar.f(0);
                zzcVar.k(j5aVar3.c / y4aVar.a);
                zzcVar.d(j5aVar3.d / y4aVar.b);
                arrayList.add(zzcVar.p());
                this.c.drawColor(0, PorterDuff.Mode.CLEAR);
                this.c.restore();
                i15 = i22 + 1;
                sparseArray6 = sparseArray8;
            }
            m4aVar = new m4a(arrayList, -9223372036854775807L, -9223372036854775807L);
        }
        pgdVar.zza(m4aVar);
    }
}
