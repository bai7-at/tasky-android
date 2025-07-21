package com.nytimes.android.features.games.gameshub.ui.util;

import com.nytimes.android.features.games.gameshub.configuration.models.NytGamesConfiguration;
import com.nytimes.android.features.games.gameshub.configuration.models.PlayTabHeader;
import defpackage.zq3;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: com.nytimes.android.features.games.gameshub.ui.util.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0282a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[DayPart.values().length];
            try {
                iArr[DayPart.Morning.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DayPart.Afternoon.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DayPart.Evening.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final PlayTabHeader a(NytGamesConfiguration nytGamesConfiguration) {
        zq3.h(nytGamesConfiguration, "<this>");
        int i = C0282a.a[DayPart.Companion.a().ordinal()];
        if (i == 1) {
            return (PlayTabHeader) nytGamesConfiguration.c().c().get(0);
        }
        if (i == 2) {
            return (PlayTabHeader) nytGamesConfiguration.c().c().get(1);
        }
        if (i == 3) {
            return (PlayTabHeader) nytGamesConfiguration.c().c().get(2);
        }
        throw new NoWhenBranchMatchedException();
    }
}
