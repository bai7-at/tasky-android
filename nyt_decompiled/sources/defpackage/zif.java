package defpackage;

/* loaded from: classes3.dex */
public final class zif implements wif {
    public static final d6f a;
    public static final d6f b;

    static {
        w5f a2 = new w5f(f5f.a("com.google.android.gms.measurement")).a();
        a = a2.f("measurement.androidId.delete_feature", true);
        b = a2.f("measurement.log_androidId_enabled", false);
    }

    @Override // defpackage.wif
    public final boolean zza() {
        return ((Boolean) a.b()).booleanValue();
    }
}
