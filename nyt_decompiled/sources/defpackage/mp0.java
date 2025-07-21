package defpackage;

import android.app.Application;
import android.content.res.Resources;
import com.nytimes.android.subauth.core.api.setup.Subauth;
import com.nytimes.android.utils.NetworkStatus;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.PublishSubject;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class mp0 {
    public static final mp0 a = new mp0();

    private mp0() {
    }

    public final ex1 a(Application application, my3 my3Var, ly3 ly3Var, PublishSubject publishSubject, cd cdVar, NetworkStatus networkStatus, BehaviorSubject behaviorSubject, Subauth subauth, z58 z58Var, Resources resources, b04 b04Var, f98 f98Var, CoroutineDispatcher coroutineDispatcher, CoroutineScope coroutineScope) {
        zq3.h(application, "context");
        zq3.h(my3Var, "latestEComm");
        zq3.h(ly3Var, "latestCampaignCodes");
        zq3.h(publishSubject, "snackbarSubject");
        zq3.h(cdVar, "analyticsLogger");
        zq3.h(networkStatus, "networkStatus");
        zq3.h(behaviorSubject, "cachedSubauthUserAnalyticsHelperSubject");
        zq3.h(subauth, "subauth");
        zq3.h(z58Var, "subauthClient");
        zq3.h(resources, "resources");
        zq3.h(b04Var, "launchAccountBenefitsHelper");
        zq3.h(f98Var, "feedbackPageCallback");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        zq3.h(coroutineScope, "applicationContext");
        return new ex1(application, my3Var, ly3Var, publishSubject, networkStatus, cdVar, behaviorSubject, z58Var, subauth.h(), resources, b04Var, f98Var, coroutineDispatcher, coroutineScope);
    }
}
