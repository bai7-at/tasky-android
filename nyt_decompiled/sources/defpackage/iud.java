package defpackage;

import android.content.pm.PackageInfo;
import com.google.android.gms.internal.ads.zzbze;
import java.util.List;

/* loaded from: classes3.dex */
public final class iud {
    private final zzbze a;
    private final int b;

    public iud(zzbze zzbzeVar, int i) {
        this.a = zzbzeVar;
        this.b = i;
    }

    public final int a() {
        return this.b;
    }

    public final PackageInfo b() {
        return this.a.zzf;
    }

    public final String c() {
        return this.a.zzd;
    }

    public final String d() {
        return ehe.c(this.a.zza.getString("ms"));
    }

    public final String e() {
        return this.a.zzh;
    }

    public final List f() {
        return this.a.zze;
    }

    final boolean g() {
        return this.a.zzl;
    }

    final boolean h() {
        return this.a.zza.getBoolean("is_gbid");
    }

    final boolean i() {
        return this.a.zzk;
    }
}
