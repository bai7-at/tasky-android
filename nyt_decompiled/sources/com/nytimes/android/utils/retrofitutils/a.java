package com.nytimes.android.utils.retrofitutils;

import com.nytimes.android.coroutinesutils.FetchResult;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.utils.retrofitutils.ResponseError;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.i;
import defpackage.zq3;
import okhttp3.ResponseBody;
import retrofit2.Response;

/* loaded from: classes4.dex */
public abstract class a {
    private static final i a;
    private static final JsonAdapter b;

    static {
        i d = new i.b().d();
        a = d;
        b = d.c(ResponseError.class);
    }

    public static final String a(Response response) {
        ResponseError.Results b2;
        zq3.h(response, "<this>");
        ResponseBody errorBody = response.errorBody();
        if (errorBody == null) {
            return null;
        }
        try {
            ResponseError responseError = (ResponseError) b.fromJson(errorBody.string());
            if (responseError != null && (b2 = responseError.b()) != null) {
                String a2 = b2.a();
                if (a2 != null) {
                    return a2;
                }
            }
            return "Something went wrong";
        } catch (Exception e) {
            NYTLogger.h(e);
            return e.getMessage();
        }
    }

    public static final FetchResult b(FetchResult.a aVar, Response response) {
        zq3.h(aVar, "<this>");
        zq3.h(response, "response");
        return new FetchResult.b.a(new Throwable(a(response)));
    }
}
