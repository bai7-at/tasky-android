package com.nytimes.android.media.player;

import com.nytimes.android.media.common.NYTMediaItem;
import io.reactivex.functions.Consumer;

/* loaded from: classes4.dex */
public final /* synthetic */ class g implements Consumer {
    public final /* synthetic */ l a;

    public /* synthetic */ g(l lVar) {
        this.a = lVar;
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        this.a.O((NYTMediaItem) obj);
    }
}
