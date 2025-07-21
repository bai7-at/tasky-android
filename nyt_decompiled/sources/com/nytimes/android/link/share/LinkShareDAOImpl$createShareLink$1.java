package com.nytimes.android.link.share;

import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.ApolloClient;
import com.nytimes.android.apolloschema.ExtensionsKt;
import defpackage.by0;
import defpackage.f54;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.hz8;
import defpackage.m21;
import defpackage.mf5;
import defpackage.nk5;
import defpackage.pf5;
import defpackage.rp7;
import defpackage.ww8;
import defpackage.yj;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import type.ShareCodeOptions;

@fc1(c = "com.nytimes.android.link.share.LinkShareDAOImpl$createShareLink$1", f = "LinkShareDAOImpl.kt", l = {43}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class LinkShareDAOImpl$createShareLink$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $pageViewId;
    final /* synthetic */ rp7 $shareCodeRequest;
    int label;
    final /* synthetic */ LinkShareDAOImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LinkShareDAOImpl$createShareLink$1(LinkShareDAOImpl linkShareDAOImpl, rp7 rp7Var, String str, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = linkShareDAOImpl;
        this.$shareCodeRequest = rp7Var;
        this.$pageViewId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new LinkShareDAOImpl$createShareLink$1(this.this$0, this.$shareCodeRequest, this.$pageViewId, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ApolloClient apolloClient;
        m21.b a;
        pf5 b;
        f54 f54Var;
        m21.b a2;
        mf5 a3;
        f54 f54Var2;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            apolloClient = this.this$0.a;
            ApolloCall G = apolloClient.G(new m21(this.$shareCodeRequest.a(), nk5.a.b(new ShareCodeOptions(new nk5.c(this.$pageViewId)))));
            this.label = 1;
            obj = ExtensionsKt.a(G, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        yj yjVar = (yj) obj;
        m21.c cVar = (m21.c) yjVar.c;
        if (cVar != null && (a2 = cVar.a()) != null && (a3 = a2.a()) != null) {
            f54Var2 = this.this$0.b;
            hz8 b2 = f54Var2.b(a3);
            if (b2 != null) {
                return b2;
            }
        }
        m21.c cVar2 = (m21.c) yjVar.c;
        if (cVar2 != null && (a = cVar2.a()) != null && (b = a.b()) != null) {
            f54Var = this.this$0.b;
            return f54Var.a(b);
        }
        throw new IllegalStateException(("Can't handle share code response for " + this.$shareCodeRequest.a()).toString());
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((LinkShareDAOImpl$createShareLink$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
