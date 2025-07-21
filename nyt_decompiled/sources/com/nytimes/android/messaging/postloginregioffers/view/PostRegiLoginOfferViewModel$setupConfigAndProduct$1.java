package com.nytimes.android.messaging.postloginregioffers.view;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.messaging.postloginregioffers.model.PostRegiLoginOfferConfig;
import com.nytimes.android.subauth.core.purchase.models.productdetails.StoreFrontProductDetailsWithPrice;
import defpackage.by0;
import defpackage.du8;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.u06;
import defpackage.v28;
import defpackage.w28;
import defpackage.ww8;
import defpackage.z58;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import okhttp3.internal.http2.Http2;

@fc1(c = "com.nytimes.android.messaging.postloginregioffers.view.PostRegiLoginOfferViewModel$setupConfigAndProduct$1", f = "PostRegiLoginOfferViewModel.kt", l = {125}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PostRegiLoginOfferViewModel$setupConfigAndProduct$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ PostRegiLoginOfferConfig $postAuthConfig;
    int label;
    final /* synthetic */ PostRegiLoginOfferViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PostRegiLoginOfferViewModel$setupConfigAndProduct$1(PostRegiLoginOfferViewModel postRegiLoginOfferViewModel, PostRegiLoginOfferConfig postRegiLoginOfferConfig, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = postRegiLoginOfferViewModel;
        this.$postAuthConfig = postRegiLoginOfferConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new PostRegiLoginOfferViewModel$setupConfigAndProduct$1(this.this$0, this.$postAuthConfig, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object H;
        Set e;
        HashMap hashMap;
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        PostRegiLoginOfferConfig copy;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            z58 q = this.this$0.q();
            List e2 = i.e(u06.a(this.$postAuthConfig));
            this.label = 1;
            H = q.H(e2, 1, this);
            if (H == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            H = obj;
        }
        w28 w28Var = (w28) H;
        if (w28Var instanceof w28.b) {
            e = ((w28.b) w28Var).a();
        } else {
            NYTLogger.g("Error getting details from Register", new Object[0]);
            e = b0.e();
        }
        Iterator it2 = e.iterator();
        while (it2.hasNext()) {
            NYTLogger.d("Details are: sku " + ((v28) it2.next()).d(), new Object[0]);
        }
        if (e.isEmpty()) {
            hashMap = new HashMap();
        } else {
            StoreFrontProductDetailsWithPrice storeFrontProductDetailsWithPrice = new StoreFrontProductDetailsWithPrice((v28) i.j0(e));
            Map n = t.n(du8.a("fullPrice", String.valueOf(storeFrontProductDetailsWithPrice.a())), du8.a("period", String.valueOf(storeFrontProductDetailsWithPrice.b())));
            String d = storeFrontProductDetailsWithPrice.d();
            if (d != null) {
                n.put("introPrice", d);
            }
            hashMap = new HashMap(n);
        }
        mutableStateFlow = this.this$0.e;
        mutableStateFlow.setValue(hashMap);
        mutableStateFlow2 = this.this$0.t;
        copy = r4.copy((r32 & 1) != 0 ? r4.accountStatus : null, (r32 & 2) != 0 ? r4.header : null, (r32 & 4) != 0 ? r4.productTitle : null, (r32 & 8) != 0 ? r4.productSubHeader : null, (r32 & 16) != 0 ? r4.valuePropsHeader : null, (r32 & 32) != 0 ? r4.showValuePropsToggle : false, (r32 & 64) != 0 ? r4.valueProps : null, (r32 & 128) != 0 ? r4.footer : null, (r32 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? r4.subscribeButtonText : null, (r32 & 512) != 0 ? r4.continueButtonText : null, (r32 & 1024) != 0 ? r4.sku : null, (r32 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? r4.legalText : null, (r32 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? r4.scheduledSkus : null, (r32 & 8192) != 0 ? r4.urgencyMessaging : null, (r32 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? this.$postAuthConfig.hasIntroPrice : hashMap.containsKey("introPrice"));
        mutableStateFlow2.setValue(copy);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((PostRegiLoginOfferViewModel$setupConfigAndProduct$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
