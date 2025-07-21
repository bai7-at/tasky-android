package io.embrace.android.embracesdk.config.remote;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class WebViewVitals {
    private final Integer maxVitals;
    private final Float pctEnabled;

    /* JADX WARN: Multi-variable type inference failed */
    public WebViewVitals() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ WebViewVitals copy$default(WebViewVitals webViewVitals, Float f, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            f = webViewVitals.pctEnabled;
        }
        if ((i & 2) != 0) {
            num = webViewVitals.maxVitals;
        }
        return webViewVitals.copy(f, num);
    }

    public final Float component1() {
        return this.pctEnabled;
    }

    public final Integer component2() {
        return this.maxVitals;
    }

    public final WebViewVitals copy(@bt3(name = "pct_enabled") Float f, @bt3(name = "max_vitals") Integer num) {
        return new WebViewVitals(f, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebViewVitals)) {
            return false;
        }
        WebViewVitals webViewVitals = (WebViewVitals) obj;
        return zq3.c(this.pctEnabled, webViewVitals.pctEnabled) && zq3.c(this.maxVitals, webViewVitals.maxVitals);
    }

    public final Integer getMaxVitals() {
        return this.maxVitals;
    }

    public final Float getPctEnabled() {
        return this.pctEnabled;
    }

    public int hashCode() {
        Float f = this.pctEnabled;
        int hashCode = (f != null ? f.hashCode() : 0) * 31;
        Integer num = this.maxVitals;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "WebViewVitals(pctEnabled=" + this.pctEnabled + ", maxVitals=" + this.maxVitals + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WebViewVitals(@bt3(name = "pct_enabled") Float f) {
        this(f, null, 2, 0 == true ? 1 : 0);
    }

    public WebViewVitals(@bt3(name = "pct_enabled") Float f, @bt3(name = "max_vitals") Integer num) {
        this.pctEnabled = f;
        this.maxVitals = num;
    }

    public /* synthetic */ WebViewVitals(Float f, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : num);
    }
}
