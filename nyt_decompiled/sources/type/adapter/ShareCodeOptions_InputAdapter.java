package type.adapter;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.h8;
import defpackage.j8;
import defpackage.lu3;
import defpackage.nk5;
import defpackage.w41;
import defpackage.zq3;
import type.ShareCodeOptions;

/* loaded from: classes5.dex */
public final class ShareCodeOptions_InputAdapter implements h8 {
    public static final ShareCodeOptions_InputAdapter INSTANCE = new ShareCodeOptions_InputAdapter();

    private ShareCodeOptions_InputAdapter() {
    }

    @Override // defpackage.h8
    public ShareCodeOptions fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // defpackage.h8
    public void toJson(lu3 lu3Var, w41 w41Var, ShareCodeOptions shareCodeOptions) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(shareCodeOptions, "value");
        if (shareCodeOptions.getPageViewId() instanceof nk5.c) {
            lu3Var.name("pageViewId");
            j8.e(j8.i).toJson(lu3Var, w41Var, (nk5.c) shareCodeOptions.getPageViewId());
        }
    }
}
