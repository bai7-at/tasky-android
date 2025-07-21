package type.adapter;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.h8;
import defpackage.j8;
import defpackage.lu3;
import defpackage.nk5;
import defpackage.w41;
import defpackage.zq3;
import type.RegiOnboardingGamesPreferencesInput;

/* loaded from: classes5.dex */
public final class RegiOnboardingGamesPreferencesInput_InputAdapter implements h8 {
    public static final RegiOnboardingGamesPreferencesInput_InputAdapter INSTANCE = new RegiOnboardingGamesPreferencesInput_InputAdapter();

    private RegiOnboardingGamesPreferencesInput_InputAdapter() {
    }

    @Override // defpackage.h8
    public RegiOnboardingGamesPreferencesInput fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // defpackage.h8
    public void toJson(lu3 lu3Var, w41 w41Var, RegiOnboardingGamesPreferencesInput regiOnboardingGamesPreferencesInput) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(regiOnboardingGamesPreferencesInput, "value");
        if (regiOnboardingGamesPreferencesInput.getConnections() instanceof nk5.c) {
            lu3Var.name("connections");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) regiOnboardingGamesPreferencesInput.getConnections());
        }
        if (regiOnboardingGamesPreferencesInput.getSpellingBee() instanceof nk5.c) {
            lu3Var.name("spellingBee");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) regiOnboardingGamesPreferencesInput.getSpellingBee());
        }
        if (regiOnboardingGamesPreferencesInput.getSudoku() instanceof nk5.c) {
            lu3Var.name("sudoku");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) regiOnboardingGamesPreferencesInput.getSudoku());
        }
        if (regiOnboardingGamesPreferencesInput.getTheMini() instanceof nk5.c) {
            lu3Var.name("theMini");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) regiOnboardingGamesPreferencesInput.getTheMini());
        }
        if (regiOnboardingGamesPreferencesInput.getTiles() instanceof nk5.c) {
            lu3Var.name("tiles");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) regiOnboardingGamesPreferencesInput.getTiles());
        }
        if (regiOnboardingGamesPreferencesInput.getWordle() instanceof nk5.c) {
            lu3Var.name("wordle");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) regiOnboardingGamesPreferencesInput.getWordle());
        }
    }
}
