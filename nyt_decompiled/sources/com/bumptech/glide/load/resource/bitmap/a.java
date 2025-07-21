package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.resource.bitmap.c;
import com.chartbeat.androidsdk.QueryKeys;
import defpackage.b94;
import defpackage.cz6;
import defpackage.mk5;
import defpackage.sk5;
import defpackage.so5;
import defpackage.to;
import defpackage.w80;
import defpackage.x19;
import defpackage.y80;
import defpackage.z06;
import defpackage.zq8;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* loaded from: classes2.dex */
public final class a {
    public static final mk5 f = mk5.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", DecodeFormat.DEFAULT);
    public static final mk5 g = mk5.f("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", PreferredColorSpace.SRGB);
    public static final mk5 h = DownsampleStrategy.h;
    public static final mk5 i;
    public static final mk5 j;
    private static final Set k;
    private static final b l;
    private static final Set m;
    private static final Queue n;
    private final w80 a;
    private final DisplayMetrics b;
    private final to c;
    private final List d;
    private final com.bumptech.glide.load.resource.bitmap.b e = com.bumptech.glide.load.resource.bitmap.b.a();

    /* renamed from: com.bumptech.glide.load.resource.bitmap.a$a, reason: collision with other inner class name */
    class C0151a implements b {
        C0151a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.a.b
        public void a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.a.b
        public void b(w80 w80Var, Bitmap bitmap) {
        }
    }

    public interface b {
        void a();

        void b(w80 w80Var, Bitmap bitmap);
    }

    static {
        Boolean bool = Boolean.FALSE;
        i = mk5.f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        j = mk5.f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        k = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        l = new C0151a();
        m = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        n = x19.e(0);
    }

    public a(List list, DisplayMetrics displayMetrics, w80 w80Var, to toVar) {
        this.d = list;
        this.b = (DisplayMetrics) z06.d(displayMetrics);
        this.a = (w80) z06.d(w80Var);
        this.c = (to) z06.d(toVar);
    }

    private static int a(double d) {
        return x((d / (r1 / r0)) * x(l(d) * d));
    }

