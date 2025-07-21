package com.nytimes.android.bestsellers;

import defpackage.id9;
import defpackage.jq;
import defpackage.op4;

/* loaded from: classes.dex */
public abstract class a implements op4 {
    public static void a(BookDialogView bookDialogView, jq jqVar) {
        bookDialogView.articleEventReporter = jqVar;
    }

    public static void b(BookDialogView bookDialogView, id9 id9Var) {
        bookDialogView.webActivityNavigator = id9Var;
    }
}
