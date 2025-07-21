package defpackage;

import androidx.fragment.app.Fragment;
import com.nytimes.android.recent.RecentlyViewedFragment;
import com.nytimes.android.recent.RecentlyViewedUnfearFragment;

/* loaded from: classes4.dex */
public final class ts6 implements ss6 {
    private final cb2 a;

    public ts6(cb2 cb2Var) {
        zq3.h(cb2Var, "featureFlagUtil");
        this.a = cb2Var;
    }

    @Override // defpackage.ss6
    public Fragment a() {
        return this.a.B() ? new RecentlyViewedUnfearFragment() : new RecentlyViewedFragment();
    }
}
