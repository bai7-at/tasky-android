package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.y;
import com.google.android.gms.ads.internal.client.zzu;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class p6c extends y {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final List e;
    private final long f;
    private final String g;
    private final k9d h;
    private final Bundle i;

    public p6c(v0e v0eVar, String str, k9d k9dVar, y0e y0eVar, String str2) {
        String str3 = null;
        this.b = v0eVar == null ? null : v0eVar.c0;
        this.c = str2;
        this.d = y0eVar == null ? null : y0eVar.b;
        if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                str3 = v0eVar.w.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.a = str3 != null ? str3 : str;
        this.e = k9dVar.c();
        this.h = k9dVar;
        this.f = dyf.b().currentTimeMillis() / 1000;
        if (!((Boolean) pla.c().a(mpa.Q6)).booleanValue() || y0eVar == null) {
            this.i = new Bundle();
        } else {
            this.i = y0eVar.j;
        }
        this.g = (!((Boolean) pla.c().a(mpa.e9)).booleanValue() || y0eVar == null || TextUtils.isEmpty(y0eVar.h)) ? "" : y0eVar.h;
    }

    public final long zzc() {
        return this.f;
    }

    public final String zzd() {
        return this.g;
    }

    @Override // defpackage.qkc
    public final Bundle zze() {
        return this.i;
    }

    @Override // defpackage.qkc
    public final zzu zzf() {
        k9d k9dVar = this.h;
        if (k9dVar != null) {
            return k9dVar.a();
        }
        return null;
    }

    @Override // defpackage.qkc
    public final String zzg() {
        return this.a;
    }

    @Override // defpackage.qkc
    public final String zzh() {
        return this.c;
    }

    @Override // defpackage.qkc
    public final String zzi() {
        return this.b;
    }

    @Override // defpackage.qkc
    public final List zzj() {
        return this.e;
    }

    public final String zzk() {
        return this.d;
    }
}
