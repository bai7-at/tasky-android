package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.chartbeat.androidsdk.QueryKeys;
import defpackage.kz2;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

/* loaded from: classes2.dex */
public class jf0 implements iz6 {
    private static final a f = new a();
    private static final b g = new b();
    private final Context a;
    private final List b;
    private final b c;
    private final a d;
    private final jz2 e;

    static class a {
        a() {
        }

        kz2 a(kz2.a aVar, tz2 tz2Var, ByteBuffer byteBuffer, int i) {
            return new i08(aVar, tz2Var, byteBuffer, i);
        }
    }

    static class b {
        private final Queue a = x19.e(0);

        b() {
        }

        synchronized uz2 a(ByteBuffer byteBuffer) {
            uz2 uz2Var;
            try {
                uz2Var = (uz2) this.a.poll();
                if (uz2Var == null) {
                    uz2Var = new uz2();
                }
            } catch (Throwable th) {
                throw th;
            }
            return uz2Var.p(byteBuffer);
        }

        synchronized void b(uz2 uz2Var) {
            uz2Var.a();
            this.a.offer(uz2Var);
        }
    }

    public jf0(Context context, List list, w80 w80Var, to toVar) {
        this(context, list, w80Var, toVar, g, f);
    }

    private oz2 c(ByteBuffer byteBuffer, int i, int i2, uz2 uz2Var, sk5 sk5Var) {
        long b2 = b94.b();
        try {
            tz2 c = uz2Var.c();
            if (c.b() > 0 && c.c() == 0) {
                Bitmap.Config config = sk5Var.c(vz2.a) == DecodeFormat.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                kz2 a2 = this.d.a(this.e, c, byteBuffer, e(c, i, i2));
                a2.d(config);
                a2.b();
                Bitmap a3 = a2.a();
                if (a3 == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        Log.v("BufferGifDecoder", "Decoded GIF from stream in " + b94.a(b2));
                    }
                    return null;
                }
                oz2 oz2Var = new oz2(new lz2(this.a, a2, cx8.c(), i, i2, a3));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + b94.a(b2));
                }
                return oz2Var;
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + b94.a(b2));
            }
        }
    }

    private static int e(tz2 tz2Var, int i, int i2) {
        int min = Math.min(tz2Var.a() / i2, tz2Var.d() / i);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i + QueryKeys.SCROLL_POSITION_TOP + i2 + "], actual dimens: [" + tz2Var.d() + QueryKeys.SCROLL_POSITION_TOP + tz2Var.a() + "]");
        }
        return max;
    }

    @Override // defpackage.iz6
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public oz2 b(ByteBuffer byteBuffer, int i, int i2, sk5 sk5Var) {
        uz2 a2 = this.c.a(byteBuffer);
        try {
            return c(byteBuffer, i, i2, a2, sk5Var);
        } finally {
            this.c.b(a2);
        }
    }

    @Override // defpackage.iz6
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean a(ByteBuffer byteBuffer, sk5 sk5Var) {
        return !((Boolean) sk5Var.c(vz2.b)).booleanValue() && com.bumptech.glide.load.a.f(this.b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    jf0(Context context, List list, w80 w80Var, to toVar, b bVar, a aVar) {
        this.a = context.getApplicationContext();
        this.b = list;
        this.d = aVar;
        this.e = new jz2(w80Var, toVar);
        this.c = bVar;
    }
}
