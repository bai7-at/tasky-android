package defpackage;

import com.amazonaws.event.ProgressEvent;

/* loaded from: classes5.dex */
abstract class sz7 extends mt0 {
    private static final Integer g = Integer.getInteger("jctools.spsc.max.lookahead.step", ProgressEvent.PART_FAILED_EVENT_CODE);
    protected final int f;

    public sz7(int i) {
        super(i);
        this.f = Math.min(i / 4, g.intValue());
    }
}
