package com.nytimes.android.sectionfront.adapter.model;

import com.google.common.collect.ImmutableList;
import com.nytimes.android.api.cms.SectionFront;
import com.nytimes.android.saved.SavedSectionHelper;
import defpackage.c97;
import defpackage.pm0;
import defpackage.re7;

/* loaded from: classes4.dex */
public class GetMoreItemsCoalescerSource extends pm0 {
    private String c;
    protected SavedSectionHelper savedSectionHelper;

    private ImmutableList f() {
        return (c97.c(this.c) && this.savedSectionHelper.addGetMoreButton()) ? ImmutableList.y(new re7(SectionAdapterItemType.SAVED_GET_MORE, 23421L)) : ImmutableList.x();
    }

    @Override // defpackage.pm0
    public void c() {
        super.c();
        this.savedSectionHelper.onDestroy();
    }

    public void e(SectionFront sectionFront) {
        this.c = sectionFront.getName();
        b(f());
    }
}
