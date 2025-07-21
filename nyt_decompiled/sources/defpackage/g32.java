package defpackage;

import com.nytimes.android.eventtracker.buffer.DefaultEventBuffer;
import com.nytimes.android.eventtracker.buffer.ValidationStatus;
import com.nytimes.android.eventtracker.model.Event;

/* loaded from: classes4.dex */
public interface g32 {
    public static final a Companion = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final g32 a(nd0 nd0Var) {
            zq3.h(nd0Var, "bufferedEventDao");
            return new DefaultEventBuffer(nd0Var);
        }
    }

    Object a(by0 by0Var);

    Object b(by0 by0Var);

    Object c(md0 md0Var, by0 by0Var);

    Object d(by0 by0Var);

    Object e(by0 by0Var);

    Object f(Event event, ValidationStatus validationStatus, by0 by0Var);

    Object g(String str, by0 by0Var);
}
