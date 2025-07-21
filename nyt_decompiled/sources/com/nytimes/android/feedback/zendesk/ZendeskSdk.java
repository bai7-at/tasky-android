package com.nytimes.android.feedback.zendesk;

import defpackage.by0;
import java.io.File;
import java.util.List;

/* loaded from: classes4.dex */
public interface ZendeskSdk {

    public static final class UnintializedException extends IllegalStateException {
        public UnintializedException() {
            super("ZendeskSdk not initialized");
        }
    }

    boolean a();

    void b();

    Object c(String str, File file, String str2, by0 by0Var);

    Object d(String str, String str2, List list, List list2, by0 by0Var);

    void e(String str);
}
