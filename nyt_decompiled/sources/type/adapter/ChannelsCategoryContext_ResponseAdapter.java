package type.adapter;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.h8;
import defpackage.lu3;
import defpackage.w41;
import defpackage.zq3;
import type.ChannelsCategoryContext;

/* loaded from: classes5.dex */
public final class ChannelsCategoryContext_ResponseAdapter implements h8 {
    public static final ChannelsCategoryContext_ResponseAdapter INSTANCE = new ChannelsCategoryContext_ResponseAdapter();

    private ChannelsCategoryContext_ResponseAdapter() {
    }

    @Override // defpackage.h8
    public ChannelsCategoryContext fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String nextString = jsonReader.nextString();
        zq3.e(nextString);
        return ChannelsCategoryContext.Companion.safeValueOf(nextString);
    }

    @Override // defpackage.h8
    public void toJson(lu3 lu3Var, w41 w41Var, ChannelsCategoryContext channelsCategoryContext) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(channelsCategoryContext, "value");
        lu3Var.value(channelsCategoryContext.getRawValue());
    }
}
