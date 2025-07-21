package com.nytimes.xwords.hybrid;

import android.content.SharedPreferences;
import android.webkit.WebView;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.hybrid.bridge.JavascriptEventParameter;
import com.nytimes.android.hybrid.bridge.NativeBridge;
import com.squareup.moshi.i;
import defpackage.ac3;
import defpackage.bc3;
import defpackage.by0;
import defpackage.mc0;
import defpackage.rd3;
import defpackage.zq3;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

/* loaded from: classes4.dex */
public final class WebViewInitializer implements SharedPreferences.OnSharedPreferenceChangeListener, CoroutineScope {
    private final String a;
    private final bc3 b;
    private final ac3 c;
    private final CoroutineDispatcher d;
    private final CoroutineDispatcher e;
    private final i f;
    private final CompletableJob g;
    private NativeBridge h;
    private WebView i;

    public WebViewInitializer(String str, bc3 bc3Var, ac3 ac3Var, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, Job job, i iVar) {
        zq3.h(str, "hybridGameUrl");
        zq3.h(bc3Var, "hybridConfigInstaller");
        zq3.h(ac3Var, "hybridConfigBuilder");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        zq3.h(coroutineDispatcher2, "mainDispatcher");
        zq3.h(job, "parentJob");
        zq3.h(iVar, "moshi");
        this.a = str;
        this.b = bc3Var;
        this.c = ac3Var;
        this.d = coroutineDispatcher;
        this.e = coroutineDispatcher2;
        this.f = iVar;
        this.g = JobKt.Job(job);
    }

    public final void g(WebView webView, String str, mc0... mc0VarArr) {
        zq3.h(webView, "webView");
        zq3.h(str, "userAgent");
        zq3.h(mc0VarArr, "extraCommands");
        this.i = webView;
        rd3.a.a(webView, false, str);
        mc0[] mc0VarArr2 = (mc0[]) Arrays.copyOf(mc0VarArr, mc0VarArr.length);
        this.h = new NativeBridge(webView, this.f, this.d, this.e, mc0VarArr2);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.g.plus(this.d);
    }

    public final void h(String str) {
        zq3.h(str, AssetConstants.HTML);
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new WebViewInitializer$loadData$1(this, str, null), 3, null);
    }

    public final void i() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new WebViewInitializer$onContentLoaded$1(this, null), 3, null);
    }

    public final void j() {
        NativeBridge nativeBridge = this.h;
        if (nativeBridge != null) {
            if (nativeBridge == null) {
                zq3.z("nativeBridge");
                nativeBridge = null;
            }
            nativeBridge.i();
        }
        Job.DefaultImpls.cancel$default((Job) this.g, (CancellationException) null, 1, (Object) null);
    }

    public final Object k(JavascriptEventParameter javascriptEventParameter, Class cls, by0 by0Var) {
        NativeBridge nativeBridge = this.h;
        if (nativeBridge == null) {
            zq3.z("nativeBridge");
            nativeBridge = null;
        }
        return nativeBridge.f(javascriptEventParameter, cls, by0Var);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
    }
}
