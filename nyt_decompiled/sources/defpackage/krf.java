package defpackage;

/* loaded from: classes3.dex */
public final class krf implements hrf {
    public static final d6f a;
    public static final d6f b;

    static {
        w5f a2 = new w5f(f5f.a("com.google.android.gms.measurement")).b().a();
        a = a2.f("measurement.collection.enable_session_stitching_token.client.dev", false);
        b = a2.f("measurement.collection.enable_session_stitching_token.service", false);
    }

    @Override // defpackage.hrf
    public final boolean zza() {
        return true;
    }

    @Override // defpackage.hrf
    public final boolean zzb() {
        return ((Boolean) a.b()).booleanValue();
    }

    @Override // defpackage.hrf
    public final boolean zzc() {
        return ((Boolean) b.b()).booleanValue();
    }
}
