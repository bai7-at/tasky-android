package okhttp3.internal.connection;

import com.chartbeat.androidsdk.QueryKeys;
import defpackage.g62;
import defpackage.zq3;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class RouteException extends RuntimeException {
    private final IOException firstConnectException;
    private IOException lastConnectException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteException(IOException iOException) {
        super(iOException);
        zq3.h(iOException, "firstConnectException");
        this.firstConnectException = iOException;
        this.lastConnectException = iOException;
    }

    public final void addConnectException(IOException iOException) {
        zq3.h(iOException, QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING);
        g62.a(this.firstConnectException, iOException);
        this.lastConnectException = iOException;
    }

    public final IOException getFirstConnectException() {
        return this.firstConnectException;
    }

    public final IOException getLastConnectException() {
        return this.lastConnectException;
    }
}
