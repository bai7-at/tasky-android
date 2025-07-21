package com.nytimes.android.readerhybrid;

import com.nytimes.android.api.cms.ArticleAsset;
import com.nytimes.android.hybrid.bridge.NativeBridge;
import defpackage.bc3;
import defpackage.by0;
import defpackage.ld3;
import defpackage.zq3;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes4.dex */
public final class HybridConfigManager {
    private final bc3 a;
    private final HybridConfigBuilder b;
    private final ld3 c;
    private final CoroutineDispatcher d;

    public HybridConfigManager(bc3 bc3Var, HybridConfigBuilder hybridConfigBuilder, ld3 ld3Var, CoroutineDispatcher coroutineDispatcher) {
        zq3.h(bc3Var, "hybridConfigInstaller");
        zq3.h(hybridConfigBuilder, "hybridConfigBuilder");
        zq3.h(ld3Var, "hybridScripts");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        this.a = bc3Var;
        this.b = hybridConfigBuilder;
        this.c = ld3Var;
        this.d = coroutineDispatcher;
    }

    public final Object d(ArticleAsset articleAsset, String str, WebViewType webViewType, NativeBridge nativeBridge, String str2, by0 by0Var) {
        return BuildersKt.withContext(this.d, new HybridConfigManager$getBridgeSupportedHtml$2(this, str2, articleAsset, str, webViewType, nativeBridge, null), by0Var);
    }

    public final Object e(ArticleAsset articleAsset, String str, by0 by0Var) {
        return BuildersKt.withContext(this.d, new HybridConfigManager$setHybridConfigScript$2(this, str, articleAsset, null), by0Var);
    }
}
