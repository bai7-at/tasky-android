package com.nytimes.android.hybrid.integration.timing;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.i;
import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class HybridWebViewInfo {
    public static final a Companion = new a(null);
    private static final JsonAdapter d;
    private final String a;
    private final WebViewPerformanceTiming b;
    private final double c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        i d2 = new i.b().d();
        zq3.g(d2, "build(...)");
        JsonAdapter c = d2.c(HybridWebViewInfo.class);
        zq3.g(c, "adapter(...)");
        d = c;
    }

    public HybridWebViewInfo(String str, WebViewPerformanceTiming webViewPerformanceTiming, double d2) {
        zq3.h(str, "title");
        zq3.h(webViewPerformanceTiming, "timing");
        this.a = str;
        this.b = webViewPerformanceTiming;
        this.c = d2;
    }

    public final double a() {
        return this.c;
    }

    public final WebViewPerformanceTiming b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HybridWebViewInfo)) {
            return false;
        }
        HybridWebViewInfo hybridWebViewInfo = (HybridWebViewInfo) obj;
        return zq3.c(this.a, hybridWebViewInfo.a) && zq3.c(this.b, hybridWebViewInfo.b) && Double.compare(this.c, hybridWebViewInfo.c) == 0;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Double.hashCode(this.c);
    }

    public String toString() {
        return "HybridWebViewInfo(title=" + this.a + ", timing=" + this.b + ", firstContentfulPaintTiming=" + this.c + ")";
    }
}
