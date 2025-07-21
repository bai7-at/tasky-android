package com.nytimes.android.hybrid;

import android.webkit.WebView;
import defpackage.by0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes4.dex */
public interface a {

    /* renamed from: com.nytimes.android.hybrid.a$a, reason: collision with other inner class name */
    public static final class C0329a {
        public static /* synthetic */ Object a(a aVar, WebView webView, String str, CoroutineDispatcher coroutineDispatcher, by0 by0Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: callAsync");
            }
            if ((i & 4) != 0) {
                coroutineDispatcher = Dispatchers.getMain();
            }
            return aVar.b(webView, str, coroutineDispatcher, by0Var);
        }
    }

    void a(WebView webView);

    Object b(WebView webView, String str, CoroutineDispatcher coroutineDispatcher, by0 by0Var);

    void c(WebView webView);
}
