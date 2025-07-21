package androidx.compose.foundation.lazy.layout;

import defpackage.fi;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
final class ItemFoundInScroll extends CancellationException {
    private final int itemOffset;
    private final fi previousAnimation;

    public ItemFoundInScroll(int i, fi fiVar) {
        this.itemOffset = i;
        this.previousAnimation = fiVar;
    }

    public final int a() {
        return this.itemOffset;
    }

    public final fi b() {
        return this.previousAnimation;
    }
}
