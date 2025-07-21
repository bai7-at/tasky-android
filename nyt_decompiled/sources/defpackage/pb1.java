package defpackage;

import com.datadog.android.api.InternalLogger;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class pb1 {
    public static final a f = new a(null);
    private final ga1 a;
    private final String b;
    private final File c;
    private final InternalLogger d;
    private final af8 e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public pb1(ga1 ga1Var, String str, File file, InternalLogger internalLogger, af8 af8Var) {
        zq3.h(ga1Var, "dataStoreFileHelper");
        zq3.h(str, "featureName");
        zq3.h(file, "storageDir");
        zq3.h(internalLogger, "internalLogger");
        zq3.h(af8Var, "tlvBlockFileReader");
        this.a = ga1Var;
        this.b = str;
        this.c = file;
        this.d = internalLogger;
        this.e = af8Var;
    }
}
