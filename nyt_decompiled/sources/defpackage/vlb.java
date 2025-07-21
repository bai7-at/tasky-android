package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.overlay.h;

/* loaded from: classes3.dex */
public final class vlb extends WebChromeClient {
    private final wlb a;

    public vlb(wlb wlbVar) {
        this.a = wlbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Context b(WebView webView) {
        if (!(webView instanceof wlb)) {
            return webView.getContext();
        }
        wlb wlbVar = (wlb) webView;
        Activity zzi = wlbVar.zzi();
        return zzi != null ? zzi : wlbVar.getContext();
    }

    protected final boolean a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        wlb wlbVar;
        ela zzd;
        try {
            wlbVar = this.a;
        } catch (WindowManager.BadTokenException e) {
            fgb.h("Fail to display Dialog.", e);
        }
        if (wlbVar != null && wlbVar.zzN() != null && this.a.zzN().zzd() != null && (zzd = this.a.zzN().zzd()) != null && !zzd.c()) {
            zzd.b("window." + str + "('" + str3 + "')");
            return false;
        }
        dyf.r();
        AlertDialog.Builder j = wxf.j(context);
        j.setTitle(str2);
        if (z) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText(str3);
            EditText editText = new EditText(context);
            editText.setText(str4);
            linearLayout.addView(textView);
            linearLayout.addView(editText);
            j.setView(linearLayout).setPositiveButton(R.string.ok, new tlb(jsPromptResult, editText)).setNegativeButton(R.string.cancel, new slb(jsPromptResult)).setOnCancelListener(new rlb(jsPromptResult)).create().show();
        } else {
            j.setMessage(str3).setPositiveButton(R.string.ok, new qlb(jsResult)).setNegativeButton(R.string.cancel, new plb(jsResult)).setOnCancelListener(new olb(jsResult)).create().show();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof wlb)) {
            fgb.g("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        h u = ((wlb) webView).u();
        if (u == null) {
            fgb.g("Tried to close an AdWebView not associated with an overlay.");
        } else {
            u.zzb();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String str = "JS: " + consoleMessage.message() + " (" + consoleMessage.sourceId() + ":" + consoleMessage.lineNumber() + ")";
        if (str.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i = ulb.a[consoleMessage.messageLevel().ordinal()];
        if (i == 1) {
            fgb.d(str);
        } else if (i == 2) {
            fgb.g(str);
        } else if (i == 3 || i == 4) {
            fgb.f(str);
        } else if (i != 5) {
            fgb.f(str);
        } else {
            fgb.b(str);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.a.m() != null) {
            webView2.setWebViewClient(this.a.m());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j == 0) {
            if (j2 > j4 || j2 > PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
                j2 = 0;
            }
        } else if (j2 == 0) {
            j2 = Math.min(j + Math.min(PlaybackStateCompat.ACTION_PREPARE_FROM_URI, j4), PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
        } else {
            if (j2 <= Math.min(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED - j, j4)) {
                j += j2;
            }
            j2 = j;
        }
        quotaUpdater.updateQuota(j2);
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z;
        if (callback != null) {
            wlb wlbVar = this.a;
            dyf.r();
            if (!wxf.b0(wlbVar.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                wlb wlbVar2 = this.a;
                dyf.r();
                if (!wxf.b0(wlbVar2.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z = false;
                    callback.invoke(str, z, true);
                }
            }
            z = true;
            callback.invoke(str, z, true);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        h u = this.a.u();
        if (u == null) {
            fgb.g("Could not get ad overlay when hiding custom view.");
        } else {
            u.zzg();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return a(b(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        h u = this.a.u();
        if (u == null) {
            fgb.g("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
        } else {
            u.z6(view, customViewCallback);
            u.x6(i);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
