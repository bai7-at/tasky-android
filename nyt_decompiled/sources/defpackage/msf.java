package defpackage;

import android.os.AsyncTask;
import android.webkit.WebView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
final class msf extends AsyncTask {
    final /* synthetic */ wwf a;

    /* synthetic */ msf(wwf wwfVar, bpf bpfVar) {
        this.a = wwfVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String doInBackground(Void... voidArr) {
        Future future;
        try {
            wwf wwfVar = this.a;
            future = wwfVar.c;
            wwfVar.h = (gfa) future.get(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException e) {
            fgb.h("", e);
        } catch (TimeoutException e2) {
            fgb.h("", e2);
        }
        return this.a.zzp();
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        WebView webView;
        WebView webView2;
        wwf wwfVar = this.a;
        String str = (String) obj;
        webView = wwfVar.f;
        if (webView == null || str == null) {
            return;
        }
        webView2 = wwfVar.f;
        webView2.loadUrl(str);
    }
}
