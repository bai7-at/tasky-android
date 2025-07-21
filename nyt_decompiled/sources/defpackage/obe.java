package defpackage;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.internal.ads.n1;
import com.google.android.gms.internal.ads.u0;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class obe {
    private final Context a;
    private final Executor b;
    private final tae c;
    private final vae d;
    private final nbe e;
    private final nbe f;
    private og8 g;
    private og8 h;

    obe(Context context, Executor executor, tae taeVar, vae vaeVar, lbe lbeVar, mbe mbeVar) {
        this.a = context;
        this.b = executor;
        this.c = taeVar;
        this.d = vaeVar;
        this.e = lbeVar;
        this.f = mbeVar;
    }

    public static obe e(Context context, Executor executor, tae taeVar, vae vaeVar) {
        final obe obeVar = new obe(context, executor, taeVar, vaeVar, new lbe(), new mbe());
        if (obeVar.d.d()) {
            obeVar.g = obeVar.h(new Callable() { // from class: ibe
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return obe.this.c();
                }
            });
        } else {
            obeVar.g = vg8.e(obeVar.e.zza());
        }
        obeVar.h = obeVar.h(new Callable() { // from class: jbe
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return obe.this.d();
            }
        });
        return obeVar;
    }

    private static n1 g(og8 og8Var, n1 n1Var) {
        return !og8Var.q() ? n1Var : (n1) og8Var.m();
    }

    private final og8 h(Callable callable) {
        return vg8.c(this.b, callable).e(this.b, new ue5() { // from class: kbe
            @Override // defpackage.ue5
            public final void onFailure(Exception exc) {
                obe.this.f(exc);
            }
        });
    }

    public final n1 a() {
        return g(this.g, this.e.zza());
    }

    public final n1 b() {
        return g(this.h, this.f.zza());
    }

    final /* synthetic */ n1 c() {
        u0 l0 = n1.l0();
        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.a);
        String id = advertisingIdInfo.getId();
        if (id != null && id.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID fromString = UUID.fromString(id);
            byte[] bArr = new byte[16];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.putLong(fromString.getMostSignificantBits());
            wrap.putLong(fromString.getLeastSignificantBits());
            id = Base64.encodeToString(bArr, 11);
        }
        if (id != null) {
            l0.r0(id);
            l0.q0(advertisingIdInfo.isLimitAdTrackingEnabled());
            l0.R(6);
        }
        return (n1) l0.i();
    }

    final /* synthetic */ n1 d() {
        Context context = this.a;
        return bbe.a(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    final /* synthetic */ void f(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.c.c(2025, -1L, exc);
    }
}
