package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class ed4 implements w80 {
    private static final Bitmap.Config k = Bitmap.Config.ARGB_8888;
    private final jd4 a;
    private final Set b;
    private final long c;
    private final a d;
    private long e;
    private long f;
    private int g;
    private int h;
    private int i;
    private int j;

    private interface a {
        void a(Bitmap bitmap);

        void b(Bitmap bitmap);
    }

    private static final class b implements a {
        b() {
        }

        @Override // ed4.a
        public void a(Bitmap bitmap) {
        }

        @Override // ed4.a
        public void b(Bitmap bitmap) {
        }
    }

    ed4(long j, jd4 jd4Var, Set set) {
        this.c = j;
        this.e = j;
        this.a = jd4Var;
        this.b = set;
        this.d = new b();
    }

    private static void e(Bitmap.Config config) {
        if (config != Bitmap.Config.HARDWARE) {
            return;
        }
        throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
    }

    private static Bitmap f(int i, int i2, Bitmap.Config config) {
        if (config == null) {
            config = k;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    private void g() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            h();
        }
    }

    private void h() {
        Log.v("LruBitmapPool", "Hits=" + this.g + ", misses=" + this.h + ", puts=" + this.i + ", evictions=" + this.j + ", currentSize=" + this.f + ", maxSize=" + this.e + "\nStrategy=" + this.a);
    }

    private void i() {
        p(this.e);
    }

    private static Set j() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        return Collections.unmodifiableSet(hashSet);
    }

    private static jd4 k() {
        return new cu7();
    }

    private synchronized Bitmap l(int i, int i2, Bitmap.Config config) {
        Bitmap c;
        try {
            e(config);
            c = this.a.c(i, i2, config != null ? config : k);
            if (c == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Missing bitmap=" + this.a.d(i, i2, config));
                }
                this.h++;
            } else {
                this.g++;
                this.f -= this.a.e(c);
                this.d.a(c);
                o(c);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Get bitmap=" + this.a.d(i, i2, config));
            }
            g();
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }

    private static void n(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    private static void o(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        n(bitmap);
    }

    private synchronized void p(long j) {
        while (this.f > j) {
            try {
                Bitmap removeLast = this.a.removeLast();
                if (removeLast == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        h();
                    }
                    this.f = 0L;
                    return;
                }
                this.d.a(removeLast);
                this.f -= this.a.e(removeLast);
                this.j++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Evicting bitmap=" + this.a.a(removeLast));
                }
                g();
                removeLast.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.w80
    public void a(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i);
        }
        if (i >= 40 || i >= 20) {
            clearMemory();
        } else if (i >= 20 || i == 15) {
            p(m() / 2);
        }
    }

    @Override // defpackage.w80
    public synchronized void b(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.a.e(bitmap) <= this.e && this.b.contains(bitmap.getConfig())) {
                int e = this.a.e(bitmap);
                this.a.b(bitmap);
                this.d.b(bitmap);
                this.i++;
                this.f += e;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    Log.v("LruBitmapPool", "Put bitmap in pool=" + this.a.a(bitmap));
                }
                g();
                i();
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.a.a(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.b.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.w80
    public Bitmap c(int i, int i2, Bitmap.Config config) {
        Bitmap l = l(i, i2, config);
        if (l == null) {
            return f(i, i2, config);
        }
        l.eraseColor(0);
        return l;
    }

    @Override // defpackage.w80
    public void clearMemory() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        p(0L);
    }

    @Override // defpackage.w80
    public Bitmap d(int i, int i2, Bitmap.Config config) {
        Bitmap l = l(i, i2, config);
        return l == null ? f(i, i2, config) : l;
    }

    public long m() {
        return this.e;
    }

    public ed4(long j) {
        this(j, k(), j());
    }
}
