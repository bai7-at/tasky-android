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
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class NonEntitledSpellingBeeProgress {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ NonEntitledSpellingBeeProgress[] $VALUES;
    public static final Companion Companion;
    public static final NonEntitledSpellingBeeProgress REGI_BEGINNER;
    public static final NonEntitledSpellingBeeProgress REGI_EMPTY = new NonEntitledSpellingBeeProgress("REGI_EMPTY", 0, "Empty", me6.progress_spelling_bee_default, rk6.progress_spelling_bee_nonentitled_empty_byline, rk6.progress_spelling_bee_nonentitled_empty_description, GamesButtonState.PLAY);
    public static final NonEntitledSpellingBeeProgress REGI_GOOD;
    public static final NonEntitledSpellingBeeProgress REGI_GOOD_START;
    public static final NonEntitledSpellingBeeProgress REGI_MOVING_UP;
    public static final NonEntitledSpellingBeeProgress REGI_NO_RANK;
    public static final NonEntitledSpellingBeeProgress REGI_SOLID;
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
            public static final EmptyProgress REGI_NOT_STARTED = new EmptyProgress("REGI_NOT_STARTED", 0, rk6.progress_spelling_bee_nonentitled_empty_byline);
            public static final EmptyProgress REGI_RANKED = new EmptyProgress("REGI_RANKED", 1, rk6.progress_spelling_bee_nonentitled_ranked_byline);
            private final int bylineRes;

            private static final /* synthetic */ EmptyProgress[] $values() {
                return new EmptyProgress[]{REGI_NOT_STARTED, REGI_RANKED};
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
                int[] iArr2 = new int[NonEntitledSpellingBeeProgress.values().length];
                try {
                    iArr2[NonEntitledSpellingBeeProgress.REGI_EMPTY.ordinal()] = 1;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr2[NonEntitledSpellingBeeProgress.REGI_NO_RANK.ordinal()] = 2;
                } catch (NoSuchFieldError unused3) {
                }
                b = iArr2;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final NonEntitledSpellingBeeProgress a(String str) {
            NonEntitledSpellingBeeProgress nonEntitledSpellingBeeProgress;
            if (str == null || str.length() == 0) {
                return NonEntitledSpellingBeeProgress.REGI_EMPTY;
            }
            String F = h.F(str, QueryKeys.END_MARKER, " ", false, 4, null);
            NonEntitledSpellingBeeProgress[] values = NonEntitledSpellingBeeProgress.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    nonEntitledSpellingBeeProgress = null;
                    break;
                }
                nonEntitledSpellingBeeProgress = values[i];
                String rank = nonEntitledSpellingBeeProgress.getRank();
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
            return nonEntitledSpellingBeeProgress == null ? NonEntitledSpellingBeeProgress.REGI_EMPTY : nonEntitledSpellingBeeProgress;
        }

        private final String c(Context context, NonEntitledSpellingBeeProgress nonEntitledSpellingBeeProgress) {
            int i = nonEntitledSpellingBeeProgress == null ? -1 : a.b[nonEntitledSpellingBeeProgress.ordinal()];
            String string = (i == -1 || i == 1 || i == 2) ? context.getString(EmptyProgress.REGI_NOT_STARTED.getBylineRes()) : context.getString(EmptyProgress.REGI_RANKED.getBylineRes(), nonEntitledSpellingBeeProgress.getRank());
            zq3.e(string);
            return string;
        }

        private final jv2 d(Context context, String str, String str2, NytGameCardEntity nytGameCardEntity) {
            NonEntitledSpellingBeeProgress a2 = a(str);
            String e = e(context, a2, a(str2));
            long f = a.a[a2.getButtonState().ordinal()] == 1 ? nn0.b.f() : nytGameCardEntity.a();
            String string = context.getString(a2.getDescription());
            zq3.g(string, "getString(...)");
            return new jv2(f, a2.getImage(), a2.getButtonState(), e, string, null);
        }

        private final String e(Context context, NonEntitledSpellingBeeProgress nonEntitledSpellingBeeProgress, NonEntitledSpellingBeeProgress nonEntitledSpellingBeeProgress2) {
            if (nonEntitledSpellingBeeProgress == null || nonEntitledSpellingBeeProgress == NonEntitledSpellingBeeProgress.REGI_EMPTY) {
                return c(context, nonEntitledSpellingBeeProgress2);
            }
            String string = context.getString(nonEntitledSpellingBeeProgress.getByline());
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

    private static final /* synthetic */ NonEntitledSpellingBeeProgress[] $values() {
        return new NonEntitledSpellingBeeProgress[]{REGI_EMPTY, REGI_NO_RANK, REGI_BEGINNER, REGI_GOOD_START, REGI_MOVING_UP, REGI_GOOD, REGI_SOLID};
    }

    static {
        int i = me6.progress_spelling_bee_default;
        int i2 = rk6.progress_spelling_bee_no_rank_byline;
        int i3 = rk6.progress_spelling_bee_nonentitled_playing_description;
        GamesButtonState gamesButtonState = GamesButtonState.CONTINUE;
        REGI_NO_RANK = new NonEntitledSpellingBeeProgress("REGI_NO_RANK", 1, "No Rank", i, i2, i3, gamesButtonState);
        REGI_BEGINNER = new NonEntitledSpellingBeeProgress("REGI_BEGINNER", 2, "Beginner", me6.progress_spelling_bee_beginner, rk6.progress_spelling_bee_beginner_byline, rk6.progress_spelling_bee_nonentitled_playing_description, gamesButtonState);
        REGI_GOOD_START = new NonEntitledSpellingBeeProgress("REGI_GOOD_START", 3, "Good Start", me6.progress_spelling_bee_good_start, rk6.progress_spelling_bee_good_start_byline, rk6.progress_spelling_bee_nonentitled_playing_description, gamesButtonState);
        REGI_MOVING_UP = new NonEntitledSpellingBeeProgress("REGI_MOVING_UP", 4, "Moving Up", me6.progress_spelling_bee_moving_up, rk6.progress_spelling_bee_moving_up_byline, rk6.progress_spelling_bee_nonentitled_playing_description, gamesButtonState);
        REGI_GOOD = new NonEntitledSpellingBeeProgress("REGI_GOOD", 5, "Good", me6.progress_spelling_bee_good, rk6.progress_spelling_bee_good_byline, rk6.progress_spelling_bee_nonentitled_playing_description, gamesButtonState);
        REGI_SOLID = new NonEntitledSpellingBeeProgress("REGI_SOLID", 6, "Solid", me6.progress_spelling_bee_solid, rk6.progress_spelling_bee_nonentitled_solid_byline, rk6.progress_spelling_bee_nonentitled_locked_description, GamesButtonState.LOCKED);
        NonEntitledSpellingBeeProgress[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
        Companion = new Companion(null);
    }

    private NonEntitledSpellingBeeProgress(String str, int i, String str2, int i2, int i3, int i4, GamesButtonState gamesButtonState) {
        this.rank = str2;
        this.image = i2;
        this.byline = i3;
        this.description = i4;
        this.buttonState = gamesButtonState;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static NonEntitledSpellingBeeProgress valueOf(String str) {
        return (NonEntitledSpellingBeeProgress) Enum.valueOf(NonEntitledSpellingBeeProgress.class, str);
    }

    public static NonEntitledSpellingBeeProgress[] values() {
        return (NonEntitledSpellingBeeProgress[]) $VALUES.clone();
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
