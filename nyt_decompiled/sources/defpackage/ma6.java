package defpackage;

import android.app.Application;
import com.nytimes.android.internal.pushmessaging.database.PushMessagingDao;

/* loaded from: classes4.dex */
public abstract class ma6 implements ba2 {
    public static PushMessagingDao a(ga6 ga6Var, Application application) {
        return (PushMessagingDao) g16.e(ga6Var.h(application));
    }
}
