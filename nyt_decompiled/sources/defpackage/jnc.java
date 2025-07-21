package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zb;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class jnc {
    private final yza a;
    private final Clock b;
    private final Executor c;

    public jnc(yza yzaVar, Clock clock, Executor executor) {
        this.a = yzaVar;
        this.b = clock;
        this.c = executor;
    }

    private final Bitmap c(byte[] bArr, BitmapFactory.Options options) {
        long elapsedRealtime = this.b.elapsedRealtime();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long elapsedRealtime2 = this.b.elapsedRealtime();
        if (decodeByteArray != null) {
            long j = elapsedRealtime2 - elapsedRealtime;
            pzc.k("Decoded image w: " + decodeByteArray.getWidth() + " h:" + decodeByteArray.getHeight() + " bytes: " + decodeByteArray.getAllocationByteCount() + " time: " + j + " on ui thread: " + (Looper.getMainLooper().getThread() == Thread.currentThread()));
        }
        return decodeByteArray;
    }

    final /* synthetic */ Bitmap a(double d, boolean z, qaa qaaVar) {
        byte[] bArr = qaaVar.b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d * 160.0d);
        if (!z) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) pla.c().a(mpa.g6)).booleanValue()) {
            options.inJustDecodeBounds = true;
            c(bArr, options);
            options.inJustDecodeBounds = false;
            int i = options.outWidth * options.outHeight;
            if (i > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i - 1) / ((Integer) pla.c().a(mpa.h6)).intValue())) / 2);
            }
        }
        return c(bArr, options);
    }

    public final j64 b(String str, final double d, final boolean z) {
        return zb.m(this.a.a(str), new gge() { // from class: inc
            @Override // defpackage.gge
            public final Object apply(Object obj) {
                return jnc.this.a(d, z, (qaa) obj);
            }
        }, this.c);
    }
}
