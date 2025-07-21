package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.InputEvent;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.internal.ads.vb;
import com.google.android.gms.internal.ads.zb;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class gwb {
    private final Context a;
    private final hie b;
    private final c9d c;
    private final zrc d;
    private final kke e;
    private final Executor f;
    private final ScheduledExecutorService g;
    m8b h;
    m8b i;

    gwb(Context context, hie hieVar, c9d c9dVar, zrc zrcVar, kke kkeVar, kke kkeVar2, ScheduledExecutorService scheduledExecutorService) {
        this.a = context;
        this.b = hieVar;
        this.c = c9dVar;
        this.d = zrcVar;
        this.e = kkeVar;
        this.f = kkeVar2;
        this.g = scheduledExecutorService;
    }

    public static boolean h(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) pla.c().a(mpa.M9));
    }

    private final j64 i(final String str, final InputEvent inputEvent, Random random) {
        final Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        if (!str.contains((CharSequence) pla.c().a(mpa.M9)) || this.b.g()) {
            return zb.h(str);
        }
        buildUpon.appendQueryParameter((String) pla.c().a(mpa.N9), String.valueOf(random.nextInt(Integer.MAX_VALUE)));
        if (inputEvent != null) {
            return zb.f(zb.n(vb.C(this.c.a()), new ake() { // from class: vvb
                @Override // defpackage.ake
                public final j64 zza(Object obj) {
                    return gwb.this.c(buildUpon, str, inputEvent, (Integer) obj);
                }
            }, this.f), Throwable.class, new ake() { // from class: wvb
                @Override // defpackage.ake
                public final j64 zza(Object obj) {
                    return gwb.this.d(buildUpon, (Throwable) obj);
                }
            }, this.e);
        }
        buildUpon.appendQueryParameter((String) pla.c().a(mpa.O9), "11");
        return zb.h(buildUpon.toString());
    }

    public final j64 b(final String str, Random random) {
        return TextUtils.isEmpty(str) ? zb.h(str) : zb.f(i(str, this.d.a(), random), Throwable.class, new ake() { // from class: uvb
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                return zb.h(str);
            }
        }, this.e);
    }

    final /* synthetic */ j64 c(final Uri.Builder builder, String str, InputEvent inputEvent, Integer num) {
        if (num.intValue() != 1) {
            builder.appendQueryParameter((String) pla.c().a(mpa.O9), "10");
            return zb.h(builder.toString());
        }
        Uri.Builder buildUpon = builder.build().buildUpon();
        buildUpon.appendQueryParameter((String) pla.c().a(mpa.P9), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        buildUpon.appendQueryParameter((String) pla.c().a(mpa.O9), "12");
        if (str.contains((CharSequence) pla.c().a(mpa.Q9))) {
            buildUpon.authority((String) pla.c().a(mpa.R9));
        }
        return zb.n(vb.C(this.c.b(buildUpon.build(), inputEvent)), new ake() { // from class: cwb
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                String str2 = (String) pla.c().a(mpa.O9);
                Uri.Builder builder2 = builder;
                builder2.appendQueryParameter(str2, "12");
                return zb.h(builder2.toString());
            }
        }, this.f);
    }

    final /* synthetic */ j64 d(Uri.Builder builder, final Throwable th) {
        this.e.l(new Runnable() { // from class: tvb
            @Override // java.lang.Runnable
            public final void run() {
                gwb.this.f(th);
            }
        });
        builder.appendQueryParameter((String) pla.c().a(mpa.O9), "9");
        return zb.h(builder.toString());
    }

    final /* synthetic */ void f(Throwable th) {
        if (((Boolean) pla.c().a(mpa.T9)).booleanValue()) {
            m8b e = k8b.e(this.a);
            this.i = e;
            e.b(th, "AttributionReporting");
        } else {
            m8b c = k8b.c(this.a);
            this.h = c;
            c.b(th, "AttributionReporting");
        }
    }

    public final void g(String str, d8e d8eVar, Random random) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zb.r(zb.o(i(str, this.d.a(), random), ((Integer) pla.c().a(mpa.S9)).intValue(), TimeUnit.MILLISECONDS, this.g), new fwb(this, d8eVar, str), this.e);
    }
}
