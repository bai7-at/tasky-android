package com.nytimes.android.abra.io;

import com.nytimes.android.abra.models.AbraStoreKey;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.xd2;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import okhttp3.ResponseBody;

@fc1(c = "com.nytimes.android.abra.io.StoreClientKt$getFetcherFunc$1", f = "StoreClient.kt", l = {12, 13}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class StoreClientKt$getFetcherFunc$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ AbraService $abraService;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StoreClientKt$getFetcherFunc$1(AbraService abraService, by0<? super StoreClientKt$getFetcherFunc$1> by0Var) {
        super(2, by0Var);
        this.$abraService = abraService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        StoreClientKt$getFetcherFunc$1 storeClientKt$getFetcherFunc$1 = new StoreClientKt$getFetcherFunc$1(this.$abraService, by0Var);
        storeClientKt$getFetcherFunc$1.L$0 = obj;
        return storeClientKt$getFetcherFunc$1;
    }

    @Override // defpackage.gt2
    public final Object invoke(AbraStoreKey abraStoreKey, by0<? super xd2> by0Var) {
        return ((StoreClientKt$getFetcherFunc$1) create(abraStoreKey, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AbraStoreKey abraStoreKey;
        byte[] bArr;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            abraStoreKey = (AbraStoreKey) this.L$0;
            AbraService abraService = this.$abraService;
            String integration = abraStoreKey.getIntegration();
            this.L$0 = abraStoreKey;
            this.label = 1;
            obj = abraService.getAbraRules(integration, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bArr = (byte[]) this.L$0;
                f.b(obj);
                return new xd2.a(new Pair(bArr, ((ResponseBody) obj).source().B0()));
            }
            abraStoreKey = (AbraStoreKey) this.L$0;
            f.b(obj);
        }
        byte[] B0 = ((ResponseBody) obj).source().B0();
        AbraService abraService2 = this.$abraService;
        String bundleUrl = abraStoreKey.getBundleUrl();
        this.L$0 = B0;
        this.label = 2;
        Object abraCode = abraService2.getAbraCode(bundleUrl, this);
        if (abraCode == h) {
            return h;
        }
        obj = abraCode;
        bArr = B0;
        return new xd2.a(new Pair(bArr, ((ResponseBody) obj).source().B0()));
    }
}
