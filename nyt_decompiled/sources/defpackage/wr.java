package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.exception.NullOrMissingField;
import com.facebook.AuthenticationTokenClaims;

/* loaded from: classes2.dex */
abstract /* synthetic */ class wr {
    public static final Void a(JsonReader jsonReader, String str) {
        zq3.h(jsonReader, "jsonReader");
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        throw new NullOrMissingField("Field '" + str + "' is missing or null at path " + jsonReader.getPath());
    }
}
