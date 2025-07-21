package com.nytimes.android.io.network.raw;

import defpackage.sd0;
import java.io.IOException;

/* loaded from: classes4.dex */
public interface CachedNetworkSource extends NetworkSource {
    sd0 cacheFetch(String str) throws IOException;
}
