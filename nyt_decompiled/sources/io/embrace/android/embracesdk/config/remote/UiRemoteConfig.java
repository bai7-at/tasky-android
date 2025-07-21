package io.embrace.android.embracesdk.config.remote;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class UiRemoteConfig {
    private final Integer breadcrumbs;
    private final Integer fragments;
    private final Integer taps;
    private final Integer views;
    private final Integer webViews;

    public UiRemoteConfig() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ UiRemoteConfig copy$default(UiRemoteConfig uiRemoteConfig, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, int i, Object obj) {
        if ((i & 1) != 0) {
            num = uiRemoteConfig.breadcrumbs;
        }
        if ((i & 2) != 0) {
            num2 = uiRemoteConfig.taps;
        }
        Integer num6 = num2;
        if ((i & 4) != 0) {
            num3 = uiRemoteConfig.views;
        }
        Integer num7 = num3;
        if ((i & 8) != 0) {
            num4 = uiRemoteConfig.webViews;
        }
        Integer num8 = num4;
        if ((i & 16) != 0) {
            num5 = uiRemoteConfig.fragments;
        }
        return uiRemoteConfig.copy(num, num6, num7, num8, num5);
    }

    public final Integer component1() {
        return this.breadcrumbs;
    }

    public final Integer component2() {
        return this.taps;
    }

    public final Integer component3() {
        return this.views;
    }

    public final Integer component4() {
        return this.webViews;
    }

    public final Integer component5() {
        return this.fragments;
    }

    public final UiRemoteConfig copy(Integer num, Integer num2, Integer num3, @bt3(name = "web_views") Integer num4, Integer num5) {
        return new UiRemoteConfig(num, num2, num3, num4, num5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UiRemoteConfig)) {
            return false;
        }
        UiRemoteConfig uiRemoteConfig = (UiRemoteConfig) obj;
        return zq3.c(this.breadcrumbs, uiRemoteConfig.breadcrumbs) && zq3.c(this.taps, uiRemoteConfig.taps) && zq3.c(this.views, uiRemoteConfig.views) && zq3.c(this.webViews, uiRemoteConfig.webViews) && zq3.c(this.fragments, uiRemoteConfig.fragments);
    }

    public final Integer getBreadcrumbs() {
        return this.breadcrumbs;
    }

    public final Integer getFragments() {
        return this.fragments;
    }

    public final Integer getTaps() {
        return this.taps;
    }

    public final Integer getViews() {
        return this.views;
    }

    public final Integer getWebViews() {
        return this.webViews;
    }

    public int hashCode() {
        Integer num = this.breadcrumbs;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.taps;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.views;
        int hashCode3 = (hashCode2 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Integer num4 = this.webViews;
        int hashCode4 = (hashCode3 + (num4 != null ? num4.hashCode() : 0)) * 31;
        Integer num5 = this.fragments;
        return hashCode4 + (num5 != null ? num5.hashCode() : 0);
    }

    public String toString() {
        return "UiRemoteConfig(breadcrumbs=" + this.breadcrumbs + ", taps=" + this.taps + ", views=" + this.views + ", webViews=" + this.webViews + ", fragments=" + this.fragments + ")";
    }

    public UiRemoteConfig(Integer num, Integer num2, Integer num3, @bt3(name = "web_views") Integer num4, Integer num5) {
        this.breadcrumbs = num;
        this.taps = num2;
        this.views = num3;
        this.webViews = num4;
        this.fragments = num5;
    }

    public /* synthetic */ UiRemoteConfig(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4, (i & 16) != 0 ? null : num5);
    }
}
