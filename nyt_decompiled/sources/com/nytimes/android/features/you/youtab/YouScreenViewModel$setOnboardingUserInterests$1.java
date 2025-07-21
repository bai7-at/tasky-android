package com.nytimes.android.features.you.youtab;

import com.nytimes.android.interests.InterestsOnboardingManager;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.ww8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.features.you.youtab.YouScreenViewModel$setOnboardingUserInterests$1", f = "YouScreenViewModel.kt", l = {369}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class YouScreenViewModel$setOnboardingUserInterests$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ List<Integer> $interests;
    final /* synthetic */ qs2 $onError;
    int label;
    final /* synthetic */ YouScreenViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    YouScreenViewModel$setOnboardingUserInterests$1(YouScreenViewModel youScreenViewModel, List list, qs2 qs2Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = youScreenViewModel;
        this.$interests = list;
        this.$onError = qs2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new YouScreenViewModel$setOnboardingUserInterests$1(this.this$0, this.$interests, this.$onError, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterestsOnboardingManager interestsOnboardingManager;
        InterestsOnboardingManager interestsOnboardingManager2;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            interestsOnboardingManager = this.this$0.s;
            interestsOnboardingManager.d();
            interestsOnboardingManager2 = this.this$0.s;
            List<Integer> list = this.$interests;
            ArrayList arrayList = new ArrayList(i.w(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(cc0.c(((Number) it2.next()).intValue()));
            }
            final YouScreenViewModel youScreenViewModel = this.this$0;
            qs2 qs2Var = new qs2() { // from class: com.nytimes.android.features.you.youtab.YouScreenViewModel$setOnboardingUserInterests$1.2
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m442invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m442invoke() {
                    YouScreenViewModel.a0(YouScreenViewModel.this, null, false, 3, null);
                }
            };
            final qs2 qs2Var2 = this.$onError;
            qs2 qs2Var3 = new qs2() { // from class: com.nytimes.android.features.you.youtab.YouScreenViewModel$setOnboardingUserInterests$1.3
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m443invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m443invoke() {
                    qs2.this.mo865invoke();
                }
            };
            this.label = 1;
            if (interestsOnboardingManager2.f(arrayList, qs2Var, qs2Var3, this) == h) {
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
        return ((YouScreenViewModel$setOnboardingUserInterests$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
