package type;

import defpackage.b22;
import defpackage.c22;
import defpackage.zq3;
import java.util.Iterator;
import kotlin.collections.i;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class CommentStatus {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ CommentStatus[] $VALUES;
    public static final Companion Companion;

    /* renamed from: type, reason: collision with root package name */
    private static final c22 f144type;
    private final String rawValue;
    public static final CommentStatus NO_COMMENTS = new CommentStatus("NO_COMMENTS", 0, "NO_COMMENTS");
    public static final CommentStatus ACCEPT_AND_DISPLAY_COMMENTS = new CommentStatus("ACCEPT_AND_DISPLAY_COMMENTS", 1, "ACCEPT_AND_DISPLAY_COMMENTS");
    public static final CommentStatus DISPLAY_COMMENTS_ONLY = new CommentStatus("DISPLAY_COMMENTS_ONLY", 2, "DISPLAY_COMMENTS_ONLY");
    public static final CommentStatus UNKNOWN__ = new CommentStatus("UNKNOWN__", 3, "UNKNOWN__");

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final java.util.List<CommentStatus> getKnownEntries() {
            return i.o(CommentStatus.NO_COMMENTS, CommentStatus.ACCEPT_AND_DISPLAY_COMMENTS, CommentStatus.DISPLAY_COMMENTS_ONLY);
        }

        public final c22 getType() {
            return CommentStatus.f144type;
        }

        public final CommentStatus[] knownValues() {
            return (CommentStatus[]) getKnownEntries().toArray(new CommentStatus[0]);
        }

        public final CommentStatus safeValueOf(String str) {
            Object obj;
            zq3.h(str, "rawValue");
            Iterator<E> it2 = CommentStatus.getEntries().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (zq3.c(((CommentStatus) obj).getRawValue(), str)) {
                    break;
                }
            }
            CommentStatus commentStatus = (CommentStatus) obj;
            return commentStatus == null ? CommentStatus.UNKNOWN__ : commentStatus;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ CommentStatus[] $values() {
        return new CommentStatus[]{NO_COMMENTS, ACCEPT_AND_DISPLAY_COMMENTS, DISPLAY_COMMENTS_ONLY, UNKNOWN__};
    }

    static {
        CommentStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
        Companion = new Companion(null);
        f144type = new c22("CommentStatus", i.o("NO_COMMENTS", "ACCEPT_AND_DISPLAY_COMMENTS", "DISPLAY_COMMENTS_ONLY"));
    }

    private CommentStatus(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static CommentStatus valueOf(String str) {
        return (CommentStatus) Enum.valueOf(CommentStatus.class, str);
    }

    public static CommentStatus[] values() {
        return (CommentStatus[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
