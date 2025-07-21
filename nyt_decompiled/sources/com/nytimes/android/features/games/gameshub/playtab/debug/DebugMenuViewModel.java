package com.nytimes.android.features.games.gameshub.playtab.debug;

import androidx.lifecycle.q;
import com.nytimes.android.features.games.gameshub.playtab.usecase.DebugDataUseCase;
import com.nytimes.android.features.games.gameshub.playtab.usecase.a;
import com.nytimes.android.features.games.gameshub.progress.api.data.DailyProgress;
import com.nytimes.android.features.games.gameshub.progress.api.data.EntitledSpellingBeeProgress;
import com.nytimes.android.features.games.gameshub.progress.api.data.MiniProgress;
import com.nytimes.android.features.games.gameshub.progress.api.data.NonEntitledSpellingBeeProgress;
import defpackage.du8;
import defpackage.oi7;
import defpackage.ui9;
import defpackage.zq3;
import java.util.Map;
import kotlin.collections.t;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class DebugMenuViewModel extends q {
    private final a a;
    private final MutableStateFlow b;
    private final Map c;
    private final Map d;

    public DebugMenuViewModel(a aVar) {
        zq3.h(aVar, "playTabProgressUseCase");
        this.a = aVar;
        this.b = StateFlowKt.MutableStateFlow(DebugDataUseCase.Companion.d());
        this.c = t.m(du8.a("Spelling Bee (Today)", EntitledSpellingBeeProgress.values()), du8.a("Spelling Bee (Yesterday)", EntitledSpellingBeeProgress.values()), du8.a("Crossword", DailyProgress.values()), du8.a("The Mini", MiniProgress.values()));
        this.d = t.m(du8.a("Spelling Bee (Today)", NonEntitledSpellingBeeProgress.values()), du8.a("Spelling Bee (Yesterday)", NonEntitledSpellingBeeProgress.values()), du8.a("Crossword", DailyProgress.values()), du8.a("The Mini", MiniProgress.values()));
    }

    public final Map e(boolean z) {
        return z ? this.c : this.d;
    }

    public final String f(boolean z, int i, Enum r4) {
        zq3.h(r4, "enum");
        return this.a.c(z, i, r4);
    }

    public final ui9 g() {
        return this.a.d();
    }

    public final void i() {
        this.a.e((oi7) this.b.getValue());
    }

    public final void j(int i, String str) {
        Object value;
        oi7 oi7Var;
        zq3.h(str, "newItem");
        MutableStateFlow mutableStateFlow = this.b;
        do {
            value = mutableStateFlow.getValue();
            oi7Var = (oi7) value;
            if (i == 0) {
                oi7Var = oi7.b(oi7Var, str, null, null, null, null, 30, null);
            } else if (i == 1) {
                oi7Var = oi7.b(oi7Var, null, str, null, null, null, 29, null);
            } else if (i == 2) {
                oi7Var = oi7.b(oi7Var, null, null, DailyProgress.valueOf(str), null, null, 27, null);
            } else if (i == 3) {
                oi7Var = oi7.b(oi7Var, null, null, null, MiniProgress.valueOf(str), null, 23, null);
            }
        } while (!mutableStateFlow.compareAndSet(value, oi7Var));
    }

    public final void k(int i, boolean z) {
        Object value;
        MutableStateFlow mutableStateFlow = this.b;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, oi7.b((oi7) value, null, null, null, null, new ui9(0, i, z, 1, null), 15, null)));
    }
}
