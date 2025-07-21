package type.adapter;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.h8;
import defpackage.j8;
import defpackage.lu3;
import defpackage.nk5;
import defpackage.w41;
import defpackage.zq3;
import type.DateTime;
import type.MessageSelectionMessageCapInput;

/* loaded from: classes5.dex */
public final class MessageSelectionMessageCapInput_InputAdapter implements h8 {
    public static final MessageSelectionMessageCapInput_InputAdapter INSTANCE = new MessageSelectionMessageCapInput_InputAdapter();

    private MessageSelectionMessageCapInput_InputAdapter() {
    }

    @Override // defpackage.h8
    public MessageSelectionMessageCapInput fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // defpackage.h8
    public void toJson(lu3 lu3Var, w41 w41Var, MessageSelectionMessageCapInput messageSelectionMessageCapInput) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(messageSelectionMessageCapInput, "value");
        if (messageSelectionMessageCapInput.getAudience() instanceof nk5.c) {
            lu3Var.name("audience");
            j8.e(j8.i).toJson(lu3Var, w41Var, (nk5.c) messageSelectionMessageCapInput.getAudience());
        }
        if (messageSelectionMessageCapInput.getCampaign() instanceof nk5.c) {
            lu3Var.name("campaign");
            j8.e(j8.i).toJson(lu3Var, w41Var, (nk5.c) messageSelectionMessageCapInput.getCampaign());
        }
        if (messageSelectionMessageCapInput.getDismissed() instanceof nk5.c) {
            lu3Var.name("dismissed");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) messageSelectionMessageCapInput.getDismissed());
        }
        if (messageSelectionMessageCapInput.getLastSeenOn() instanceof nk5.c) {
            lu3Var.name("lastSeenOn");
            j8.e(j8.b(w41Var.h(DateTime.Companion.getType()))).toJson(lu3Var, w41Var, (nk5.c) messageSelectionMessageCapInput.getLastSeenOn());
        }
        if (messageSelectionMessageCapInput.getUnit() instanceof nk5.c) {
            lu3Var.name("unit");
            j8.e(j8.i).toJson(lu3Var, w41Var, (nk5.c) messageSelectionMessageCapInput.getUnit());
        }
        if (messageSelectionMessageCapInput.getViewCount() instanceof nk5.c) {
            lu3Var.name("viewCount");
            j8.e(j8.k).toJson(lu3Var, w41Var, (nk5.c) messageSelectionMessageCapInput.getViewCount());
        }
    }
}
