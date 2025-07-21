package com.nytimes.android.tpl;

import defpackage.b22;
import defpackage.bu1;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class TPLSize {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ TPLSize[] $VALUES;
    private final float value;
    public static final TPLSize border1 = new TPLSize("border1", 0, bu1.g((float) 1.0d));
    public static final TPLSize border2 = new TPLSize("border2", 1, bu1.g((float) 2.0d));
    public static final TPLSize border1_5 = new TPLSize("border1_5", 2, bu1.g((float) 1.5d));
    public static final TPLSize spacing1 = new TPLSize("spacing1", 3, bu1.g((float) 8.0d));
    public static final TPLSize spacing2 = new TPLSize("spacing2", 4, bu1.g((float) 16.0d));
    public static final TPLSize spacing3 = new TPLSize("spacing3", 5, bu1.g((float) 24.0d));
    public static final TPLSize spacing4 = new TPLSize("spacing4", 6, bu1.g((float) 32.0d));
    public static final TPLSize spacing5 = new TPLSize("spacing5", 7, bu1.g((float) 40.0d));
    public static final TPLSize spacing6 = new TPLSize("spacing6", 8, bu1.g((float) 48.0d));
    public static final TPLSize spacing7 = new TPLSize("spacing7", 9, bu1.g((float) 56.0d));
    public static final TPLSize spacing8 = new TPLSize("spacing8", 10, bu1.g((float) 64.0d));
    public static final TPLSize spacing9 = new TPLSize("spacing9", 11, bu1.g((float) 72.0d));
    public static final TPLSize spacing10 = new TPLSize("spacing10", 12, bu1.g((float) 80.0d));
    public static final TPLSize spacing0_5 = new TPLSize("spacing0_5", 13, bu1.g((float) 4.0d));
    public static final TPLSize spacing1_5 = new TPLSize("spacing1_5", 14, bu1.g((float) 12.0d));
    public static final TPLSize spacing2_5 = new TPLSize("spacing2_5", 15, bu1.g((float) 20.0d));

    private static final /* synthetic */ TPLSize[] $values() {
        return new TPLSize[]{border1, border2, border1_5, spacing1, spacing2, spacing3, spacing4, spacing5, spacing6, spacing7, spacing8, spacing9, spacing10, spacing0_5, spacing1_5, spacing2_5};
    }

    static {
        TPLSize[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TPLSize(String str, int i, float f) {
        this.value = f;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static TPLSize valueOf(String str) {
        return (TPLSize) Enum.valueOf(TPLSize.class, str);
    }

    public static TPLSize[] values() {
        return (TPLSize[]) $VALUES.clone();
    }

    /* renamed from: getValue-D9Ej5fM, reason: not valid java name */
    public final float m765getValueD9Ej5fM() {
        return this.value;
    }
}
