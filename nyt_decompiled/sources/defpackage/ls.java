package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.network.urlexpander.UrlExpander;
import io.reactivex.Observable;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class ls {
    private final UrlExpander a;

    public ls(UrlExpander urlExpander) {
        zq3.h(urlExpander, "urlExpander");
        this.a = urlExpander;
    }

    private final boolean a(String str) {
        return h.I(str, "http://", true);
    }

    private final String b(String str) {
        return h.G(str, "http", "https", true);
    }

    public final Observable c(String str) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        if (this.a.f(str)) {
            Observable observable = this.a.c(str).toObservable();
            zq3.g(observable, "toObservable(...)");
            return observable;
        }
        if (a(str)) {
            Observable just = Observable.just(b(str));
            zq3.g(just, "just(...)");
            return just;
        }
        Observable just2 = Observable.just(str);
        zq3.g(just2, "just(...)");
        return just2;
    }
}
