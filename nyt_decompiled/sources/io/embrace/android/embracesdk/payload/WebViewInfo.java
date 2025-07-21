package io.embrace.android.embracesdk.payload;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class WebViewInfo {
    private final long startTime;
    private final String tag;
    private final String url;
    private final transient Map<WebVitalType, WebVital> webVitalMap;
    private final List<WebVital> webVitals;

    public WebViewInfo(@bt3(name = "t") String str, @bt3(name = "vt") List<WebVital> list, @bt3(name = "u") String str2, @bt3(name = "ts") long j, Map<WebVitalType, WebVital> map) {
        zq3.h(list, "webVitals");
        zq3.h(str2, "url");
        zq3.h(map, "webVitalMap");
        this.tag = str;
        this.webVitals = list;
        this.url = str2;
        this.startTime = j;
        this.webVitalMap = map;
    }

    public static /* synthetic */ WebViewInfo copy$default(WebViewInfo webViewInfo, String str, List list, String str2, long j, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = webViewInfo.tag;
        }
        if ((i & 2) != 0) {
            list = webViewInfo.webVitals;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            str2 = webViewInfo.url;
        }
        String str3 = str2;
        if ((i & 8) != 0) {
            j = webViewInfo.startTime;
        }
        long j2 = j;
        if ((i & 16) != 0) {
            map = webViewInfo.webVitalMap;
        }
        return webViewInfo.copy(str, list2, str3, j2, map);
    }

    public final String component1() {
        return this.tag;
    }

    public final List<WebVital> component2() {
        return this.webVitals;
    }

    public final String component3() {
        return this.url;
    }

    public final long component4() {
        return this.startTime;
    }

    public final Map<WebVitalType, WebVital> component5() {
        return this.webVitalMap;
    }

    public final WebViewInfo copy(@bt3(name = "t") String str, @bt3(name = "vt") List<WebVital> list, @bt3(name = "u") String str2, @bt3(name = "ts") long j, Map<WebVitalType, WebVital> map) {
        zq3.h(list, "webVitals");
        zq3.h(str2, "url");
        zq3.h(map, "webVitalMap");
        return new WebViewInfo(str, list, str2, j, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebViewInfo)) {
            return false;
        }
        WebViewInfo webViewInfo = (WebViewInfo) obj;
        return zq3.c(this.tag, webViewInfo.tag) && zq3.c(this.webVitals, webViewInfo.webVitals) && zq3.c(this.url, webViewInfo.url) && this.startTime == webViewInfo.startTime && zq3.c(this.webVitalMap, webViewInfo.webVitalMap);
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getUrl() {
        return this.url;
    }

    public final Map<WebVitalType, WebVital> getWebVitalMap() {
        return this.webVitalMap;
    }

    public final List<WebVital> getWebVitals() {
        return this.webVitals;
    }

    public int hashCode() {
        String str = this.tag;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<WebVital> list = this.webVitals;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.url;
        int hashCode3 = (((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Long.hashCode(this.startTime)) * 31;
        Map<WebVitalType, WebVital> map = this.webVitalMap;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "WebViewInfo(tag=" + this.tag + ", webVitals=" + this.webVitals + ", url=" + this.url + ", startTime=" + this.startTime + ", webVitalMap=" + this.webVitalMap + ")";
    }

    public /* synthetic */ WebViewInfo(String str, List list, String str2, long j, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? new ArrayList() : list, str2, j, (i & 16) != 0 ? new HashMap() : map);
    }
}
