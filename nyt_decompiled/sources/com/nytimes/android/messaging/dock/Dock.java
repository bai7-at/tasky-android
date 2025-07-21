package com.nytimes.android.messaging.dock;

import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class Dock {
    public static final int $stable = 0;
    private final boolean isActive;
    private final String linkLocation;
    private final String text;

    public Dock(boolean z, String str, String str2) {
        this.isActive = z;
        this.text = str;
        this.linkLocation = str2;
    }

    public static /* synthetic */ Dock copy$default(Dock dock, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = dock.isActive;
        }
        if ((i & 2) != 0) {
            str = dock.text;
        }
        if ((i & 4) != 0) {
            str2 = dock.linkLocation;
        }
        return dock.copy(z, str, str2);
    }

    public final boolean component1() {
        return this.isActive;
    }

    public final String component2() {
        return this.text;
    }

    public final String component3() {
        return this.linkLocation;
    }

    public final Dock copy(boolean z, String str, String str2) {
        return new Dock(z, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dock)) {
            return false;
        }
        Dock dock = (Dock) obj;
        return this.isActive == dock.isActive && zq3.c(this.text, dock.text) && zq3.c(this.linkLocation, dock.linkLocation);
    }

    public final String getLinkLocation() {
        return this.linkLocation;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isActive) * 31;
        String str = this.text;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.linkLocation;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public String toString() {
        return "Dock(isActive=" + this.isActive + ", text=" + this.text + ", linkLocation=" + this.linkLocation + ")";
    }

    public /* synthetic */ Dock(boolean z, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }
}
