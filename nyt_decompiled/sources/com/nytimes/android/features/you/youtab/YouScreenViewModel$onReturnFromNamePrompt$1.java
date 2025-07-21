package com.nytimes.android.features.you.youtab;

import com.nytimes.android.subauth.core.api.setup.Subauth;
import com.nytimes.android.subauth.core.auth.userdetails.a;
import com.nytimes.android.subauth.core.database.userdata.UserData;
import com.nytimes.android.subauth.core.database.userdata.subscription.UserSubscriptionEntitlement;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.pm9;
import defpackage.ww8;
import defpackage.xz8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.i;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@fc1(c = "com.nytimes.android.features.you.youtab.YouScreenViewModel$onReturnFromNamePrompt$1", f = "YouScreenViewModel.kt", l = {415}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class YouScreenViewModel$onReturnFromNamePrompt$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ YouScreenViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    YouScreenViewModel$onReturnFromNamePrompt$1(YouScreenViewModel youScreenViewModel, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = youScreenViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new YouScreenViewModel$onReturnFromNamePrompt$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        Subauth subauth;
        MutableStateFlow mutableStateFlow2;
        Set set;
        pm9 T;
        Set<UserSubscriptionEntitlement> activeEntitlements;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            mutableStateFlow = this.this$0.g0;
            mutableStateFlow.setValue(cc0.a(false));
            subauth = this.this$0.u;
            xz8 q = subauth.q();
            this.label = 1;
            obj = q.c(true, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        com.nytimes.android.subauth.core.auth.userdetails.a aVar = (com.nytimes.android.subauth.core.auth.userdetails.a) obj;
        if (aVar instanceof a.b) {
            mutableStateFlow2 = this.this$0.Y;
            YouScreenViewModel youScreenViewModel = this.this$0;
            a.b bVar = (a.b) aVar;
            UserData a = bVar.a();
            String email = a != null ? a.email() : null;
            UserData a2 = bVar.a();
            if (a2 == null || (activeEntitlements = a2.getActiveEntitlements()) == null) {
                set = null;
            } else {
                Set<UserSubscriptionEntitlement> set2 = activeEntitlements;
                ArrayList arrayList = new ArrayList(i.w(set2, 10));
                Iterator<T> it2 = set2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((UserSubscriptionEntitlement) it2.next()).getRawValue());
                }
                set = i.c1(arrayList);
            }
            UserData a3 = bVar.a();
            T = youScreenViewModel.T(email, set, a3 != null ? a3.givenName() : null);
            mutableStateFlow2.setValue(T);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((YouScreenViewModel$onReturnFromNamePrompt$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
