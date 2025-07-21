package io.opentelemetry.context;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
abstract class c {
    private static boolean b;
    private static final Logger a = Logger.getLogger(c.class.getName());
    private static final List c = new ArrayList();
    private static final Object d = new Object();

    static List a() {
        List list;
        synchronized (d) {
            list = c;
        }
        return list;
    }

    static void b() {
        synchronized (d) {
            b = true;
        }
    }
}
