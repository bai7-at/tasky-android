package com.nytimes.android.features.games.gameshub.ui.util;

import defpackage.b22;
import java.util.Calendar;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class DayPart {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ DayPart[] $VALUES;
    public static final a Companion;
    private final int startAt;
    public static final DayPart Morning = new DayPart("Morning", 0, 3);
    public static final DayPart Afternoon = new DayPart("Afternoon", 1, 12);
    public static final DayPart Evening = new DayPart("Evening", 2, 22);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DayPart a() {
            DayPart dayPart;
            int i = Calendar.getInstance().get(11);
            DayPart[] values = DayPart.values();
            int length = values.length - 1;
            if (length >= 0) {
                while (true) {
                    int i2 = length - 1;
                    dayPart = values[length];
                    if (dayPart.getStartAt() <= i) {
                        break;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length = i2;
                }
            }
            dayPart = null;
            return dayPart == null ? DayPart.Evening : dayPart;
        }

        private a() {
        }
    }

    private static final /* synthetic */ DayPart[] $values() {
        return new DayPart[]{Morning, Afternoon, Evening};
    }

    static {
        DayPart[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
    }

    private DayPart(String str, int i, int i2) {
        this.startAt = i2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static DayPart valueOf(String str) {
        return (DayPart) Enum.valueOf(DayPart.class, str);
    }

    public static DayPart[] values() {
        return (DayPart[]) $VALUES.clone();
    }

    public final int getStartAt() {
        return this.startAt;
    }
}
