package com.nytimes.android.api.cms;

import defpackage.zq3;

/* loaded from: classes3.dex */
public final class RecentlyViewed {
    private final Integer historyCount;
    private final Integer showCount;

    public RecentlyViewed(Integer num, Integer num2) {
        this.showCount = num;
        this.historyCount = num2;
    }

    public static /* synthetic */ RecentlyViewed copy$default(RecentlyViewed recentlyViewed, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = recentlyViewed.showCount;
        }
        if ((i & 2) != 0) {
            num2 = recentlyViewed.historyCount;
        }
        return recentlyViewed.copy(num, num2);
    }

    public final Integer component1() {
        return this.showCount;
    }

    public final Integer component2() {
        return this.historyCount;
    }

    public final RecentlyViewed copy(Integer num, Integer num2) {
        return new RecentlyViewed(num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentlyViewed)) {
            return false;
        }
        RecentlyViewed recentlyViewed = (RecentlyViewed) obj;
        return zq3.c(this.showCount, recentlyViewed.showCount) && zq3.c(this.historyCount, recentlyViewed.historyCount);
    }

    public final Integer getHistoryCount() {
        return this.historyCount;
    }

    public final Integer getShowCount() {
        return this.showCount;
    }

    public int hashCode() {
        Integer num = this.showCount;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.historyCount;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "RecentlyViewed(showCount=" + this.showCount + ", historyCount=" + this.historyCount + ")";
    }
}
