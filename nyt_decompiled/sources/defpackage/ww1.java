package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.y31;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
final class ww1 {
    private static final byte[] h = {0, 7, 8, 15};
    private static final byte[] i = {0, 119, -120, -1};
    private static final byte[] j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final Paint a;
    private final Paint b;
    private final Canvas c;
    private final b d;
    private final a e;
    private final h f;
    private Bitmap g;

    private static final class a {
        public final int a;
        public final int[] b;
        public final int[] c;
        public final int[] d;

        public a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.a = i;
            this.b = iArr;
            this.c = iArr2;
            this.d = iArr3;
        }
    }

    private static final class b {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        public b(int i, int i2, int i3, int i4, int i5, int i6) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
        }
    }

    private static final class c {
        public final int a;
        public final boolean b;
        public final byte[] c;
        public final byte[] d;

        public c(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.a = i;
            this.b = z;
            this.c = bArr;
            this.d = bArr2;
        }
    }

    private static final class d {
        public final int a;
        public final int b;
        public final int c;
        public final SparseArray d;

        public d(int i, int i2, int i3, SparseArray sparseArray) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = sparseArray;
        }
    }

    private static final class e {
        public final int a;
        public final int b;

        public e(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    private static final class f {
        public final int a;
        public final boolean b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final int j;
        public final SparseArray k;

        public f(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, SparseArray sparseArray) {
            this.a = i;
            this.b = z;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.g = i6;
            this.h = i7;
            this.i = i8;
            this.j = i9;
            this.k = sparseArray;
        }

        public void a(f fVar) {
            SparseArray sparseArray = fVar.k;
            for (int i = 0; i < sparseArray.size(); i++) {
                this.k.put(sparseArray.keyAt(i), (g) sparseArray.valueAt(i));
            }
        }
    }

    private static final class g {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        public g(int i, int i2, int i3, int i4, int i5, int i6) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
        }
    }

    private static final class h {
        public final int a;
        public final int b;
        public final SparseArray c = new SparseArray();
        public final SparseArray d = new SparseArray();
        public final SparseArray e = new SparseArray();
        public final SparseArray f = new SparseArray();
        public final SparseArray g = new SparseArray();
        public b h;
        public d i;

        public h(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public void a() {
            this.c.clear();
            this.d.clear();
            this.e.clear();
            this.f.clear();
            this.g.clear();
            this.h = null;
            this.i = null;
        }
    }

    public ww1(int i2, int i3) {
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
        this.d = new b(719, 575, 0, 719, 0, 575);
        this.e = new a(0, c(), d(), e());
        this.f = new h(i2, i3);
    }

    private static byte[] a(int i2, int i3, xo5 xo5Var) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) xo5Var.h(i3);
        }
        return bArr;
    }

    private static int[] c() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] d() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            if (i2 < 8) {
                iArr[i2] = f(255, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i2] = f(255, (i2 & 1) != 0 ? 127 : 0, (i2 & 2) != 0 ? 127 : 0, (i2 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] e() {
        int[] iArr = new int[JceEncryptionConstants.SYMMETRIC_KEY_LENGTH];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (i2 < 8) {
                iArr[i2] = f(63, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) == 0 ? 0 : 255);
            } else {
                int i3 = i2 & 136;
                if (i3 == 0) {
                    iArr[i2] = f(255, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 8) {
                    iArr[i2] = f(127, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 128) {
                    iArr[i2] = f(255, ((i2 & 1) != 0 ? 43 : 0) + 127 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + 127 + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i3 == 136) {
                    iArr[i2] = f(255, ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static int f(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    private static int g(xo5 xo5Var, int[] iArr, byte[] bArr, int i2, int i3, Paint paint, Canvas canvas) {
        boolean z;
        int i4;
        int h2;
        int h3;
        int i5 = i2;
        boolean z2 = false;
        while (true) {
            int h4 = xo5Var.h(2);
            if (h4 != 0) {
                z = z2;
                i4 = 1;
            } else {
                if (xo5Var.g()) {
                    h2 = xo5Var.h(3) + 3;
                    h3 = xo5Var.h(2);
                } else {
                    if (xo5Var.g()) {
                        z = z2;
                        i4 = 1;
                    } else {
                        int h5 = xo5Var.h(2);
                        if (h5 == 0) {
                            z = true;
                        } else if (h5 == 1) {
                            z = z2;
                            i4 = 2;
                        } else if (h5 == 2) {
                            h2 = xo5Var.h(4) + 12;
                            h3 = xo5Var.h(2);
                        } else if (h5 != 3) {
                            z = z2;
                        } else {
                            h2 = xo5Var.h(8) + 29;
                            h3 = xo5Var.h(2);
                        }
                        h4 = 0;
                        i4 = 0;
                    }
                    h4 = 0;
                }
                z = z2;
                i4 = h2;
                h4 = h3;
            }
            if (i4 != 0 && paint != null) {
                if (bArr != null) {
                    h4 = bArr[h4];
                }
                paint.setColor(iArr[h4]);
                canvas.drawRect(i5, i3, i5 + i4, i3 + 1, paint);
            }
            i5 += i4;
            if (z) {
                return i5;
            }
            z2 = z;
        }
    }

    private static int h(xo5 xo5Var, int[] iArr, byte[] bArr, int i2, int i3, Paint paint, Canvas canvas) {
        boolean z;
        int i4;
        int h2;
        int h3;
        int i5 = i2;
        boolean z2 = false;
        while (true) {
            int h4 = xo5Var.h(4);
            if (h4 != 0) {
                z = z2;
                i4 = 1;
            } else if (xo5Var.g()) {
                if (xo5Var.g()) {
                    int h5 = xo5Var.h(2);
                    if (h5 == 0) {
                        z = z2;
                        i4 = 1;
                    } else if (h5 == 1) {
                        z = z2;
                        i4 = 2;
                    } else if (h5 == 2) {
                        h2 = xo5Var.h(4) + 9;
                        h3 = xo5Var.h(4);
                    } else if (h5 != 3) {
                        z = z2;
                        h4 = 0;
                        i4 = 0;
                    } else {
                        h2 = xo5Var.h(8) + 25;
                        h3 = xo5Var.h(4);
                    }
                    h4 = 0;
                } else {
                    h2 = xo5Var.h(2) + 4;
                    h3 = xo5Var.h(4);
                }
                z = z2;
                i4 = h2;
                h4 = h3;
            } else {
                int h6 = xo5Var.h(3);
                if (h6 != 0) {
                    z = z2;
                    i4 = h6 + 2;
                    h4 = 0;
                } else {
                    z = true;
                    h4 = 0;
                    i4 = 0;
                }
            }
            if (i4 != 0 && paint != null) {
                if (bArr != null) {
                    h4 = bArr[h4];
                }
                paint.setColor(iArr[h4]);
                canvas.drawRect(i5, i3, i5 + i4, i3 + 1, paint);
            }
            i5 += i4;
            if (z) {
                return i5;
            }
            z2 = z;
        }
    }

    private static int i(xo5 xo5Var, int[] iArr, byte[] bArr, int i2, int i3, Paint paint, Canvas canvas) {
        boolean z;
        int h2;
        int i4 = i2;
        boolean z2 = false;
        while (true) {
            int h3 = xo5Var.h(8);
            if (h3 != 0) {
                z = z2;
                h2 = 1;
            } else if (xo5Var.g()) {
                z = z2;
                h2 = xo5Var.h(7);
                h3 = xo5Var.h(8);
            } else {
                int h4 = xo5Var.h(7);
                if (h4 != 0) {
                    z = z2;
                    h2 = h4;
                    h3 = 0;
                } else {
                    z = true;
                    h3 = 0;
                    h2 = 0;
                }
            }
            if (h2 != 0 && paint != null) {
                if (bArr != null) {
                    h3 = bArr[h3];
                }
                paint.setColor(iArr[h3]);
                canvas.drawRect(i4, i3, i4 + h2, i3 + 1, paint);
            }
            i4 += h2;
            if (z) {
                return i4;
            }
            z2 = z;
        }
    }

    private static void j(byte[] bArr, int[] iArr, int i2, int i3, int i4, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        xo5 xo5Var = new xo5(bArr);
        int i5 = i3;
        int i6 = i4;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        while (xo5Var.b() != 0) {
            int h2 = xo5Var.h(8);
            if (h2 != 240) {
                switch (h2) {
                    case 16:
                        if (i2 != 3) {
                            if (i2 != 2) {
                                bArr2 = null;
                                i5 = g(xo5Var, iArr, bArr2, i5, i6, paint, canvas);
                                xo5Var.c();
                                break;
                            } else {
                                bArr3 = bArr7 == null ? h : bArr7;
                            }
                        } else {
                            bArr3 = bArr5 == null ? i : bArr5;
                        }
                        bArr2 = bArr3;
                        i5 = g(xo5Var, iArr, bArr2, i5, i6, paint, canvas);
                        xo5Var.c();
                    case 17:
                        if (i2 == 3) {
                            bArr4 = bArr6 == null ? j : bArr6;
                        } else {
                            bArr4 = null;
                        }
                        i5 = h(xo5Var, iArr, bArr4, i5, i6, paint, canvas);
                        xo5Var.c();
                        break;
                    case 18:
                        i5 = i(xo5Var, iArr, null, i5, i6, paint, canvas);
                        break;
                    default:
                        switch (h2) {
                            case 32:
                                bArr7 = a(4, 4, xo5Var);
                                break;
                            case 33:
                                bArr5 = a(4, 8, xo5Var);
                                break;
                            case 34:
                                bArr6 = a(16, 8, xo5Var);
                                break;
                        }
                }
            } else {
                i6 += 2;
                i5 = i3;
            }
        }
    }

    private static void k(c cVar, a aVar, int i2, int i3, int i4, Paint paint, Canvas canvas) {
        int[] iArr = i2 == 3 ? aVar.d : i2 == 2 ? aVar.c : aVar.b;
        j(cVar.c, iArr, i2, i3, i4, paint, canvas);
        j(cVar.d, iArr, i2, i3, i4 + 1, paint, canvas);
    }

    private static a l(xo5 xo5Var, int i2) {
        int h2;
        int i3;
        int h3;
        int i4;
        int i5;
        int i6 = 8;
        int h4 = xo5Var.h(8);
        xo5Var.r(8);
        int i7 = 2;
        int i8 = i2 - 2;
        int[] c2 = c();
        int[] d2 = d();
        int[] e2 = e();
        while (i8 > 0) {
            int h5 = xo5Var.h(i6);
            int h6 = xo5Var.h(i6);
            int[] iArr = (h6 & 128) != 0 ? c2 : (h6 & 64) != 0 ? d2 : e2;
            if ((h6 & 1) != 0) {
                i4 = xo5Var.h(i6);
                i5 = xo5Var.h(i6);
                h2 = xo5Var.h(i6);
                h3 = xo5Var.h(i6);
                i3 = i8 - 6;
            } else {
                int h7 = xo5Var.h(6) << i7;
                int h8 = xo5Var.h(4) << 4;
                h2 = xo5Var.h(4) << 4;
                i3 = i8 - 4;
                h3 = xo5Var.h(i7) << 6;
                i4 = h7;
                i5 = h8;
            }
            if (i4 == 0) {
                h3 = 255;
                i5 = 0;
                h2 = 0;
            }
            double d3 = i4;
            double d4 = i5 - 128;
            double d5 = h2 - 128;
            iArr[h5] = f((byte) (255 - (h3 & 255)), z19.q((int) (d3 + (1.402d * d4)), 0, 255), z19.q((int) ((d3 - (0.34414d * d5)) - (d4 * 0.71414d)), 0, 255), z19.q((int) (d3 + (d5 * 1.772d)), 0, 255));
            i8 = i3;
            h4 = h4;
            i6 = 8;
            i7 = 2;
        }
        return new a(h4, c2, d2, e2);
    }

    private static b m(xo5 xo5Var) {
        int i2;
        int i3;
        int i4;
        int i5;
        xo5Var.r(4);
        boolean g2 = xo5Var.g();
        xo5Var.r(3);
        int h2 = xo5Var.h(16);
        int h3 = xo5Var.h(16);
        if (g2) {
            int h4 = xo5Var.h(16);
            int h5 = xo5Var.h(16);
            int h6 = xo5Var.h(16);
            i5 = xo5Var.h(16);
            i4 = h5;
            i3 = h6;
            i2 = h4;
        } else {
            i2 = 0;
            i3 = 0;
            i4 = h2;
            i5 = h3;
        }
        return new b(h2, h3, i2, i4, i3, i5);
    }

    private static c n(xo5 xo5Var) {
        byte[] bArr;
        int h2 = xo5Var.h(16);
        xo5Var.r(4);
        int h3 = xo5Var.h(2);
        boolean g2 = xo5Var.g();
        xo5Var.r(1);
        byte[] bArr2 = z19.f;
        if (h3 == 1) {
            xo5Var.r(xo5Var.h(8) * 16);
        } else if (h3 == 0) {
            int h4 = xo5Var.h(16);
            int h5 = xo5Var.h(16);
            if (h4 > 0) {
                bArr2 = new byte[h4];
                xo5Var.k(bArr2, 0, h4);
            }
            if (h5 > 0) {
                bArr = new byte[h5];
                xo5Var.k(bArr, 0, h5);
                return new c(h2, g2, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(h2, g2, bArr2, bArr);
    }

    private static d o(xo5 xo5Var, int i2) {
        int h2 = xo5Var.h(8);
        int h3 = xo5Var.h(4);
        int h4 = xo5Var.h(2);
        xo5Var.r(2);
        int i3 = i2 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i3 > 0) {
            int h5 = xo5Var.h(8);
            xo5Var.r(8);
            i3 -= 6;
            sparseArray.put(h5, new e(xo5Var.h(16), xo5Var.h(16)));
        }
        return new d(h2, h3, h4, sparseArray);
    }

    private static f p(xo5 xo5Var, int i2) {
        int i3;
        int i4;
        int i5;
        int h2 = xo5Var.h(8);
        xo5Var.r(4);
        boolean g2 = xo5Var.g();
        xo5Var.r(3);
        int i6 = 16;
        int h3 = xo5Var.h(16);
        int h4 = xo5Var.h(16);
        int h5 = xo5Var.h(3);
        int h6 = xo5Var.h(3);
        int i7 = 2;
        xo5Var.r(2);
        int h7 = xo5Var.h(8);
        int h8 = xo5Var.h(8);
        int h9 = xo5Var.h(4);
        int h10 = xo5Var.h(2);
        xo5Var.r(2);
        int i8 = i2 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i8 > 0) {
            int h11 = xo5Var.h(i6);
            int h12 = xo5Var.h(i7);
            int h13 = xo5Var.h(i7);
            int h14 = xo5Var.h(12);
            int i9 = h10;
            xo5Var.r(4);
            int h15 = xo5Var.h(12);
            int i10 = i8 - 6;
            if (h12 != 1) {
                i3 = 2;
                if (h12 != 2) {
                    i5 = 0;
                    i4 = 0;
                    i8 = i10;
                    sparseArray.put(h11, new g(h12, h13, h14, h15, i5, i4));
                    i7 = i3;
                    h10 = i9;
                    i6 = 16;
                }
            } else {
                i3 = 2;
            }
            i8 -= 8;
            i5 = xo5Var.h(8);
            i4 = xo5Var.h(8);
            sparseArray.put(h11, new g(h12, h13, h14, h15, i5, i4));
            i7 = i3;
            h10 = i9;
            i6 = 16;
        }
        return new f(h2, g2, h3, h4, h5, h6, h7, h8, h9, h10, sparseArray);
    }

    private static void q(xo5 xo5Var, h hVar) {
        f fVar;
        int h2 = xo5Var.h(8);
        int h3 = xo5Var.h(16);
        int h4 = xo5Var.h(16);
        int d2 = xo5Var.d() + h4;
        if (h4 * 8 > xo5Var.b()) {
            a84.j("DvbParser", "Data field length exceeds limit");
            xo5Var.r(xo5Var.b());
            return;
        }
        switch (h2) {
            case 16:
                if (h3 == hVar.a) {
                    d dVar = hVar.i;
                    d o = o(xo5Var, h4);
                    if (o.c == 0) {
                        if (dVar != null && dVar.b != o.b) {
                            hVar.i = o;
                            break;
                        }
                    } else {
                        hVar.i = o;
                        hVar.c.clear();
                        hVar.d.clear();
                        hVar.e.clear();
                        break;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.i;
                if (h3 == hVar.a && dVar2 != null) {
                    f p = p(xo5Var, h4);
                    if (dVar2.c == 0 && (fVar = (f) hVar.c.get(p.a)) != null) {
                        p.a(fVar);
                    }
                    hVar.c.put(p.a, p);
                    break;
                }
                break;
            case 18:
                if (h3 != hVar.a) {
                    if (h3 == hVar.b) {
                        a l = l(xo5Var, h4);
                        hVar.f.put(l.a, l);
                        break;
                    }
                } else {
                    a l2 = l(xo5Var, h4);
                    hVar.d.put(l2.a, l2);
                    break;
                }
                break;
            case 19:
                if (h3 != hVar.a) {
                    if (h3 == hVar.b) {
                        c n = n(xo5Var);
                        hVar.g.put(n.a, n);
                        break;
                    }
                } else {
                    c n2 = n(xo5Var);
                    hVar.e.put(n2.a, n2);
                    break;
                }
                break;
            case 20:
                if (h3 == hVar.a) {
                    hVar.h = m(xo5Var);
                    break;
                }
                break;
        }
        xo5Var.s(d2 - xo5Var.d());
    }

    public List b(byte[] bArr, int i2) {
        int i3;
        SparseArray sparseArray;
        xo5 xo5Var = new xo5(bArr, i2);
        while (xo5Var.b() >= 48 && xo5Var.h(8) == 15) {
            q(xo5Var, this.f);
        }
        h hVar = this.f;
        d dVar = hVar.i;
        if (dVar == null) {
            return Collections.emptyList();
        }
        b bVar = hVar.h;
        if (bVar == null) {
            bVar = this.d;
        }
        Bitmap bitmap = this.g;
        if (bitmap == null || bVar.a + 1 != bitmap.getWidth() || bVar.b + 1 != this.g.getHeight()) {
            Bitmap createBitmap = Bitmap.createBitmap(bVar.a + 1, bVar.b + 1, Bitmap.Config.ARGB_8888);
            this.g = createBitmap;
            this.c.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray2 = dVar.d;
        for (int i4 = 0; i4 < sparseArray2.size(); i4++) {
            this.c.save();
            e eVar = (e) sparseArray2.valueAt(i4);
            f fVar = (f) this.f.c.get(sparseArray2.keyAt(i4));
            int i5 = eVar.a + bVar.c;
            int i6 = eVar.b + bVar.e;
            this.c.clipRect(i5, i6, Math.min(fVar.c + i5, bVar.d), Math.min(fVar.d + i6, bVar.f));
            a aVar = (a) this.f.d.get(fVar.g);
            if (aVar == null && (aVar = (a) this.f.f.get(fVar.g)) == null) {
                aVar = this.e;
            }
            SparseArray sparseArray3 = fVar.k;
            int i7 = 0;
            while (i7 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i7);
                g gVar = (g) sparseArray3.valueAt(i7);
                c cVar = (c) this.f.e.get(keyAt);
                c cVar2 = cVar == null ? (c) this.f.g.get(keyAt) : cVar;
                if (cVar2 != null) {
                    i3 = i7;
                    sparseArray = sparseArray3;
                    k(cVar2, aVar, fVar.f, gVar.c + i5, i6 + gVar.d, cVar2.b ? null : this.a, this.c);
                } else {
                    i3 = i7;
                    sparseArray = sparseArray3;
                }
                i7 = i3 + 1;
                sparseArray3 = sparseArray;
            }
            if (fVar.b) {
                int i8 = fVar.f;
                this.b.setColor(i8 == 3 ? aVar.d[fVar.h] : i8 == 2 ? aVar.c[fVar.i] : aVar.b[fVar.j]);
                this.c.drawRect(i5, i6, fVar.c + i5, fVar.d + i6, this.b);
            }
            arrayList.add(new y31.b().f(Bitmap.createBitmap(this.g, i5, i6, fVar.c, fVar.d)).k(i5 / bVar.a).l(0).h(i6 / bVar.b, 0).i(0).n(fVar.c / bVar.a).g(fVar.d / bVar.b).a());
            this.c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.c.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void r() {
        this.f.a();
    }
}
