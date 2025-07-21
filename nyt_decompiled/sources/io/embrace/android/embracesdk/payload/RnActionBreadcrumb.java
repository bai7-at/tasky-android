package io.embrace.android.embracesdk.payload;

import com.facebook.AuthenticationTokenClaims;
import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import io.embrace.android.embracesdk.capture.crumbs.Breadcrumb;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class RnActionBreadcrumb implements Breadcrumb {
    public static final Companion Companion = new Companion(null);
    private final int bytesSent;
    private final long endTime;
    private final String name;
    private final String output;
    private final Map<String, Object> properties;
    private final long startTime;

    public static final class Companion {
        private Companion() {
        }

        public final String getValidRnBreadcrumbOutputName() {
            String arrays = Arrays.toString(RnOutputType.values());
            zq3.g(arrays, "Arrays.toString(RnOutputType.values())");
            return arrays;
        }

        public final boolean validateRnBreadcrumbOutputName(String str) {
            zq3.h(str, "output");
            for (RnOutputType rnOutputType : RnOutputType.values()) {
                if (h.w(rnOutputType.name(), str, true)) {
                    return true;
                }
            }
            return false;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public enum RnOutputType {
        SUCCESS,
        FAIL,
        INCOMPLETE
    }

    public RnActionBreadcrumb(@bt3(name = "n") String str, @bt3(name = "st") long j, @bt3(name = "en") long j2, @bt3(name = "p") Map<String, ? extends Object> map, @bt3(name = "pz") int i, @bt3(name = "o") String str2) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(str2, "output");
        this.name = str;
        this.startTime = j;
        this.endTime = j2;
        this.properties = map;
        this.bytesSent = i;
        this.output = str2;
    }

    public final String component1() {
        return this.name;
    }

    public final long component2$embrace_android_sdk_release() {
        return this.startTime;
    }

    public final long component3() {
        return this.endTime;
    }

    public final Map<String, Object> component4() {
        return this.properties;
    }

    public final int component5() {
        return this.bytesSent;
    }

    public final String component6() {
        return this.output;
    }

    public final RnActionBreadcrumb copy(@bt3(name = "n") String str, @bt3(name = "st") long j, @bt3(name = "en") long j2, @bt3(name = "p") Map<String, ? extends Object> map, @bt3(name = "pz") int i, @bt3(name = "o") String str2) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(str2, "output");
        return new RnActionBreadcrumb(str, j, j2, map, i, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RnActionBreadcrumb)) {
            return false;
        }
        RnActionBreadcrumb rnActionBreadcrumb = (RnActionBreadcrumb) obj;
        return zq3.c(this.name, rnActionBreadcrumb.name) && this.startTime == rnActionBreadcrumb.startTime && this.endTime == rnActionBreadcrumb.endTime && zq3.c(this.properties, rnActionBreadcrumb.properties) && this.bytesSent == rnActionBreadcrumb.bytesSent && zq3.c(this.output, rnActionBreadcrumb.output);
    }

    public final int getBytesSent() {
        return this.bytesSent;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOutput() {
        return this.output;
    }

    public final Map<String, Object> getProperties() {
        return this.properties;
    }

    @Override // io.embrace.android.embracesdk.capture.crumbs.Breadcrumb
    public long getStartTime() {
        return this.startTime;
    }

    public final long getStartTime$embrace_android_sdk_release() {
        return this.startTime;
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (((((str != null ? str.hashCode() : 0) * 31) + Long.hashCode(this.startTime)) * 31) + Long.hashCode(this.endTime)) * 31;
        Map<String, Object> map = this.properties;
        int hashCode2 = (((hashCode + (map != null ? map.hashCode() : 0)) * 31) + Integer.hashCode(this.bytesSent)) * 31;
        String str2 = this.output;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "RnActionBreadcrumb(name=" + this.name + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", properties=" + this.properties + ", bytesSent=" + this.bytesSent + ", output=" + this.output + ")";
    }
}
