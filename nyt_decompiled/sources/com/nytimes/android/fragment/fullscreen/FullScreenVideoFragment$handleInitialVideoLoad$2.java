package com.nytimes.android.fragment.fullscreen;

import com.comscore.streaming.AdvertisementType;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2CoroutineScope;
import com.nytimes.android.media.common.NYTMediaItem;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.s55;
import defpackage.ss2;
import defpackage.tx1;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.fragment.fullscreen.FullScreenVideoFragment$handleInitialVideoLoad$2", f = "FullScreenVideoFragment.kt", l = {AdvertisementType.BRANDED_DURING_LIVE}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FullScreenVideoFragment$handleInitialVideoLoad$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ NYTMediaItem $videoItem;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FullScreenVideoFragment$handleInitialVideoLoad$2(NYTMediaItem nYTMediaItem, by0 by0Var) {
        super(2, by0Var);
        this.$videoItem = nYTMediaItem;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(ET2CoroutineScope eT2CoroutineScope, by0 by0Var) {
        return ((FullScreenVideoFragment$handleInitialVideoLoad$2) create(eT2CoroutineScope, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        FullScreenVideoFragment$handleInitialVideoLoad$2 fullScreenVideoFragment$handleInitialVideoLoad$2 = new FullScreenVideoFragment$handleInitialVideoLoad$2(this.$videoItem, by0Var);
        fullScreenVideoFragment$handleInitialVideoLoad$2.L$0 = obj;
        return fullScreenVideoFragment$handleInitialVideoLoad$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h;
        Object h2 = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            ET2CoroutineScope eT2CoroutineScope = (ET2CoroutineScope) this.L$0;
            s55.e eVar = s55.e.c;
            String u = this.$videoItem.u();
            String E = this.$videoItem.E();
            this.label = 1;
            h = eT2CoroutineScope.h(eVar, (r23 & 2) != 0 ? null : E, (r23 & 4) != 0 ? null : u, (r23 & 8) != 0 ? null : null, (r23 & 16) != 0 ? null : null, (r23 & 32) != 0 ? new qs2() { // from class: com.nytimes.android.eventtracker.pagetracker.scope.ET2CoroutineScope$trackPage$2
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
            if (h == h2) {
                return h2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }
}
