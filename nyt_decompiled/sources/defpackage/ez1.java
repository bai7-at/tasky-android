package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import com.nytimes.android.subauth.core.type.EmailMarketingOptInUiDirectiveValue;

/* loaded from: classes4.dex */
public final class ez1 implements h8 {
    public static final ez1 a = new ez1();

    private ez1() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public EmailMarketingOptInUiDirectiveValue fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String nextString = jsonReader.nextString();
        zq3.e(nextString);
        return EmailMarketingOptInUiDirectiveValue.Companion.a(nextString);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, EmailMarketingOptInUiDirectiveValue emailMarketingOptInUiDirectiveValue) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(emailMarketingOptInUiDirectiveValue, "value");
        lu3Var.value(emailMarketingOptInUiDirectiveValue.getRawValue());
    }
}
