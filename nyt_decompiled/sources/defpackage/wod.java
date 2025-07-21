package defpackage;

import com.google.android.gms.internal.ads.zb;

/* loaded from: classes3.dex */
public final class wod implements gqd {
    private final String a;
    private final String b;

    wod(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.gqd
    public final int zza() {
        return 31;
    }

    @Override // defpackage.gqd
    public final j64 zzb() {
        return zb.h(new xod(this.a, this.b));
    }
}
