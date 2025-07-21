package defpackage;

import android.webkit.WebView;
import com.nytimes.android.hybrid.bridge.NativeBridge;
import com.squareup.moshi.i;
import java.util.Arrays;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes4.dex */
public final class y15 {
    private final i a;
    private final CoroutineDispatcher b;
    private final CoroutineDispatcher c;

    public y15(i iVar, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2) {
        zq3.h(iVar, "moshi");
        zq3.h(coroutineDispatcher, "defaultDispatcher");
        zq3.h(coroutineDispatcher2, "mainDispatcher");
        this.a = iVar;
        this.b = coroutineDispatcher;
        this.c = coroutineDispatcher2;
    }

    public final NativeBridge a(WebView webView, mc0... mc0VarArr) {
        zq3.h(webView, "webView");
        zq3.h(mc0VarArr, "extraCommands");
        return new NativeBridge(webView, this.a, this.b, this.c, (mc0[]) Arrays.copyOf(mc0VarArr, mc0VarArr.length));
    }
}
