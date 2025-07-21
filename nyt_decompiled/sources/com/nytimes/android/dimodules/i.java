package com.nytimes.android.dimodules;

import com.nytimes.android.latestfeed.feed.FeedStore;
import defpackage.ba2;
import defpackage.g16;
import defpackage.ms;
import defpackage.td4;
import defpackage.uy3;
import defpackage.z58;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public abstract class i implements ba2 {
    public static ms a(FeedStore feedStore, uy3 uy3Var, td4 td4Var, z58 z58Var, CoroutineScope coroutineScope) {
        return (ms) g16.e(ApplicationModule.Companion.d(feedStore, uy3Var, td4Var, z58Var, coroutineScope));
    }
}
