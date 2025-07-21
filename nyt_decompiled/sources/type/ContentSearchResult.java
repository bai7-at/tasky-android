package type;

import defpackage.aq0;
import defpackage.dc5;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class ContentSearchResult {
    public static final Companion Companion = new Companion(null);
    private static final aq0 __hits_first = new aq0.a("first").a();
    private static final aq0 __hits_after = new aq0.a("after").a();

    /* renamed from: type, reason: collision with root package name */
    private static final dc5 f149type = new dc5.a("ContentSearchResult").a();

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final dc5 getType() {
            return ContentSearchResult.f149type;
        }

        public final aq0 get__hits_after() {
            return ContentSearchResult.__hits_after;
        }

        public final aq0 get__hits_first() {
            return ContentSearchResult.__hits_first;
        }

        private Companion() {
        }
    }
}
