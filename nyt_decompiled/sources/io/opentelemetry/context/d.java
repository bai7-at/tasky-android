package io.opentelemetry.context;

import defpackage.lh4;
import defpackage.ux0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ServiceLoader;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
abstract class d {
    private static final Logger a = Logger.getLogger(d.class.getName());
    private static final b b;

    static {
        AtomicReference atomicReference = new AtomicReference();
        b a2 = a(atomicReference);
        if (Boolean.getBoolean("io.opentelemetry.context.enableStrictContext")) {
            a2 = StrictContextStorage.d(a2);
        }
        Iterator it2 = c.a().iterator();
        while (it2.hasNext()) {
            a2 = (b) ((Function) it2.next()).apply(a2);
        }
        b = a2;
        c.b();
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            a.log(Level.WARNING, "ContextStorageProvider initialized failed. Using default", th);
        }
    }

    static b a(AtomicReference atomicReference) {
        String property = System.getProperty("io.opentelemetry.context.contextStorageProvider", "");
        if ("default".equals(property)) {
            return b.a();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ServiceLoader.load(ux0.class).iterator();
        if (it2.hasNext()) {
            lh4.a(it2.next());
            throw null;
        }
        if (arrayList.isEmpty()) {
            return b.a();
        }
        if (property.isEmpty()) {
            if (arrayList.size() == 1) {
                lh4.a(arrayList.get(0));
                throw null;
            }
            atomicReference.set(new IllegalStateException("Found multiple ContextStorageProvider. Set the io.opentelemetry.context.ContextStorageProvider property to the fully qualified class name of the provider to use. Falling back to default ContextStorage. Found providers: " + arrayList));
            return b.a();
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            lh4.a(it3.next());
            throw null;
        }
        atomicReference.set(new IllegalStateException("io.opentelemetry.context.ContextStorageProvider property set but no matching class could be found, requested: " + property + " but found providers: " + arrayList));
        return b.a();
    }

    static b b() {
        return b;
    }
}
