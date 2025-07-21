package com.nytimes.android;

import android.content.Intent;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.InteractiveAsset;
import com.nytimes.android.api.cms.PromoAsset;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2CoroutineScope;
import com.nytimes.android.m;
import defpackage.by0;
import defpackage.e32;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.or;
import defpackage.qs2;
import defpackage.rb5;
import defpackage.s55;
import defpackage.ss2;
import defpackage.tx1;
import defpackage.ue4;
import defpackage.wt6;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@fc1(c = "com.nytimes.android.SingleArticleActivity$ET2TrackPage$1", f = "SingleArticleActivity.kt", l = {570, 584}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SingleArticleActivity$ET2TrackPage$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ m $webViewContent;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SingleArticleActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleArticleActivity$ET2TrackPage$1(m mVar, SingleArticleActivity singleArticleActivity, by0 by0Var) {
        super(2, by0Var);
        this.$webViewContent = mVar;
        this.this$0 = singleArticleActivity;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(ET2CoroutineScope eT2CoroutineScope, by0 by0Var) {
        return ((SingleArticleActivity$ET2TrackPage$1) create(eT2CoroutineScope, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        SingleArticleActivity$ET2TrackPage$1 singleArticleActivity$ET2TrackPage$1 = new SingleArticleActivity$ET2TrackPage$1(this.$webViewContent, this.this$0, by0Var);
        singleArticleActivity$ET2TrackPage$1.L$0 = obj;
        return singleArticleActivity$ET2TrackPage$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h;
        Object h2;
        Object h3 = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            ET2CoroutineScope eT2CoroutineScope = (ET2CoroutineScope) this.L$0;
            m mVar = this.$webViewContent;
            if (mVar instanceof m.e) {
                final Asset a = ((m.e) mVar).a();
                e32 e32Var = ((a instanceof PromoAsset) || (a instanceof InteractiveAsset)) ? s55.v.c : s55.d.c;
                String url = a.getUrl();
                String uri = a.getUri();
                wt6.a aVar = wt6.Companion;
                Intent intent = this.this$0.getIntent();
                zq3.g(intent, "getIntent(...)");
                wt6 a2 = aVar.a(intent);
                qs2 qs2Var = new qs2() { // from class: com.nytimes.android.SingleArticleActivity$ET2TrackPage$1.1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final ue4 mo865invoke() {
                        return new or(Asset.this.getAssetId());
                    }
                };
                this.label = 1;
                h2 = eT2CoroutineScope.h(e32Var, (r23 & 2) != 0 ? null : url, (r23 & 4) != 0 ? null : uri, (r23 & 8) != 0 ? null : a2, (r23 & 16) != 0 ? null : null, (r23 & 32) != 0 ? new qs2() { // from class: com.nytimes.android.eventtracker.pagetracker.scope.ET2CoroutineScope$trackPage$2
                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final Void mo865invoke() {
                        return null;
                    }
                } : qs2Var, (r23 & 64) != 0 ? new ss2() { // from class: com.nytimes.android.eventtracker.pagetracker.scope.ET2CoroutineScope$trackPage$3
                    public final void b(tx1 tx1Var) {
                        zq3.h(tx1Var, "$this$null");
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        b((tx1) obj2);
                        return ww8.a;
                    }
                } : null, (r23 & 128) != 0 ? new ss2() { // from class: com.nytimes.android.eventtracker.pagetracker.scope.ET2CoroutineScope$trackPage$4
                    public final void b(tx1 tx1Var) {
                        zq3.h(tx1Var, "$this$null");
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        b((tx1) obj2);
                        return ww8.a;
                    }
                } : null, this);
                if (h2 == h3) {
                    return h3;
                }
            } else if (mVar instanceof m.f) {
                e32 e32Var2 = this.this$0.Z() ? s55.p.c : s55.v.c;
                String c = this.this$0.Z() ? rb5.a.c(kotlin.text.h.w0(((m.f) this.$webViewContent).getUrl(), "/")) : ((m.f) this.$webViewContent).getUrl();
                wt6.a aVar2 = wt6.Companion;
                Intent intent2 = this.this$0.getIntent();
                zq3.g(intent2, "getIntent(...)");
                wt6 a3 = aVar2.a(intent2);
                this.label = 2;
                h = eT2CoroutineScope.h(e32Var2, (r23 & 2) != 0 ? null : c, (r23 & 4) != 0 ? null : null, (r23 & 8) != 0 ? null : a3, (r23 & 16) != 0 ? null : null, (r23 & 32) != 0 ? new qs2() { // from class: com.nytimes.android.eventtracker.pagetracker.scope.ET2CoroutineScope$trackPage$2
                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final Void mo865invoke() {
                        return null;
                    }
                } : null, (r23 & 64) != 0 ? new ss2() { // from class: com.nytimes.android.eventtracker.pagetracker.scope.ET2CoroutineScope$trackPage$3
                    public final void b(tx1 tx1Var) {
                        zq3.h(tx1Var, "$this$null");
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        b((tx1) obj2);
                        return ww8.a;
                    }
                } : null, (r23 & 128) != 0 ? new ss2() { // from class: com.nytimes.android.eventtracker.pagetracker.scope.ET2CoroutineScope$trackPage$4
                    public final void b(tx1 tx1Var) {
                        zq3.h(tx1Var, "$this$null");
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        b((tx1) obj2);
                        return ww8.a;
                    }
                } : null, this);
                if (h == h3) {
                    return h3;
                }
            } else {
                boolean z = mVar instanceof m.k;
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        return ww8.a;
    }
}
