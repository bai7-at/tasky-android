package com.nytimes.android.devsettings.home.composables;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class DevSettingsFragmentComposableKt {
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0070, code lost:
    
        if ((r12 & 4) != 0) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final int r7, androidx.compose.ui.Modifier r8, defpackage.ss2 r9, androidx.compose.runtime.Composer r10, final int r11, final int r12) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.devsettings.home.composables.DevSettingsFragmentComposableKt.a(int, androidx.compose.ui.Modifier, ss2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(FragmentManager fragmentManager, Fragment fragment) {
        zq3.h(fragmentManager, "<this>");
        zq3.h(fragment, "fragment");
        if (fragment.isDetached() || fragmentManager.S0()) {
            return;
        }
        fragmentManager.p().p(fragment).g(null).h();
        fragmentManager.f1();
    }
}
