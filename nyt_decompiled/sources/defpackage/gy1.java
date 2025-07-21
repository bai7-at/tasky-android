package defpackage;

/* loaded from: classes.dex */
public abstract class gy1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(char c, char c2) {
        return Character.isHighSurrogate(c) && Character.isLowSurrogate(c2);
    }
}
