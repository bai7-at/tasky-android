package type.adapter;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.h8;
import defpackage.j8;
import defpackage.lu3;
import defpackage.nk5;
import defpackage.w41;
import defpackage.zq3;
import type.DateTime;
import type.MessageCapInput;

/* loaded from: classes5.dex */
public final class MessageCapInput_InputAdapter implements h8 {
    public static final MessageCapInput_InputAdapter INSTANCE = new MessageCapInput_InputAdapter();

    private MessageCapInput_InputAdapter() {
    }

    @Override // defpackage.h8
    public MessageCapInput fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // defpackage.h8
    public void toJson(lu3 lu3Var, w41 w41Var, MessageCapInput messageCapInput) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(messageCapInput, "value");
        if (messageCapInput.getDismissed() instanceof nk5.c) {
            lu3Var.name("dismissed");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) messageCapInput.getDismissed());
        }
        if (messageCapInput.getLastSeenOn() instanceof nk5.c) {
            lu3Var.name("lastSeenOn");
            j8.e(j8.b(w41Var.h(DateTime.Companion.getType()))).toJson(lu3Var, w41Var, (nk5.c) messageCapInput.getLastSeenOn());
        }
        if (messageCapInput.getViewCount() instanceof nk5.c) {
            lu3Var.name("viewCount");
            j8.e(j8.k).toJson(lu3Var, w41Var, (nk5.c) messageCapInput.getViewCount());
        }
    }
}
