package defpackage;

/* loaded from: classes3.dex */
public final class qmf implements nmf {
    public static final d6f a;
    public static final d6f b;
    public static final d6f c;
    public static final d6f d;

    static {
        w5f a2 = new w5f(f5f.a("com.google.android.gms.measurement")).a();
        a = a2.f("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        b = a2.f("measurement.audience.refresh_event_count_filters_timestamp", false);
        c = a2.f("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        d = a2.f("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // defpackage.nmf
    public final boolean zza() {
        return true;
    }

    @Override // defpackage.nmf
    public final boolean zzb() {
        return ((Boolean) b.b()).booleanValue();
    }

    @Override // defpackage.nmf
    public final boolean zzc() {
        return ((Boolean) c.b()).booleanValue();
    }

    @Override // defpackage.nmf
    public final boolean zzd() {
        return ((Boolean) d.b()).booleanValue();
    }
}
