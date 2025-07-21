package com.nytimes.android.features.you.youtab;

import com.comscore.streaming.ContentFeedType;
import com.nytimes.android.coroutinesutils.DownloadState;
import com.nytimes.android.interests.InterestsManager;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.features.you.youtab.YouScreenViewModel$removeInterest$1", f = "YouScreenViewModel.kt", l = {ContentFeedType.WEST_HD}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class YouScreenViewModel$removeInterest$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ com.nytimes.android.interests.db.a $interest;
    final /* synthetic */ qs2 $onError;
    int label;
    final /* synthetic */ YouScreenViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    YouScreenViewModel$removeInterest$1(YouScreenViewModel youScreenViewModel, com.nytimes.android.interests.db.a aVar, qs2 qs2Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = youScreenViewModel;
        this.$interest = aVar;
        this.$onError = qs2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new YouScreenViewModel$removeInterest$1(this.this$0, this.$interest, this.$onError, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterestsManager interestsManager;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            this.this$0.Q0(this.$interest.d(), this.$interest.e());
            interestsManager = this.this$0.r;
            com.nytimes.android.interests.db.a aVar = this.$interest;
            final YouScreenViewModel youScreenViewModel = this.this$0;
            qs2 qs2Var = new qs2() { // from class: com.nytimes.android.features.you.youtab.YouScreenViewModel$removeInterest$1.1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m440invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m440invoke() {
                    YouScreenViewModel youScreenViewModel2 = YouScreenViewModel.this;
                    YouScreenViewModel.a0(youScreenViewModel2, (b) ((DownloadState) youScreenViewModel2.H().getValue()).a(), false, 2, null);
                }
            };
            final qs2 qs2Var2 = this.$onError;
            qs2 qs2Var3 = new qs2() { // from class: com.nytimes.android.features.you.youtab.YouScreenViewModel$removeInterest$1.2
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m441invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m441invoke() {
                    qs2.this.mo865invoke();
                }
            };
            this.label = 1;
            if (interestsManager.k(aVar, qs2Var, qs2Var3, this) == h) {
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
        return ((YouScreenViewModel$removeInterest$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
