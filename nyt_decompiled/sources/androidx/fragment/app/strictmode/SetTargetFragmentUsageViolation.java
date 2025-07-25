package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import defpackage.zq3;

/* loaded from: classes.dex */
public final class SetTargetFragmentUsageViolation extends TargetFragmentUsageViolation {
    private final int requestCode;
    private final Fragment targetFragment;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetTargetFragmentUsageViolation(Fragment fragment, Fragment fragment2, int i) {
        super(fragment, "Attempting to set target fragment " + fragment2 + " with request code " + i + " for fragment " + fragment);
        zq3.h(fragment, "fragment");
        zq3.h(fragment2, "targetFragment");
        this.targetFragment = fragment2;
        this.requestCode = i;
    }
}
