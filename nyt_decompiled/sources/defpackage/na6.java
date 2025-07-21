package defpackage;

import com.nytimes.android.internal.pushmessaging.PushMessaging;
import com.nytimes.android.internal.pushmessaging.database.PushMessagingDao;
import com.nytimes.android.internal.pushmessaging.tagmanager.TagMetadataAPI;

/* loaded from: classes4.dex */
public abstract class na6 implements ba2 {
    public static vf8 a(ga6 ga6Var, TagMetadataAPI tagMetadataAPI, PushMessaging.c cVar, PushMessagingDao pushMessagingDao) {
        return (vf8) g16.e(ga6Var.i(tagMetadataAPI, cVar, pushMessagingDao));
    }
}
