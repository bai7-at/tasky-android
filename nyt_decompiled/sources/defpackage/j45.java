package defpackage;

import com.nytimes.android.network.NetworkModule;
import com.nytimes.android.network.urlexpander.UrlExpander;
import com.nytimes.android.network.urlexpander.UrlExpanderApi;

/* loaded from: classes4.dex */
public abstract class j45 implements ba2 {
    public static UrlExpander a(UrlExpanderApi urlExpanderApi) {
        return (UrlExpander) g16.e(NetworkModule.a.n(urlExpanderApi));
    }
}
