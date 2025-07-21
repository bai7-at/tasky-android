package com.apollographql.apollo.internal;

import defpackage.db3;
import defpackage.wa3;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.h;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes2.dex */
public abstract class MultipartKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(String str) {
        Object obj;
        List E0;
        String str2;
        if (str == null) {
            return null;
        }
        List E02 = h.E0(str, new char[]{';'}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList(i.w(E02, 10));
        Iterator it2 = E02.iterator();
        while (it2.hasNext()) {
            arrayList.add(h.c1((String) it2.next()).toString());
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj = null;
                break;
            }
            obj = it3.next();
            if (h.K((String) obj, "boundary=", false, 2, null)) {
                break;
            }
        }
        String str3 = (String) obj;
        if (str3 == null || (E0 = h.E0(str3, new char[]{'='}, false, 0, 6, null)) == null || (str2 = (String) i.n0(E0, 1)) == null) {
            return null;
        }
        return h.d1(str2, '\"', '\'');
    }

    public static final boolean c(db3 db3Var) {
        zq3.h(db3Var, "<this>");
        String a = wa3.a(db3Var.b(), "Content-Type");
        return a != null && h.I(a, "application/graphql-response+json", true);
    }

    public static final boolean d(db3 db3Var) {
        zq3.h(db3Var, "<this>");
        String a = wa3.a(db3Var.b(), "Content-Type");
        return a != null && h.I(a, "multipart/", true);
    }

    public static final Flow e(db3 db3Var) {
        zq3.h(db3Var, "response");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        return FlowKt.onCompletion(FlowKt.flow(new MultipartKt$multipartBodyFlow$1(ref$ObjectRef, db3Var, null)), new MultipartKt$multipartBodyFlow$2(ref$ObjectRef, null));
    }
}
