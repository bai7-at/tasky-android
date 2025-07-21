package defpackage;

import com.nytimes.android.eventtracker.data.encoder.EventJsonAdapter;
import com.nytimes.android.eventtracker.model.Event;

/* loaded from: classes4.dex */
public final class gh1 implements x52 {
    private final yz6 a;
    private final EventJsonAdapter b;

    public gh1(yz6 yz6Var, EventJsonAdapter eventJsonAdapter) {
        zq3.h(yz6Var, "scriptInflater");
        zq3.h(eventJsonAdapter, "adapter");
        this.a = yz6Var;
        this.b = eventJsonAdapter;
    }

    @Override // defpackage.x52
    public Object a(Event event, by0 by0Var) {
        return (String) this.a.a(mj6.validation_function, this.b.a(event));
    }
}
