package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.google.android.gms.internal.ads.zzcei;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class xib {
    private final Context a;
    private final String b;
    private final zzcei c;
    private final bqa d;
    private final eqa e;
    private final kqa f;
    private final long[] g;
    private final String[] h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private xhb n;
    private boolean o;
    private boolean p;
    private long q;

    public xib(Context context, zzcei zzceiVar, String str, eqa eqaVar, bqa bqaVar) {
        loa loaVar = new loa();
        loaVar.a("min_1", Double.MIN_VALUE, 1.0d);
        loaVar.a("1_5", 1.0d, 5.0d);
        loaVar.a("5_10", 5.0d, 10.0d);
        loaVar.a("10_20", 10.0d, 20.0d);
        loaVar.a("20_30", 20.0d, 30.0d);
        loaVar.a("30_max", 30.0d, Double.MAX_VALUE);
        this.f = loaVar.b();
        this.i = false;
        this.j = false;
        this.k = false;
        this.l = false;
        this.q = -1L;
        this.a = context;
        this.c = zzceiVar;
        this.b = str;
        this.e = eqaVar;
        this.d = bqaVar;
        String str2 = (String) pla.c().a(mpa.A);
        if (str2 == null) {
            this.h = new String[0];
            this.g = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        int length = split.length;
        this.h = new String[length];
        this.g = new long[length];
        for (int i = 0; i < split.length; i++) {
            try {
                this.g[i] = Long.parseLong(split[i]);
            } catch (NumberFormatException e) {
                fgb.h("Unable to parse frame hash target time number.", e);
                this.g[i] = -1;
            }
        }
    }

    public final void a(xhb xhbVar) {
        wpa.a(this.e, this.d, "vpc2");
        this.i = true;
        this.e.d("vpn", xhbVar.r());
        this.n = xhbVar;
    }

    public final void b() {
        if (!this.i || this.j) {
            return;
        }
        wpa.a(this.e, this.d, "vfr2");
        this.j = true;
    }

    public final void c() {
        this.m = true;
        if (!this.j || this.k) {
            return;
        }
        wpa.a(this.e, this.d, "vfp2");
        this.k = true;
    }

    public final void d() {
        if (!((Boolean) ksa.a.e()).booleanValue() || this.o) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(TransferTable.COLUMN_TYPE, "native-player-metrics");
        bundle.putString("request", this.b);
        bundle.putString("player", this.n.r());
        for (goa goaVar : this.f.a()) {
            String valueOf = String.valueOf(goaVar.a);
            bundle.putString("fps_c_".concat(valueOf), Integer.toString(goaVar.e));
            String valueOf2 = String.valueOf(goaVar.a);
            bundle.putString("fps_p_".concat(valueOf2), Double.toString(goaVar.d));
        }
        int i = 0;
        while (true) {
            long[] jArr = this.g;
            if (i >= jArr.length) {
                dyf.r().J(this.a, this.c.zza, "gmob-apps", bundle, true);
                this.o = true;
                return;
            }
            String str = this.h[i];
            if (str != null) {
                bundle.putString("fh_".concat(Long.valueOf(jArr[i]).toString()), str);
            }
            i++;
        }
    }

    public final void e() {
        this.m = false;
    }

    public final void f(xhb xhbVar) {
        if (this.k && !this.l) {
            if (pzc.m() && !this.l) {
                pzc.k("VideoMetricsMixin first frame");
            }
            wpa.a(this.e, this.d, "vff2");
            this.l = true;
        }
        long nanoTime = dyf.b().nanoTime();
        if (this.m && this.p && this.q != -1) {
            this.f.b(TimeUnit.SECONDS.toNanos(1L) / (nanoTime - this.q));
        }
        this.p = this.m;
        this.q = nanoTime;
        long longValue = ((Long) pla.c().a(mpa.B)).longValue();
        long i = xhbVar.i();
        int i2 = 0;
        while (true) {
            String[] strArr = this.h;
            if (i2 >= strArr.length) {
                return;
            }
            if (strArr[i2] == null && longValue > Math.abs(i - this.g[i2])) {
                String[] strArr2 = this.h;
                int i3 = 8;
                Bitmap bitmap = xhbVar.getBitmap(8, 8);
                long j = 63;
                long j2 = 0;
                int i4 = 0;
                while (i4 < i3) {
                    int i5 = 0;
                    while (i5 < i3) {
                        int pixel = bitmap.getPixel(i5, i4);
                        j2 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1L : 0L) << ((int) j);
                        j--;
                        i5++;
                        i3 = 8;
                    }
                    i4++;
                    i3 = 8;
                }
                strArr2[i2] = String.format("%016X", Long.valueOf(j2));
                return;
            }
            i2++;
        }
    }
}
