package com.nytimes.android.features.games.gameshub.configuration.models;

import android.content.Context;
import com.nytimes.android.features.games.gameshub.playtab.NytGamesProgressState;
import com.nytimes.android.features.games.gameshub.playtab.WordlePuzzleState;
import com.nytimes.android.features.games.gameshub.progress.api.GamesButtonState;
import com.nytimes.android.features.games.gameshub.progress.api.data.DailyProgress;
import com.nytimes.android.features.games.gameshub.progress.api.data.EntitledSpellingBeeProgress;
import com.nytimes.android.features.games.gameshub.progress.api.data.MiniProgress;
import com.nytimes.android.features.games.gameshub.progress.api.data.NonEntitledSpellingBeeProgress;
import com.nytimes.android.logging.NYTLogger;
import defpackage.b22;
import defpackage.me6;
import defpackage.nn0;
import defpackage.ui9;
import defpackage.wt2;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class PlayTabContentDetails {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ PlayTabContentDetails[] $VALUES;
    public static final a Companion;
    private static final wt2 emptyDetails;
    private final String id;
    private final String title;
    public static final PlayTabContentDetails SPELLING_BEE = new PlayTabContentDetails("SPELLING_BEE", 0, "spelling-bee", "Spelling Bee");
    public static final PlayTabContentDetails CROSSWORD_DAILY = new PlayTabContentDetails("CROSSWORD_DAILY", 1, "daily-page", "The Crossword");
    public static final PlayTabContentDetails CROSSWORD_MINI = new PlayTabContentDetails("CROSSWORD_MINI", 2, "mini-page", "The Mini");
    public static final PlayTabContentDetails WORDLE = new PlayTabContentDetails("WORDLE", 3, "wordle", "Wordle");
    public static final PlayTabContentDetails CONNECTIONS = new PlayTabContentDetails("CONNECTIONS", 4, "connections", "Connections");
    public static final PlayTabContentDetails LETTER_BOXED = new PlayTabContentDetails("LETTER_BOXED", 5, "letter-boxed", "Letter Boxed");
    public static final PlayTabContentDetails TILES = new PlayTabContentDetails("TILES", 6, "tiles", "Tiles");
    public static final PlayTabContentDetails SUDOKU = new PlayTabContentDetails("SUDOKU", 7, "sudoku", "Sudoku");
    public static final PlayTabContentDetails STRANDS = new PlayTabContentDetails("STRANDS", 8, "strands", "Strands");

    public static final class a {

        /* renamed from: com.nytimes.android.features.games.gameshub.configuration.models.PlayTabContentDetails$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0277a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[PlayTabContentDetails.values().length];
                try {
                    iArr[PlayTabContentDetails.SPELLING_BEE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PlayTabContentDetails.CROSSWORD_DAILY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PlayTabContentDetails.CROSSWORD_MINI.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[PlayTabContentDetails.WORDLE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[PlayTabContentDetails.CONNECTIONS.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[PlayTabContentDetails.LETTER_BOXED.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[PlayTabContentDetails.TILES.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[PlayTabContentDetails.SUDOKU.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[PlayTabContentDetails.STRANDS.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final wt2 a(Context context, boolean z, String str, String str2, NytGameCardEntity nytGameCardEntity) {
            return z ? EntitledSpellingBeeProgress.Companion.b(context, str, str2, nytGameCardEntity) : NonEntitledSpellingBeeProgress.Companion.b(context, str, str2, nytGameCardEntity);
        }

        private final wt2 e(NytGameCardEntity nytGameCardEntity) {
            return s(me6.progress_crossword_default, nytGameCardEntity);
        }

        private final wt2 f(NytGameCardEntity nytGameCardEntity) {
            return s(me6.progress_mini_default, nytGameCardEntity);
        }

        private final wt2 g(NytGameCardEntity nytGameCardEntity) {
            return s(me6.progress_spelling_bee_default, nytGameCardEntity);
        }

        private final wt2 h(NytGameCardEntity nytGameCardEntity) {
            return s(me6.progress_wordle_default, nytGameCardEntity);
        }

        private final wt2 i(NytGameCardEntity nytGameCardEntity) {
            return s(me6.progress_connections_default, nytGameCardEntity);
        }

        private final wt2 j(Context context, NytGameCardEntity nytGameCardEntity, NytGamesProgressState nytGamesProgressState) {
            return DailyProgress.Companion.b(context, nytGameCardEntity, nytGamesProgressState.a().b());
        }

        private final wt2 k(NytGameCardEntity nytGameCardEntity) {
            return s(me6.progress_letter_boxed_default, nytGameCardEntity);
        }

        private final wt2 l(Context context, NytGameCardEntity nytGameCardEntity, NytGamesProgressState nytGamesProgressState) {
            return MiniProgress.Companion.b(context, nytGameCardEntity, nytGamesProgressState.b().b());
        }

        private final wt2 m(Context context, boolean z, NytGameCardEntity nytGameCardEntity, NytGamesProgressState nytGamesProgressState) {
            return a(context, z, nytGamesProgressState.c().c(), nytGamesProgressState.d().c(), nytGameCardEntity);
        }

        private final wt2 n(NytGameCardEntity nytGameCardEntity) {
            return s(me6.progress_strands_default, nytGameCardEntity);
        }

        private final wt2 o(NytGameCardEntity nytGameCardEntity) {
            return s(me6.progress_sudoku_default, nytGameCardEntity);
        }

        private final wt2 p(NytGameCardEntity nytGameCardEntity) {
            return s(me6.progress_tiles_default, nytGameCardEntity);
        }

        private final wt2 q(NytGameCardEntity nytGameCardEntity) {
            NYTLogger.A("Unknown game: " + nytGameCardEntity, new Object[0]);
            return PlayTabContentDetails.emptyDetails;
        }

        private final wt2 r(Context context, NytGameCardEntity nytGameCardEntity, NytGamesProgressState nytGamesProgressState) {
            WordlePuzzleState e = nytGamesProgressState.e();
            return ui9.Companion.b(context, nytGameCardEntity, e.b(), e.d());
        }

        private final wt2 s(int i, NytGameCardEntity nytGameCardEntity) {
            return new wt2(nytGameCardEntity.f(), nytGameCardEntity.a(), i, nytGameCardEntity.g(), GamesButtonState.PLAY, nytGameCardEntity.b(), nytGameCardEntity.e(), nytGameCardEntity.h(), nytGameCardEntity.c(), nytGameCardEntity.d(), null);
        }

        public final PlayTabContentDetails b(String str) {
            zq3.h(str, "searchId");
            for (PlayTabContentDetails playTabContentDetails : PlayTabContentDetails.values()) {
                if (zq3.c(playTabContentDetails.getId(), str)) {
                    return playTabContentDetails;
                }
            }
            return null;
        }

        public final wt2 c(Context context, boolean z, NytGameCardEntity nytGameCardEntity, NytGamesProgressState nytGamesProgressState) {
            zq3.h(context, "context");
            zq3.h(nytGameCardEntity, "gameCardData");
            zq3.h(nytGamesProgressState, "progressState");
            PlayTabContentDetails b = b(nytGameCardEntity.f());
            switch (b == null ? -1 : C0277a.a[b.ordinal()]) {
                case 1:
                    return m(context, z, nytGameCardEntity, nytGamesProgressState);
                case 2:
                    return j(context, nytGameCardEntity, nytGamesProgressState);
                case 3:
                    return l(context, nytGameCardEntity, nytGamesProgressState);
                case 4:
                    return r(context, nytGameCardEntity, nytGamesProgressState);
                case 5:
                    return i(nytGameCardEntity);
                case 6:
                    return k(nytGameCardEntity);
                case 7:
                    return p(nytGameCardEntity);
                case 8:
                    return o(nytGameCardEntity);
                case 9:
                    return n(nytGameCardEntity);
                default:
                    return q(nytGameCardEntity);
            }
        }

        public final wt2 d(NytGameCardEntity nytGameCardEntity) {
            zq3.h(nytGameCardEntity, "gameCardData");
            PlayTabContentDetails b = b(nytGameCardEntity.f());
            switch (b == null ? -1 : C0277a.a[b.ordinal()]) {
                case 1:
                    return g(nytGameCardEntity);
                case 2:
                    return e(nytGameCardEntity);
                case 3:
                    return f(nytGameCardEntity);
                case 4:
                    return h(nytGameCardEntity);
                case 5:
                    return i(nytGameCardEntity);
                case 6:
                    return k(nytGameCardEntity);
                case 7:
                    return p(nytGameCardEntity);
                case 8:
                    return o(nytGameCardEntity);
                case 9:
                    return n(nytGameCardEntity);
                default:
                    return q(nytGameCardEntity);
            }
        }

        private a() {
        }
    }

    private static final /* synthetic */ PlayTabContentDetails[] $values() {
        return new PlayTabContentDetails[]{SPELLING_BEE, CROSSWORD_DAILY, CROSSWORD_MINI, WORDLE, CONNECTIONS, LETTER_BOXED, TILES, SUDOKU, STRANDS};
    }

    static {
        PlayTabContentDetails[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        emptyDetails = new wt2("", nn0.b.f(), 0, "", GamesButtonState.PLAY, "", "", false, null, null, null);
    }

    private PlayTabContentDetails(String str, int i, String str2, String str3) {
        this.id = str2;
        this.title = str3;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static PlayTabContentDetails valueOf(String str) {
        return (PlayTabContentDetails) Enum.valueOf(PlayTabContentDetails.class, str);
    }

    public static PlayTabContentDetails[] values() {
        return (PlayTabContentDetails[]) $VALUES.clone();
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }
}
