package com.nytimes.android.subauth.core.purr.directive;

import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class PurrAcceptableTrackersDirectiveV2 extends PurrPrivacyDirective {
    private final AcceptableTracker value;

    /* JADX WARN: Multi-variable type inference failed */
    public PurrAcceptableTrackersDirectiveV2() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PurrAcceptableTrackersDirectiveV2 copy$default(PurrAcceptableTrackersDirectiveV2 purrAcceptableTrackersDirectiveV2, AcceptableTracker acceptableTracker, int i, Object obj) {
        if ((i & 1) != 0) {
            acceptableTracker = purrAcceptableTrackersDirectiveV2.value;
        }
        return purrAcceptableTrackersDirectiveV2.copy(acceptableTracker);
    }

    public final AcceptableTracker component1() {
        return this.value;
    }

    public final PurrAcceptableTrackersDirectiveV2 copy(AcceptableTracker acceptableTracker) {
        zq3.h(acceptableTracker, "value");
        return new PurrAcceptableTrackersDirectiveV2(acceptableTracker);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PurrAcceptableTrackersDirectiveV2) && this.value == ((PurrAcceptableTrackersDirectiveV2) obj).value;
    }

    public final AcceptableTracker getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return "PurrAcceptableTrackersDirectiveV2(value=" + this.value + ")";
    }

    public /* synthetic */ PurrAcceptableTrackersDirectiveV2(AcceptableTracker acceptableTracker, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AcceptableTracker.CONTROLLERS : acceptableTracker);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurrAcceptableTrackersDirectiveV2(AcceptableTracker acceptableTracker) {
        super(null);
        zq3.h(acceptableTracker, "value");
        this.value = acceptableTracker;
    }
}
