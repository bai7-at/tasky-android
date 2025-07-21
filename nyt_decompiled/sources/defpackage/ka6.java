package defpackage;

import com.nytimes.android.internal.pushmessaging.model.a;
import com.nytimes.android.internal.pushmessaging.subscription.PushSubscriptionAPI;
import retrofit2.Retrofit;

/* loaded from: classes4.dex */
public abstract class ka6 implements ba2 {
    public static PushSubscriptionAPI a(ga6 ga6Var, Retrofit.Builder builder, a aVar) {
        return (PushSubscriptionAPI) g16.e(ga6Var.f(builder, aVar));
    }
}
