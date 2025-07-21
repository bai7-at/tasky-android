package com.nytimes.android.analytics.event;

import com.appsflyer.AppsFlyerProperties;
import com.nytimes.android.analytics.api.Channel;
import com.nytimes.android.analytics.api.values.DeviceOrientation;
import com.nytimes.android.analytics.api.values.Edition;
import com.nytimes.android.analytics.api.values.SubscriptionLevel;
import defpackage.b22;
import defpackage.ci2;
import defpackage.k92;
import defpackage.w52;
import defpackage.zq3;
import java.util.Set;
import kotlin.collections.b0;

/* loaded from: classes2.dex */
public final class GatewayEvent implements k92, ci2 {
    private final ActionTaken a;
    private final String b;
    private final String c;
    private final String d;
    private final Integer e;
    private final DeviceOrientation f;
    private final String g;
    private final String h;
    private final String i;
    private final SubscriptionLevel j;
    private final String k;
    private final long l;
    private final Edition m;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ActionTaken {
        private static final /* synthetic */ b22 $ENTRIES;
        private static final /* synthetic */ ActionTaken[] $VALUES;
        private final String title;
        public static final ActionTaken LogIn = new ActionTaken("LogIn", 0, "Log In");
        public static final ActionTaken Back = new ActionTaken("Back", 1, "Back");
        public static final ActionTaken Swipe = new ActionTaken("Swipe", 2, "Swipe");
        public static final ActionTaken LearnMore = new ActionTaken("LearnMore", 3, "Learn More");
        public static final ActionTaken SeeMyOptions = new ActionTaken("SeeMyOptions", 4, "See My Options");

        private static final /* synthetic */ ActionTaken[] $values() {
            return new ActionTaken[]{LogIn, Back, Swipe, LearnMore, SeeMyOptions};
        }

        static {
            ActionTaken[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private ActionTaken(String str, int i, String str2) {
            this.title = str2;
        }

        public static b22 getEntries() {
            return $ENTRIES;
        }

        public static ActionTaken valueOf(String str) {
            return (ActionTaken) Enum.valueOf(ActionTaken.class, str);
        }

        public static ActionTaken[] values() {
            return (ActionTaken[]) $VALUES.clone();
        }

        public String getTitle() {
            return this.title;
        }
    }

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Channel.values().length];
            try {
                iArr[Channel.Firebase.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Channel.Facebook.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public GatewayEvent(ActionTaken actionTaken, String str, String str2, String str3, Integer num, DeviceOrientation deviceOrientation, String str4, String str5, String str6, SubscriptionLevel subscriptionLevel, String str7, long j, Edition edition) {
        zq3.h(actionTaken, "actionTaken");
        zq3.h(deviceOrientation, "orientation");
        zq3.h(str4, "buildNumber");
        zq3.h(str5, "appVersion");
        zq3.h(str6, "networkStatus");
        zq3.h(subscriptionLevel, "subscriptionLevel");
        zq3.h(str7, "sourceApp");
        zq3.h(edition, "edition");
        this.a = actionTaken;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = num;
        this.f = deviceOrientation;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = subscriptionLevel;
        this.k = str7;
        this.l = j;
        this.m = edition;
    }

    @Override // defpackage.j37
    public Set a() {
        return b0.j(Channel.Firebase, Channel.Facebook);
    }

    @Override // defpackage.gl
    public void b(Channel channel, w52 w52Var) {
        zq3.h(channel, AppsFlyerProperties.CHANNEL);
        zq3.h(w52Var, "visitor");
        w52Var.c("url", this.b);
        int i = a.a[channel.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            w52Var.a("Action Taken", this.a.getTitle());
            w52Var.a("Edition", this.m.getTitle());
            w52Var.a("Network Status", this.i);
            w52Var.a("Orientation", this.f.getTitle());
            w52Var.c("Section", this.c);
            w52Var.a("Subscription Level", this.j.getTitle());
            return;
        }
        w52Var.a("app_version", this.h);
        w52Var.a("build_number", this.g);
        w52Var.d("meter_count", this.e);
        w52Var.a("network_status", this.i);
        w52Var.a("orientation", this.f.getTitle());
        w52Var.a("source_app", this.k);
        w52Var.a("subscription_level", this.j.getTitle());
        w52Var.c("subscription_level", this.d);
        w52Var.e("time_stamp", this.l);
    }

    @Override // defpackage.gl
    public String c(Channel channel) {
        zq3.h(channel, AppsFlyerProperties.CHANNEL);
        int i = a.a[channel.ordinal()];
        if (i == 1) {
            return "gateway";
        }
        if (i == 2) {
            return "Gateway";
        }
        throw new IllegalStateException("Wrong channel");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GatewayEvent)) {
            return false;
        }
        GatewayEvent gatewayEvent = (GatewayEvent) obj;
        return this.a == gatewayEvent.a && zq3.c(this.b, gatewayEvent.b) && zq3.c(this.c, gatewayEvent.c) && zq3.c(this.d, gatewayEvent.d) && zq3.c(this.e, gatewayEvent.e) && this.f == gatewayEvent.f && zq3.c(this.g, gatewayEvent.g) && zq3.c(this.h, gatewayEvent.h) && zq3.c(this.i, gatewayEvent.i) && this.j == gatewayEvent.j && zq3.c(this.k, gatewayEvent.k) && this.l == gatewayEvent.l && this.m == gatewayEvent.m;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.e;
        return ((((((((((((((((hashCode4 + (num != null ? num.hashCode() : 0)) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + Long.hashCode(this.l)) * 31) + this.m.hashCode();
    }

    public String toString() {
        return "GatewayEvent(actionTaken=" + this.a + ", url=" + this.b + ", section=" + this.c + ", subLevel=" + this.d + ", meterCount=" + this.e + ", orientation=" + this.f + ", buildNumber=" + this.g + ", appVersion=" + this.h + ", networkStatus=" + this.i + ", subscriptionLevel=" + this.j + ", sourceApp=" + this.k + ", timestampSeconds=" + this.l + ", edition=" + this.m + ")";
    }
}
