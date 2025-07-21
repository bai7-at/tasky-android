package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class ji implements cj {
    private static final ni b = new hi();
    private final ni a;

    public ji() {
        ni niVar;
        wh a = wh.a();
        try {
            niVar = (ni) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            niVar = b;
        }
        ii iiVar = new ii(a, niVar);
        byte[] bArr = ai.d;
        this.a = iiVar;
    }

    private static boolean a(mi miVar) {
        return miVar.zzc() + (-1) != 1;
    }

    @Override // com.google.android.gms.internal.ads.cj
    public final bj zza(Class cls) {
        dj.y(cls);
        mi zzb = this.a.zzb(cls);
        return zzb.zzb() ? yh.class.isAssignableFrom(cls) ? qi.f(dj.u(), sh.b(), zzb.zza()) : qi.f(dj.t(), sh.a(), zzb.zza()) : yh.class.isAssignableFrom(cls) ? a(zzb) ? pi.B(cls, zzb, si.b(), fi.e(), dj.u(), sh.b(), li.b()) : pi.B(cls, zzb, si.b(), fi.e(), dj.u(), null, li.b()) : a(zzb) ? pi.B(cls, zzb, si.a(), fi.d(), dj.t(), sh.a(), li.a()) : pi.B(cls, zzb, si.a(), fi.d(), dj.t(), null, li.a());
    }
}
