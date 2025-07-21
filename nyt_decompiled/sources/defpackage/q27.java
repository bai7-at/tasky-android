package defpackage;

import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.temporal.TemporalAccessor;
import org.threeten.bp.temporal.TemporalQuery;

/* loaded from: classes4.dex */
public final /* synthetic */ class q27 implements TemporalQuery {
    @Override // org.threeten.bp.temporal.TemporalQuery
    public final Object queryFrom(TemporalAccessor temporalAccessor) {
        return OffsetDateTime.from(temporalAccessor);
    }
}
