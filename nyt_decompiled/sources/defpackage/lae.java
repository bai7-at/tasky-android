package defpackage;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class lae extends gae {
    public lae(z9e z9eVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(z9eVar, hashSet, jSONObject, j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.hae
    /* renamed from: a */
    public final void onPostExecute(String str) {
        v8e a;
        if (!TextUtils.isEmpty(str) && (a = v8e.a()) != null) {
            for (n8e n8eVar : a.c()) {
                if (this.c.contains(n8eVar.h())) {
                    n8eVar.g().f(str, this.e);
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (q9e.g(this.d, this.b.a())) {
            return null;
        }
        this.b.e(this.d);
        return this.d.toString();
    }

    @Override // defpackage.hae, android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }
}
