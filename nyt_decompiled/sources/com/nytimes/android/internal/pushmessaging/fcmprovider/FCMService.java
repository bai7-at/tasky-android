package com.nytimes.android.internal.pushmessaging.fcmprovider;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import defpackage.e61;
import defpackage.r82;
import defpackage.zq3;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes4.dex */
public final class FCMService extends FirebaseMessagingService {
    private final CompletableJob a;
    private final CoroutineScope b;
    public r82 fcmTokenProvider;

    public FCMService() {
        CompletableJob SupervisorJob$default = SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null);
        this.a = SupervisorJob$default;
        this.b = CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault().plus(SupervisorJob$default));
    }

    public final r82 l() {
        r82 r82Var = this.fcmTokenProvider;
        if (r82Var != null) {
            return r82Var;
        }
        zq3.z("fcmTokenProvider");
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        e61.a.a().b(this);
    }

    @Override // com.google.firebase.messaging.d, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        Job.DefaultImpls.cancel$default((Job) this.a, (CancellationException) null, 1, (Object) null);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        zq3.h(remoteMessage, "remoteMessage");
        super.onMessageReceived(remoteMessage);
        BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new FCMService$onMessageReceived$1(remoteMessage, null), 3, null);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        zq3.h(str, "token");
        super.onNewToken(str);
        BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new FCMService$onNewToken$1(this, str, null), 3, null);
    }
}
