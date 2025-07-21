package com.nytimes.android.messaging.dock;

import defpackage.zq3;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class DockData {
    public static final int $stable = 8;
    private final String defaultDockText;
    private final String defaultLinkLocation;
    private final boolean isActive;
    private final String playTabDockText;
    private final String playTabLinkLocation;
    private final List<DockUrgencyMessage> playTabUrgencyMessages;

    public DockData() {
        this(false, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ DockData copy$default(DockData dockData, boolean z, String str, String str2, String str3, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = dockData.isActive;
        }
        if ((i & 2) != 0) {
            str = dockData.defaultDockText;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = dockData.defaultLinkLocation;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = dockData.playTabDockText;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = dockData.playTabLinkLocation;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            list = dockData.playTabUrgencyMessages;
        }
        return dockData.copy(z, str5, str6, str7, str8, list);
    }

    public final boolean component1() {
        return this.isActive;
    }

    public final String component2() {
        return this.defaultDockText;
    }

    public final String component3() {
        return this.defaultLinkLocation;
    }

    public final String component4() {
        return this.playTabDockText;
    }

    public final String component5() {
        return this.playTabLinkLocation;
    }

    public final List<DockUrgencyMessage> component6() {
        return this.playTabUrgencyMessages;
    }

    public final DockData copy(boolean z, String str, String str2, String str3, String str4, List<DockUrgencyMessage> list) {
        zq3.h(str, "defaultDockText");
        zq3.h(str2, "defaultLinkLocation");
        zq3.h(str3, "playTabDockText");
        zq3.h(str4, "playTabLinkLocation");
        return new DockData(z, str, str2, str3, str4, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DockData)) {
            return false;
        }
        DockData dockData = (DockData) obj;
        return this.isActive == dockData.isActive && zq3.c(this.defaultDockText, dockData.defaultDockText) && zq3.c(this.defaultLinkLocation, dockData.defaultLinkLocation) && zq3.c(this.playTabDockText, dockData.playTabDockText) && zq3.c(this.playTabLinkLocation, dockData.playTabLinkLocation) && zq3.c(this.playTabUrgencyMessages, dockData.playTabUrgencyMessages);
    }

    public final String getDefaultDockText() {
        return this.defaultDockText;
    }

    public final String getDefaultLinkLocation() {
        return this.defaultLinkLocation;
    }

    public final String getPlayTabDockText() {
        return this.playTabDockText;
    }

    public final String getPlayTabLinkLocation() {
        return this.playTabLinkLocation;
    }

    public final List<DockUrgencyMessage> getPlayTabUrgencyMessages() {
        return this.playTabUrgencyMessages;
    }

    public int hashCode() {
        int hashCode = ((((((((Boolean.hashCode(this.isActive) * 31) + this.defaultDockText.hashCode()) * 31) + this.defaultLinkLocation.hashCode()) * 31) + this.playTabDockText.hashCode()) * 31) + this.playTabLinkLocation.hashCode()) * 31;
        List<DockUrgencyMessage> list = this.playTabUrgencyMessages;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public String toString() {
        return "DockData(isActive=" + this.isActive + ", defaultDockText=" + this.defaultDockText + ", defaultLinkLocation=" + this.defaultLinkLocation + ", playTabDockText=" + this.playTabDockText + ", playTabLinkLocation=" + this.playTabLinkLocation + ", playTabUrgencyMessages=" + this.playTabUrgencyMessages + ")";
    }

    public DockData(boolean z, String str, String str2, String str3, String str4, List<DockUrgencyMessage> list) {
        zq3.h(str, "defaultDockText");
        zq3.h(str2, "defaultLinkLocation");
        zq3.h(str3, "playTabDockText");
        zq3.h(str4, "playTabLinkLocation");
        this.isActive = z;
        this.defaultDockText = str;
        this.defaultLinkLocation = str2;
        this.playTabDockText = str3;
        this.playTabLinkLocation = str4;
        this.playTabUrgencyMessages = list;
    }

    public /* synthetic */ DockData(boolean z, String str, String str2, String str3, String str4, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) == 0 ? str4 : "", (i & 32) != 0 ? i.l() : list);
    }
}
