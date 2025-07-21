package defpackage;

/* loaded from: classes3.dex */
public final class qif implements nif {
    public static final d6f a;
    public static final d6f b;
    public static final d6f c;
    public static final d6f d;
    public static final d6f e;
    public static final d6f f;

    static {
        w5f a2 = new w5f(f5f.a("com.google.android.gms.measurement")).b().a();
        a = a2.f("measurement.adid_zero.app_instance_id_fix", true);
        b = a2.f("measurement.adid_zero.service", true);
        c = a2.f("measurement.adid_zero.adid_uid", true);
        d = a2.f("measurement.adid_zero.remove_lair_if_adidzero_false", true);
        e = a2.f("measurement.adid_zero.remove_lair_if_userid_cleared", true);
        f = a2.f("measurement.adid_zero.remove_lair_on_id_value_change_only", true);
    }

    @Override // defpackage.nif
    public final boolean zza() {
        return true;
    }

    @Override // defpackage.nif
    public final boolean zzb() {
        return ((Boolean) a.b()).booleanValue();
    }

    @Override // defpackage.nif
    public final boolean zzc() {
        return ((Boolean) b.b()).booleanValue();
    }

    @Override // defpackage.nif
    public final boolean zzd() {
        return ((Boolean) c.b()).booleanValue();
    }

    @Override // defpackage.nif
    public final boolean zze() {
        return ((Boolean) d.b()).booleanValue();
    }

    @Override // defpackage.nif
    public final boolean zzf() {
        return ((Boolean) e.b()).booleanValue();
    }

    @Override // defpackage.nif
    public final boolean zzg() {
        return ((Boolean) f.b()).booleanValue();
    }
}
