package com.nytimes.android.subauth.core.purr.directive;

import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class PurrShowLimitSensitivePIUiDirective extends PurrPrivacyDirective {
    public static final Companion Companion = new Companion(null);
    public static final String URL = "https://www.nytimes.com/data-subject-request";
    private final ToggleableDirectiveValue value;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PurrShowLimitSensitivePIUiDirective() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PurrShowLimitSensitivePIUiDirective copy$default(PurrShowLimitSensitivePIUiDirective purrShowLimitSensitivePIUiDirective, ToggleableDirectiveValue toggleableDirectiveValue, int i, Object obj) {
        if ((i & 1) != 0) {
            toggleableDirectiveValue = purrShowLimitSensitivePIUiDirective.value;
        }
        return purrShowLimitSensitivePIUiDirective.copy(toggleableDirectiveValue);
    }

    public final ToggleableDirectiveValue component1() {
        return this.value;
    }

    public final PurrShowLimitSensitivePIUiDirective copy(ToggleableDirectiveValue toggleableDirectiveValue) {
        zq3.h(toggleableDirectiveValue, "value");
        return new PurrShowLimitSensitivePIUiDirective(toggleableDirectiveValue);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PurrShowLimitSensitivePIUiDirective) && this.value == ((PurrShowLimitSensitivePIUiDirective) obj).value;
    }

    public final ToggleableDirectiveValue getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return "PurrShowLimitSensitivePIUiDirective(value=" + this.value + ")";
    }

    public /* synthetic */ PurrShowLimitSensitivePIUiDirective(ToggleableDirectiveValue toggleableDirectiveValue, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ToggleableDirectiveValue.HIDE : toggleableDirectiveValue);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurrShowLimitSensitivePIUiDirective(ToggleableDirectiveValue toggleableDirectiveValue) {
        super(null);
        zq3.h(toggleableDirectiveValue, "value");
        this.value = toggleableDirectiveValue;
    }
}
