package com.nytimes.android.sectionfront;

import androidx.fragment.app.Fragment;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2CoroutineScopeKt;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class SectionFrontPageEventSender {
    public final void a(Fragment fragment, String str) {
        zq3.h(fragment, "fragment");
        zq3.h(str, "sectionName");
        ET2CoroutineScopeKt.d(fragment, new SectionFrontPageEventSender$trackPage$1(str, null));
    }
}
