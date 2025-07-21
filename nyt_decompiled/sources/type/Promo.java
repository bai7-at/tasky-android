package type;

import defpackage.dc5;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class Promo {
    public static final Companion Companion = new Companion(null);

    /* renamed from: type, reason: collision with root package name */
    private static final dc5 f276type = new dc5.a("Promo").b(i.o(HasPromotionalProperties.Companion.getType(), HasPromotions.Companion.getType(), Linkable.Companion.getType(), Node.Companion.getType(), Published.Companion.getType())).a();

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final dc5 getType() {
            return Promo.f276type;
        }

        private Companion() {
        }
    }
}
