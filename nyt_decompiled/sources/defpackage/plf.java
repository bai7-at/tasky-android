package defpackage;

/* loaded from: classes3.dex */
public final class plf implements mlf {
    public static final d6f a;
    public static final d6f b;
    public static final d6f c;

    static {
        w5f a2 = new w5f(f5f.a("com.google.android.gms.measurement")).b().a();
        a = a2.f("measurement.collection.event_safelist", true);
        b = a2.f("measurement.service.store_null_safelist", true);
        c = a2.f("measurement.service.store_safelist", true);
    }

    @Override // defpackage.mlf
    public final boolean zza() {
        return true;
    }

    @Override // defpackage.mlf
    public final boolean zzb() {
        return ((Boolean) b.b()).booleanValue();
    }

    @Override // defpackage.mlf
    public final boolean zzc() {
        return ((Boolean) c.b()).booleanValue();
    }
}
