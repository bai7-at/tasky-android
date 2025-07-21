package type;

import defpackage.dc5;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class Person {
    public static final Companion Companion = new Companion(null);

    /* renamed from: type, reason: collision with root package name */
    private static final dc5 f258type = new dc5.a("Person").b(i.o(Collection.Companion.getType(), Linkable.Companion.getType(), Node.Companion.getType(), PersonInterface.Companion.getType(), Published.Companion.getType(), TimesTag.Companion.getType())).a();

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final dc5 getType() {
            return Person.f258type;
        }

        private Companion() {
        }
    }
}
