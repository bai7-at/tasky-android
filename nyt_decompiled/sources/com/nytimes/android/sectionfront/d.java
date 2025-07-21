package com.nytimes.android.sectionfront;

import com.nytimes.android.saved.SavedManager;
import com.nytimes.android.saved.SavedSectionHelper;
import defpackage.op4;
import defpackage.p97;

/* loaded from: classes4.dex */
public abstract class d implements op4 {
    public static void a(SavedSectionFrontFragment savedSectionFrontFragment, com.nytimes.android.entitlements.a aVar) {
        savedSectionFrontFragment.eCommClient = aVar;
    }

    public static void b(SavedSectionFrontFragment savedSectionFrontFragment, p97 p97Var) {
        savedSectionFrontFragment.presenter = p97Var;
    }

    public static void c(SavedSectionFrontFragment savedSectionFrontFragment, SavedManager savedManager) {
        savedSectionFrontFragment.savedManager = savedManager;
    }

    public static void d(SavedSectionFrontFragment savedSectionFrontFragment, SavedSectionHelper savedSectionHelper) {
        savedSectionFrontFragment.savedSectionHelper = savedSectionHelper;
    }
}
