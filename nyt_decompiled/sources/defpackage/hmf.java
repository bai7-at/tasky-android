package defpackage;

/* loaded from: classes3.dex */
public final class hmf implements emf {
    public static final d6f a;
    public static final d6f b;

    static {
        w5f a2 = new w5f(f5f.a("com.google.android.gms.measurement")).a();
        a = a2.f("measurement.client.consent.suppress_1p_in_ga4f_install", true);
        b = a2.f("measurement.client.consent.gmpappid_worker_thread_fix", true);
    }

    @Override // defpackage.emf
    public final boolean zza() {
        return true;
    }

    @Override // defpackage.emf
    public final boolean zzb() {
        return ((Boolean) b.b()).booleanValue();
    }
}
