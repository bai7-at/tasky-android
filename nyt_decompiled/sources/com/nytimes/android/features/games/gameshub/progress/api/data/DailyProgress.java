package com.nytimes.android.features.games.gameshub.progress.api.data;

import android.content.Context;
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
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class DailyProgress {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ DailyProgress[] $VALUES;
    public static final a Companion;
    public static final DailyProgress Complete;
    public static final DailyProgress Default = new DailyProgress("Default", 0, 0, me6.progress_crossword_default, GamesButtonState.PLAY);
    public static final DailyProgress Step1;
    public static final DailyProgress Step2;
    public static final DailyProgress Step3;
    public static final DailyProgress Step4;
    public static final DailyProgress Step5;
    public static final DailyProgress Step6;
    public static final DailyProgress Step7;
    public static final DailyProgress Step8;
    public static final DailyProgress Step9;
    private final GamesButtonState buttonState;
    private final int ceiling;
    private final int image;

    public static final class a {

        /* renamed from: com.nytimes.android.features.games.gameshub.progress.api.data.DailyProgress$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0279a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[GamesButtonState.values().length];
                try {
                    iArr[GamesButtonState.SOLVED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final DailyProgress a(int i) {
            DailyProgress dailyProgress;
            DailyProgress[] values = DailyProgress.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    dailyProgress = null;
                    break;
                }
                dailyProgress = values[i2];
                if (dailyProgress.getCeiling() >= i) {
                    break;
                }
                i2++;
            }
            return dailyProgress == null ? DailyProgress.Default : dailyProgress;
        }

        private final jv2 c(Context context, NytGameCardEntity nytGameCardEntity, int i) {
            DailyProgress a = a(i);
            GamesButtonState buttonState = a.getButtonState();
            return new jv2(C0279a.a[buttonState.ordinal()] == 1 ? nn0.b.f() : nytGameCardEntity.a(), a.getImage(), buttonState, d(context, i), nytGameCardEntity.d(), null);
        }

        private final String d(Context context, int i) {
            if (i == 0) {
                String string = context.getString(rk6.progress_crossword_default_byline);
                zq3.g(string, "getString(...)");
                return string;
            }
            if (i != 100) {
                String string2 = context.getString(rk6.progress_crossword_percent_filled_byline, Integer.valueOf(i));
                zq3.g(string2, "getString(...)");
                return string2;
            }
            String string3 = context.getString(rk6.progress_crossword_complete_byline);
            zq3.g(string3, "getString(...)");
            return string3;
        }

        public final wt2 b(Context context, NytGameCardEntity nytGameCardEntity, int i) {
            zq3.h(context, "context");
            zq3.h(nytGameCardEntity, AssetConstants.DAILY_FIVE_GAME);
            jv2 c = c(context, nytGameCardEntity, i);
            String f = nytGameCardEntity.f();
            String g = nytGameCardEntity.g();
            long a = c.a();
            int e = c.e();
            String c2 = c.c();
            String d = c.d();
            return new wt2(f, a, e, g, c.b(), nytGameCardEntity.b(), nytGameCardEntity.e(), nytGameCardEntity.h(), c2, d, null);
        }

        private a() {
        }
    }

    private static final /* synthetic */ DailyProgress[] $values() {
        return new DailyProgress[]{Default, Step1, Step2, Step3, Step4, Step5, Step6, Step7, Step8, Step9, Complete};
    }

    static {
        int i = me6.progress_crossword_step1;
        GamesButtonState gamesButtonState = GamesButtonState.CONTINUE;
        Step1 = new DailyProgress("Step1", 1, 17, i, gamesButtonState);
        Step2 = new DailyProgress("Step2", 2, 26, me6.progress_crossword_step2, gamesButtonState);
        Step3 = new DailyProgress("Step3", 3, 35, me6.progress_crossword_step3, gamesButtonState);
        Step4 = new DailyProgress("Step4", 4, 44, me6.progress_crossword_step4, gamesButtonState);
        Step5 = new DailyProgress("Step5", 5, 53, me6.progress_crossword_step5, gamesButtonState);
        Step6 = new DailyProgress("Step6", 6, 63, me6.progress_crossword_step6, gamesButtonState);
        Step7 = new DailyProgress("Step7", 7, 71, me6.progress_crossword_step7, gamesButtonState);
        Step8 = new DailyProgress("Step8", 8, 80, me6.progress_crossword_step8, gamesButtonState);
        Step9 = new DailyProgress("Step9", 9, 99, me6.progress_crossword_step9, gamesButtonState);
        Complete = new DailyProgress("Complete", 10, 100, me6.progress_crossword_complete, GamesButtonState.SOLVED);
        DailyProgress[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
    }

    private DailyProgress(String str, int i, int i2, int i3, GamesButtonState gamesButtonState) {
        this.ceiling = i2;
        this.image = i3;
        this.buttonState = gamesButtonState;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static DailyProgress valueOf(String str) {
        return (DailyProgress) Enum.valueOf(DailyProgress.class, str);
    }

    public static DailyProgress[] values() {
        return (DailyProgress[]) $VALUES.clone();
    }

    public final GamesButtonState getButtonState() {
        return this.buttonState;
    }

    public final int getCeiling() {
        return this.ceiling;
    }

    public final int getImage() {
        return this.image;
    }
}
