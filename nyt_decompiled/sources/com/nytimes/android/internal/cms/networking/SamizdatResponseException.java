package com.nytimes.android.internal.cms.networking;

import com.nytimes.android.internal.auth.graphql.APIException;
import defpackage.sd0;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import retrofit2.Response;

/* loaded from: classes4.dex */
public final class SamizdatResponseException extends APIException {
    public static final a Companion = new a(null);
    private final Response<sd0> response;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(Response response) {
            MediaType contentType;
            String subtype;
            ResponseBody body = response.raw().body();
            return (body == null || (contentType = body.contentType()) == null || (subtype = contentType.subtype()) == null) ? "missing subtype" : subtype;
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SamizdatResponseException(String str, Response response) {
        super("failed to fetch %s from samizdat, server returned a %s status and %s", str, Integer.valueOf(response.code()), Companion.b(response));
        zq3.h(str, "feedType");
        zq3.h(response, "response");
        this.response = response;
    }
}
