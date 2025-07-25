package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import defpackage.zq3;

/* loaded from: classes.dex */
public final class WrongNestedHierarchyViolation extends Violation {
    private final int containerId;
    private final Fragment expectedParentFragment;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrongNestedHierarchyViolation(Fragment fragment, Fragment fragment2, int i) {
        super(fragment, "Attempting to nest fragment " + fragment + " within the view of parent fragment " + fragment2 + " via container with ID " + i + " without using parent's childFragmentManager");
        zq3.h(fragment, "fragment");
        zq3.h(fragment2, "expectedParentFragment");
        this.expectedParentFragment = fragment2;
        this.containerId = i;
    }
}
