package defpackage;

import com.google.android.gms.internal.ads.zzbrm;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final class u2b implements iya {
    private final ugb a;
    final /* synthetic */ v2b b;

    public u2b(v2b v2bVar, ugb ugbVar) {
        this.b = v2bVar;
        this.a = ugbVar;
    }

    @Override // defpackage.iya
    public final void a(String str) {
        try {
            if (str == null) {
                this.a.d(new zzbrm());
            } else {
                this.a.d(new zzbrm(str));
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // defpackage.iya
    public final void b(JSONObject jSONObject) {
        try {
            this.a.c(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.a.d(e);
        }
    }
}
