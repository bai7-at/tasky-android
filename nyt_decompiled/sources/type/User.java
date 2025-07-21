package type;

import defpackage.aq0;
import defpackage.dc5;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class User {
    public static final Companion Companion = new Companion(null);
    private static final aq0 __readingListAssetsConnection_first = new aq0.a("first").a();
    private static final aq0 __readingListAssetsConnection_after = new aq0.a("after").a();
    private static final aq0 __shareCode_url = new aq0.a("url").a();
    private static final aq0 __giftHistory_first = new aq0.a("first").a();
    private static final aq0 __userInterests_limit = new aq0.a("limit").a();
    private static final aq0 __userInterests_page = new aq0.a("page").a();
    private static final aq0 __userInterests_interestIds = new aq0.a("interestIds").a();

    /* renamed from: type, reason: collision with root package name */
    private static final dc5 f325type = new dc5.a("User").a();

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final dc5 getType() {
            return User.f325type;
        }

        public final aq0 get__giftHistory_first() {
            return User.__giftHistory_first;
        }

        public final aq0 get__readingListAssetsConnection_after() {
            return User.__readingListAssetsConnection_after;
        }

        public final aq0 get__readingListAssetsConnection_first() {
            return User.__readingListAssetsConnection_first;
        }

        public final aq0 get__shareCode_url() {
            return User.__shareCode_url;
        }

        public final aq0 get__userInterests_interestIds() {
            return User.__userInterests_interestIds;
        }

        public final aq0 get__userInterests_limit() {
            return User.__userInterests_limit;
        }

        public final aq0 get__userInterests_page() {
            return User.__userInterests_page;
        }

        private Companion() {
        }
    }
}
