package defpackage;

import android.os.AsyncTask;

/* loaded from: classes3.dex */
public abstract class hae extends AsyncTask {
    private iae a;
    protected final z9e b;

    public hae(z9e z9eVar) {
        this.b = z9eVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        iae iaeVar = this.a;
        if (iaeVar != null) {
            iaeVar.a(this);
        }
    }

    public final void b(iae iaeVar) {
        this.a = iaeVar;
    }
}
