package type.adapter;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.h8;
import defpackage.j8;
import defpackage.lu3;
import defpackage.nk5;
import defpackage.w41;
import defpackage.zq3;
import type.MastheadUserModalAppDownloadInput;

/* loaded from: classes5.dex */
public final class MastheadUserModalAppDownloadInput_InputAdapter implements h8 {
    public static final MastheadUserModalAppDownloadInput_InputAdapter INSTANCE = new MastheadUserModalAppDownloadInput_InputAdapter();

    private MastheadUserModalAppDownloadInput_InputAdapter() {
    }

    @Override // defpackage.h8
    public MastheadUserModalAppDownloadInput fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // defpackage.h8
    public void toJson(lu3 lu3Var, w41 w41Var, MastheadUserModalAppDownloadInput mastheadUserModalAppDownloadInput) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(mastheadUserModalAppDownloadInput, "value");
        if (mastheadUserModalAppDownloadInput.getClickedOnBar1() instanceof nk5.c) {
            lu3Var.name("clickedOnBar1");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) mastheadUserModalAppDownloadInput.getClickedOnBar1());
        }
        if (mastheadUserModalAppDownloadInput.getClickedOnDownloadButtonBadge() instanceof nk5.c) {
            lu3Var.name("clickedOnDownloadButtonBadge");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) mastheadUserModalAppDownloadInput.getClickedOnDownloadButtonBadge());
        }
        if (mastheadUserModalAppDownloadInput.getDismissedModal() instanceof nk5.c) {
            lu3Var.name("dismissedModal");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) mastheadUserModalAppDownloadInput.getDismissedModal());
        }
        if (mastheadUserModalAppDownloadInput.getDismissedOnboardingMessage() instanceof nk5.c) {
            lu3Var.name("dismissedOnboardingMessage");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) mastheadUserModalAppDownloadInput.getDismissedOnboardingMessage());
        }
        if (mastheadUserModalAppDownloadInput.getViewCount() instanceof nk5.c) {
            lu3Var.name("viewCount");
            j8.e(j8.k).toJson(lu3Var, w41Var, (nk5.c) mastheadUserModalAppDownloadInput.getViewCount());
        }
    }
}
