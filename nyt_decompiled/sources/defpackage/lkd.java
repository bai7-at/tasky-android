package defpackage;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.internal.ads.zzcei;

/* loaded from: classes3.dex */
public final class lkd implements fqd {
    private final zzw a;
    private final zzcei b;
    private final boolean c;

    public lkd(zzw zzwVar, zzcei zzceiVar, boolean z) {
        this.a = zzwVar;
        this.b = zzceiVar;
        this.c = z;
    }

    @Override // defpackage.fqd
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.b.zzc >= ((Integer) pla.c().a(mpa.h5)).intValue()) {
            bundle.putString("app_open_version", "2");
        }
        if (((Boolean) pla.c().a(mpa.i5)).booleanValue()) {
            bundle.putBoolean("app_switched", this.c);
        }
        zzw zzwVar = this.a;
        if (zzwVar != null) {
            int i = zzwVar.zza;
            if (i == 1) {
                bundle.putString("avo", "p");
            } else if (i == 2) {
                bundle.putString("avo", "l");
            }
        }
    }
}
