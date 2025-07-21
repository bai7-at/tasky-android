package defpackage;

/* loaded from: classes3.dex */
public final class rnf implements onf {
    public static final d6f a;
    public static final d6f b;
    public static final d6f c;
    public static final d6f d;

    static {
        w5f a2 = new w5f(f5f.a("com.google.android.gms.measurement")).a();
        a = a2.f("measurement.sdk.collection.enable_extend_user_property_size", true);
        b = a2.f("measurement.sdk.collection.last_deep_link_referrer2", true);
        c = a2.f("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        d = a2.d("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // defpackage.onf
    public final boolean zza() {
        return ((Boolean) c.b()).booleanValue();
    }
}
