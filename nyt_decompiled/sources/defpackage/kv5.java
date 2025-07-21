package defpackage;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import com.nytimes.android.features.games.gameshub.playtab.CrosswordPuzzleState;
import com.nytimes.android.features.games.gameshub.playtab.SpellingBeePuzzleState;
import com.nytimes.android.features.games.gameshub.playtab.WordlePuzzleState;
import com.nytimes.android.features.games.gameshub.progress.api.CrosswordMiniPuzzleProgressData;
import com.nytimes.android.features.games.gameshub.progress.api.CrosswordPuzzleProgressData;
import com.nytimes.android.features.games.gameshub.progress.api.SpellingBeePuzzleProgressData;
import com.nytimes.android.features.games.gameshub.progress.api.WordlePuzzleProgressData;
import com.nytimes.android.features.games.gameshub.progress.api.data.EntitledSpellingBeeProgress;
import com.nytimes.android.utils.composeutils.nestedscroll.ScrollObserver;

/* loaded from: classes4.dex */
public abstract class kv5 {
    public static final CrosswordPuzzleState a(CrosswordMiniPuzzleProgressData crosswordMiniPuzzleProgressData) {
        String str;
        int puzzleId = crosswordMiniPuzzleProgressData != null ? crosswordMiniPuzzleProgressData.getPuzzleId() : 0;
        if (crosswordMiniPuzzleProgressData == null || (str = crosswordMiniPuzzleProgressData.getPrintDate()) == null) {
            str = "";
        }
        return new CrosswordPuzzleState(puzzleId, crosswordMiniPuzzleProgressData != null ? crosswordMiniPuzzleProgressData.getSolved() : false, crosswordMiniPuzzleProgressData != null ? crosswordMiniPuzzleProgressData.getPercentFilled() : 0, str);
    }

    public static final CrosswordPuzzleState b(CrosswordPuzzleProgressData crosswordPuzzleProgressData) {
        String str;
        int puzzleId = crosswordPuzzleProgressData != null ? crosswordPuzzleProgressData.getPuzzleId() : 0;
        if (crosswordPuzzleProgressData == null || (str = crosswordPuzzleProgressData.getPrintDate()) == null) {
            str = "";
        }
        return new CrosswordPuzzleState(puzzleId, crosswordPuzzleProgressData != null ? crosswordPuzzleProgressData.getSolved() : false, crosswordPuzzleProgressData != null ? crosswordPuzzleProgressData.getPercentFilled() : 0, str);
    }

    public static final SpellingBeePuzzleState c(SpellingBeePuzzleProgressData spellingBeePuzzleProgressData) {
        String rank;
        int puzzleId = spellingBeePuzzleProgressData != null ? spellingBeePuzzleProgressData.getPuzzleId() : 0;
        if (spellingBeePuzzleProgressData == null || (rank = spellingBeePuzzleProgressData.getRank()) == null) {
            rank = EntitledSpellingBeeProgress.EMPTY.getRank();
        }
        return new SpellingBeePuzzleState(puzzleId, rank);
    }

    public static final WordlePuzzleState d(WordlePuzzleProgressData wordlePuzzleProgressData) {
        return new WordlePuzzleState(wordlePuzzleProgressData != null ? wordlePuzzleProgressData.getPuzzleId() : 0, wordlePuzzleProgressData != null ? wordlePuzzleProgressData.getWin() : false, wordlePuzzleProgressData != null ? wordlePuzzleProgressData.getGuesses() : 0);
    }

    public static final jv5 e(boolean z, ScrollObserver scrollObserver, LazyListState lazyListState, Composer composer, int i, int i2) {
        zq3.h(scrollObserver, "toolbarScroller");
        composer.z(-1942593235);
        if ((i2 & 4) != 0) {
            lazyListState = LazyListStateKt.c(0, 0, composer, 0, 3);
        }
        if (b.G()) {
            b.S(-1942593235, i, -1, "com.nytimes.android.features.games.gameshub.playtab.rememberPlayTabState (PlayTabState.kt:129)");
        }
        composer.z(541288885);
        Object A = composer.A();
        if (A == Composer.a.a()) {
            A = new jv5(new e19(z), scrollObserver, lazyListState);
            composer.q(A);
        }
        composer.R();
        jv5 c = jv5.c((jv5) A, new e19(z), null, null, 6, null);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return c;
    }
}
