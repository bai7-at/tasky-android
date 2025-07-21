package com.datadog.android.core.internal.system;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class SystemInfo {
    private final boolean a;
    private final int b;
    private final boolean c;
    private final boolean d;

    public enum BatteryStatus {
        UNKNOWN,
        CHARGING,
        DISCHARGING,
        NOT_CHARGING,
        FULL;

        public static final a Companion = new a(null);

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final BatteryStatus a(int i) {
                return i != 2 ? i != 3 ? i != 4 ? i != 5 ? BatteryStatus.UNKNOWN : BatteryStatus.FULL : BatteryStatus.NOT_CHARGING : BatteryStatus.DISCHARGING : BatteryStatus.CHARGING;
            }

            private a() {
            }
        }
    }

    public SystemInfo(boolean z, int i, boolean z2, boolean z3) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = z3;
    }

    public static /* synthetic */ SystemInfo b(SystemInfo systemInfo, boolean z, int i, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = systemInfo.a;
        }
        if ((i2 & 2) != 0) {
            i = systemInfo.b;
        }
        if ((i2 & 4) != 0) {
            z2 = systemInfo.c;
        }
        if ((i2 & 8) != 0) {
            z3 = systemInfo.d;
        }
        return systemInfo.a(z, i, z2, z3);
    }

    public final SystemInfo a(boolean z, int i, boolean z2, boolean z3) {
        return new SystemInfo(z, i, z2, z3);
    }

    public final boolean c() {
        return this.a;
    }

    public final int d() {
        return this.b;
    }

    public final boolean e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SystemInfo)) {
            return false;
        }
        SystemInfo systemInfo = (SystemInfo) obj;
        return this.a == systemInfo.a && this.b == systemInfo.b && this.c == systemInfo.c && this.d == systemInfo.d;
    }

    public final boolean f() {
        return this.c;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.a) * 31) + Integer.hashCode(this.b)) * 31) + Boolean.hashCode(this.c)) * 31) + Boolean.hashCode(this.d);
    }

    public String toString() {
        return "SystemInfo(batteryFullOrCharging=" + this.a + ", batteryLevel=" + this.b + ", powerSaveMode=" + this.c + ", onExternalPowerSource=" + this.d + ")";
    }

    public /* synthetic */ SystemInfo(boolean z, int i, boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? false : z3);
    }
}
