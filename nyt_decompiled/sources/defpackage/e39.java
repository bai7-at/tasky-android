package defpackage;

import com.nytimes.android.eventtracker.di.ValidatorApiModule;
import com.nytimes.android.eventtracker.validator.fetcher.ValidatorApi;

/* loaded from: classes4.dex */
public abstract class e39 implements ba2 {
    public static ValidatorApi a(b04 b04Var) {
        return (ValidatorApi) g16.e(ValidatorApiModule.a.f(b04Var));
    }
}
