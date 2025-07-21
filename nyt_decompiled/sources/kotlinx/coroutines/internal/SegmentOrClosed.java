package kotlinx.coroutines.internal;

import defpackage.zq3;
import kotlinx.coroutines.internal.Segment;

/* loaded from: classes5.dex */
public final class SegmentOrClosed<S extends Segment<S>> {
    private final Object value;

    private /* synthetic */ SegmentOrClosed(Object obj) {
        this.value = obj;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SegmentOrClosed m939boximpl(Object obj) {
        return new SegmentOrClosed(obj);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <S extends Segment<S>> Object m940constructorimpl(Object obj) {
        return obj;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m941equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof SegmentOrClosed) && zq3.c(obj, ((SegmentOrClosed) obj2).m947unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m942equalsimpl0(Object obj, Object obj2) {
        return zq3.c(obj, obj2);
    }

    public static /* synthetic */ void getSegment$annotations() {
    }

    /* renamed from: getSegment-impl, reason: not valid java name */
    public static final S m943getSegmentimpl(Object obj) {
        if (obj == ConcurrentLinkedListKt.CLOSED) {
            throw new IllegalStateException("Does not contain segment");
        }
        zq3.f(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (S) obj;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m944hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: isClosed-impl, reason: not valid java name */
    public static final boolean m945isClosedimpl(Object obj) {
        return obj == ConcurrentLinkedListKt.CLOSED;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m946toStringimpl(Object obj) {
        return "SegmentOrClosed(value=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m941equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m944hashCodeimpl(this.value);
    }

    public String toString() {
        return m946toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Object m947unboximpl() {
        return this.value;
    }
}
