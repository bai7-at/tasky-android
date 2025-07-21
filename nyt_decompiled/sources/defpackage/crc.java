package defpackage;

import com.google.android.gms.internal.ads.zzbbz;

/* loaded from: classes3.dex */
public final class crc implements v3f {
    private final l4f a;

    public crc(l4f l4fVar) {
        this.a = l4fVar;
    }

    @Override // defpackage.l4f
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbbz zzbbzVar = ((n6c) this.a).a().o.a == 3 ? zzbbz.REWARDED_INTERSTITIAL : zzbbz.REWARD_BASED_VIDEO_AD;
        d4f.b(zzbbzVar);
        return zzbbzVar;
    }
}
