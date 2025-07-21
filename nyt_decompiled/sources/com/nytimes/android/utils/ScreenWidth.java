package com.nytimes.android.utils;

import android.content.Context;
import defpackage.b22;
import defpackage.mh6;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class ScreenWidth {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ScreenWidthType {
        private static final /* synthetic */ b22 $ENTRIES;
        private static final /* synthetic */ ScreenWidthType[] $VALUES;
        private final int value;
        public static final ScreenWidthType UNKNOWN = new ScreenWidthType("UNKNOWN", 0, -1);
        public static final ScreenWidthType BELOW_SIX_HUNDRED = new ScreenWidthType("BELOW_SIX_HUNDRED", 1, 0);
        public static final ScreenWidthType SIX_HUNDRED = new ScreenWidthType("SIX_HUNDRED", 2, 600);
        public static final ScreenWidthType SIX_SIXTY_FOUR = new ScreenWidthType("SIX_SIXTY_FOUR", 3, 664);
        public static final ScreenWidthType SEVEN_TWENTY = new ScreenWidthType("SEVEN_TWENTY", 4, 720);
        public static final ScreenWidthType EIGHT_HUNDRED = new ScreenWidthType("EIGHT_HUNDRED", 5, 800);
        public static final ScreenWidthType EIGHT_TWENTY = new ScreenWidthType("EIGHT_TWENTY", 6, 820);
        public static final ScreenWidthType NINE_SIXTY = new ScreenWidthType("NINE_SIXTY", 7, 960);
        public static final ScreenWidthType TWELVE_EIGHTY = new ScreenWidthType("TWELVE_EIGHTY", 8, 1280);

        private static final /* synthetic */ ScreenWidthType[] $values() {
            return new ScreenWidthType[]{UNKNOWN, BELOW_SIX_HUNDRED, SIX_HUNDRED, SIX_SIXTY_FOUR, SEVEN_TWENTY, EIGHT_HUNDRED, EIGHT_TWENTY, NINE_SIXTY, TWELVE_EIGHTY};
        }

        static {
            ScreenWidthType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private ScreenWidthType(String str, int i, int i2) {
            this.value = i2;
        }

        public static b22 getEntries() {
            return $ENTRIES;
        }

        public static ScreenWidthType valueOf(String str) {
            return (ScreenWidthType) Enum.valueOf(ScreenWidthType.class, str);
        }

        public static ScreenWidthType[] values() {
            return (ScreenWidthType[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    public final ScreenWidthType a(Context context) {
        ScreenWidthType screenWidthType;
        zq3.h(context, "context");
        int integer = context.getResources().getInteger(mh6.screen_identifier);
        ScreenWidthType[] values = ScreenWidthType.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                screenWidthType = null;
                break;
            }
            screenWidthType = values[i];
            if (screenWidthType.getValue() == integer) {
                break;
            }
            i++;
        }
        return screenWidthType == null ? ScreenWidthType.UNKNOWN : screenWidthType;
    }
}
