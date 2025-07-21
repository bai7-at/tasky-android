package defpackage;

import com.appsflyer.AppsFlyerProperties;
import com.nytimes.android.analytics.api.Channel;
import com.nytimes.android.analytics.api.exception.EventRoutingException;

/* loaded from: classes2.dex */
public abstract class v42 {
    public static final Void a(uc ucVar, Channel channel) {
        zq3.h(ucVar, "<this>");
        zq3.h(channel, AppsFlyerProperties.CHANNEL);
        throw new EventRoutingException(ucVar.getClass().getSimpleName() + " cannot be routed to " + channel.name());
    }
}
