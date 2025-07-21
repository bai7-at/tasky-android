package com.squareup.picasso;

import android.content.Context;
import defpackage.au1;
import java.io.File;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes4.dex */
public final class m implements au1 {
    final Call.Factory a;
    private final Cache b;
    private boolean c;

    public m(Context context) {
        this(w.f(context));
    }

    @Override // defpackage.au1
    public Response a(Request request) {
        return this.a.newCall(request).execute();
    }

    public m(File file) {
        this(file, w.a(file));
    }

    public m(File file, long j) {
        this(new OkHttpClient.Builder().cache(new Cache(file, j)).build());
        this.c = false;
    }

    public m(OkHttpClient okHttpClient) {
        this.c = true;
        this.a = okHttpClient;
        this.b = okHttpClient.cache();
    }
}