    private void b(c cVar, DecodeFormat decodeFormat, boolean z, boolean z2, BitmapFactory.Options options, int i2, int i3) {
        boolean z3;
        if (this.e.e(i2, i3, options, z, z2)) {
            return;
        }
        if (decodeFormat == DecodeFormat.PREFER_ARGB_8888) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return;
        }
        try {
            z3 = cVar.d().hasAlpha();
        } catch (IOException e) {
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + decodeFormat, e);
            }
            z3 = false;
        }
        Bitmap.Config config = z3 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        options.inPreferredConfig = config;
        if (config == Bitmap.Config.RGB_565) {
            options.inDither = true;
        }
    }

    private static void c(ImageHeaderParser.ImageType imageType, c cVar, b bVar, w80 w80Var, DownsampleStrategy downsampleStrategy, int i2, int i3, int i4, int i5, int i6, BitmapFactory.Options options) {
        int i7;
        int i8;
        int floor;
        int floor2;
        if (i3 <= 0 || i4 <= 0) {
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Unable to determine dimensions for: " + imageType + " with target [" + i5 + QueryKeys.SCROLL_POSITION_TOP + i6 + "]");
                return;
            }
            return;
        }
        if (r(i2)) {
            i8 = i3;
            i7 = i4;
        } else {
            i7 = i3;
            i8 = i4;
        }
        float b2 = downsampleStrategy.b(i7, i8, i5, i6);
        if (b2 <= 0.0f) {
            throw new IllegalArgumentException("Cannot scale with factor: " + b2 + " from: " + downsampleStrategy + ", source: [" + i3 + QueryKeys.SCROLL_POSITION_TOP + i4 + "], target: [" + i5 + QueryKeys.SCROLL_POSITION_TOP + i6 + "]");
        }
        DownsampleStrategy.SampleSizeRounding a = downsampleStrategy.a(i7, i8, i5, i6);
        if (a == null) {
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        float f2 = i7;
        float f3 = i8;
        int x = i7 / x(b2 * f2);
        int x2 = i8 / x(b2 * f3);
        DownsampleStrategy.SampleSizeRounding sampleSizeRounding = DownsampleStrategy.SampleSizeRounding.MEMORY;
        int max = Math.max(1, Integer.highestOneBit(a == sampleSizeRounding ? Math.max(x, x2) : Math.min(x, x2)));
        if (a == sampleSizeRounding && max < 1.0f / b2) {
            max <<= 1;
        }
        options.inSampleSize = max;
        if (imageType == ImageHeaderParser.ImageType.JPEG) {
            float min = Math.min(max, 8);
            floor = (int) Math.ceil(f2 / min);
            floor2 = (int) Math.ceil(f3 / min);
            int i9 = max / 8;
            if (i9 > 0) {
                floor /= i9;
                floor2 /= i9;
            }
        } else if (imageType == ImageHeaderParser.ImageType.PNG || imageType == ImageHeaderParser.ImageType.PNG_A) {
            float f4 = max;
            floor = (int) Math.floor(f2 / f4);
            floor2 = (int) Math.floor(f3 / f4);
        } else if (imageType == ImageHeaderParser.ImageType.WEBP || imageType == ImageHeaderParser.ImageType.WEBP_A) {
            float f5 = max;
            floor = Math.round(f2 / f5);
            floor2 = Math.round(f3 / f5);
        } else if (i7 % max == 0 && i8 % max == 0) {
            floor = i7 / max;
            floor2 = i8 / max;
        } else {
            int[] m2 = m(cVar, options, bVar, w80Var);
            floor = m2[0];
            floor2 = m2[1];
        }
        double b3 = downsampleStrategy.b(floor, floor2, i5, i6);
        options.inTargetDensity = a(b3);
        options.inDensity = l(b3);
        if (s(options)) {
            options.inScaled = true;
        } else {
            options.inTargetDensity = 0;
            options.inDensity = 0;
        }
        if (Log.isLoggable("Downsampler", 2)) {
            Log.v("Downsampler", "Calculate scaling, source: [" + i3 + QueryKeys.SCROLL_POSITION_TOP + i4 + "], degreesToRotate: " + i2 + ", target: [" + i5 + QueryKeys.SCROLL_POSITION_TOP + i6 + "], power of two scaled: [" + floor + QueryKeys.SCROLL_POSITION_TOP + floor2 + "], exact scale factor: " + b2 + ", power of 2 sample size: " + max + ", adjusted scale factor: " + b3 + ", target density: " + options.inTargetDensity + ", density: " + options.inDensity);
        }
    }

    private cz6 e(c cVar, int i2, int i3, sk5 sk5Var, b bVar) {
        byte[] bArr = (byte[]) this.c.b(65536, byte[].class);
        BitmapFactory.Options k2 = k();
        k2.inTempStorage = bArr;
        DecodeFormat decodeFormat = (DecodeFormat) sk5Var.c(f);
        PreferredColorSpace preferredColorSpace = (PreferredColorSpace) sk5Var.c(g);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) sk5Var.c(DownsampleStrategy.h);
        boolean booleanValue = ((Boolean) sk5Var.c(i)).booleanValue();
        mk5 mk5Var = j;
        try {
            return y80.f(h(cVar, k2, downsampleStrategy, decodeFormat, preferredColorSpace, sk5Var.c(mk5Var) != null && ((Boolean) sk5Var.c(mk5Var)).booleanValue(), i2, i3, booleanValue, bVar), this.a);
        } finally {
            v(k2);
            this.c.put(bArr);
        }
    }

    private Bitmap h(c cVar, BitmapFactory.Options options, DownsampleStrategy downsampleStrategy, DecodeFormat decodeFormat, PreferredColorSpace preferredColorSpace, boolean z, int i2, int i3, boolean z2, b bVar) {
        int i4;
        int i5;
        int i6;
        ColorSpace colorSpace;
        int round;
        int round2;
        long b2 = b94.b();
        int[] m2 = m(cVar, options, bVar, this.a);
        int i7 = m2[0];
        int i8 = m2[1];
        String str = options.outMimeType;
        boolean z3 = (i7 == -1 || i8 == -1) ? false : z;
        int c = cVar.c();
        int e = zq8.e(c);
        boolean h2 = zq8.h(c);
        if (i2 == Integer.MIN_VALUE) {
            i4 = i3;
            i5 = r(e) ? i8 : i7;
        } else {
            i4 = i3;
            i5 = i2;
        }
        int i9 = i4 == Integer.MIN_VALUE ? r(e) ? i7 : i8 : i4;
        ImageHeaderParser.ImageType d = cVar.d();
        c(d, cVar, bVar, this.a, downsampleStrategy, e, i7, i8, i5, i9, options);
        b(cVar, decodeFormat, z3, h2, options, i5, i9);
        if (z(d)) {
            if (i7 < 0 || i8 < 0 || !z2) {
                float f2 = s(options) ? options.inTargetDensity / options.inDensity : 1.0f;
                int i10 = options.inSampleSize;
                float f3 = i10;
                int ceil = (int) Math.ceil(i7 / f3);
                int ceil2 = (int) Math.ceil(i8 / f3);
                round = Math.round(ceil * f2);
                round2 = Math.round(ceil2 * f2);
                if (Log.isLoggable("Downsampler", 2)) {
                    Log.v("Downsampler", "Calculated target [" + round + QueryKeys.SCROLL_POSITION_TOP + round2 + "] for source [" + i7 + QueryKeys.SCROLL_POSITION_TOP + i8 + "], sampleSize: " + i10 + ", targetDensity: " + options.inTargetDensity + ", density: " + options.inDensity + ", density multiplier: " + f2);
                }
            } else {
                round = i5;
                round2 = i9;
            }
            if (round > 0 && round2 > 0) {
                y(options, this.a, round, round2);
            }
        }
        options.inPreferredColorSpace = ColorSpace.get((preferredColorSpace == PreferredColorSpace.DISPLAY_P3 && (colorSpace = options.outColorSpace) != null && colorSpace.isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
        Bitmap i11 = i(cVar, options, bVar, this.a);
        bVar.b(this.a, i11);
        if (Log.isLoggable("Downsampler", 2)) {
            i6 = c;
            t(i7, i8, str, options, i11, i2, i3, b2);
        } else {
            i6 = c;
        }
        if (i11 == null) {
            return null;
        }
        i11.setDensity(this.b.densityDpi);
        Bitmap i12 = zq8.i(this.a, i11, i6);
        if (i11.equals(i12)) {
            return i12;
        }
        this.a.b(i11);
        return i12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Bitmap i(com.bumptech.glide.load.resource.bitmap.c r5, android.graphics.BitmapFactory.Options r6, com.bumptech.glide.load.resource.bitmap.a.b r7, defpackage.w80 r8) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto Lc
            r7.a()
            r5.b()
        Lc:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = defpackage.zq8.d()
            r4.lock()
            android.graphics.Bitmap r5 = r5.a(r6)     // Catch: java.lang.Throwable -> L25 java.lang.IllegalArgumentException -> L27
            java.util.concurrent.locks.Lock r6 = defpackage.zq8.d()
            r6.unlock()
            return r5
        L25:
            r5 = move-exception
            goto L50
        L27:
            r4 = move-exception
            java.io.IOException r1 = u(r4, r1, r2, r3, r6)     // Catch: java.lang.Throwable -> L25
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L38
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch: java.lang.Throwable -> L25
        L38:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L4f
            r8.b(r0)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4e
            r0 = 0
            r6.inBitmap = r0     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4e
            android.graphics.Bitmap r5 = i(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4e
            java.util.concurrent.locks.Lock r6 = defpackage.zq8.d()
            r6.unlock()
            return r5
        L4e:
            throw r1     // Catch: java.lang.Throwable -> L25
        L4f:
            throw r1     // Catch: java.lang.Throwable -> L25
        L50:
            java.util.concurrent.locks.Lock r6 = defpackage.zq8.d()
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.a.i(com.bumptech.glide.load.resource.bitmap.c, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.a$b, w80):android.graphics.Bitmap");
    }

    private static String j(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + QueryKeys.SCROLL_POSITION_TOP + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    private static synchronized BitmapFactory.Options k() {
        BitmapFactory.Options options;
        synchronized (a.class) {
            Queue queue = n;
            synchronized (queue) {
                options = (BitmapFactory.Options) queue.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                w(options);
            }
        }
        return options;
    }

    private static int l(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) Math.round(d * 2.147483647E9d);
    }

    private static int[] m(c cVar, BitmapFactory.Options options, b bVar, w80 w80Var) {
        options.inJustDecodeBounds = true;
        i(cVar, options, bVar, w80Var);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    private static String n(BitmapFactory.Options options) {
        return j(options.inBitmap);
    }

    private static boolean r(int i2) {
        return i2 == 90 || i2 == 270;
    }

    private static boolean s(BitmapFactory.Options options) {
        int i2;
        int i3 = options.inTargetDensity;
        return i3 > 0 && (i2 = options.inDensity) > 0 && i3 != i2;
    }

    private static void t(int i2, int i3, String str, BitmapFactory.Options options, Bitmap bitmap, int i4, int i5, long j2) {
        Log.v("Downsampler", "Decoded " + j(bitmap) + " from [" + i2 + QueryKeys.SCROLL_POSITION_TOP + i3 + "] " + str + " with inBitmap " + n(options) + " for [" + i4 + QueryKeys.SCROLL_POSITION_TOP + i5 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + b94.a(j2));
    }

    private static IOException u(IllegalArgumentException illegalArgumentException, int i2, int i3, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i2 + ", outHeight: " + i3 + ", outMimeType: " + str + ", inBitmap: " + n(options), illegalArgumentException);
    }

    private static void v(BitmapFactory.Options options) {
        w(options);
        Queue queue = n;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    private static void w(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    private static int x(double d) {
        return (int) (d + 0.5d);
    }

    private static void y(BitmapFactory.Options options, w80 w80Var, int i2, int i3) {
        Bitmap.Config config = options.inPreferredConfig;
        if (config == Bitmap.Config.HARDWARE) {
            return;
        }
        Bitmap.Config config2 = options.outConfig;
        if (config2 != null) {
            config = config2;
        }
        options.inBitmap = w80Var.d(i2, i3, config);
    }

    private boolean z(ImageHeaderParser.ImageType imageType) {
        return true;
    }

    public cz6 d(ParcelFileDescriptor parcelFileDescriptor, int i2, int i3, sk5 sk5Var) {
        return e(new c.b(parcelFileDescriptor, this.d, this.c), i2, i3, sk5Var, l);
    }

    public cz6 f(InputStream inputStream, int i2, int i3, sk5 sk5Var) {
        return g(inputStream, i2, i3, sk5Var, l);
    }

    public cz6 g(InputStream inputStream, int i2, int i3, sk5 sk5Var, b bVar) {
        return e(new c.a(inputStream, this.d, this.c), i2, i3, sk5Var, bVar);
    }

    public boolean o(ParcelFileDescriptor parcelFileDescriptor) {
        return so5.c();
    }

    public boolean p(InputStream inputStream) {
        return true;
    }

    public boolean q(ByteBuffer byteBuffer) {
        return true;
    }
}
