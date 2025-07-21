package com.skydoves.balloon;

import defpackage.b22;
import kotlin.NoWhenBranchMatchedException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class BalloonCenterAlign {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ BalloonCenterAlign[] $VALUES;
    public static final BalloonCenterAlign START = new BalloonCenterAlign("START", 0);
    public static final BalloonCenterAlign END = new BalloonCenterAlign("END", 1);
    public static final BalloonCenterAlign TOP = new BalloonCenterAlign("TOP", 2);
    public static final BalloonCenterAlign BOTTOM = new BalloonCenterAlign("BOTTOM", 3);

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[BalloonCenterAlign.values().length];
            try {
                iArr[BalloonCenterAlign.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BalloonCenterAlign.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BalloonCenterAlign.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BalloonCenterAlign.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    private static final /* synthetic */ BalloonCenterAlign[] $values() {
        return new BalloonCenterAlign[]{START, END, TOP, BOTTOM};
    }

    static {
        BalloonCenterAlign[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private BalloonCenterAlign(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static BalloonCenterAlign valueOf(String str) {
        return (BalloonCenterAlign) Enum.valueOf(BalloonCenterAlign.class, str);
    }

    public static BalloonCenterAlign[] values() {
        return (BalloonCenterAlign[]) $VALUES.clone();
    }

    public final BalloonAlign toAlign() {
        int i = a.a[ordinal()];
        if (i == 1) {
            return BalloonAlign.START;
        }
        if (i == 2) {
            return BalloonAlign.END;
        }
        if (i == 3) {
            return BalloonAlign.TOP;
        }
        if (i == 4) {
            return BalloonAlign.BOTTOM;
        }
        throw new NoWhenBranchMatchedException();
    }
}
