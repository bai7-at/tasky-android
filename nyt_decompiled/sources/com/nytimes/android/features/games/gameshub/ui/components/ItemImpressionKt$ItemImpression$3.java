package com.nytimes.android.features.games.gameshub.ui.components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2CoroutineScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2CoroutineScopeKt;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.tx1;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@fc1(c = "com.nytimes.android.features.games.gameshub.ui.components.ItemImpressionKt$ItemImpression$3", f = "ItemImpression.kt", l = {35}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ItemImpressionKt$ItemImpression$3 extends SuspendLambda implements gt2 {
    final /* synthetic */ Context $context;
    final /* synthetic */ ss2 $isCurrentET2Page;
    final /* synthetic */ sy4 $onCorrectET2Page$delegate;
    private /* synthetic */ Object L$0;
    int label;

    static final class a implements FlowCollector {
        final /* synthetic */ sy4 a;

        a(sy4 sy4Var) {
            this.a = sy4Var;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(tx1 tx1Var, by0 by0Var) {
            ItemImpressionKt.c(this.a, true);
            return ww8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ItemImpressionKt$ItemImpression$3(Context context, ss2 ss2Var, sy4 sy4Var, by0 by0Var) {
        super(2, by0Var);
        this.$context = context;
        this.$isCurrentET2Page = ss2Var;
        this.$onCorrectET2Page$delegate = sy4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        ItemImpressionKt$ItemImpression$3 itemImpressionKt$ItemImpression$3 = new ItemImpressionKt$ItemImpression$3(this.$context, this.$isCurrentET2Page, this.$onCorrectET2Page$delegate, by0Var);
        itemImpressionKt$ItemImpression$3.L$0 = obj;
        return itemImpressionKt$ItemImpression$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            ET2CoroutineScope g = ET2CoroutineScopeKt.g((CoroutineScope) this.L$0, this.$context);
            final ss2 ss2Var = this.$isCurrentET2Page;
            sy4 sy4Var = this.$onCorrectET2Page$delegate;
            final Flow filterNotNull = FlowKt.filterNotNull(g.f());
            Flow distinctUntilChanged = FlowKt.distinctUntilChanged(new Flow() { // from class: com.nytimes.android.features.games.gameshub.ui.components.ItemImpressionKt$ItemImpression$3$invokeSuspend$lambda$0$$inlined$filter$1

                /* renamed from: com.nytimes.android.features.games.gameshub.ui.components.ItemImpressionKt$ItemImpression$3$invokeSuspend$lambda$0$$inlined$filter$1$2, reason: invalid class name */
                public static final class AnonymousClass2 implements FlowCollector {
                    final /* synthetic */ FlowCollector a;
                    final /* synthetic */ ss2 b;

                    @fc1(c = "com.nytimes.android.features.games.gameshub.ui.components.ItemImpressionKt$ItemImpression$3$invokeSuspend$lambda$0$$inlined$filter$1$2", f = "ItemImpression.kt", l = {219}, m = "emit")
                    /* renamed from: com.nytimes.android.features.games.gameshub.ui.components.ItemImpressionKt$ItemImpression$3$invokeSuspend$lambda$0$$inlined$filter$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(by0 by0Var) {
                            super(by0Var);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= RecyclerView.UNDEFINED_DURATION;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector, ss2 ss2Var) {
                        this.a = flowCollector;
                        this.b = ss2Var;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(java.lang.Object r5, defpackage.by0 r6) {
                        /*
                            r4 = this;
                            boolean r0 = r6 instanceof com.nytimes.android.features.games.gameshub.ui.components.ItemImpressionKt$ItemImpression$3$invokeSuspend$lambda$0$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r6
                            com.nytimes.android.features.games.gameshub.ui.components.ItemImpressionKt$ItemImpression$3$invokeSuspend$lambda$0$$inlined$filter$1$2$1 r0 = (com.nytimes.android.features.games.gameshub.ui.components.ItemImpressionKt$ItemImpression$3$invokeSuspend$lambda$0$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.nytimes.android.features.games.gameshub.ui.components.ItemImpressionKt$ItemImpression$3$invokeSuspend$lambda$0$$inlined$filter$1$2$1 r0 = new com.nytimes.android.features.games.gameshub.ui.components.ItemImpressionKt$ItemImpression$3$invokeSuspend$lambda$0$$inlined$filter$1$2$1
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.result
                            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L31
                            if (r2 != r3) goto L29
                            kotlin.f.b(r6)
                            goto L50
                        L29:
                            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                            r4.<init>(r5)
                            throw r4
                        L31:
                            kotlin.f.b(r6)
                            kotlinx.coroutines.flow.FlowCollector r6 = r4.a
                            r2 = r5
                            tx1 r2 = (defpackage.tx1) r2
                            ss2 r4 = r4.b
                            java.lang.Object r4 = r4.invoke(r2)
                            java.lang.Boolean r4 = (java.lang.Boolean) r4
                            boolean r4 = r4.booleanValue()
                            if (r4 == 0) goto L50
                            r0.label = r3
                            java.lang.Object r4 = r6.emit(r5, r0)
                            if (r4 != r1) goto L50
                            return r1
                        L50:
                            ww8 r4 = defpackage.ww8.a
                            return r4
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.games.gameshub.ui.components.ItemImpressionKt$ItemImpression$3$invokeSuspend$lambda$0$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector flowCollector, by0 by0Var) {
                    Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, ss2Var), by0Var);
                    return collect == a.h() ? collect : ww8.a;
                }
            });
            a aVar = new a(sy4Var);
            this.label = 1;
            if (distinctUntilChanged.collect(aVar, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((ItemImpressionKt$ItemImpression$3) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
