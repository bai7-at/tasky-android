package kotlinx.coroutines.selects;

import defpackage.it2;
import kotlinx.coroutines.InternalCoroutinesApi;

@InternalCoroutinesApi
/* loaded from: classes5.dex */
public interface SelectClause {
    Object getClauseObject();

    it2 getOnCancellationConstructor();

    it2 getProcessResFunc();

    it2 getRegFunc();
}
