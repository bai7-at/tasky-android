package defpackage;

import com.datadog.android.api.InternalLogger;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class qb1 {
    public static final a f = new a(null);
    private static final byte[] g = new byte[0];
    private final ga1 a;
    private final String b;
    private final File c;
    private final InternalLogger d;
    private final re2 e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public qb1(ga1 ga1Var, String str, File file, InternalLogger internalLogger, re2 re2Var) {
        zq3.h(ga1Var, "dataStoreFileHelper");
        zq3.h(str, "featureName");
        zq3.h(file, "storageDir");
        zq3.h(internalLogger, "internalLogger");
        zq3.h(re2Var, "fileReaderWriter");
        this.a = ga1Var;
        this.b = str;
        this.c = file;
        this.d = internalLogger;
        this.e = re2Var;
    }
}
