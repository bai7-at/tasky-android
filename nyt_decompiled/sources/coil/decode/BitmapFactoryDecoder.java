package coil.decode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import coil.ImageLoader;
import defpackage.a72;
import defpackage.ad0;
import defpackage.au7;
import defpackage.b07;
import defpackage.b72;
import defpackage.dg4;
import defpackage.gm0;
import defpackage.op2;
import defpackage.px7;
import defpackage.q;
import defpackage.s;
import defpackage.sc1;
import defpackage.sd0;
import defpackage.sx7;
import defpackage.tc1;
import defpackage.u62;
import defpackage.uc1;
import defpackage.uk5;
import defpackage.uo6;
import defpackage.wd5;
import defpackage.yg3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreKt;

/* loaded from: classes.dex */
public final class BitmapFactoryDecoder implements uc1 {
    public static final a e = new a(null);
    private final yg3 a;
    private final uk5 b;
    private final Semaphore c;
    private final ExifOrientationPolicy d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private static final class b extends op2 {
        private Exception a;

        public b(px7 px7Var) {
            super(px7Var);
        }

        public final Exception a() {
            return this.a;
        }

        @Override // defpackage.op2, defpackage.px7
        public long read(ad0 ad0Var, long j) {
            try {
                return super.read(ad0Var, j);
            } catch (Exception e) {
                this.a = e;
                throw e;
            }
        }
    }

    public static final class c implements uc1.a {
        private final ExifOrientationPolicy a;
        private final Semaphore b;

        public c(int i, ExifOrientationPolicy exifOrientationPolicy) {
            this.a = exifOrientationPolicy;
            this.b = SemaphoreKt.Semaphore$default(i, 0, 2, null);
        }

        @Override // uc1.a
        public uc1 a(sx7 sx7Var, uk5 uk5Var, ImageLoader imageLoader) {
            return new BitmapFactoryDecoder(sx7Var.c(), uk5Var, this.b, this.a);
        }

        public boolean equals(Object obj) {
            return obj instanceof c;
        }

        public int hashCode() {
            return c.class.hashCode();
        }
    }

    public BitmapFactoryDecoder(yg3 yg3Var, uk5 uk5Var, Semaphore semaphore, ExifOrientationPolicy exifOrientationPolicy) {
        this.a = yg3Var;
        this.b = uk5Var;
        this.c = semaphore;
        this.d = exifOrientationPolicy;
    }

    private final void c(BitmapFactory.Options options, u62 u62Var) {
        Bitmap.Config f = this.b.f();
        if (u62Var.b() || b72.a(u62Var)) {
            f = defpackage.a.e(f);
        }
        if (this.b.d() && f == Bitmap.Config.ARGB_8888 && zq3.c(options.outMimeType, "image/jpeg")) {
            f = Bitmap.Config.RGB_565;
        }
        Bitmap.Config config = options.outConfig;
        Bitmap.Config config2 = Bitmap.Config.RGBA_F16;
        if (config == config2 && f != Bitmap.Config.HARDWARE) {
            f = config2;
        }
        options.inPreferredConfig = f;
    }

