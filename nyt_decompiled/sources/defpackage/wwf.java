package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzavj;
import com.google.android.gms.internal.ads.zzcei;
import java.util.Map;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
public final class wwf extends m3b {
    private final zzcei a;
    private final zzq b;
    private final Future c = pgb.a.j(new llf(this));
    private final Context d;
    private final dvf e;
    private WebView f;
    private pqa g;
    private gfa h;
    private AsyncTask i;

    public wwf(Context context, zzq zzqVar, String str, zzcei zzceiVar) {
        this.d = context;
        this.a = zzceiVar;
        this.b = zzqVar;
        this.f = new WebView(context);
        this.e = new dvf(context, str);
        w6(0);
        this.f.setVerticalScrollBarEnabled(false);
        this.f.getSettings().setJavaScriptEnabled(true);
        this.f.setWebViewClient(new mff(this));
        this.f.setOnTouchListener(new bif(this));
    }

    static /* bridge */ /* synthetic */ String C6(wwf wwfVar, String str) {
        if (wwfVar.h == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        try {
            parse = wwfVar.h.a(parse, wwfVar.d, null, null);
        } catch (zzavj e) {
            fgb.h("Unable to process ad data", e);
        }
        return parse.toString();
    }

    static /* bridge */ /* synthetic */ void F6(wwf wwfVar, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        wwfVar.d.startActivity(intent);
    }

    @Override // defpackage.q4b
    public final void B3(zzl zzlVar, cua cuaVar) {
    }

    @Override // defpackage.q4b
    public final void B4(rbb rbbVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.q4b
    public final void C2(zzw zzwVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.q4b
    public final void D0(ucb ucbVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.q4b
    public final void G4(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.q4b
    public final void I5(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.q4b
    public final void J3(qqa qqaVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.q4b
    public final void K4(pqa pqaVar) {
        this.g = pqaVar;
    }

    @Override // defpackage.q4b
    public final void N5(koa koaVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.q4b
    public final void O3(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.q4b
    public final boolean T() {
        return false;
    }

    @Override // defpackage.q4b
    public final void T5(cma cmaVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.q4b
    public final boolean V() {
        return false;
    }

    @Override // defpackage.q4b
    public final void V1(fhb fhbVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.q4b
    public final void W0(zzdu zzduVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.q4b
    public final void W2(zcc zccVar) {
    }

    @Override // defpackage.q4b
    public final void e() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.i.cancel(true);
        this.c.cancel(true);
        this.f.destroy();
        this.f = null;
    }

    @Override // defpackage.q4b
    public final void e3(x7b x7bVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.q4b
    public final void e5(r8b r8bVar) {
        throw new IllegalStateException("Unused method");
    }

    final int f(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            kia.b();
            return tfb.z(this.d, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @Override // defpackage.q4b
    public final String g() {
        return null;
    }

    @Override // defpackage.q4b
    public final void g1() {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.q4b
    public final void i4(ukb ukbVar) {
    }

    @Override // defpackage.q4b
    public final void n3(zzfk zzfkVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.q4b
    public final void o() {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.q4b
    public final boolean p3(zzl zzlVar) {
        Preconditions.checkNotNull(this.f, "This Search Ad has already been torn down");
        this.e.f(zzlVar, this.a);
        this.i = new msf(this, null).execute(new Void[0]);
        return true;
    }

    @Override // defpackage.q4b
    public final void q6(boolean z) {
    }

    @Override // defpackage.q4b
    public final void r6(a8b a8bVar, String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.q4b
    public final void s5(ee3 ee3Var) {
    }

    @Override // defpackage.q4b
    public final void v() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
    }

    final void w6(int i) {
        if (this.f == null) {
            return;
        }
        this.f.setLayoutParams(new ViewGroup.LayoutParams(-1, i));
    }

    @Override // defpackage.q4b
    public final void x5(zzq zzqVar) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // defpackage.q4b
    public final void z() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
    }

    @Override // defpackage.q4b
    public final Bundle zzd() {
        throw new IllegalStateException("Unused method");
    }

    @Override // defpackage.q4b
    public final zzq zzg() {
        return this.b;
    }

    @Override // defpackage.q4b
    public final pqa zzi() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // defpackage.q4b
    public final ucb zzj() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // defpackage.q4b
    public final qkc zzk() {
        return null;
    }

    @Override // defpackage.q4b
    public final znc zzl() {
        return null;
    }

    @Override // defpackage.q4b
    public final ee3 zzn() {
        Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        return fc5.l3(this.f);
    }

    final String zzp() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) era.d.e());
        builder.appendQueryParameter("query", this.e.d());
        builder.appendQueryParameter("pubId", this.e.c());
        builder.appendQueryParameter("mappver", this.e.a());
        Map e = this.e.e();
        for (String str : e.keySet()) {
            builder.appendQueryParameter(str, (String) e.get(str));
        }
        Uri build = builder.build();
        gfa gfaVar = this.h;
        if (gfaVar != null) {
            try {
                build = gfaVar.b(build, this.d);
            } catch (zzavj e2) {
                fgb.h("Unable to process ad data", e2);
            }
        }
        return zzq() + "#" + build.getEncodedQuery();
    }

    final String zzq() {
        String b = this.e.b();
        if (true == TextUtils.isEmpty(b)) {
            b = "www.google.com";
        }
        return "https://" + b + ((String) era.d.e());
    }

    @Override // defpackage.q4b
    public final String zzr() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // defpackage.q4b
    public final String zzs() {
        return null;
    }
}
