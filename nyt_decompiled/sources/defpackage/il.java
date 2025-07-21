package defpackage;

import android.content.Context;
import android.util.Log;
import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.PersistedEvents;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class il {
    public static final il a = new il();
    private static final String b;

    private static final class a extends ObjectInputStream {
        public static final C0489a a = new C0489a(null);

        /* renamed from: il$a$a, reason: collision with other inner class name */
        public static final class C0489a {
            public /* synthetic */ C0489a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0489a() {
            }
        }

        public a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.ObjectInputStream
        protected ObjectStreamClass readClassDescriptor() {
            ObjectStreamClass readClassDescriptor = super.readClassDescriptor();
            if (zq3.c(readClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
                readClassDescriptor = ObjectStreamClass.lookup(AccessTokenAppIdPair.SerializationProxyV1.class);
            } else if (zq3.c(readClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2")) {
                readClassDescriptor = ObjectStreamClass.lookup(AppEvent.SerializationProxyV2.class);
            }
            zq3.g(readClassDescriptor, "resultClassDescriptor");
            return readClassDescriptor;
        }
    }

    static {
        String name = il.class.getName();
        zq3.g(name, "AppEventDiskStore::class.java.name");
        b = name;
    }

    private il() {
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009f A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0003, B:12:0x0028, B:14:0x002b, B:17:0x009f, B:23:0x0039, B:44:0x0074, B:46:0x0077, B:47:0x0089, B:50:0x0082, B:36:0x005e, B:38:0x0061, B:41:0x006c, B:33:0x0070, B:27:0x008a, B:29:0x008d, B:32:0x0098), top: B:3:0x0003, inners: #1, #4, #5, #10 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final synchronized com.facebook.appevents.PersistedEvents a() {
        /*
            java.lang.Class<il> r0 = defpackage.il.class
            monitor-enter(r0)
            defpackage.sl.b()     // Catch: java.lang.Throwable -> L35
            android.content.Context r1 = defpackage.w92.l()     // Catch: java.lang.Throwable -> L35
            r2 = 0
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.FileInputStream r3 = r1.openFileInput(r3)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L52 java.io.FileNotFoundException -> L55
            java.lang.String r4 = "context.openFileInput(PERSISTED_EVENTS_FILENAME)"
            defpackage.zq3.g(r3, r4)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L52 java.io.FileNotFoundException -> L55
            il$a r4 = new il$a     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L52 java.io.FileNotFoundException -> L55
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L52 java.io.FileNotFoundException -> L55
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L52 java.io.FileNotFoundException -> L55
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L52 java.io.FileNotFoundException -> L55
            java.lang.Object r3 = r4.readObject()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44 java.io.FileNotFoundException -> L8a
            if (r3 == 0) goto L46
            com.facebook.appevents.PersistedEvents r3 = (com.facebook.appevents.PersistedEvents) r3     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44 java.io.FileNotFoundException -> L8a
            defpackage.g29.j(r4)     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r2)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38
            r1.delete()     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38
            goto L40
        L35:
            r1 = move-exception
            goto La6
        L38:
            r1 = move-exception
            java.lang.String r2 = defpackage.il.b     // Catch: java.lang.Throwable -> L35
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            android.util.Log.w(r2, r4, r1)     // Catch: java.lang.Throwable -> L35
        L40:
            r2 = r3
            goto L9d
        L42:
            r2 = move-exception
            goto L74
        L44:
            r3 = move-exception
            goto L57
        L46:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44 java.io.FileNotFoundException -> L8a
            java.lang.String r5 = "null cannot be cast to non-null type com.facebook.appevents.PersistedEvents"
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44 java.io.FileNotFoundException -> L8a
            throw r3     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44 java.io.FileNotFoundException -> L8a
        L4e:
            r3 = move-exception
            r4 = r2
            r2 = r3
            goto L74
        L52:
            r3 = move-exception
            r4 = r2
            goto L57
        L55:
            r4 = r2
            goto L8a
        L57:
            java.lang.String r5 = defpackage.il.b     // Catch: java.lang.Throwable -> L42
            java.lang.String r6 = "Got unexpected exception while reading events: "
            android.util.Log.w(r5, r6, r3)     // Catch: java.lang.Throwable -> L42
            defpackage.g29.j(r4)     // Catch: java.lang.Throwable -> L35
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L6b
            r1.delete()     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L6b
            goto L9d
        L6b:
            r1 = move-exception
            java.lang.String r3 = defpackage.il.b     // Catch: java.lang.Throwable -> L35
            java.lang.String r4 = "Got unexpected exception when removing events file: "
        L70:
            android.util.Log.w(r3, r4, r1)     // Catch: java.lang.Throwable -> L35
            goto L9d
        L74:
            defpackage.g29.j(r4)     // Catch: java.lang.Throwable -> L35
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L81
            r1.delete()     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L81
            goto L89
        L81:
            r1 = move-exception
            java.lang.String r3 = defpackage.il.b     // Catch: java.lang.Throwable -> L35
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            android.util.Log.w(r3, r4, r1)     // Catch: java.lang.Throwable -> L35
        L89:
            throw r2     // Catch: java.lang.Throwable -> L35
        L8a:
            defpackage.g29.j(r4)     // Catch: java.lang.Throwable -> L35
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L97
            r1.delete()     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L97
            goto L9d
        L97:
            r1 = move-exception
            java.lang.String r3 = defpackage.il.b     // Catch: java.lang.Throwable -> L35
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            goto L70
        L9d:
            if (r2 != 0) goto La4
            com.facebook.appevents.PersistedEvents r2 = new com.facebook.appevents.PersistedEvents     // Catch: java.lang.Throwable -> L35
            r2.<init>()     // Catch: java.lang.Throwable -> L35
        La4:
            monitor-exit(r0)
            return r2
        La6:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.il.a():com.facebook.appevents.PersistedEvents");
    }

    public static final void b(PersistedEvents persistedEvents) {
        ObjectOutputStream objectOutputStream;
        Context l = w92.l();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(l.openFileOutput("AppEventsLogger.persistedevents", 0)));
        } catch (Throwable th) {
            th = th;
        }
        try {
            objectOutputStream.writeObject(persistedEvents);
            g29.j(objectOutputStream);
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            try {
                Log.w(b, "Got unexpected exception while persisting events: ", th);
                try {
                    l.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                } catch (Exception unused) {
                }
            } finally {
                g29.j(objectOutputStream2);
            }
        }
    }
}
