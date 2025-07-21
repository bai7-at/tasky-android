package defpackage;

import com.nytimes.android.eventtracker.data.encoder.EventJsonAdapter;
import com.nytimes.android.eventtracker.model.Event;

/* loaded from: classes4.dex */
public interface x52 {
    public static final a Companion = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final x52 a(yz6 yz6Var, EventJsonAdapter eventJsonAdapter) {
            zq3.h(yz6Var, "scriptInflater");
            zq3.h(eventJsonAdapter, "adapter");
            return new gh1(yz6Var, eventJsonAdapter);
        }
    }

    Object a(Event event, by0 by0Var);
}
