package com.nytimes.android.utils;

import com.nytimes.android.latestfeed.feed.FeedStore;
import com.nytimes.android.utils.ImageCropsHelper;
import defpackage.vf3;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class ImageCropsHelper {
    private final Function a = new vf3();
    FeedStore feedStore;

    private boolean c(String str, Map map) {
        return (str == null || str.isEmpty() || map == null || !map.containsKey(str)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List d(String str, Map map) {
        return !c(str, map) ? Collections.emptyList() : (List) map.get(str);
    }

    public Single b(final String str) {
        return this.feedStore.f().firstOrError().map(this.a).map(new Function() { // from class: ag3
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                List d;
                d = ImageCropsHelper.this.d(str, (Map) obj);
                return d;
            }
        });
    }
}
