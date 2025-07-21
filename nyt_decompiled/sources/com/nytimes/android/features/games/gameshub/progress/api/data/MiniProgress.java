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
public final class MiniProgress {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ MiniProgress[] $VALUES;
    public static final a Companion;
    public static final MiniProgress Complete;
    public static final MiniProgress Default = new MiniProgress("Default", 0, 0, me6.progress_mini_default, GamesButtonState.PLAY);
    public static final MiniProgress Step1;
    public static final MiniProgress Step2;
    public static final MiniProgress Step3;
    public static final MiniProgress Step4;
    private final GamesButtonState buttonState;
    private final int ceiling;
    private final int image;

    public static final class a {

        /* renamed from: com.nytimes.android.features.games.gameshub.progress.api.data.MiniProgress$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0280a {
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

        private final MiniProgress a(int i) {
            MiniProgress miniProgress;
            MiniProgress[] values = MiniProgress.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    miniProgress = null;
                    break;
                }
                miniProgress = values[i2];
                if (miniProgress.getCeiling() >= i) {
                    break;
                }
                i2++;
            }
            return miniProgress == null ? MiniProgress.Default : miniProgress;
        }

        private final jv2 c(Context context, NytGameCardEntity nytGameCardEntity, int i) {
            MiniProgress a = a(i);
            GamesButtonState buttonState = a.getButtonState();
            return new jv2(C0280a.a[buttonState.ordinal()] == 1 ? nn0.b.f() : nytGameCardEntity.a(), a.getImage(), buttonState, d(context, i), nytGameCardEntity.d(), null);
        }

        private final String d(Context context, int i) {
            if (i == 0) {
                String string = context.getString(rk6.progress_mini_default_byline);
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

    private static final /* synthetic */ MiniProgress[] $values() {
        return new MiniProgress[]{Default, Step1, Step2, Step3, Step4, Complete};
    }

    static {
        int i = me6.progress_mini_step1;
        GamesButtonState gamesButtonState = GamesButtonState.CONTINUE;
        Step1 = new MiniProgress("Step1", 1, 30, i, gamesButtonState);
        Step2 = new MiniProgress("Step2", 2, 50, me6.progress_mini_step2, gamesButtonState);
        Step3 = new MiniProgress("Step3", 3, 75, me6.progress_mini_step3, gamesButtonState);
        Step4 = new MiniProgress("Step4", 4, 99, me6.progress_mini_step4, gamesButtonState);
        Complete = new MiniProgress("Complete", 5, 100, me6.progress_mini_complete, GamesButtonState.SOLVED);
        MiniProgress[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
    }

    private MiniProgress(String str, int i, int i2, int i3, GamesButtonState gamesButtonState) {
        this.ceiling = i2;
        this.image = i3;
        this.buttonState = gamesButtonState;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static MiniProgress valueOf(String str) {
        return (MiniProgress) Enum.valueOf(MiniProgress.class, str);
    }

    public static MiniProgress[] values() {
        return (MiniProgress[]) $VALUES.clone();
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
