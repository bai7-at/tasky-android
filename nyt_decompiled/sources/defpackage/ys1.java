package defpackage;

import java.net.InetAddress;

/* loaded from: classes3.dex */
public final class ys1 implements xs1 {
    @Override // defpackage.xs1
    public InetAddress a(String str) {
        zq3.h(str, "host");
        InetAddress byName = InetAddress.getByName(str);
        zq3.g(byName, "InetAddress.getByName(host)");
        return byName;
    }
}
