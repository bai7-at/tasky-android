package okhttp3.internal.connection;

import defpackage.zq3;
import java.util.LinkedHashSet;
import java.util.Set;
import okhttp3.Route;

/* loaded from: classes5.dex */
public final class RouteDatabase {
    private final Set<Route> failedRoutes = new LinkedHashSet();

    public final synchronized void connected(Route route) {
        zq3.h(route, "route");
        this.failedRoutes.remove(route);
    }

    public final synchronized void failed(Route route) {
        zq3.h(route, "failedRoute");
        this.failedRoutes.add(route);
    }

    public final synchronized boolean shouldPostpone(Route route) {
        zq3.h(route, "route");
        return this.failedRoutes.contains(route);
    }
}
