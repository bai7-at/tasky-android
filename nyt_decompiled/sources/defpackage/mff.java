package defpackage;

import android.graphics.Bitmap;
import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import io.embrace.android.embracesdk.WebViewClientSwazzledHooks;

/* loaded from: classes2.dex */
final class mff extends WebViewClient {
    final /* synthetic */ wwf a;

    mff(wwf wwfVar) {
        this.a = wwfVar;
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        WebViewClientSwazzledHooks._preOnPageStarted(webView, str, bitmap);
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        pqa pqaVar;
        pqa pqaVar2;
        pqa pqaVar3;
        pqa pqaVar4;
        wwf wwfVar = this.a;
        pqaVar = wwfVar.g;
        if (pqaVar != null) {
            try {
                pqaVar2 = wwfVar.g;
                pqaVar2.d(w2e.d(1, null, null));
            } catch (RemoteException e) {
                fgb.i("#007 Could not call remote method.", e);
            }
        }
        wwf wwfVar2 = this.a;
        pqaVar3 = wwfVar2.g;
        if (pqaVar3 != null) {
            try {
                pqaVar4 = wwfVar2.g;
                pqaVar4.i(0);
            } catch (RemoteException e2) {
                fgb.i("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        pqa pqaVar;
        pqa pqaVar2;
        pqa pqaVar3;
        pqa pqaVar4;
        pqa pqaVar5;
        pqa pqaVar6;
        pqa pqaVar7;
        pqa pqaVar8;
        pqa pqaVar9;
        pqa pqaVar10;
        pqa pqaVar11;
        pqa pqaVar12;
        pqa pqaVar13;
        if (str.startsWith(this.a.zzq())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            wwf wwfVar = this.a;
            pqaVar10 = wwfVar.g;
            if (pqaVar10 != null) {
                try {
                    pqaVar11 = wwfVar.g;
                    pqaVar11.d(w2e.d(3, null, null));
                } catch (RemoteException e) {
                    fgb.i("#007 Could not call remote method.", e);
                }
            }
            wwf wwfVar2 = this.a;
            pqaVar12 = wwfVar2.g;
            if (pqaVar12 != null) {
                try {
                    pqaVar13 = wwfVar2.g;
                    pqaVar13.i(3);
                } catch (RemoteException e2) {
                    fgb.i("#007 Could not call remote method.", e2);
                }
            }
            this.a.w6(0);
            return true;
        }
        if (str.startsWith("gmsg://scriptLoadFailed")) {
            wwf wwfVar3 = this.a;
            pqaVar6 = wwfVar3.g;
            if (pqaVar6 != null) {
                try {
                    pqaVar7 = wwfVar3.g;
                    pqaVar7.d(w2e.d(1, null, null));
                } catch (RemoteException e3) {
                    fgb.i("#007 Could not call remote method.", e3);
                }
            }
            wwf wwfVar4 = this.a;
            pqaVar8 = wwfVar4.g;
            if (pqaVar8 != null) {
                try {
                    pqaVar9 = wwfVar4.g;
                    pqaVar9.i(0);
                } catch (RemoteException e4) {
                    fgb.i("#007 Could not call remote method.", e4);
                }
            }
            this.a.w6(0);
            return true;
        }
        if (str.startsWith("gmsg://adResized")) {
            wwf wwfVar5 = this.a;
            pqaVar4 = wwfVar5.g;
            if (pqaVar4 != null) {
                try {
                    pqaVar5 = wwfVar5.g;
                    pqaVar5.zzi();
                } catch (RemoteException e5) {
                    fgb.i("#007 Could not call remote method.", e5);
                }
            }
            this.a.w6(this.a.f(str));
            return true;
        }
        if (str.startsWith("gmsg://")) {
            return true;
        }
        wwf wwfVar6 = this.a;
        pqaVar = wwfVar6.g;
        if (pqaVar != null) {
            try {
                pqaVar2 = wwfVar6.g;
                pqaVar2.zzc();
                pqaVar3 = this.a.g;
                pqaVar3.zzh();
            } catch (RemoteException e6) {
                fgb.i("#007 Could not call remote method.", e6);
            }
        }
        wwf.F6(this.a, wwf.C6(this.a, str));
        return true;
    }
}
