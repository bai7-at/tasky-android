package type;

import defpackage.vw8;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class HomeUnion {
    public static final Companion Companion = new Companion(null);

    /* renamed from: type, reason: collision with root package name */
    private static final vw8 f203type = new vw8("HomeUnion", ProgrammingList.Companion.getType(), ProgrammingNode.Companion.getType());

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final vw8 getType() {
            return HomeUnion.f203type;
        }

        private Companion() {
        }
    }
}
