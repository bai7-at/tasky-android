package defpackage;

/* loaded from: classes3.dex */
public final class jkf implements gkf {
    public static final d6f a;
    public static final d6f b;
    public static final d6f c;
    public static final d6f d;

    static {
        w5f a2 = new w5f(f5f.a("com.google.android.gms.measurement")).a();
        a = a2.f("measurement.client.consent_state_v1", true);
        b = a2.f("measurement.client.3p_consent_state_v1", true);
        c = a2.f("measurement.service.consent_state_v1_W36", true);
        d = a2.d("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // defpackage.gkf
    public final long zza() {
        return ((Long) d.b()).longValue();
    }
}
