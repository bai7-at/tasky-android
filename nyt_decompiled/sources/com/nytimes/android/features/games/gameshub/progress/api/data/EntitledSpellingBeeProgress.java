package com.nytimes.android.features.games.gameshub.progress.api.data;

import android.content.Context;
import com.chartbeat.androidsdk.QueryKeys;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.features.games.gameshub.configuration.models.NytGameCardEntity;
import com.nytimes.android.features.games.gameshub.progress.api.GamesButtonState;
import defpackage.b22;
import defpackage.jv2;
import defpackage.me6;
import defpackage.nn0;
import defpackage.rk6;
import defpackage.wt2;
import defpackage.zq3;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class EntitledSpellingBeeProgress {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ EntitledSpellingBeeProgress[] $VALUES;
    public static final EntitledSpellingBeeProgress AMAZING;
    public static final EntitledSpellingBeeProgress BEGINNER;
    public static final Companion Companion;
    public static final EntitledSpellingBeeProgress EMPTY = new EntitledSpellingBeeProgress("EMPTY", 0, "Empty", me6.progress_spelling_bee_default, rk6.progress_spelling_bee_empty_byline, rk6.progress_spelling_bee_empty_description, GamesButtonState.PLAY);
    public static final EntitledSpellingBeeProgress GENIUS;
    public static final EntitledSpellingBeeProgress GOOD;
    public static final EntitledSpellingBeeProgress GOOD_START;
    public static final EntitledSpellingBeeProgress GREAT;
    public static final EntitledSpellingBeeProgress MOVING_UP;
    public static final EntitledSpellingBeeProgress NICE;
    public static final EntitledSpellingBeeProgress NO_RANK;
    public static final EntitledSpellingBeeProgress QUEEN_BEE;
    public static final EntitledSpellingBeeProgress SOLID;
    private final GamesButtonState buttonState;
    private final int byline;
    private final int description;
    private final int image;
    private final String rank;

    public static final class Companion {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        private static final class EmptyProgress {
            private static final /* synthetic */ b22 $ENTRIES;
            private static final /* synthetic */ EmptyProgress[] $VALUES;
            private final int bylineRes;
            public static final EmptyProgress EMPTY_NOT_STARTED = new EmptyProgress("EMPTY_NOT_STARTED", 0, rk6.progress_spelling_bee_empty_byline);
            public static final EmptyProgress EMPTY_NO_RANK = new EmptyProgress("EMPTY_NO_RANK", 1, rk6.progress_spelling_bee_empty_no_rank_byline);
            public static final EmptyProgress EMPTY_RANKED = new EmptyProgress("EMPTY_RANKED", 2, rk6.progress_spelling_bee_empty_ranked_byline);
            public static final EmptyProgress EMPTY_GENIUS = new EmptyProgress("EMPTY_GENIUS", 3, rk6.progress_spelling_bee_empty_genius_byline);
            public static final EmptyProgress EMPTY_QUEEN_BEE = new EmptyProgress("EMPTY_QUEEN_BEE", 4, rk6.progress_spelling_bee_empty_queen_bee_byline);

            private static final /* synthetic */ EmptyProgress[] $values() {
                return new EmptyProgress[]{EMPTY_NOT_STARTED, EMPTY_NO_RANK, EMPTY_RANKED, EMPTY_GENIUS, EMPTY_QUEEN_BEE};
            }

            static {
                EmptyProgress[] $values = $values();
                $VALUES = $values;
                $ENTRIES = kotlin.enums.a.a($values);
            }

            private EmptyProgress(String str, int i, int i2) {
                this.bylineRes = i2;
            }

            public static b22 getEntries() {
                return $ENTRIES;
            }

            public static EmptyProgress valueOf(String str) {
                return (EmptyProgress) Enum.valueOf(EmptyProgress.class, str);
            }

            public static EmptyProgress[] values() {
                return (EmptyProgress[]) $VALUES.clone();
            }

            public final int getBylineRes() {
                return this.bylineRes;
            }
        }

        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a;
            public static final /* synthetic */ int[] b;

            static {
                int[] iArr = new int[GamesButtonState.values().length];
                try {
                    iArr[GamesButtonState.SOLVED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                a = iArr;
                int[] iArr2 = new int[EntitledSpellingBeeProgress.values().length];
                try {
                    iArr2[EntitledSpellingBeeProgress.EMPTY.ordinal()] = 1;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr2[EntitledSpellingBeeProgress.NO_RANK.ordinal()] = 2;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[EntitledSpellingBeeProgress.BEGINNER.ordinal()] = 3;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[EntitledSpellingBeeProgress.GOOD_START.ordinal()] = 4;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[EntitledSpellingBeeProgress.MOVING_UP.ordinal()] = 5;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[EntitledSpellingBeeProgress.GOOD.ordinal()] = 6;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[EntitledSpellingBeeProgress.SOLID.ordinal()] = 7;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr2[EntitledSpellingBeeProgress.NICE.ordinal()] = 8;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr2[EntitledSpellingBeeProgress.GREAT.ordinal()] = 9;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr2[EntitledSpellingBeeProgress.AMAZING.ordinal()] = 10;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr2[EntitledSpellingBeeProgress.GENIUS.ordinal()] = 11;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr2[EntitledSpellingBeeProgress.QUEEN_BEE.ordinal()] = 12;
                } catch (NoSuchFieldError unused13) {
                }
                b = iArr2;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final EntitledSpellingBeeProgress a(String str) {
            EntitledSpellingBeeProgress entitledSpellingBeeProgress;
            if (str == null || str.length() == 0) {
                return EntitledSpellingBeeProgress.EMPTY;
            }
            String F = h.F(str, QueryKeys.END_MARKER, " ", false, 4, null);
            EntitledSpellingBeeProgress[] values = EntitledSpellingBeeProgress.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    entitledSpellingBeeProgress = null;
                    break;
                }
                entitledSpellingBeeProgress = values[i];
                String rank = entitledSpellingBeeProgress.getRank();
                Locale locale = Locale.ROOT;
                String lowerCase = rank.toLowerCase(locale);
                zq3.g(lowerCase, "toLowerCase(...)");
                String lowerCase2 = F.toLowerCase(locale);
                zq3.g(lowerCase2, "toLowerCase(...)");
                if (zq3.c(lowerCase, lowerCase2)) {
                    break;
                }
                i++;
            }
            return entitledSpellingBeeProgress == null ? EntitledSpellingBeeProgress.EMPTY : entitledSpellingBeeProgress;
        }

        private final String c(Context context, EntitledSpellingBeeProgress entitledSpellingBeeProgress) {
            String string;
            switch (entitledSpellingBeeProgress == null ? -1 : a.b[entitledSpellingBeeProgress.ordinal()]) {
                case -1:
                case 1:
                    string = context.getString(EmptyProgress.EMPTY_NOT_STARTED.getBylineRes());
                    break;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 2:
                    string = context.getString(EmptyProgress.EMPTY_NO_RANK.getBylineRes());
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    string = context.getString(EmptyProgress.EMPTY_RANKED.getBylineRes(), entitledSpellingBeeProgress.getRank());
                    break;
                case 11:
                    string = context.getString(EmptyProgress.EMPTY_GENIUS.getBylineRes());
                    break;
                case 12:
                    string = context.getString(EmptyProgress.EMPTY_QUEEN_BEE.getBylineRes());
                    break;
            }
            zq3.e(string);
            return string;
        }

        private final jv2 d(Context context, String str, String str2, NytGameCardEntity nytGameCardEntity) {
            EntitledSpellingBeeProgress a2 = a(str);
            String e = e(context, a2, a(str2));
            long f = a.a[a2.getButtonState().ordinal()] == 1 ? nn0.b.f() : nytGameCardEntity.a();
            String string = context.getString(a2.getDescription());
            zq3.g(string, "getString(...)");
            return new jv2(f, a2.getImage(), a2.getButtonState(), e, string, null);
        }

        private final String e(Context context, EntitledSpellingBeeProgress entitledSpellingBeeProgress, EntitledSpellingBeeProgress entitledSpellingBeeProgress2) {
            if (entitledSpellingBeeProgress == null || entitledSpellingBeeProgress == EntitledSpellingBeeProgress.EMPTY) {
                return c(context, entitledSpellingBeeProgress2);
            }
            String string = context.getString(entitledSpellingBeeProgress.getByline());
            zq3.e(string);
            return string;
        }

        public final wt2 b(Context context, String str, String str2, NytGameCardEntity nytGameCardEntity) {
            zq3.h(context, "context");
            zq3.h(str, "rankToday");
            zq3.h(str2, "rankYesterday");
            zq3.h(nytGameCardEntity, AssetConstants.DAILY_FIVE_GAME);
            jv2 d = d(context, str, str2, nytGameCardEntity);
            String f = nytGameCardEntity.f();
            String g = nytGameCardEntity.g();
            long a2 = d.a();
            int e = d.e();
            String c = d.c();
            String d2 = d.d();
            return new wt2(f, a2, e, g, d.b(), nytGameCardEntity.b(), nytGameCardEntity.e(), nytGameCardEntity.h(), c, d2, null);
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ EntitledSpellingBeeProgress[] $values() {
        return new EntitledSpellingBeeProgress[]{EMPTY, NO_RANK, BEGINNER, GOOD_START, MOVING_UP, GOOD, SOLID, NICE, GREAT, AMAZING, GENIUS, QUEEN_BEE};
    }

    static {
        int i = me6.progress_spelling_bee_default;
        int i2 = rk6.progress_spelling_bee_no_rank_byline;
        int i3 = rk6.progress_spelling_bee_playing_description;
        GamesButtonState gamesButtonState = GamesButtonState.CONTINUE;
        NO_RANK = new EntitledSpellingBeeProgress("NO_RANK", 1, "No Rank", i, i2, i3, gamesButtonState);
        BEGINNER = new EntitledSpellingBeeProgress("BEGINNER", 2, "Beginner", me6.progress_spelling_bee_beginner, rk6.progress_spelling_bee_beginner_byline, rk6.progress_spelling_bee_playing_description, gamesButtonState);
        GOOD_START = new EntitledSpellingBeeProgress("GOOD_START", 3, "Good Start", me6.progress_spelling_bee_good_start, rk6.progress_spelling_bee_good_start_byline, rk6.progress_spelling_bee_playing_description, gamesButtonState);
        MOVING_UP = new EntitledSpellingBeeProgress("MOVING_UP", 4, "Moving Up", me6.progress_spelling_bee_moving_up, rk6.progress_spelling_bee_moving_up_byline, rk6.progress_spelling_bee_playing_description, gamesButtonState);
        GOOD = new EntitledSpellingBeeProgress("GOOD", 5, "Good", me6.progress_spelling_bee_good, rk6.progress_spelling_bee_good_byline, rk6.progress_spelling_bee_playing_description, gamesButtonState);
        SOLID = new EntitledSpellingBeeProgress("SOLID", 6, "Solid", me6.progress_spelling_bee_solid, rk6.progress_spelling_bee_solid_byline, rk6.progress_spelling_bee_playing_description, gamesButtonState);
        NICE = new EntitledSpellingBeeProgress("NICE", 7, "Nice", me6.progress_spelling_bee_nice, rk6.progress_spelling_bee_nice_byline, rk6.progress_spelling_bee_playing_description, gamesButtonState);
        GREAT = new EntitledSpellingBeeProgress("GREAT", 8, "Great", me6.progress_spelling_bee_great, rk6.progress_spelling_bee_great_byline, rk6.progress_spelling_bee_playing_description, gamesButtonState);
        AMAZING = new EntitledSpellingBeeProgress("AMAZING", 9, "Amazing", me6.progress_spelling_bee_amazing, rk6.progress_spelling_bee_amazing_byline, rk6.progress_spelling_bee_playing_description, gamesButtonState);
        int i4 = me6.progress_spelling_bee_genius;
        int i5 = rk6.progress_spelling_bee_genius_byline;
        int i6 = rk6.progress_spelling_bee_genius_description;
        GamesButtonState gamesButtonState2 = GamesButtonState.SOLVED;
        GENIUS = new EntitledSpellingBeeProgress("GENIUS", 10, "Genius", i4, i5, i6, gamesButtonState2);
        QUEEN_BEE = new EntitledSpellingBeeProgress("QUEEN_BEE", 11, "Queen Bee", me6.progress_spelling_bee_queen_bee, rk6.progress_spelling_bee_queen_bee_byline, rk6.progress_spelling_bee_queen_bee_description, gamesButtonState2);
        EntitledSpellingBeeProgress[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
        Companion = new Companion(null);
    }

    private EntitledSpellingBeeProgress(String str, int i, String str2, int i2, int i3, int i4, GamesButtonState gamesButtonState) {
        this.rank = str2;
        this.image = i2;
        this.byline = i3;
        this.description = i4;
        this.buttonState = gamesButtonState;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static EntitledSpellingBeeProgress valueOf(String str) {
        return (EntitledSpellingBeeProgress) Enum.valueOf(EntitledSpellingBeeProgress.class, str);
    }

    public static EntitledSpellingBeeProgress[] values() {
        return (EntitledSpellingBeeProgress[]) $VALUES.clone();
    }

    public final GamesButtonState getButtonState() {
        return this.buttonState;
    }

    public final int getByline() {
        return this.byline;
    }

    public final int getDescription() {
        return this.description;
    }

    public final int getImage() {
        return this.image;
    }

    public final String getRank() {
        return this.rank;
    }
}
