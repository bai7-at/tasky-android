package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.nytimes.android.api.cms.SectionMeta;
import com.nytimes.android.sectionfront.SectionFrontFragment;

/* loaded from: classes4.dex */
public final class cf7 {
    public static final cf7 a = new cf7();
    public static final SectionMeta b = new SectionMeta("saved", "Saved for Later", null, null, null, null, null, null, null, null, null, 2044, null);
    public static final SectionMeta c = new SectionMeta("recent", "Recently Viewed", null, null, null, null, null, null, null, null, null, 2044, null);
    public static final int d = 8;

    private cf7() {
    }

    public static final Fragment a(Fragment fragment, String str, String str2) {
        zq3.h(fragment, "fragment");
        zq3.h(str, "sectionName");
        zq3.h(str2, "sectionTitle");
        Bundle bundle = new Bundle(1);
        bundle.putString("sectionName", str);
        bundle.putString("sectionTitle", str2);
        fragment.setArguments(bundle);
        return fragment;
    }

    public static final Fragment b(String str, String str2, wg7 wg7Var) {
        zq3.h(str, "sectionName");
        zq3.h(str2, "sectionTitle");
        zq3.h(wg7Var, "progressListener");
        SectionFrontFragment sectionFrontFragment = new SectionFrontFragment();
        sectionFrontFragment.z1(wg7Var);
        return a(sectionFrontFragment, str, str2);
    }
}
