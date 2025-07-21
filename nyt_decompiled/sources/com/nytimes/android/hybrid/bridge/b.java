package com.nytimes.android.hybrid.bridge;

import android.webkit.WebView;
import com.nytimes.android.hybrid.bridge.BridgeCommandResult;
import defpackage.by0;
import defpackage.mc0;
import defpackage.nc0;

/* loaded from: classes4.dex */
public final class b extends mc0 {
    public b() {
        super("ping");
    }

    @Override // defpackage.mc0
    public Object b(WebView webView, int i, nc0 nc0Var, by0 by0Var) {
        return BridgeCommandResult.a.d(BridgeCommandResult.Companion, i, null, 2, null);
    }
}
