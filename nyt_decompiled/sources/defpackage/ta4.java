package defpackage;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.storage.EventType;
import com.datadog.android.core.persistence.SerializerKt;
import com.datadog.android.log.model.LogEvent;

/* loaded from: classes2.dex */
public final class ta4 implements qa1 {
    private final pk7 a;
    private final InternalLogger b;

    public ta4(pk7 pk7Var, InternalLogger internalLogger) {
        zq3.h(pk7Var, "serializer");
        zq3.h(internalLogger, "internalLogger");
        this.a = pk7Var;
        this.b = internalLogger;
    }

    @Override // defpackage.qa1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean a(f32 f32Var, LogEvent logEvent, EventType eventType) {
        boolean a;
        zq3.h(f32Var, "writer");
        zq3.h(logEvent, "element");
        zq3.h(eventType, "eventType");
        byte[] a2 = SerializerKt.a(this.a, logEvent, this.b);
        if (a2 == null) {
            return false;
        }
        synchronized (this) {
            a = f32Var.a(new bp6(a2, null, 2, null), null, eventType);
        }
        return a;
    }
}
