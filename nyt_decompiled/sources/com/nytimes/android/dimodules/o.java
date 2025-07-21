package com.nytimes.android.dimodules;

import com.nytimes.android.latestfeed.feed.FeedStore;
import defpackage.ba2;
import defpackage.g16;
import defpackage.my3;

/* loaded from: classes4.dex */
public abstract class o implements ba2 {
    public static my3 a(FeedStore feedStore) {
        return (my3) g16.e(ApplicationModule.Companion.k(feedStore));
    }
}
