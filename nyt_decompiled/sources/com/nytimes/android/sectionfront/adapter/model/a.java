package com.nytimes.android.sectionfront.adapter.model;

import com.nytimes.android.saved.SavedSectionHelper;
import defpackage.op4;

/* loaded from: classes4.dex */
public abstract class a implements op4 {
    public static void a(GetMoreItemsCoalescerSource getMoreItemsCoalescerSource, SavedSectionHelper savedSectionHelper) {
        getMoreItemsCoalescerSource.savedSectionHelper = savedSectionHelper;
    }
}
