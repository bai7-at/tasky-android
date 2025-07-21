package defpackage;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.constraints.DatadogDataConstraints;
import com.datadog.android.core.internal.utils.JsonSerializer;
import com.datadog.android.log.model.LogEvent;
import defpackage.f91;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes2.dex */
public final class d84 implements pk7 {
    public static final a c = new a(null);
    private final InternalLogger a;
    private final f91 b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public d84(InternalLogger internalLogger, f91 f91Var) {
        zq3.h(internalLogger, "internalLogger");
        zq3.h(f91Var, "dataConstraints");
        this.a = internalLogger;
        this.b = f91Var;
    }

    private final LogEvent a(LogEvent logEvent) {
        LogEvent a2;
        String u0 = i.u0(this.b.b(h.F0(logEvent.d(), new String[]{","}, false, 0, 6, null)), ",", null, null, 0, null, null, 62, null);
        Map a3 = f91.a.a(this.b, logEvent.c(), null, null, null, 14, null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : a3.entrySet()) {
            if (!h.d0((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LogEvent.j e = logEvent.e();
        a2 = logEvent.a((r26 & 1) != 0 ? logEvent.a : null, (r26 & 2) != 0 ? logEvent.b : null, (r26 & 4) != 0 ? logEvent.c : null, (r26 & 8) != 0 ? logEvent.d : null, (r26 & 16) != 0 ? logEvent.e : null, (r26 & 32) != 0 ? logEvent.f : null, (r26 & 64) != 0 ? logEvent.g : e != null ? LogEvent.j.b(e, null, null, null, t.x(JsonSerializer.a.a(f91.a.a(this.b, e.c(), "usr", "user extra information", null, 8, null), this.a)), 7, null) : null, (r26 & 128) != 0 ? logEvent.h : null, (r26 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? logEvent.i : null, (r26 & 512) != 0 ? logEvent.j : null, (r26 & 1024) != 0 ? logEvent.k : u0, (r26 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? logEvent.l : t.x(JsonSerializer.a.a(linkedHashMap, this.a)));
        return a2;
    }

    @Override // defpackage.pk7
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String serialize(LogEvent logEvent) {
        zq3.h(logEvent, "model");
        String jsonElement = a(logEvent).f().toString();
        zq3.g(jsonElement, "sanitizeTagsAndAttribute…odel).toJson().toString()");
        return jsonElement;
    }

    public /* synthetic */ d84(InternalLogger internalLogger, f91 f91Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(internalLogger, (i & 2) != 0 ? new DatadogDataConstraints(internalLogger) : f91Var);
    }
}
