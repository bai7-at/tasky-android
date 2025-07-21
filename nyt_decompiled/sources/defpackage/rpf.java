package defpackage;

/* loaded from: classes3.dex */
public final class rpf implements opf {
    public static final d6f a;
    public static final d6f b;

    static {
        w5f a2 = new w5f(f5f.a("com.google.android.gms.measurement")).a();
        a = a2.f("measurement.module.pixie.ees", true);
        b = a2.f("measurement.module.pixie.fix_array", true);
    }

    @Override // defpackage.opf
    public final boolean zza() {
        return true;
    }

    @Override // defpackage.opf
    public final boolean zzb() {
        return ((Boolean) b.b()).booleanValue();
    }
}
