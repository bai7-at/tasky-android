package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import defpackage.zq3;

/* loaded from: classes.dex */
public final class SetUserVisibleHintViolation extends Violation {
    private final boolean isVisibleToUser;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetUserVisibleHintViolation(Fragment fragment, boolean z) {
        super(fragment, "Attempting to set user visible hint to " + z + " for fragment " + fragment);
        zq3.h(fragment, "fragment");
        this.isVisibleToUser = z;
    }
}
