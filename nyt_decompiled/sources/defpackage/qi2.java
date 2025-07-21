package defpackage;

import com.nytimes.android.analytics.handler.FacebookChannelHandler;
import com.nytimes.android.analytics.handler.FirebaseChannelHandler;
import com.nytimes.android.firebase.FirebaseModule;
import com.nytimes.android.firebase.compliance.FirebasePurrEventInterceptor;
import com.nytimes.android.firebase.device.FirebaseInstanceIdEventInterceptor;

/* loaded from: classes4.dex */
public abstract class qi2 implements ba2 {
    public static hc a(FirebaseModule firebaseModule, FacebookChannelHandler facebookChannelHandler, FirebaseChannelHandler firebaseChannelHandler, mn mnVar, cb2 cb2Var, qh2 qh2Var, FirebasePurrEventInterceptor firebasePurrEventInterceptor, pi2 pi2Var, FirebaseInstanceIdEventInterceptor firebaseInstanceIdEventInterceptor, pn pnVar) {
        return (hc) g16.e(firebaseModule.a(facebookChannelHandler, firebaseChannelHandler, mnVar, cb2Var, qh2Var, firebasePurrEventInterceptor, pi2Var, firebaseInstanceIdEventInterceptor, pnVar));
    }
}
