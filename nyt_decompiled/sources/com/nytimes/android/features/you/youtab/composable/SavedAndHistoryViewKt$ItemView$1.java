package com.nytimes.android.features.you.youtab.composable;

import androidx.compose.foundation.pager.PagerState;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import java.util.List;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.features.you.youtab.composable.SavedAndHistoryViewKt$ItemView$1", f = "SavedAndHistoryView.kt", l = {128}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SavedAndHistoryViewKt$ItemView$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ boolean $bothStates;
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ List<String> $images;
    final /* synthetic */ PagerState $pagerState;
    int label;

    @fc1(c = "com.nytimes.android.features.you.youtab.composable.SavedAndHistoryViewKt$ItemView$1$1", f = "SavedAndHistoryView.kt", l = {132}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.features.you.youtab.composable.SavedAndHistoryViewKt$ItemView$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ int $nextPage;
        final /* synthetic */ PagerState $pagerState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PagerState pagerState, int i, by0 by0Var) {
            super(2, by0Var);
            this.$pagerState = pagerState;
            this.$nextPage = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass1(this.$pagerState, this.$nextPage, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object h = a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                PagerState pagerState = this.$pagerState;
                int i2 = this.$nextPage;
                this.label = 1;
                if (PagerState.o(pagerState, i2, 0.0f, null, this, 6, null) == h) {
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
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavedAndHistoryViewKt$ItemView$1(boolean z, PagerState pagerState, List list, CoroutineScope coroutineScope, by0 by0Var) {
        super(2, by0Var);
        this.$bothStates = z;
        this.$pagerState = pagerState;
        this.$images = list;
        this.$coroutineScope = coroutineScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SavedAndHistoryViewKt$ItemView$1(this.$bothStates, this.$pagerState, this.$images, this.$coroutineScope, by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0026 -> B:5:0x0029). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r9.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.f.b(r10)
            goto L29
        Lf:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L17:
            kotlin.f.b(r10)
        L1a:
            boolean r10 = r9.$bothStates
            if (r10 == 0) goto L5b
            r9.label = r2
            r3 = 4000(0xfa0, double:1.9763E-320)
            java.lang.Object r10 = kotlinx.coroutines.DelayKt.delay(r3, r9)
            if (r10 != r0) goto L29
            return r0
        L29:
            androidx.compose.foundation.pager.PagerState r10 = r9.$pagerState
            int r10 = r10.w()
            java.util.List<java.lang.String> r1 = r9.$images
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            int r1 = r1 - r2
            if (r10 >= r1) goto L49
            androidx.compose.foundation.pager.PagerState r10 = r9.$pagerState
            int r10 = r10.w()
            int r10 = r10 + r2
            java.util.List<java.lang.String> r1 = r9.$images
            int r1 = r1.size()
            int r10 = r10 % r1
            goto L4a
        L49:
            r10 = 0
        L4a:
            kotlinx.coroutines.CoroutineScope r3 = r9.$coroutineScope
            com.nytimes.android.features.you.youtab.composable.SavedAndHistoryViewKt$ItemView$1$1 r6 = new com.nytimes.android.features.you.youtab.composable.SavedAndHistoryViewKt$ItemView$1$1
            androidx.compose.foundation.pager.PagerState r1 = r9.$pagerState
            r4 = 0
            r6.<init>(r1, r10, r4)
            r7 = 3
            r8 = 0
            r5 = 0
            kotlinx.coroutines.BuildersKt.launch$default(r3, r4, r5, r6, r7, r8)
            goto L1a
        L5b:
            ww8 r9 = defpackage.ww8.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.you.youtab.composable.SavedAndHistoryViewKt$ItemView$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SavedAndHistoryViewKt$ItemView$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
