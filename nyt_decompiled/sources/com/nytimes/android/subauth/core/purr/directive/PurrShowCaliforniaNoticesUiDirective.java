package com.nytimes.android.subauth.core.purr.directive;

import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class PurrShowCaliforniaNoticesUiDirective extends PurrPrivacyDirective {
    public static final Companion Companion = new Companion(null);
    public static final String URL = "https://www.nytimes.com/privacy/privacy-policy#california-notice";
    private final ToggleableDirectiveValue value;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PurrShowCaliforniaNoticesUiDirective() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PurrShowCaliforniaNoticesUiDirective copy$default(PurrShowCaliforniaNoticesUiDirective purrShowCaliforniaNoticesUiDirective, ToggleableDirectiveValue toggleableDirectiveValue, int i, Object obj) {
        if ((i & 1) != 0) {
            toggleableDirectiveValue = purrShowCaliforniaNoticesUiDirective.value;
        }
        return purrShowCaliforniaNoticesUiDirective.copy(toggleableDirectiveValue);
    }

    public final ToggleableDirectiveValue component1() {
        return this.value;
    }

    public final PurrShowCaliforniaNoticesUiDirective copy(ToggleableDirectiveValue toggleableDirectiveValue) {
        zq3.h(toggleableDirectiveValue, "value");
        return new PurrShowCaliforniaNoticesUiDirective(toggleableDirectiveValue);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PurrShowCaliforniaNoticesUiDirective) && this.value == ((PurrShowCaliforniaNoticesUiDirective) obj).value;
    }

    public final ToggleableDirectiveValue getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return "PurrShowCaliforniaNoticesUiDirective(value=" + this.value + ")";
    }

    public /* synthetic */ PurrShowCaliforniaNoticesUiDirective(ToggleableDirectiveValue toggleableDirectiveValue, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ToggleableDirectiveValue.HIDE : toggleableDirectiveValue);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurrShowCaliforniaNoticesUiDirective(ToggleableDirectiveValue toggleableDirectiveValue) {
        super(null);
        zq3.h(toggleableDirectiveValue, "value");
        this.value = toggleableDirectiveValue;
    }
}
