package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.nytimes.android.designsystem.uiview.ProgressTextView;

/* loaded from: classes4.dex */
public final class zp2 implements f99 {
    private final FrameLayout a;
    public final ComposeView b;
    public final RecyclerView c;
    public final FrameLayout d;
    public final ProgressTextView e;
    public final SwipeRefreshLayout f;

    private zp2(FrameLayout frameLayout, ComposeView composeView, RecyclerView recyclerView, FrameLayout frameLayout2, ProgressTextView progressTextView, SwipeRefreshLayout swipeRefreshLayout) {
        this.a = frameLayout;
        this.b = composeView;
        this.c = recyclerView;
        this.d = frameLayout2;
        this.e = progressTextView;
        this.f = swipeRefreshLayout;
    }

    public static zp2 a(View view) {
        int i = ig6.composable;
        ComposeView composeView = (ComposeView) g99.a(view, i);
        if (composeView != null) {
            i = ig6.dailyFiveFeedRv;
            RecyclerView recyclerView = (RecyclerView) g99.a(view, i);
            if (recyclerView != null) {
                FrameLayout frameLayout = (FrameLayout) view;
                i = ig6.progressIndicator;
                ProgressTextView progressTextView = (ProgressTextView) g99.a(view, i);
                if (progressTextView != null) {
                    i = ig6.swipeRefreshLayout;
                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) g99.a(view, i);
                    if (swipeRefreshLayout != null) {
                        return new zp2(frameLayout, composeView, recyclerView, frameLayout, progressTextView, swipeRefreshLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static zp2 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(ai6.fragment_daily_five, viewGroup, false);
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
