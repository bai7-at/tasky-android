package com.nytimes.android.network.urlexpander;

import android.net.Uri;
import com.nytimes.android.network.urlexpander.UrlExpander;
import defpackage.dz8;
import defpackage.lh4;
import defpackage.ss2;
import defpackage.zq3;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class UrlExpander {
    private final UrlExpanderApi a;
    private final Map b;

    public UrlExpander(UrlExpanderApi urlExpanderApi) {
        zq3.h(urlExpanderApi, "urlExpanderApi");
        this.a = urlExpanderApi;
        this.b = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return (String) ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource e(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return (SingleSource) ss2Var.invoke(obj);
    }

    public final Single c(final String str) {
        zq3.h(str, "shortUrl");
        if (this.b.containsKey(str)) {
            Single just = Single.just(this.b.get(str));
            zq3.g(just, "just(...)");
            return just;
        }
        if (!f(str)) {
            Single just2 = Single.just(str);
            zq3.e(just2);
            return just2;
        }
        Single<dz8> expandedUrl = this.a.getExpandedUrl(str);
        final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.network.urlexpander.UrlExpander$get$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final String b(dz8 dz8Var) {
                zq3.h(dz8Var, "result");
                throw null;
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                lh4.a(obj);
                return b(null);
            }
        };
        Single<R> map = expandedUrl.map(new Function() { // from class: bz8
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                String d;
                d = UrlExpander.d(ss2.this, obj);
                return d;
            }
        });
        final ss2 ss2Var2 = new ss2() { // from class: com.nytimes.android.network.urlexpander.UrlExpander$get$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SingleSource invoke(Throwable th) {
                zq3.h(th, "it");
                return Single.just(str);
            }
        };
        Single onErrorResumeNext = map.onErrorResumeNext((Function<? super Throwable, ? extends SingleSource<? extends R>>) new Function() { // from class: cz8
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource e;
                e = UrlExpander.e(ss2.this, obj);
                return e;
            }
        });
        zq3.e(onErrorResumeNext);
        return onErrorResumeNext;
    }

    public final boolean f(String str) {
        String str2;
        zq3.h(str, "url");
        String host = Uri.parse(str).getHost();
        if (host != null) {
            str2 = host.toLowerCase();
            zq3.g(str2, "toLowerCase(...)");
        } else {
            str2 = null;
        }
        return zq3.c(str2, "nyti.ms") || zq3.c(str2, "bit.ly");
    }
}
