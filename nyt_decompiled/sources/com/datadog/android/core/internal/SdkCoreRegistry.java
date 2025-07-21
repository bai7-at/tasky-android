package com.datadog.android.core.internal;

import com.datadog.android.api.InternalLogger;
import defpackage.qs2;
import defpackage.vc7;
import defpackage.zq3;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class SdkCoreRegistry {
    public static final a c = new a(null);
    private final InternalLogger a;
    private final Map b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public SdkCoreRegistry(InternalLogger internalLogger) {
        zq3.h(internalLogger, "internalLogger");
        this.a = internalLogger;
        this.b = new LinkedHashMap();
    }

    public final vc7 a(String str) {
        if (str == null) {
            str = "_dd.sdk_core.default";
        }
        return (vc7) this.b.get(str);
    }

    public final void b(final String str, vc7 vc7Var) {
        zq3.h(vc7Var, "sdkCore");
        if (str == null) {
            str = "_dd.sdk_core.default";
        }
        if (this.b.containsKey(str)) {
            InternalLogger.b.a(this.a, InternalLogger.Level.WARN, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.core.internal.SdkCoreRegistry$register$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    return "An SdkCode with name " + str + " has already been registered.";
                }
            }, null, false, null, 56, null);
        } else {
            this.b.put(str, vc7Var);
        }
    }
}
