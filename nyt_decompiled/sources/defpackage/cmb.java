package defpackage;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class cmb implements gke {
    final /* synthetic */ List a;
    final /* synthetic */ String b;
    final /* synthetic */ Uri c;
    final /* synthetic */ emb d;

    cmb(emb embVar, List list, String str, Uri uri) {
        this.a = list;
        this.b = str;
        this.c = uri;
        this.d = embVar;
    }

    @Override // defpackage.gke
    public final void zza(Throwable th) {
        fgb.g("Failed to parse gmsg params for: ".concat(String.valueOf(this.c)));
    }

    @Override // defpackage.gke
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List list = this.a;
        String str = this.b;
        this.d.E((Map) obj, list, str);
    }
}
