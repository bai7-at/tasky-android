package defpackage;

import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class kae extends gae {
    public kae(z9e z9eVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(z9eVar, hashSet, jSONObject, j);
    }

    private final void c(String str) {
        v8e a = v8e.a();
        if (a != null) {
            for (n8e n8eVar : a.c()) {
                if (this.c.contains(n8eVar.h())) {
                    n8eVar.g().d(str, this.e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.hae
    /* renamed from: a */
    public final void onPostExecute(String str) {
        c(str);
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.d.toString();
    }

    @Override // defpackage.hae, android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        c(str);
        super.onPostExecute(str);
    }
}
