package com.nytimes.android.sectionfront.adapter.model;

import defpackage.op4;

/* loaded from: classes4.dex */
public abstract class e implements op4 {
    public static void a(SectionFrontCoalescer sectionFrontCoalescer, GetMoreItemsCoalescerSource getMoreItemsCoalescerSource) {
        sectionFrontCoalescer.getMoreItemsSource = getMoreItemsCoalescerSource;
    }

    public static void b(SectionFrontCoalescer sectionFrontCoalescer, SectionCoalescerSource sectionCoalescerSource) {
        sectionFrontCoalescer.sectionSource = sectionCoalescerSource;
    }
}
