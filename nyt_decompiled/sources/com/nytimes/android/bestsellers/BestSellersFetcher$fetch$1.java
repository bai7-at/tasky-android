package com.nytimes.android.bestsellers;

import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.ApolloClient;
import com.nytimes.android.apolloschema.ExtensionsKt;
import com.nytimes.android.bestsellers.vo.BookCategory;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.q70;
import defpackage.v90;
import defpackage.ww8;
import defpackage.yj;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.i;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import org.threeten.bp.Instant;

@fc1(c = "com.nytimes.android.bestsellers.BestSellersFetcher$fetch$1", f = "BestSellersFetcher.kt", l = {28}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class BestSellersFetcher$fetch$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ BestSellersFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BestSellersFetcher$fetch$1(BestSellersFetcher bestSellersFetcher, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = bestSellersFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new BestSellersFetcher$fetch$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ApolloClient apolloClient;
        q70.f a;
        v90 a2;
        q70.a a3;
        q70.g a4;
        q70.b a5;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            apolloClient = this.this$0.a;
            Instant now = Instant.now();
            zq3.g(now, "now(...)");
            ApolloCall L = apolloClient.L(new q70(now));
            this.label = 1;
            obj = ExtensionsKt.a(L, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        q70.d dVar = (q70.d) ((yj) obj).c;
        List<q70.e> a6 = (dVar == null || (a3 = dVar.a()) == null || (a4 = a3.a()) == null || (a5 = a4.a()) == null) ? null : a5.a();
        if (a6 == null) {
            a6 = i.l();
        }
        BestSellersFetcher bestSellersFetcher = this.this$0;
        ArrayList arrayList = new ArrayList();
        for (q70.e eVar : a6) {
            BookCategory e = (eVar == null || (a = eVar.a()) == null || (a2 = a.a()) == null) ? null : bestSellersFetcher.e(a2);
            if (e != null) {
                arrayList.add(e);
            }
        }
        return arrayList;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((BestSellersFetcher$fetch$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
