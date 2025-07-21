package com.nytimes.android;

import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.m;
import com.nytimes.android.readerhybrid.HybridWebView;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.n98;
import defpackage.td3;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

@fc1(c = "com.nytimes.android.HybridWebViewLayoutKt$loadWebContentOrError$1", f = "HybridWebViewLayout.kt", l = {364, 365}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class HybridWebViewLayoutKt$loadWebContentOrError$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ m.f $content;
    final /* synthetic */ td3 $entryPoint;
    final /* synthetic */ String $urlToLoad;
    final /* synthetic */ HybridWebView $webView;
    int label;

    @fc1(c = "com.nytimes.android.HybridWebViewLayoutKt$loadWebContentOrError$1$1", f = "HybridWebViewLayout.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.HybridWebViewLayoutKt$loadWebContentOrError$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ m.f $content;
        final /* synthetic */ td3 $entryPoint;
        final /* synthetic */ String $urlToLoad;
        final /* synthetic */ HybridWebView $webView;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(td3 td3Var, HybridWebView hybridWebView, String str, m.f fVar, by0 by0Var) {
            super(2, by0Var);
            this.$entryPoint = td3Var;
            this.$webView = hybridWebView;
            this.$urlToLoad = str;
            this.$content = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass1(this.$entryPoint, this.$webView, this.$urlToLoad, this.$content, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
            this.$entryPoint.j().b(this.$webView, this.$urlToLoad);
            m.f fVar = this.$content;
            m.e eVar = fVar instanceof m.e ? (m.e) fVar : null;
            Asset a = eVar != null ? eVar.a() : null;
            this.$entryPoint.u().n(this.$content.hashCode(), this.$urlToLoad, a != null ? a.getAssetType() : null, a != null ? cc0.d(a.getLastModified()) : null, this.$content.e());
            return ww8.a;
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HybridWebViewLayoutKt$loadWebContentOrError$1(td3 td3Var, String str, HybridWebView hybridWebView, m.f fVar, by0 by0Var) {
        super(2, by0Var);
        this.$entryPoint = td3Var;
        this.$urlToLoad = str;
        this.$webView = hybridWebView;
        this.$content = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new HybridWebViewLayoutKt$loadWebContentOrError$1(this.$entryPoint, this.$urlToLoad, this.$webView, this.$content, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            n98 q = this.$entryPoint.q();
            String str = this.$urlToLoad;
            this.label = 1;
            if (q.c(str, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.f.b(obj);
                return ww8.a;
            }
            kotlin.f.b(obj);
        }
        MainCoroutineDispatcher main = Dispatchers.getMain();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$entryPoint, this.$webView, this.$urlToLoad, this.$content, null);
        this.label = 2;
        if (BuildersKt.withContext(main, anonymousClass1, this) == h) {
            return h;
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((HybridWebViewLayoutKt$loadWebContentOrError$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
