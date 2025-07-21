package com.nytimes.android.ads.hybrid;

import android.content.res.Resources;
import android.webkit.WebView;
import com.nytimes.android.hybrid.HybridScriptInflater;
import com.nytimes.android.logging.NYTLogger;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.bc;
import defpackage.kb3;
import defpackage.nb3;
import defpackage.ob3;
import defpackage.zq3;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;

/* loaded from: classes2.dex */
public final class HybridAdManagerImpl implements kb3 {
    private final bc a;
    private final CoroutineDispatcher b;
    private final HybridScriptInflater c;
    private final ob3 d;
    private final CoroutineScope e;
    private final i f;
    private nb3 g;
    private WeakReference h;

    public HybridAdManagerImpl(bc bcVar, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, HybridScriptInflater hybridScriptInflater, ob3 ob3Var) {
        CompletableJob Job$default;
        zq3.h(bcVar, "alsRepository");
        zq3.h(coroutineDispatcher, "dispatcher");
        zq3.h(coroutineDispatcher2, "mainDispatcher");
        zq3.h(hybridScriptInflater, "hybridScriptInflater");
        zq3.h(ob3Var, "hybridAdUtils");
        this.a = bcVar;
        this.b = coroutineDispatcher;
        this.c = hybridScriptInflater;
        this.d = ob3Var;
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        this.e = CoroutineScopeKt.CoroutineScope(Job$default.plus(coroutineDispatcher2));
        i d = new i.b().d();
        zq3.g(d, "build(...)");
        this.f = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String i(Map map) {
        return this.f.d(j.j(Map.class, String.class, String.class)).toJson(map);
    }

    @Override // defpackage.kb3
    public boolean a(WebView webView) {
        zq3.h(webView, "webView");
        try {
            this.d.a(webView);
            this.h = new WeakReference(webView);
            Resources resources = webView.getResources();
            zq3.g(resources, "getResources(...)");
            this.g = new nb3(resources, this.c);
            return true;
        } catch (Exception e) {
            NYTLogger.h(e);
            return false;
        }
    }

    @Override // defpackage.kb3
    public void b(String str, String str2, String str3) {
        zq3.h(str, "pageType");
        BuildersKt__Builders_commonKt.launch$default(this.e, null, null, new HybridAdManagerImpl$initializeMalice$1(this, str, str2, str3, null), 3, null);
    }

    @Override // defpackage.kb3
    public void c(String str) {
        zq3.h(str, "pageViewId");
        BuildersKt__Builders_commonKt.launch$default(this.e, null, null, new HybridAdManagerImpl$updatePageViewId$1(this, str, null), 3, null);
    }

    public void j(Map map) {
        zq3.h(map, "targetingData");
        BuildersKt__Builders_commonKt.launch$default(this.e, null, null, new HybridAdManagerImpl$updateAdTargeting$1(this, map, null), 3, null);
    }

    public /* synthetic */ HybridAdManagerImpl(bc bcVar, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, HybridScriptInflater hybridScriptInflater, ob3 ob3Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bcVar, (i & 2) != 0 ? Dispatchers.getIO() : coroutineDispatcher, (i & 4) != 0 ? Dispatchers.getMain() : coroutineDispatcher2, hybridScriptInflater, (i & 16) != 0 ? new ob3() : ob3Var);
    }
}
