package defpackage;

import com.datadog.android.api.InternalLogger;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class af8 {
    public static final a c = new a(null);
    private final InternalLogger a;
    private final re2 b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public af8(InternalLogger internalLogger, re2 re2Var) {
        zq3.h(internalLogger, "internalLogger");
        zq3.h(re2Var, "fileReaderWriter");
        this.a = internalLogger;
        this.b = re2Var;
    }
}
