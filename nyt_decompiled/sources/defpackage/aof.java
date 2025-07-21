package defpackage;

/* loaded from: classes3.dex */
public final class aof implements xnf {
    public static final d6f a;
    public static final d6f b;
    public static final d6f c;
    public static final d6f d;

    static {
        w5f a2 = new w5f(f5f.a("com.google.android.gms.measurement")).a();
        a = a2.d("measurement.id.lifecycle.app_in_background_parameter", 0L);
        b = a2.f("measurement.lifecycle.app_backgrounded_tracking", true);
        c = a2.f("measurement.lifecycle.app_in_background_parameter", false);
        d = a2.d("measurement.id.lifecycle.app_backgrounded_tracking", 0L);
    }

    @Override // defpackage.xnf
    public final boolean zza() {
        return ((Boolean) c.b()).booleanValue();
    }
}
