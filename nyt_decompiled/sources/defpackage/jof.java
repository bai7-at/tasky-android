package defpackage;

/* loaded from: classes3.dex */
public final class jof implements gof {
    public static final d6f a;
    public static final d6f b;

    static {
        w5f a2 = new w5f(f5f.a("com.google.android.gms.measurement")).a();
        a = a2.f("measurement.validation.internal_limits_internal_event_params", true);
        b = a2.d("measurement.id.validation.internal_limits_internal_event_params", 0L);
    }

    @Override // defpackage.gof
    public final boolean zza() {
        return ((Boolean) a.b()).booleanValue();
    }
}
