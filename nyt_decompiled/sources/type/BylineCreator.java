package type;

import defpackage.vw8;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class BylineCreator {
    public static final Companion Companion = new Companion(null);

    /* renamed from: type, reason: collision with root package name */
    private static final vw8 f135type = new vw8("BylineCreator", Person.Companion.getType(), Organization.Companion.getType());

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final vw8 getType() {
            return BylineCreator.f135type;
        }

        private Companion() {
        }
    }
}
