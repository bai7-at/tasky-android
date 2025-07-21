package defpackage;

/* loaded from: classes3.dex */
public final class jqf implements gqf {
    public static final d6f a;
    public static final d6f b;
    public static final d6f c;
    public static final d6f d;
    public static final d6f e;
    public static final d6f f;
    public static final d6f g;
    public static final d6f h;
    public static final d6f i;
    public static final d6f j;
    public static final d6f k;
    public static final d6f l;
    public static final d6f m;

    static {
        w5f a2 = new w5f(f5f.a("com.google.android.gms.measurement")).b().a();
        a = a2.f("measurement.redaction.app_instance_id", true);
        b = a2.f("measurement.redaction.client_ephemeral_aiid_generation", true);
        c = a2.f("measurement.redaction.config_redacted_fields", true);
        d = a2.f("measurement.redaction.device_info", true);
        e = a2.f("measurement.redaction.e_tag", false);
        f = a2.f("measurement.redaction.enhanced_uid", true);
        g = a2.f("measurement.redaction.populate_ephemeral_app_instance_id", true);
        h = a2.f("measurement.redaction.google_signals", true);
        i = a2.f("measurement.redaction.no_aiid_in_config_request", true);
        j = a2.f("measurement.redaction.upload_redacted_fields", true);
        k = a2.f("measurement.redaction.upload_subdomain_override", true);
        l = a2.f("measurement.redaction.user_id", true);
        m = a2.d("measurement.id.redaction", 0L);
    }

    @Override // defpackage.gqf
    public final boolean zza() {
        return true;
    }

    @Override // defpackage.gqf
    public final boolean zzb() {
        return ((Boolean) a.b()).booleanValue();
    }

    @Override // defpackage.gqf
    public final boolean zzc() {
        return ((Boolean) b.b()).booleanValue();
    }

    @Override // defpackage.gqf
    public final boolean zzd() {
        return ((Boolean) c.b()).booleanValue();
    }

    @Override // defpackage.gqf
    public final boolean zze() {
        return ((Boolean) d.b()).booleanValue();
    }

    @Override // defpackage.gqf
    public final boolean zzf() {
        return ((Boolean) e.b()).booleanValue();
    }

    @Override // defpackage.gqf
    public final boolean zzg() {
        return ((Boolean) f.b()).booleanValue();
    }

    @Override // defpackage.gqf
    public final boolean zzh() {
        return ((Boolean) g.b()).booleanValue();
    }

    @Override // defpackage.gqf
    public final boolean zzi() {
        return ((Boolean) h.b()).booleanValue();
    }

    @Override // defpackage.gqf
    public final boolean zzj() {
        return ((Boolean) i.b()).booleanValue();
    }

    @Override // defpackage.gqf
    public final boolean zzk() {
        return ((Boolean) j.b()).booleanValue();
    }

    @Override // defpackage.gqf
    public final boolean zzl() {
        return ((Boolean) k.b()).booleanValue();
    }

    @Override // defpackage.gqf
    public final boolean zzm() {
        return ((Boolean) l.b()).booleanValue();
    }
}
