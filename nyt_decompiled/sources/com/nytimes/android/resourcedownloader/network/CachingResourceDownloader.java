package com.nytimes.android.resourcedownloader.network;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.io.network.ex.NetworkingException;
import com.nytimes.android.io.network.raw.CachedNetworkSource;
import com.nytimes.android.resourcedownloader.model.MimeType;
import com.nytimes.android.resourcedownloader.model.Resource;
import com.nytimes.android.resourcedownloader.network.CachingResourceDownloader;
import defpackage.b04;
import defpackage.kz6;
import defpackage.sd0;
import defpackage.ss2;
import defpackage.ul8;
import defpackage.ww8;
import defpackage.zq3;
import io.reactivex.Observable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.threeten.bp.Instant;

/* loaded from: classes4.dex */
public final class CachingResourceDownloader implements kz6 {
    public static final a Companion = new a(null);
    private final b04 a;
    private final b04 b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public CachingResourceDownloader(b04 b04Var, b04 b04Var2) {
        zq3.h(b04Var, "networkManager");
        zq3.h(b04Var2, "httpClient");
        this.a = b04Var;
        this.b = b04Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(String str) {
        ul8.a.z("HYBRID").l("Finish loading hybrid image " + str, new Object[0]);
    }

    private final Resource i(Response response, String str) {
        Date date = response.headers().getDate("date");
        Instant j = date != null ? j(date) : null;
        Date date2 = response.headers().getDate("expires");
        Instant j2 = date2 != null ? j(date2) : null;
        Long valueOf = response.cacheControl().isPublic() ? Long.valueOf(response.cacheControl().maxAgeSeconds()) : null;
        String str2 = response.headers().get(TransferTable.COLUMN_ETAG);
        ResponseBody body = response.body();
        zq3.e(body);
        return new Resource(str, j, j2, valueOf, str2, body.string());
    }

    private final Instant j(Date date) {
        try {
            return Instant.ofEpochMilli(date.getTime());
        } catch (Exception e) {
            ul8.a.z("HYBRID").e(e);
            return null;
        }
    }

    @Override // defpackage.kz6
    public void a(final String str) {
        if (str == null || str.length() == 0 || !MimeType.Companion.isImage(str)) {
            throw new IllegalArgumentException("Parameter url=" + str + " is not a valid image URL.");
        }
        Observable<sd0> asyncFetch = ((CachedNetworkSource) this.a.get()).asyncFetch(str);
        final CachingResourceDownloader$preCacheImage$2 cachingResourceDownloader$preCacheImage$2 = new ss2() { // from class: com.nytimes.android.resourcedownloader.network.CachingResourceDownloader$preCacheImage$2
            public final void b(sd0 sd0Var) {
                try {
                    sd0Var.close();
                } catch (Exception e) {
                    ul8.a.z("HYBRID").f(e, "Fail to load and save required resource", new Object[0]);
                }
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((sd0) obj);
                return ww8.a;
            }
        };
        Consumer<? super sd0> consumer = new Consumer() { // from class: vg0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CachingResourceDownloader.f(ss2.this, obj);
            }
        };
        final CachingResourceDownloader$preCacheImage$3 cachingResourceDownloader$preCacheImage$3 = new ss2() { // from class: com.nytimes.android.resourcedownloader.network.CachingResourceDownloader$preCacheImage$3
            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return ww8.a;
            }

            public final void invoke(Throwable th) {
                ul8.a.z("HYBRID").f(th, "Fail to load and save required resource", new Object[0]);
            }
        };
        asyncFetch.subscribe(consumer, new Consumer() { // from class: wg0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CachingResourceDownloader.g(ss2.this, obj);
            }
        }, new Action() { // from class: xg0
            @Override // io.reactivex.functions.Action
            public final void run() {
                CachingResourceDownloader.h(str);
            }
        });
    }

    @Override // defpackage.kz6
    public Resource b(String str) {
        zq3.h(str, "url");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("Parameter 'url' must a valid network URL.");
        }
        Response execute = ((OkHttpClient) this.b.get()).newCall(new Request.Builder().url(str).build()).execute();
        if (execute.isSuccessful() && execute.body() != null) {
            return i(execute, str);
        }
        throw new NetworkingException("Failed to fetch resource " + str + " due to " + execute.code() + " " + execute.message(), new Object[0]);
    }
}
