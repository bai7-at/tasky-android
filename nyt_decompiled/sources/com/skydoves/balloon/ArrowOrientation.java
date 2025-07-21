package com.skydoves.balloon;

import defpackage.b22;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ArrowOrientation {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ ArrowOrientation[] $VALUES;
    public static final a Companion;
    public static final ArrowOrientation BOTTOM = new ArrowOrientation("BOTTOM", 0);
    public static final ArrowOrientation TOP = new ArrowOrientation("TOP", 1);
    public static final ArrowOrientation START = new ArrowOrientation("START", 2);
    public static final ArrowOrientation END = new ArrowOrientation("END", 3);

    public static final class a {

        /* renamed from: com.skydoves.balloon.ArrowOrientation$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0468a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[ArrowOrientation.values().length];
                try {
                    iArr[ArrowOrientation.START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ArrowOrientation.END.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ArrowOrientation a(ArrowOrientation arrowOrientation, boolean z) {
            zq3.h(arrowOrientation, "<this>");
            if (!z) {
                return arrowOrientation;
            }
            int i = C0468a.a[arrowOrientation.ordinal()];
            return i != 1 ? i != 2 ? arrowOrientation : ArrowOrientation.START : ArrowOrientation.END;
        }

        private a() {
        }
    }

    private static final /* synthetic */ ArrowOrientation[] $values() {
        return new ArrowOrientation[]{BOTTOM, TOP, START, END};
    }

    static {
        ArrowOrientation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
    }

    private ArrowOrientation(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static ArrowOrientation valueOf(String str) {
        return (ArrowOrientation) Enum.valueOf(ArrowOrientation.class, str);
    }

    public static ArrowOrientation[] values() {
        return (ArrowOrientation[]) $VALUES.clone();
    }
}
