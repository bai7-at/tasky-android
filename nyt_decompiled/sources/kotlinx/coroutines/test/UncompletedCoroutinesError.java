package kotlinx.coroutines.test;

import kotlinx.coroutines.ExperimentalCoroutinesApi;

@ExperimentalCoroutinesApi
/* loaded from: classes5.dex */
public final class UncompletedCoroutinesError extends AssertionError {
    public UncompletedCoroutinesError(String str) {
        super(str);
    }
}
