package defpackage;

import com.nytimes.android.analytics.handler.FacebookChannelHandler;
import com.nytimes.android.analytics.handler.FirebaseChannelHandler;
import io.reactivex.subjects.BehaviorSubject;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes2.dex */
public final class kc {
    public static final kc a = new kc();

    private kc() {
    }

    public final FacebookChannelHandler a(p86 p86Var, CoroutineDispatcher coroutineDispatcher) {
        zq3.h(p86Var, "purrAnalyticsHelper");
        zq3.h(coroutineDispatcher, "defaultDispatcher");
        return new FacebookChannelHandler(p86Var, coroutineDispatcher);
    }

    public final FirebaseChannelHandler b(a19 a19Var, p86 p86Var, BehaviorSubject behaviorSubject, CoroutineDispatcher coroutineDispatcher) {
        zq3.h(a19Var, "userPropertiesProvider");
        zq3.h(p86Var, "purrAnalyticsHelper");
        zq3.h(behaviorSubject, "cachedSubauthUserAnalyticsHelperSubject");
        zq3.h(coroutineDispatcher, "defaultDispatcher");
        return new FirebaseChannelHandler(a19Var, p86Var, behaviorSubject, coroutineDispatcher);
    }
}
