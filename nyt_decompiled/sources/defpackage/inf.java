package defpackage;

/* loaded from: classes3.dex */
public final class inf implements fnf {
    public static final d6f a;
    public static final d6f b;
    public static final d6f c;

    static {
        w5f a2 = new w5f(f5f.a("com.google.android.gms.measurement")).a();
        a = a2.f("measurement.client.sessions.check_on_reset_and_enable2", true);
        b = a2.f("measurement.client.sessions.check_on_startup", true);
        c = a2.f("measurement.client.sessions.start_session_before_view_screen", true);
    }

    @Override // defpackage.fnf
    public final boolean zza() {
        return true;
    }

    @Override // defpackage.fnf
    public final boolean zzb() {
        return ((Boolean) a.b()).booleanValue();
    }
}
