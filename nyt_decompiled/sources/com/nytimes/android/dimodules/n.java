package com.nytimes.android.dimodules;

import com.nytimes.android.latestfeed.feed.FeedStore;
import defpackage.ba2;
import defpackage.g16;
import defpackage.ly3;

/* loaded from: classes4.dex */
public abstract class n implements ba2 {
    public static ly3 a(FeedStore feedStore) {
        return (ly3) g16.e(ApplicationModule.Companion.i(feedStore));
    }
}
