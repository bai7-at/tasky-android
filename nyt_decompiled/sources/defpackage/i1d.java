package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzead;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class i1d implements j2d {
    private static final Pattern h = Pattern.compile("Received error HTTP response code: (.*)");
    private final g0d a;
    private final kke b;
    private final s1e c;
    private final ScheduledExecutorService d;
    private final t6d e;
    private final q7e f;
    private final Context g;

    i1d(Context context, s1e s1eVar, g0d g0dVar, kke kkeVar, ScheduledExecutorService scheduledExecutorService, t6d t6dVar, q7e q7eVar) {
        this.g = context;
        this.c = s1eVar;
        this.a = g0dVar;
        this.b = kkeVar;
        this.d = scheduledExecutorService;
        this.e = t6dVar;
        this.f = q7eVar;
    }

    @Override // defpackage.j2d
    public final j64 a(zzbze zzbzeVar) {
        Context context = this.g;
        j64 b = this.a.b(zzbzeVar);
        f7e a = e7e.a(context, 11);
        p7e.d(b, a);
        j64 n = zb.n(b, new ake() { // from class: f1d
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                return i1d.this.c((InputStream) obj);
            }
        }, this.b);
        if (((Boolean) pla.c().a(mpa.v5)).booleanValue()) {
            n = zb.f(zb.o(n, ((Integer) pla.c().a(mpa.x5)).intValue(), TimeUnit.SECONDS, this.d), TimeoutException.class, new ake() { // from class: g1d
                @Override // defpackage.ake
                public final j64 zza(Object obj) {
                    return zb.g(new zzead(5));
                }
            }, pgb.f);
        }
        p7e.a(n, this.f, a);
        zb.r(n, new h1d(this), pgb.f);
        return n;
    }

    final /* synthetic */ j64 c(InputStream inputStream) {
        return zb.h(new g1e(new d1e(this.c), f1e.a(new InputStreamReader(inputStream))));
    }
}
