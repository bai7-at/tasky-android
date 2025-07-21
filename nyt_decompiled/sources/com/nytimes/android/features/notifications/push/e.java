package com.nytimes.android.features.notifications.push;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class e {
    public static final a Companion = new a(null);
    private final boolean a;
    private final float b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float a(boolean z) {
            return (z ? AlphaState.ON : AlphaState.OFF).getAlpha();
        }

        private a() {
        }
    }

    public e(boolean z, float f) {
        this.a = z;
        this.b = f;
    }

    public final float a() {
        return this.b;
    }

    public final boolean b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && Float.compare(this.b, eVar.b) == 0;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.a) * 31) + Float.hashCode(this.b);
    }

    public String toString() {
        return "PermissionState(hasNotificationPermission=" + this.a + ", alpha=" + this.b + ")";
    }
}
