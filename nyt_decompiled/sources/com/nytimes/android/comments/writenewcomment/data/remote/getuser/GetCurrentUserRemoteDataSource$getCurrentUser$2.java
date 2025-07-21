package com.nytimes.android.comments.writenewcomment.data.remote.getuser;

import com.nytimes.android.coroutinesutils.FetchResult;
import com.nytimes.android.coroutinesutils.FetchResultKt;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.comments.writenewcomment.data.remote.getuser.GetCurrentUserRemoteDataSource$getCurrentUser$2", f = "GetCurrentUserRemoteDataSource.kt", l = {14}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class GetCurrentUserRemoteDataSource$getCurrentUser$2 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ GetCurrentUserRemoteDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetCurrentUserRemoteDataSource$getCurrentUser$2(GetCurrentUserRemoteDataSource getCurrentUserRemoteDataSource, by0<? super GetCurrentUserRemoteDataSource$getCurrentUser$2> by0Var) {
        super(2, by0Var);
        this.this$0 = getCurrentUserRemoteDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        return new GetCurrentUserRemoteDataSource$getCurrentUser$2(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GetCurrentUserApi getCurrentUserApi;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            getCurrentUserApi = this.this$0.getCurrentUserAPI;
            this.label = 1;
            obj = getCurrentUserApi.getCurrentUser(this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return FetchResultKt.c((FetchResult) obj, new ss2() { // from class: com.nytimes.android.comments.writenewcomment.data.remote.getuser.GetCurrentUserRemoteDataSource$getCurrentUser$2.1
            @Override // defpackage.ss2
            public final User invoke(GetCurrentUserResponse getCurrentUserResponse) {
                zq3.h(getCurrentUserResponse, "currentUserResponse");
                return new User(getCurrentUserResponse.getDisplayName(), getCurrentUserResponse.getLocation(), getCurrentUserResponse.getEmailMe(), getCurrentUserResponse.isReporter(), getCurrentUserResponse.getTitle());
            }
        });
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0<? super FetchResult<User>> by0Var) {
        return ((GetCurrentUserRemoteDataSource$getCurrentUser$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
