package io.embrace.android.embracesdk.payload;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.AuthenticationTokenClaims;
import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class WebVital {
    private final Long duration;
    private final String name;
    private final Map<String, Object> properties;
    private final Double score;
    private final long startTime;

    /* renamed from: type, reason: collision with root package name */
    private final WebVitalType f89type;

    public WebVital(@bt3(name = "t") WebVitalType webVitalType, @bt3(name = "n") String str, @bt3(name = "st") long j, @bt3(name = "d") Long l, @bt3(name = "p") Map<String, ? extends Object> map, @bt3(name = "s") Double d) {
        zq3.h(webVitalType, TransferTable.COLUMN_TYPE);
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        this.f89type = webVitalType;
        this.name = str;
        this.startTime = j;
        this.duration = l;
        this.properties = map;
        this.score = d;
    }

    public static /* synthetic */ WebVital copy$default(WebVital webVital, WebVitalType webVitalType, String str, long j, Long l, Map map, Double d, int i, Object obj) {
        if ((i & 1) != 0) {
            webVitalType = webVital.f89type;
        }
        if ((i & 2) != 0) {
            str = webVital.name;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            j = webVital.startTime;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            l = webVital.duration;
        }
        Long l2 = l;
        if ((i & 16) != 0) {
            map = webVital.properties;
        }
        Map map2 = map;
        if ((i & 32) != 0) {
            d = webVital.score;
        }
        return webVital.copy(webVitalType, str2, j2, l2, map2, d);
    }

    public final WebVitalType component1() {
        return this.f89type;
    }

    public final String component2() {
        return this.name;
    }

    public final long component3() {
        return this.startTime;
    }

    public final Long component4() {
        return this.duration;
    }

    public final Map<String, Object> component5() {
        return this.properties;
    }

    public final Double component6() {
        return this.score;
    }

    public final WebVital copy(@bt3(name = "t") WebVitalType webVitalType, @bt3(name = "n") String str, @bt3(name = "st") long j, @bt3(name = "d") Long l, @bt3(name = "p") Map<String, ? extends Object> map, @bt3(name = "s") Double d) {
        zq3.h(webVitalType, TransferTable.COLUMN_TYPE);
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        return new WebVital(webVitalType, str, j, l, map, d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebVital)) {
            return false;
        }
        WebVital webVital = (WebVital) obj;
        return zq3.c(this.f89type, webVital.f89type) && zq3.c(this.name, webVital.name) && this.startTime == webVital.startTime && zq3.c(this.duration, webVital.duration) && zq3.c(this.properties, webVital.properties) && zq3.c(this.score, webVital.score);
    }

    public final Long getDuration() {
        return this.duration;
    }

    public final String getName() {
        return this.name;
    }

    public final Map<String, Object> getProperties() {
        return this.properties;
    }

    public final Double getScore() {
        return this.score;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final WebVitalType getType() {
        return this.f89type;
    }

    public int hashCode() {
        WebVitalType webVitalType = this.f89type;
        int hashCode = (webVitalType != null ? webVitalType.hashCode() : 0) * 31;
        String str = this.name;
        int hashCode2 = (((hashCode + (str != null ? str.hashCode() : 0)) * 31) + Long.hashCode(this.startTime)) * 31;
        Long l = this.duration;
        int hashCode3 = (hashCode2 + (l != null ? l.hashCode() : 0)) * 31;
        Map<String, Object> map = this.properties;
        int hashCode4 = (hashCode3 + (map != null ? map.hashCode() : 0)) * 31;
        Double d = this.score;
        return hashCode4 + (d != null ? d.hashCode() : 0);
    }

    public String toString() {
        return "WebVital(type=" + this.f89type + ", name=" + this.name + ", startTime=" + this.startTime + ", duration=" + this.duration + ", properties=" + this.properties + ", score=" + this.score + ")";
    }

    public /* synthetic */ WebVital(WebVitalType webVitalType, String str, long j, Long l, Map map, Double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(webVitalType, str, j, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : map, (i & 32) != 0 ? null : d);
    }
}
