package defpackage;

import com.google.android.gms.internal.ads.zzbrm;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final class m2b implements iya {
    private final l1b a;
    private final ugb b;
    final /* synthetic */ n2b c;

    public m2b(n2b n2bVar, l1b l1bVar, ugb ugbVar) {
        this.c = n2bVar;
        this.a = l1bVar;
        this.b = ugbVar;
    }

    @Override // defpackage.iya
    public final void a(String str) {
        try {
            if (str == null) {
                this.b.d(new zzbrm());
            } else {
                this.b.d(new zzbrm(str));
            }
        } catch (IllegalStateException unused) {
        } catch (Throwable th) {
            this.a.g();
            throw th;
        }
        this.a.g();
    }

    @Override // defpackage.iya
    public final void b(JSONObject jSONObject) {
        w1b w1bVar;
        try {
            try {
                ugb ugbVar = this.b;
                w1bVar = this.c.a;
                ugbVar.c(w1bVar.a(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e) {
                this.b.d(e);
            }
        } finally {
            this.a.g();
        }
    }
}
