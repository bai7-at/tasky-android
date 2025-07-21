package defpackage;

/* loaded from: classes3.dex */
public final class skf implements pkf {
    public static final d6f a;
    public static final d6f b;
    public static final d6f c;
    public static final d6f d;

    static {
        w5f a2 = new w5f(f5f.a("com.google.android.gms.measurement")).b().a();
        a = a2.f("measurement.enhanced_campaign.client", true);
        b = a2.f("measurement.enhanced_campaign.service", true);
        c = a2.f("measurement.enhanced_campaign.srsltid.client", true);
        d = a2.f("measurement.enhanced_campaign.srsltid.service", true);
    }

    @Override // defpackage.pkf
    public final boolean zza() {
        return true;
    }

    @Override // defpackage.pkf
    public final boolean zzb() {
        return ((Boolean) a.b()).booleanValue();
    }

    @Override // defpackage.pkf
    public final boolean zzc() {
        return ((Boolean) b.b()).booleanValue();
    }

    @Override // defpackage.pkf
    public final boolean zzd() {
        return ((Boolean) c.b()).booleanValue();
    }

    @Override // defpackage.pkf
    public final boolean zze() {
        return ((Boolean) d.b()).booleanValue();
    }
}
