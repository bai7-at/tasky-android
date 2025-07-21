package com.nytimes.android.fragment;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.nytimes.android.hybrid.bridge.BridgeCommandResult;
import defpackage.gt2;
import defpackage.zq3;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
final class WebViewFragment$onCreateView$2$setPTREEnabledCommand$1 extends Lambda implements gt2 {
    final /* synthetic */ WebViewFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebViewFragment$onCreateView$2$setPTREEnabledCommand$1(WebViewFragment webViewFragment) {
        super(2);
        this.this$0 = webViewFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(WebViewFragment webViewFragment, boolean z) {
        zq3.h(webViewFragment, "this$0");
        SwipeRefreshLayout u1 = webViewFragment.u1();
        if (u1 == null) {
            return;
        }
        u1.setEnabled(z);
    }

    public final BridgeCommandResult c(int i, final boolean z) {
        SwipeRefreshLayout u1 = this.this$0.u1();
        if (u1 != null) {
            final WebViewFragment webViewFragment = this.this$0;
            u1.post(new Runnable() { // from class: com.nytimes.android.fragment.c
                @Override // java.lang.Runnable
                public final void run() {
                    WebViewFragment$onCreateView$2$setPTREEnabledCommand$1.d(WebViewFragment.this, z);
                }
            });
        }
        return BridgeCommandResult.a.d(BridgeCommandResult.Companion, i, null, 2, null);
    }

    @Override // defpackage.gt2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return c(((Number) obj).intValue(), ((Boolean) obj2).booleanValue());
    }
}
