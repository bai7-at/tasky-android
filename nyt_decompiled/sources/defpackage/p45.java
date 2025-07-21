package defpackage;

import android.net.NetworkRequest;

/* loaded from: classes.dex */
public final class p45 {
    public static final p45 a = new p45();

    private p45() {
    }

    public static final NetworkRequest a(int[] iArr, int[] iArr2) {
        zq3.h(iArr, "capabilities");
        zq3.h(iArr2, "transports");
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i : iArr) {
            try {
                builder.addCapability(i);
            } catch (IllegalArgumentException e) {
                h94.e().l(t45.b.a(), "Ignoring adding capability '" + i + '\'', e);
            }
        }
        for (int i2 : iArr2) {
            builder.addTransportType(i2);
        }
        NetworkRequest build = builder.build();
        zq3.g(build, "networkRequest.build()");
        return build;
    }

    public final t45 b(int[] iArr, int[] iArr2) {
        zq3.h(iArr, "capabilities");
        zq3.h(iArr2, "transports");
        return new t45(a(iArr, iArr2));
    }

    public final boolean c(NetworkRequest networkRequest, int i) {
        zq3.h(networkRequest, "request");
        return networkRequest.hasCapability(i);
    }

    public final boolean d(NetworkRequest networkRequest, int i) {
        zq3.h(networkRequest, "request");
        return networkRequest.hasTransport(i);
    }
}
