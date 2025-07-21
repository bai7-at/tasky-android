package com.nytimes.android.ads.games;

import android.content.Context;
import defpackage.by0;
import defpackage.d8;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.nytimes.android.ads.games.GameHubAdUseCase$invoke$1", f = "GameHubAdUseCase.kt", l = {23, 24, 39}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class GameHubAdUseCase$invoke$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Context $context;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GameHubAdUseCase this$0;

    static final class a implements FlowCollector {
        final /* synthetic */ FlowCollector a;

        a(FlowCollector flowCollector) {
            this.a = flowCollector;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(d8 d8Var, by0 by0Var) {
            Object emit = this.a.emit(d8Var, by0Var);
            return emit == kotlin.coroutines.intrinsics.a.h() ? emit : ww8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GameHubAdUseCase$invoke$1(GameHubAdUseCase gameHubAdUseCase, Context context, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = gameHubAdUseCase;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        GameHubAdUseCase$invoke$1 gameHubAdUseCase$invoke$1 = new GameHubAdUseCase$invoke$1(this.this$0, this.$context, by0Var);
        gameHubAdUseCase$invoke$1.L$0 = obj;
        return gameHubAdUseCase$invoke$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00e0 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r11.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2e
            if (r1 == r4) goto L26
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            kotlin.f.b(r12)
            goto Le1
        L16:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L1e:
            java.lang.Object r1 = r11.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.f.b(r12)
            goto L5c
        L26:
            java.lang.Object r1 = r11.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.f.b(r12)
            goto L43
        L2e:
            kotlin.f.b(r12)
            java.lang.Object r12 = r11.L$0
            kotlinx.coroutines.flow.FlowCollector r12 = (kotlinx.coroutines.flow.FlowCollector) r12
            d8$b r1 = d8.b.b
            r11.L$0 = r12
            r11.label = r4
            java.lang.Object r1 = r12.emit(r1, r11)
            if (r1 != r0) goto L42
            return r0
        L42:
            r1 = r12
        L43:
            com.nytimes.android.ads.games.GameHubAdUseCase r12 = r11.this$0
            com.nytimes.android.ads.usecase.FetchAdUseCase r4 = com.nytimes.android.ads.games.GameHubAdUseCase.d(r12)
            r11.L$0 = r1
            r11.label = r3
            r5 = 0
            java.lang.String r6 = "https://www.nytimes.com/crosswords"
            java.lang.String r7 = "play"
            r9 = 1
            r10 = 0
            r8 = r11
            java.lang.Object r12 = com.nytimes.android.ads.usecase.FetchAdUseCase.e(r4, r5, r6, r7, r8, r9, r10)
            if (r12 != r0) goto L5c
            return r0
        L5c:
            com.nytimes.android.ads.games.GameHubAdUseCase r12 = r11.this$0
            com.nytimes.android.ads.AdConfig$Builder r12 = com.nytimes.android.ads.games.GameHubAdUseCase.b(r12)
            com.nytimes.android.ads.AdConfig r12 = r12.b()
            java.lang.String r3 = "/crosswords/play"
            r12.a(r3)
            com.nytimes.android.ads.models.CommonAdKeys r3 = com.nytimes.android.ads.models.CommonAdKeys.CONTENT_TYPE
            java.lang.String r3 = r3.getKey()
            java.lang.String r4 = "play"
            kotlin.Pair r3 = defpackage.du8.a(r3, r4)
            com.nytimes.android.ads.models.CommonAdKeys r4 = com.nytimes.android.ads.models.CommonAdKeys.PAGE_VIEW_ID
            java.lang.String r4 = r4.getKey()
            com.nytimes.android.ads.games.GameHubAdUseCase r5 = r11.this$0
            com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope r5 = com.nytimes.android.ads.games.GameHubAdUseCase.c(r5)
            tx1 r5 = r5.c()
            if (r5 == 0) goto L95
            com.nytimes.android.eventtracker.context.PageContext r5 = r5.i()
            if (r5 == 0) goto L95
            java.lang.String r5 = r5.g()
            if (r5 != 0) goto L97
        L95:
            java.lang.String r5 = ""
        L97:
            kotlin.Pair r4 = defpackage.du8.a(r4, r5)
            com.nytimes.android.ads.models.CommonAdKeys r5 = com.nytimes.android.ads.models.CommonAdKeys.AB_EXPERIMENT
            java.lang.String r5 = r5.getKey()
            com.nytimes.android.ads.games.GameHubAdUseCase r6 = r11.this$0
            com.nytimes.android.abra.AbraManager r6 = com.nytimes.android.ads.games.GameHubAdUseCase.a(r6)
            java.lang.String r6 = com.nytimes.android.ads.utils.AdExtensionsKt.b(r6)
            kotlin.Pair r5 = defpackage.du8.a(r5, r6)
            kotlin.Pair[] r3 = new kotlin.Pair[]{r3, r4, r5}
            java.util.Map r3 = kotlin.collections.t.m(r3)
            r12.c(r3)
            android.content.Context r3 = r11.$context
            float r3 = com.nytimes.android.utils.DeviceUtils.q(r3)
            int r3 = (int) r3
            r12.q(r3)
            com.nytimes.android.ads.games.GameHubAdUseCase r3 = r11.this$0
            com.nytimes.android.ads.usecase.FetchAdUseCase r3 = com.nytimes.android.ads.games.GameHubAdUseCase.d(r3)
            java.lang.String r4 = "bottom"
            kotlinx.coroutines.flow.Flow r12 = r3.f(r12, r4)
            com.nytimes.android.ads.games.GameHubAdUseCase$invoke$1$a r3 = new com.nytimes.android.ads.games.GameHubAdUseCase$invoke$1$a
            r3.<init>(r1)
            r1 = 0
            r11.L$0 = r1
            r11.label = r2
            java.lang.Object r11 = r12.collect(r3, r11)
            if (r11 != r0) goto Le1
            return r0
        Le1:
            ww8 r11 = defpackage.ww8.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ads.games.GameHubAdUseCase$invoke$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(FlowCollector flowCollector, by0 by0Var) {
        return ((GameHubAdUseCase$invoke$1) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
    }
}