    private final void d(BitmapFactory.Options options, u62 u62Var) {
        yg3.a a2 = this.a.a();
        if ((a2 instanceof b07) && q.a(this.b.o())) {
            options.inSampleSize = 1;
            options.inScaled = true;
            options.inDensity = ((b07) a2).a();
            options.inTargetDensity = this.b.g().getResources().getDisplayMetrics().densityDpi;
            return;
        }
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            options.inSampleSize = 1;
            options.inScaled = false;
            return;
        }
        int i = b72.b(u62Var) ? options.outHeight : options.outWidth;
        int i2 = b72.b(u62Var) ? options.outWidth : options.outHeight;
        au7 o = this.b.o();
        int z = q.a(o) ? i : s.z(o.d(), this.b.n());
        au7 o2 = this.b.o();
        int z2 = q.a(o2) ? i2 : s.z(o2.c(), this.b.n());
        int a3 = tc1.a(i, i2, z, z2, this.b.n());
        options.inSampleSize = a3;
        double b2 = tc1.b(i / a3, i2 / a3, z, z2, this.b.n());
        if (this.b.c()) {
            b2 = uo6.g(b2, 1.0d);
        }
        boolean z3 = b2 == 1.0d;
        options.inScaled = !z3;
        if (z3) {
            return;
        }
        if (b2 > 1.0d) {
            options.inDensity = dg4.c(Integer.MAX_VALUE / b2);
            options.inTargetDensity = Integer.MAX_VALUE;
        } else {
            options.inDensity = Integer.MAX_VALUE;
            options.inTargetDensity = dg4.c(Integer.MAX_VALUE * b2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final sc1 e(BitmapFactory.Options options) {
        b bVar = new b(this.a.b());
        sd0 d = wd5.d(bVar);
        boolean z = true;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(d.peek().t1(), null, options);
        Exception a2 = bVar.a();
        if (a2 != null) {
            throw a2;
        }
        options.inJustDecodeBounds = false;
        a72 a72Var = a72.a;
        u62 a3 = a72Var.a(options.outMimeType, d, this.d);
        Exception a4 = bVar.a();
        if (a4 != null) {
            throw a4;
        }
        options.inMutable = false;
        if (this.b.e() != null) {
            options.inPreferredColorSpace = this.b.e();
        }
        options.inPremultiplied = this.b.m();
        c(options, a3);
        d(options, a3);
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(d.t1(), null, options);
            gm0.a(d, null);
            Exception a5 = bVar.a();
            if (a5 != null) {
                throw a5;
            }
            if (decodeStream == null) {
                throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
            }
            decodeStream.setDensity(this.b.g().getResources().getDisplayMetrics().densityDpi);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.b.g().getResources(), a72Var.b(decodeStream, a3));
            if (options.inSampleSize <= 1 && !options.inScaled) {
                z = false;
            }
            return new sc1(bitmapDrawable, z);
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.uc1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(defpackage.by0 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof coil.decode.BitmapFactoryDecoder$decode$1
            if (r0 == 0) goto L13
            r0 = r7
            coil.decode.BitmapFactoryDecoder$decode$1 r0 = (coil.decode.BitmapFactoryDecoder$decode$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            coil.decode.BitmapFactoryDecoder$decode$1 r0 = new coil.decode.BitmapFactoryDecoder$decode$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.sync.Semaphore r6 = (kotlinx.coroutines.sync.Semaphore) r6
            kotlin.f.b(r7)     // Catch: java.lang.Throwable -> L30
            goto L70
        L30:
            r7 = move-exception
            goto L7a
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.sync.Semaphore r6 = (kotlinx.coroutines.sync.Semaphore) r6
            java.lang.Object r2 = r0.L$0
            coil.decode.BitmapFactoryDecoder r2 = (coil.decode.BitmapFactoryDecoder) r2
            kotlin.f.b(r7)
            r7 = r6
            r6 = r2
            goto L5a
        L48:
            kotlin.f.b(r7)
            kotlinx.coroutines.sync.Semaphore r7 = r6.c
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r2 = r7.acquire(r0)
            if (r2 != r1) goto L5a
            return r1
        L5a:
            coil.decode.BitmapFactoryDecoder$decode$2$1 r2 = new coil.decode.BitmapFactoryDecoder$decode$2$1     // Catch: java.lang.Throwable -> L76
            r2.<init>()     // Catch: java.lang.Throwable -> L76
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L76
            r6 = 0
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L76
            r0.label = r3     // Catch: java.lang.Throwable -> L76
            java.lang.Object r6 = kotlinx.coroutines.InterruptibleKt.runInterruptible$default(r6, r2, r0, r4, r6)     // Catch: java.lang.Throwable -> L76
            if (r6 != r1) goto L6d
            return r1
        L6d:
            r5 = r7
            r7 = r6
            r6 = r5
        L70:
            sc1 r7 = (defpackage.sc1) r7     // Catch: java.lang.Throwable -> L30
            r6.release()
            return r7
        L76:
            r6 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L7a:
            r6.release()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.decode.BitmapFactoryDecoder.a(by0):java.lang.Object");
    }
}
