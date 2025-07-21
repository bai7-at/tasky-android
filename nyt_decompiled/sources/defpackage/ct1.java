package defpackage;

import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import com.appsflyer.AppsFlyerProperties;
import com.nytimes.android.analytics.api.Channel;
import com.nytimes.android.analytics.api.values.DeviceOrientation;
import com.nytimes.android.analytics.api.values.SubscriptionLevel;
import com.nytimes.android.analytics.event.messaging.DockMessageAttribute;
import com.nytimes.android.analytics.event.messaging.DockType;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.collections.b0;

/* loaded from: classes2.dex */
public final class ct1 implements ci2 {
    private final DockType a;
    private final int b;
    private final DockMessageAttribute c;
    private final DeviceOrientation d;
    private final String e;
    private final String f;
    private final String g;
    private final SubscriptionLevel h;
    private final String i;
    private final long j;

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

    public ct1(DockType dockType, int i, DockMessageAttribute dockMessageAttribute, DeviceOrientation deviceOrientation, String str, String str2, String str3, SubscriptionLevel subscriptionLevel, String str4, long j) {
        zq3.h(dockType, "action");
        zq3.h(dockMessageAttribute, "message");
        zq3.h(deviceOrientation, "orientation");
        zq3.h(str, "buildNumber");
        zq3.h(str2, "appVersion");
        zq3.h(str3, "networkStatus");
        zq3.h(subscriptionLevel, "subscriptionLevel");
        zq3.h(str4, "sourceApp");
        this.a = dockType;
        this.b = i;
        this.c = dockMessageAttribute;
        this.d = deviceOrientation;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = subscriptionLevel;
        this.i = str4;
        this.j = j;
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
        w52Var.a("Message", this.c.getTitle());
        w52Var.a("app_version", this.f);
        w52Var.a("build_number", this.e);
        w52Var.a("network_status", this.g);
        w52Var.a("orientation", this.d.getTitle());
        w52Var.a("source_app", this.i);
        w52Var.a("subscription_level", this.h.getTitle());
        w52Var.e("time_stamp", this.j);
        if (channel == Channel.Facebook) {
            w52Var.a("Orientation", this.d.getTitle());
        }
    }

    @Override // defpackage.gl
    public String c(Channel channel) {
        zq3.h(channel, AppsFlyerProperties.CHANNEL);
        if (a.a[channel.ordinal()] == 1) {
            return "dockTapped";
        }
        v42.a(this, channel);
        throw new KotlinNothingValueException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ct1)) {
            return false;
        }
        ct1 ct1Var = (ct1) obj;
        return this.a == ct1Var.a && this.b == ct1Var.b && this.c == ct1Var.c && this.d == ct1Var.d && zq3.c(this.e, ct1Var.e) && zq3.c(this.f, ct1Var.f) && zq3.c(this.g, ct1Var.g) && this.h == ct1Var.h && zq3.c(this.i, ct1Var.i) && this.j == ct1Var.j;
    }

    public int hashCode() {
        return (((((((((((((((((this.a.hashCode() * 31) + Integer.hashCode(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + Long.hashCode(this.j);
    }

    public String toString() {
        return "DockTappedEvent(action=" + this.a + ", count=" + this.b + ", message=" + this.c + ", orientation=" + this.d + ", buildNumber=" + this.e + ", appVersion=" + this.f + ", networkStatus=" + this.g + ", subscriptionLevel=" + this.h + ", sourceApp=" + this.i + ", timestampSeconds=" + this.j + ")";
    }
}
