package com.nytimes.android.subauth.core.purr.model;

import com.nytimes.android.subauth.core.purr.directive.AcceptableTracker;
import com.nytimes.android.subauth.core.purr.directive.PurrAcceptableTrackersDirectiveV2;
import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class AcceptableTrackersDirectiveV2 extends UserPrivacyDirective {
    private final AcceptableTracker value;

    public AcceptableTrackersDirectiveV2(AcceptableTracker acceptableTracker) {
        zq3.h(acceptableTracker, "value");
        this.value = acceptableTracker;
    }

    public static /* synthetic */ AcceptableTrackersDirectiveV2 copy$default(AcceptableTrackersDirectiveV2 acceptableTrackersDirectiveV2, AcceptableTracker acceptableTracker, int i, Object obj) {
        if ((i & 1) != 0) {
            acceptableTracker = acceptableTrackersDirectiveV2.value;
        }
        return acceptableTrackersDirectiveV2.copy(acceptableTracker);
    }

    public final AcceptableTracker component1() {
        return this.value;
    }

    public final AcceptableTrackersDirectiveV2 copy(AcceptableTracker acceptableTracker) {
        zq3.h(acceptableTracker, "value");
        return new AcceptableTrackersDirectiveV2(acceptableTracker);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AcceptableTrackersDirectiveV2) && this.value == ((AcceptableTrackersDirectiveV2) obj).value;
    }

    public final AcceptableTracker getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return "AcceptableTrackersDirectiveV2(value=" + this.value + ")";
    }

    @Override // com.nytimes.android.subauth.core.purr.model.UserPrivacyDirective
    public PurrAcceptableTrackersDirectiveV2 toPublic$subauth_core_release() {
        return new PurrAcceptableTrackersDirectiveV2(this.value);
    }
}
