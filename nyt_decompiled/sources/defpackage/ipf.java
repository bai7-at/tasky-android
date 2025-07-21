package defpackage;

/* loaded from: classes3.dex */
public final class ipf implements fpf {
    public static final d6f a;
    public static final d6f b;
    public static final d6f c;
    public static final d6f d;
    public static final d6f e;

    static {
        w5f a2 = new w5f(f5f.a("com.google.android.gms.measurement")).a();
        a = a2.f("measurement.test.boolean_flag", false);
        b = a2.c("measurement.test.double_flag", -3.0d);
        c = a2.d("measurement.test.int_flag", -2L);
        d = a2.d("measurement.test.long_flag", -1L);
        e = a2.e("measurement.test.string_flag", "---");
    }

    @Override // defpackage.fpf
    public final double zza() {
        return ((Double) b.b()).doubleValue();
    }

    @Override // defpackage.fpf
    public final long zzb() {
        return ((Long) c.b()).longValue();
    }

    @Override // defpackage.fpf
    public final long zzc() {
        return ((Long) d.b()).longValue();
    }

    @Override // defpackage.fpf
    public final String zzd() {
        return (String) e.b();
    }

    @Override // defpackage.fpf
    public final boolean zze() {
        return ((Boolean) a.b()).booleanValue();
    }
}
