package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public final class dn9 implements f99 {
    private final ConstraintLayout a;
    public final ProgressBar b;
    public final WebView c;

    private dn9(ConstraintLayout constraintLayout, ProgressBar progressBar, WebView webView) {
        this.a = constraintLayout;
        this.b = progressBar;
        this.c = webView;
    }

    public static dn9 a(LayoutInflater layoutInflater) {
        return b(layoutInflater, null, false);
    }

    public static dn9 b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(si6.activity_challenge, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return c(inflate);
    }

    public static dn9 c(View view) {
        String str;
        ProgressBar progressBar = (ProgressBar) view.findViewById(uf6.progressBar);
        if (progressBar != null) {
            WebView webView = (WebView) view.findViewById(uf6.webview);
            if (webView != null) {
                return new dn9((ConstraintLayout) view, progressBar, webView);
            }
            str = "webview";
        } else {
            str = "progressBar";
        }
        throw new NullPointerException("Missing required view with ID: ".concat(str));
    }

    @Override // defpackage.f99
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
