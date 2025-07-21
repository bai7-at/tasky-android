package defpackage;

import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzead;
import java.util.Map;

/* loaded from: classes3.dex */
public final class h2d implements j2d {
    private final Map a;
    private final kke b;
    private final aac c;

    public h2d(Map map, kke kkeVar, aac aacVar) {
        this.a = map;
        this.b = kkeVar;
        this.c = aacVar;
    }

    @Override // defpackage.j2d
    public final j64 a(final zzbze zzbzeVar) {
        this.c.F(zzbzeVar);
        j64 g = zb.g(new zzead(3));
        for (String str : ((String) pla.c().a(mpa.c8)).split(",")) {
            final l4f l4fVar = (l4f) this.a.get(str.trim());
            if (l4fVar != null) {
                g = zb.f(g, zzead.class, new ake() { // from class: f2d
                    @Override // defpackage.ake
                    public final j64 zza(Object obj) {
                        return ((j2d) l4f.this.zzb()).a(zzbzeVar);
                    }
                }, this.b);
            }
        }
        zb.r(g, new g2d(this), pgb.f);
        return g;
    }
}
