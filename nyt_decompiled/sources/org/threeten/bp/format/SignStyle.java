package org.threeten.bp.format;

/* loaded from: classes5.dex */
public enum SignStyle {
    NORMAL,
    ALWAYS,
    NEVER,
    NOT_NEGATIVE,
    EXCEEDS_PAD;

    boolean parse(boolean z, boolean z2, boolean z3) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return (z && z2) ? false : true;
        }
        if (ordinal == 1 || ordinal == 4) {
            return true;
        }
        return (z2 || z3) ? false : true;
    }
}
