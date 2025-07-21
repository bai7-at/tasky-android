package androidx.constraintlayout.compose;

import java.util.Arrays;

/* loaded from: classes.dex */
public enum LayoutInfoFlags {
    NONE,
    BOUNDS;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static LayoutInfoFlags[] valuesCustom() {
        LayoutInfoFlags[] valuesCustom = values();
        return (LayoutInfoFlags[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
