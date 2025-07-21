package type.adapter;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.h8;
import defpackage.j8;
import defpackage.lu3;
import defpackage.nk5;
import defpackage.w41;
import defpackage.zq3;
import type.AccountMastheadUserModalInput;

/* loaded from: classes5.dex */
public final class AccountMastheadUserModalInput_InputAdapter implements h8 {
    public static final AccountMastheadUserModalInput_InputAdapter INSTANCE = new AccountMastheadUserModalInput_InputAdapter();

    private AccountMastheadUserModalInput_InputAdapter() {
    }

    @Override // defpackage.h8
    public AccountMastheadUserModalInput fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // defpackage.h8
    public void toJson(lu3 lu3Var, w41 w41Var, AccountMastheadUserModalInput accountMastheadUserModalInput) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(accountMastheadUserModalInput, "value");
        if (accountMastheadUserModalInput.getClickedOnAccountButtonBadge() instanceof nk5.c) {
            lu3Var.name("clickedOnAccountButtonBadge");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) accountMastheadUserModalInput.getClickedOnAccountButtonBadge());
        }
        if (accountMastheadUserModalInput.getDismissedOnboardingMessage() instanceof nk5.c) {
            lu3Var.name("dismissedOnboardingMessage");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) accountMastheadUserModalInput.getDismissedOnboardingMessage());
        }
    }
}
