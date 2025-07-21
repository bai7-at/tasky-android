package defpackage;

import android.content.Context;
import android.webkit.CookieManager;
import com.google.android.gms.internal.ads.s6;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzflg;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class m0d implements v3f {
    private final l4f a;
    private final l4f b;

    public m0d(l4f l4fVar, l4f l4fVar2) {
        this.a = l4fVar;
        this.b = l4fVar2;
    }

    @Override // defpackage.l4f
    public final /* bridge */ /* synthetic */ Object zzb() {
        s6 s6Var = (s6) this.a.zzb();
        final CookieManager a = dyf.s().a((Context) this.b.zzb());
        w5e i = m5e.a(new Callable() { // from class: j0d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                CookieManager cookieManager = a;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) pla.c().a(mpa.N0));
            }
        }, zzflg.WEBVIEW_COOKIE, s6Var).i(1L, TimeUnit.SECONDS);
        final k0d k0dVar = new f5e() { // from class: k0d
            @Override // defpackage.f5e
            public final Object zza(Object obj) {
                return "";
            }
        };
        return i.c(Exception.class, new ake() { // from class: n5e
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                return zb.h("");
            }
        }).a();
    }
}
