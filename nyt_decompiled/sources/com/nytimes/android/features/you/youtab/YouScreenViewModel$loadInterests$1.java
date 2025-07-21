package com.nytimes.android.features.you.youtab;

import com.nytimes.android.coroutinesutils.DownloadState;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;

@fc1(c = "com.nytimes.android.features.you.youtab.YouScreenViewModel$loadInterests$1", f = "YouScreenViewModel.kt", l = {156, 190, 194}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class YouScreenViewModel$loadInterests$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ b $data;
    final /* synthetic */ boolean $forceFetch;
    int label;
    final /* synthetic */ YouScreenViewModel this$0;

    static final class a implements FlowCollector {
        final /* synthetic */ YouScreenViewModel a;

        a(YouScreenViewModel youScreenViewModel) {
            this.a = youScreenViewModel;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(DownloadState downloadState, by0 by0Var) {
            MutableStateFlow mutableStateFlow;
            DownloadState I;
            mutableStateFlow = this.a.w;
            I = this.a.I(downloadState);
            mutableStateFlow.setValue(I);
            return ww8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    YouScreenViewModel$loadInterests$1(YouScreenViewModel youScreenViewModel, boolean z, b bVar, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = youScreenViewModel;
        this.$forceFetch = z;
        this.$data = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new YouScreenViewModel$loadInterests$1(this.this$0, this.$forceFetch, this.$data, by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d8  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.you.youtab.YouScreenViewModel$loadInterests$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((YouScreenViewModel$loadInterests$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
