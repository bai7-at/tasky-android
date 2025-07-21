package defpackage;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.internal.ads.zzdkv;

/* loaded from: classes3.dex */
final class sbd implements iic {
    private final v0e a;
    private final o5b b;
    private final AdFormat c;
    private r7c d = null;

    sbd(v0e v0eVar, o5b o5bVar, AdFormat adFormat) {
        this.a = v0eVar;
        this.b = o5bVar;
        this.c = adFormat;
    }

    @Override // defpackage.iic
    public final void a(boolean z, Context context, m7c m7cVar) {
        boolean c0;
        try {
            AdFormat adFormat = AdFormat.BANNER;
            int ordinal = this.c.ordinal();
            if (ordinal == 1) {
                c0 = this.b.c0(fc5.l3(context));
            } else {
                if (ordinal != 2) {
                    if (ordinal == 5) {
                        c0 = this.b.F(fc5.l3(context));
                    }
                    throw new zzdkv("Adapter failed to show.");
                }
                c0 = this.b.b5(fc5.l3(context));
            }
            if (c0) {
                if (this.d == null) {
                    return;
                }
                if (((Boolean) pla.c().a(mpa.w1)).booleanValue() || this.a.Z != 2) {
                    return;
                }
                this.d.zza();
                return;
            }
            throw new zzdkv("Adapter failed to show.");
        } catch (Throwable th) {
            throw new zzdkv(th);
        }
    }

    public final void b(r7c r7cVar) {
        this.d = r7cVar;
    }
}
