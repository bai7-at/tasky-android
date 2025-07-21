package io.embrace.android.embracesdk.payload;

import com.facebook.AuthenticationTokenClaims;
import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import java.util.List;
import java.util.Map;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class ResponsivenessSnapshot {
    private final long errors;
    private final long firstPing;
    private final Map<String, Long> gaps;
    private final long lastPing;
    private final String name;
    private final List<ResponsivenessOutlier> outliers;

    public ResponsivenessSnapshot(@bt3(name = "name") String str, @bt3(name = "first") long j, @bt3(name = "last") long j2, @bt3(name = "gaps") Map<String, Long> map, @bt3(name = "outliers") List<ResponsivenessOutlier> list, @bt3(name = "errors") long j3) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(map, "gaps");
        zq3.h(list, "outliers");
        this.name = str;
        this.firstPing = j;
        this.lastPing = j2;
        this.gaps = map;
        this.outliers = list;
        this.errors = j3;
    }

    public final String component1() {
        return this.name;
    }

    public final long component2() {
        return this.firstPing;
    }

    public final long component3() {
        return this.lastPing;
    }

    public final Map<String, Long> component4() {
        return this.gaps;
    }

    public final List<ResponsivenessOutlier> component5() {
        return this.outliers;
    }

    public final long component6() {
        return this.errors;
    }

    public final ResponsivenessSnapshot copy(@bt3(name = "name") String str, @bt3(name = "first") long j, @bt3(name = "last") long j2, @bt3(name = "gaps") Map<String, Long> map, @bt3(name = "outliers") List<ResponsivenessOutlier> list, @bt3(name = "errors") long j3) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(map, "gaps");
        zq3.h(list, "outliers");
        return new ResponsivenessSnapshot(str, j, j2, map, list, j3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponsivenessSnapshot)) {
            return false;
        }
        ResponsivenessSnapshot responsivenessSnapshot = (ResponsivenessSnapshot) obj;
        return zq3.c(this.name, responsivenessSnapshot.name) && this.firstPing == responsivenessSnapshot.firstPing && this.lastPing == responsivenessSnapshot.lastPing && zq3.c(this.gaps, responsivenessSnapshot.gaps) && zq3.c(this.outliers, responsivenessSnapshot.outliers) && this.errors == responsivenessSnapshot.errors;
    }

    public final long getErrors() {
        return this.errors;
    }

    public final long getFirstPing() {
        return this.firstPing;
    }

    public final Map<String, Long> getGaps() {
        return this.gaps;
    }

    public final long getLastPing() {
        return this.lastPing;
    }

    public final String getName() {
        return this.name;
    }

    public final List<ResponsivenessOutlier> getOutliers() {
        return this.outliers;
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (((((str != null ? str.hashCode() : 0) * 31) + Long.hashCode(this.firstPing)) * 31) + Long.hashCode(this.lastPing)) * 31;
        Map<String, Long> map = this.gaps;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        List<ResponsivenessOutlier> list = this.outliers;
        return ((hashCode2 + (list != null ? list.hashCode() : 0)) * 31) + Long.hashCode(this.errors);
    }

    public String toString() {
        return "ResponsivenessSnapshot(name=" + this.name + ", firstPing=" + this.firstPing + ", lastPing=" + this.lastPing + ", gaps=" + this.gaps + ", outliers=" + this.outliers + ", errors=" + this.errors + ")";
    }
}
