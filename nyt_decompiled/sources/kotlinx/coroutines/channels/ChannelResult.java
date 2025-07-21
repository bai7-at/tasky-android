package kotlinx.coroutines.channels;

import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.InternalCoroutinesApi;

/* loaded from: classes5.dex */
public final class ChannelResult<T> {
    public static final Companion Companion = new Companion(null);
    private static final Failed failed = new Failed();
    private final Object holder;

    public static final class Closed extends Failed {
        public final Throwable cause;

        public Closed(Throwable th) {
            this.cause = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof Closed) && zq3.c(this.cause, ((Closed) obj).cause);
        }

        public int hashCode() {
            Throwable th = this.cause;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // kotlinx.coroutines.channels.ChannelResult.Failed
        public String toString() {
            return "Closed(" + this.cause + ')';
        }
    }

    @InternalCoroutinesApi
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @InternalCoroutinesApi
        /* renamed from: closed-JP2dKIU, reason: not valid java name */
        public final <E> Object m905closedJP2dKIU(Throwable th) {
            return ChannelResult.m893constructorimpl(new Closed(th));
        }

        @InternalCoroutinesApi
        /* renamed from: failure-PtdJZtk, reason: not valid java name */
        public final <E> Object m906failurePtdJZtk() {
            return ChannelResult.m893constructorimpl(ChannelResult.failed);
        }

        @InternalCoroutinesApi
        /* renamed from: success-JP2dKIU, reason: not valid java name */
        public final <E> Object m907successJP2dKIU(E e) {
            return ChannelResult.m893constructorimpl(e);
        }

        private Companion() {
        }
    }

    public static class Failed {
        public String toString() {
            return "Failed";
        }
    }

    private /* synthetic */ ChannelResult(Object obj) {
        this.holder = obj;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ChannelResult m892boximpl(Object obj) {
        return new ChannelResult(obj);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> Object m893constructorimpl(Object obj) {
        return obj;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m894equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof ChannelResult) && zq3.c(obj, ((ChannelResult) obj2).m904unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m895equalsimpl0(Object obj, Object obj2) {
        return zq3.c(obj, obj2);
    }

    /* renamed from: exceptionOrNull-impl, reason: not valid java name */
    public static final Throwable m896exceptionOrNullimpl(Object obj) {
        Closed closed = obj instanceof Closed ? (Closed) obj : null;
        if (closed != null) {
            return closed.cause;
        }
        return null;
    }

    public static /* synthetic */ void getHolder$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOrNull-impl, reason: not valid java name */
    public static final T m897getOrNullimpl(Object obj) {
        if (obj instanceof Failed) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOrThrow-impl, reason: not valid java name */
    public static final T m898getOrThrowimpl(Object obj) {
        Throwable th;
        if (!(obj instanceof Failed)) {
            return obj;
        }
        if ((obj instanceof Closed) && (th = ((Closed) obj).cause) != null) {
            throw th;
        }
        throw new IllegalStateException(("Trying to call 'getOrThrow' on a failed channel result: " + obj).toString());
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m899hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: isClosed-impl, reason: not valid java name */
    public static final boolean m900isClosedimpl(Object obj) {
        return obj instanceof Closed;
    }

    /* renamed from: isFailure-impl, reason: not valid java name */
    public static final boolean m901isFailureimpl(Object obj) {
        return obj instanceof Failed;
    }

    /* renamed from: isSuccess-impl, reason: not valid java name */
    public static final boolean m902isSuccessimpl(Object obj) {
        return !(obj instanceof Failed);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m903toStringimpl(Object obj) {
        if (obj instanceof Closed) {
            return ((Closed) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m894equalsimpl(this.holder, obj);
    }

    public int hashCode() {
        return m899hashCodeimpl(this.holder);
    }

    public String toString() {
        return m903toStringimpl(this.holder);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Object m904unboximpl() {
        return this.holder;
    }
}
