package defpackage;

import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import com.appsflyer.AppsFlyerProperties;
import com.nytimes.android.analytics.api.Channel;
import com.nytimes.android.analytics.api.values.DeviceOrientation;
import com.nytimes.android.analytics.api.values.SubscriptionLevel;
import com.nytimes.android.analytics.event.messaging.DockType;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.collections.b0;

/* loaded from: classes2.dex */
public final class gt1 implements ci2 {
    private final DockType a;
    private final int b;
    private final DeviceOrientation c;
    private final String d;
    private final String e;
    private final String f;
    private final SubscriptionLevel g;
    private final String h;
    private final long i;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Channel.values().length];
            try {
                iArr[Channel.Firebase.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    public gt1(DockType dockType, int i, DeviceOrientation deviceOrientation, String str, String str2, String str3, SubscriptionLevel subscriptionLevel, String str4, long j) {
        zq3.h(dockType, "action");
        zq3.h(deviceOrientation, "orientation");
        zq3.h(str, "buildNumber");
        zq3.h(str2, "appVersion");
        zq3.h(str3, "networkStatus");
        zq3.h(subscriptionLevel, "subscriptionLevel");
        zq3.h(str4, "sourceApp");
        this.a = dockType;
        this.b = i;
        this.c = deviceOrientation;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = subscriptionLevel;
        this.h = str4;
        this.i = j;
    }

    @Override // defpackage.j37
    public Set a() {
        return b0.d(Channel.Firebase);
    }

    @Override // defpackage.gl
    public void b(Channel channel, w52 w52Var) {
        zq3.h(channel, AppsFlyerProperties.CHANNEL);
        zq3.h(w52Var, "visitor");
        w52Var.a(JsonDocumentFields.ACTION, this.a.getTitle());
        w52Var.b("Count", this.b);
        w52Var.a("app_version", this.e);
        w52Var.a("build_number", this.d);
        w52Var.a("network_status", this.f);
        w52Var.a("orientation", this.c.getTitle());
        w52Var.a("source_app", this.h);
        w52Var.a("subscription_level", this.g.getTitle());
        w52Var.e("time_stamp", this.i);
        if (channel == Channel.Facebook) {
            w52Var.a("Orientation", this.c.getTitle());
        }
    }

    @Override // defpackage.gl
    public String c(Channel channel) {
        zq3.h(channel, AppsFlyerProperties.CHANNEL);
        if (a.a[channel.ordinal()] == 1) {
            return "dockViewed";
        }
        v42.a(this, channel);
        throw new KotlinNothingValueException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gt1)) {
            return false;
        }
        gt1 gt1Var = (gt1) obj;
        return this.a == gt1Var.a && this.b == gt1Var.b && this.c == gt1Var.c && zq3.c(this.d, gt1Var.d) && zq3.c(this.e, gt1Var.e) && zq3.c(this.f, gt1Var.f) && this.g == gt1Var.g && zq3.c(this.h, gt1Var.h) && this.i == gt1Var.i;
    }

    public int hashCode() {
        return (((((((((((((((this.a.hashCode() * 31) + Integer.hashCode(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + Long.hashCode(this.i);
    }

    public String toString() {
        return "DockViewedEvent(action=" + this.a + ", count=" + this.b + ", orientation=" + this.c + ", buildNumber=" + this.d + ", appVersion=" + this.e + ", networkStatus=" + this.f + ", subscriptionLevel=" + this.g + ", sourceApp=" + this.h + ", timestampSeconds=" + this.i + ")";
    }
}
