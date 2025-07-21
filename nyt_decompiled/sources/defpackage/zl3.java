package defpackage;

import org.threeten.bp.Instant;
import org.threeten.bp.temporal.TemporalAccessor;
import org.threeten.bp.temporal.TemporalQuery;

/* loaded from: classes4.dex */
public final /* synthetic */ class zl3 implements TemporalQuery {
    @Override // org.threeten.bp.temporal.TemporalQuery
    public final Object queryFrom(TemporalAccessor temporalAccessor) {
        return Instant.from(temporalAccessor);
    }
}
