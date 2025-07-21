package com.nytimes.android.fragment.fullscreen;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.f;
import defpackage.zm8;

/* loaded from: classes4.dex */
public abstract class a extends Fragment {
    protected void b1() {
        f activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    protected void c1(int i) {
        zm8.e(getActivity().getApplicationContext(), i);
        b1();
    }
}
