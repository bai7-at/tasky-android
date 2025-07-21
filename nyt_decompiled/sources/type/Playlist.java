package type;

import defpackage.aq0;
import defpackage.dc5;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class Playlist {
    public static final Companion Companion = new Companion(null);
    private static final aq0 __videos_first = new aq0.a("first").a();

    /* renamed from: type, reason: collision with root package name */
    private static final dc5 f269type = new dc5.a("Playlist").b(i.o(CreativeWork.Companion.getType(), HasPromotionalProperties.Companion.getType(), Linkable.Companion.getType(), Node.Companion.getType(), Published.Companion.getType())).a();

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final dc5 getType() {
            return Playlist.f269type;
        }

        public final aq0 get__videos_first() {
            return Playlist.__videos_first;
        }

        private Companion() {
        }
    }
}
