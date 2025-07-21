package com.nytimes.android.eventtracker.engine;

import com.nytimes.android.eventtracker.validator.Validator;
import defpackage.by0;

/* loaded from: classes4.dex */
public interface JavascriptEngine {

    public static final class InitializationException extends RuntimeException {
        public InitializationException() {
            super("Engine is not initialized");
        }
    }

    Object a(String str, by0 by0Var);

    void b(Validator validator);

    Object c(String str, by0 by0Var);
}
