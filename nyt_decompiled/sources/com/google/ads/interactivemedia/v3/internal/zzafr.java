package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes2.dex */
final class zzafr implements zzagt {
    private static final zzafx zza = new zzafp();
    private final zzafx zzb;

    public zzafr() {
        zzafx zzafxVar;
        zzaeo zza2 = zzaeo.zza();
        try {
            zzafxVar = (zzafx) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            zzafxVar = zza;
        }
        zzafq zzafqVar = new zzafq(zza2, zzafxVar);
        byte[] bArr = zzafa.zzd;
        this.zzb = zzafqVar;
    }

    private static boolean zzb(zzafw zzafwVar) {
        return zzafwVar.zzc() == 1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagt
    public final zzags zza(Class cls) {
        zzagu.zzE(cls);
        zzafw zzb = this.zzb.zzb(cls);
        return zzb.zzb() ? zzaet.class.isAssignableFrom(cls) ? zzagd.zzc(zzagu.zzA(), zzaei.zzb(), zzb.zza()) : zzagd.zzc(zzagu.zzy(), zzaei.zza(), zzb.zza()) : zzaet.class.isAssignableFrom(cls) ? zzb(zzb) ? zzagc.zzm(cls, zzb, zzagf.zzb(), zzafn.zze(), zzagu.zzA(), zzaei.zzb(), zzafv.zzb()) : zzagc.zzm(cls, zzb, zzagf.zzb(), zzafn.zze(), zzagu.zzA(), null, zzafv.zzb()) : zzb(zzb) ? zzagc.zzm(cls, zzb, zzagf.zza(), zzafn.zzd(), zzagu.zzy(), zzaei.zza(), zzafv.zza()) : zzagc.zzm(cls, zzb, zzagf.zza(), zzafn.zzd(), zzagu.zzz(), null, zzafv.zza());
    }
}
