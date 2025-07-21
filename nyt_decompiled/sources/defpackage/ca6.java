package defpackage;

import android.app.Application;
import com.nytimes.android.internal.pushmessaging.PushMessaging;
import com.nytimes.android.internal.pushmessaging.subscription.SubscriptionWorker;
import com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerWorker;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public interface ca6 {

    public interface a {
        a a(Application application);

        a b(String str);

        ca6 build();

        a c(CoroutineScope coroutineScope);

        a d(a15 a15Var);

        a e(r82 r82Var);

        a f(PushMessaging.c cVar);
    }

    fa6 a();

    void b(TagManagerWorker tagManagerWorker);

    void c(SubscriptionWorker subscriptionWorker);
}
