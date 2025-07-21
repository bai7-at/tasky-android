package defpackage;

import com.nytimes.android.logging.remote.stream.LoggingRemoteStreamManager;
import com.nytimes.android.logging.remote.stream.debugging.NYTLoggingRemoteStreamDevSettingsFactory;
import java.util.Set;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class m05 {
    public final Set a(LoggingRemoteStreamManager loggingRemoteStreamManager) {
        zq3.h(loggingRemoteStreamManager, "loggingRemoteStreamManager");
        return b0.j(u05.a.a(), NYTLoggingRemoteStreamDevSettingsFactory.a.b(loggingRemoteStreamManager));
    }
}
