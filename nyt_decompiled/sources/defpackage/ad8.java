package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes3.dex */
public final class ad8 implements f99 {
    private final ConstraintLayout a;
    public final ProgressBar b;
    public final WebView c;

    private ad8(ConstraintLayout constraintLayout, ProgressBar progressBar, WebView webView) {
        this.a = constraintLayout;
        this.b = progressBar;
        this.c = webView;
    }

    public static ad8 a(View view) {
        int i = dg6.progress_bar;
        ProgressBar progressBar = (ProgressBar) g99.a(view, i);
        if (progressBar != null) {
            i = dg6.webview;
            WebView webView = (WebView) g99.a(view, i);
            if (webView != null) {
                return new ad8((ConstraintLayout) view, progressBar, webView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ad8 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static ad8 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(vh6.survey_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // defpackage.f99
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
