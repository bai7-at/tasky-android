package com.datadog.android.core.internal.persistence.file.single;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.persistence.SerializerKt;
import defpackage.kf2;
import defpackage.oe2;
import defpackage.pa1;
import defpackage.pe2;
import defpackage.pk7;
import defpackage.qs2;
import defpackage.zq3;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class SingleItemDataWriter implements pa1 {
    public static final a f = new a(null);
    private final oe2 a;
    private final pk7 b;
    private final kf2 c;
    private final InternalLogger d;
    private final pe2 e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public SingleItemDataWriter(oe2 oe2Var, pk7 pk7Var, kf2 kf2Var, InternalLogger internalLogger, pe2 pe2Var) {
        zq3.h(oe2Var, "fileOrchestrator");
        zq3.h(pk7Var, "serializer");
        zq3.h(kf2Var, "fileWriter");
        zq3.h(internalLogger, "internalLogger");
        zq3.h(pe2Var, "filePersistenceConfig");
        this.a = oe2Var;
        this.b = pk7Var;
        this.c = kf2Var;
        this.d = internalLogger;
        this.e = pe2Var;
    }

    private final boolean b(final int i) {
        if (i <= this.e.f()) {
            return true;
        }
        InternalLogger.b.b(this.d, InternalLogger.Level.ERROR, i.o(InternalLogger.Target.USER, InternalLogger.Target.TELEMETRY), new qs2() { // from class: com.datadog.android.core.internal.persistence.file.single.SingleItemDataWriter$checkEventSize$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final String mo865invoke() {
                String format = String.format(Locale.US, "Can't write data with size %d (max item size is %d)", Arrays.copyOf(new Object[]{Integer.valueOf(i), Long.valueOf(this.d().f())}, 2));
                zq3.g(format, "format(...)");
                return format;
            }
        }, null, false, null, 56, null);
        return false;
    }

    private final void c(Object obj) {
        byte[] a2 = SerializerKt.a(this.b, obj, this.d);
        if (a2 == null) {
            return;
        }
        synchronized (this) {
            e(a2);
        }
    }

    private final boolean e(byte[] bArr) {
        File a2;
        if (b(bArr.length) && (a2 = oe2.a.a(this.a, false, 1, null)) != null) {
            return this.c.b(a2, bArr, false);
        }
        return false;
    }

    @Override // defpackage.pa1
    public void a(Object obj) {
        zq3.h(obj, "element");
        c(obj);
    }

    public final pe2 d() {
        return this.e;
    }
}
