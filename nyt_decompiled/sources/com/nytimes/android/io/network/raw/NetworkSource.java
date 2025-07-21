package com.nytimes.android.io.network.raw;

import defpackage.sd0;
import io.reactivex.Observable;
import java.io.IOException;

/* loaded from: classes4.dex */
public interface NetworkSource {
    Observable<sd0> asyncFetch(String str);

    sd0 fetch(String str) throws IOException;
}
