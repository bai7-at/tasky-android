package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.nytimes.android.designsystem.uiview.ProgressTextView;
import com.nytimes.android.readerhybrid.HybridWebView;

/* loaded from: classes4.dex */
public final class o93 implements f99 {
    private final FrameLayout a;
    public final ComposeView b;
    public final FrameLayout c;
    public final ProgressTextView d;
    public final HybridWebView e;
    public final SwipeRefreshLayout f;

    private o93(FrameLayout frameLayout, ComposeView composeView, FrameLayout frameLayout2, ProgressTextView progressTextView, HybridWebView hybridWebView, SwipeRefreshLayout swipeRefreshLayout) {
        this.a = frameLayout;
        this.b = composeView;
        this.c = frameLayout2;
        this.d = progressTextView;
        this.e = hybridWebView;
        this.f = swipeRefreshLayout;
    }

    public static o93 a(View view) {
        int i = og6.composable;
        ComposeView composeView = (ComposeView) g99.a(view, i);
        if (composeView != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            i = og6.progressIndicator;
            ProgressTextView progressTextView = (ProgressTextView) g99.a(view, i);
            if (progressTextView != null) {
                i = og6.webView;
                HybridWebView hybridWebView = (HybridWebView) g99.a(view, i);
                if (hybridWebView != null) {
                    i = og6.webViewRefreshLayout;
                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) g99.a(view, i);
                    if (swipeRefreshLayout != null) {
                        return new o93(frameLayout, composeView, frameLayout, progressTextView, hybridWebView, swipeRefreshLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static o93 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(gi6.home_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // defpackage.f99
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.a;
    }
}
