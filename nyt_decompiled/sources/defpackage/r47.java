package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public class r47 {
    private static final r47 e = new r47();
    static final n47 f = new a();
    private final AtomicReference a = new AtomicReference();
    private final AtomicReference b = new AtomicReference();
    private final AtomicReference c = new AtomicReference();
    private final AtomicReference d = new AtomicReference();

    static class a extends n47 {
        a() {
        }
    }

    r47() {
    }

    public static r47 b() {
        return e;
    }

    static Object d(Class cls, Properties properties) {
        Properties properties2 = (Properties) properties.clone();
        String simpleName = cls.getSimpleName();
        String property = properties2.getProperty("rxjava.plugin." + simpleName + ".implementation");
        if (property == null) {
            Iterator it2 = properties2.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it2.next();
                String obj = entry.getKey().toString();
                if (obj.startsWith("rxjava.plugin.") && obj.endsWith(".class") && simpleName.equals(entry.getValue().toString())) {
                    String str = "rxjava.plugin." + obj.substring(0, obj.length() - 6).substring(14) + ".impl";
                    String property2 = properties2.getProperty(str);
                    if (property2 == null) {
                        throw new RuntimeException("Implementing class declaration for " + simpleName + " missing: " + str);
                    }
                    property = property2;
                }
            }
        }
        if (property == null) {
            return null;
        }
        try {
            return Class.forName(property).asSubclass(cls).newInstance();
        } catch (ClassCastException unused) {
            throw new RuntimeException(simpleName + " implementation is not an instance of " + simpleName + ": " + property);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(simpleName + " implementation class not found: " + property, e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException(simpleName + " implementation not able to be accessed: " + property, e3);
        } catch (InstantiationException e4) {
            throw new RuntimeException(simpleName + " implementation not able to be instantiated: " + property, e4);
        }
    }

    public n47 a() {
        if (this.a.get() == null) {
            Object d = d(n47.class, System.getProperties());
            if (d == null) {
                kz4.a(this.a, null, f);
            } else {
                kz4.a(this.a, null, (n47) d);
            }
        }
        return (n47) this.a.get();
    }

    public o47 c() {
        if (this.b.get() == null) {
            Object d = d(o47.class, System.getProperties());
            if (d == null) {
                kz4.a(this.b, null, p47.f());
            } else {
                kz4.a(this.b, null, (o47) d);
            }
        }
        return (o47) this.b.get();
    }

    public s47 e() {
        if (this.d.get() == null) {
            Object d = d(s47.class, System.getProperties());
            if (d == null) {
                kz4.a(this.d, null, s47.h());
            } else {
                kz4.a(this.d, null, (s47) d);
            }
        }
        return (s47) this.d.get();
    }

    public t47 f() {
        if (this.c.get() == null) {
            Object d = d(t47.class, System.getProperties());
            if (d == null) {
                kz4.a(this.c, null, u47.a());
            } else {
                kz4.a(this.c, null, (t47) d);
            }
        }
        return (t47) this.c.get();
    }
}
