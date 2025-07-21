package com.nytimes.android.dimodules;

import com.nytimes.android.api.cms.LatestFeed;
import com.nytimes.android.api.config.model.CampaignCodes;
import com.nytimes.android.api.config.model.Marketing;
import com.nytimes.android.latestfeed.feed.FeedStore;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.dimodules.ApplicationModule$Companion$provideLatestCampaignCodes$1$1", f = "ApplicationModule.kt", l = {139}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ApplicationModule$Companion$provideLatestCampaignCodes$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ FeedStore $feedStore;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ApplicationModule$Companion$provideLatestCampaignCodes$1$1(FeedStore feedStore, by0 by0Var) {
        super(2, by0Var);
        this.$feedStore = feedStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new ApplicationModule$Companion$provideLatestCampaignCodes$1$1(this.$feedStore, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CampaignCodes campaignCodes;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            FeedStore feedStore = this.$feedStore;
            this.label = 1;
            obj = FeedStore.d(feedStore, false, this, 1, null);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        Marketing marketing = ((LatestFeed) obj).getMarketing();
        if (marketing == null || (campaignCodes = marketing.getCampaignCodes()) == null) {
            throw new IllegalStateException("no campaign codes");
        }
        return campaignCodes;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((ApplicationModule$Companion$provideLatestCampaignCodes$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
