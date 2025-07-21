package com.nytimes.android.features.home.domain;

import com.apollographql.apollo.exception.ApolloHttpException;
import com.nytimes.android.features.home.data.HomeCacheManager;
import com.nytimes.android.features.home.data.HomeRepository;
import com.nytimes.android.features.home.data.NyTimesApolloHttpException;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.l93;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.threeten.bp.Instant;

@fc1(c = "com.nytimes.android.features.home.domain.HomeUseCase$fetchFromServer$2", f = "HomeUseCase.kt", l = {59, LockFreeTaskQueueCore.FROZEN_SHIFT, 64, 70}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HomeUseCase$fetchFromServer$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $oneWebViewGraphQLId;
    Object L$0;
    int label;
    final /* synthetic */ HomeUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeUseCase$fetchFromServer$2(HomeUseCase homeUseCase, String str, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = homeUseCase;
        this.$oneWebViewGraphQLId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new HomeUseCase$fetchFromServer$2(this.this$0, this.$oneWebViewGraphQLId, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        HomeCacheManager homeCacheManager;
        HomeCacheManager homeCacheManager2;
        HomeRepository homeRepository;
        String str;
        HomeCacheManager homeCacheManager3;
        Object h = a.h();
        int i = this.label;
        try {
        } catch (ApolloHttpException e) {
            if (e.a() != 304) {
                throw e;
            }
            homeCacheManager2 = this.this$0.b;
            this.L$0 = null;
            this.label = 3;
            obj = homeCacheManager2.f(this);
            if (obj == h) {
                return h;
            }
        } catch (NyTimesApolloHttpException e2) {
            if (e2.a() != 408) {
                throw e2;
            }
            homeCacheManager = this.this$0.b;
            this.L$0 = null;
            this.label = 4;
            obj = homeCacheManager.f(this);
            if (obj == h) {
                return h;
            }
        }
        if (i == 0) {
            f.b(obj);
            homeRepository = this.this$0.a;
            String str2 = this.$oneWebViewGraphQLId;
            this.label = 1;
            obj = homeRepository.g(str2, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    str = (String) this.L$0;
                    f.b(obj);
                    return new l93(str, (Instant) obj);
                }
                if (i == 3) {
                    f.b(obj);
                    l93 l93Var = (l93) obj;
                    if (l93Var != null) {
                        return l93Var;
                    }
                    throw new IllegalStateException("304 error with no data available in cache");
                }
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
                l93 l93Var2 = (l93) obj;
                if (l93Var2 != null) {
                    return l93Var2;
                }
                throw new IllegalStateException("304 error with no data available in cache");
            }
            f.b(obj);
        }
        str = (String) obj;
        homeCacheManager3 = this.this$0.b;
        this.L$0 = str;
        this.label = 2;
        obj = homeCacheManager3.g(str, this);
        if (obj == h) {
            return h;
        }
        return new l93(str, (Instant) obj);
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((HomeUseCase$fetchFromServer$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
